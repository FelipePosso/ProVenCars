package com.deflipe.ProVenCarz.controler;

import com.deflipe.ProVenCarz.interfaceService.IvehiculoService;
import com.deflipe.ProVenCarz.modelo.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class VehiculoControlador {
    @Autowired
    private IvehiculoService service;

    @GetMapping("/listarVehiculo")
    // agregado para requerir el catiop - rango precio
    public String listarVehiculoControlador(Model model, @RequestParam(name = "catipo", required = false) String catipo,
                                            @RequestParam(name = "precioMin", required = false) Integer precioMin,
                                            @RequestParam(name = "precioMax", required = false) Integer precioMax){
        List<Vehiculo>vehiculos=service.listarVehiculo();
        // if para buscar dato de catipo
        if (catipo != null && !catipo.isEmpty()) {
            vehiculos = service.listarVehiculoPorCategoria(catipo);
            //rango precio
        } else if (precioMin != null && precioMax != null) {
            vehiculos = service.listarVehiculoPorRangoPrecio(precioMin, precioMax);
        } else {
            vehiculos = service.listarVehiculo();
        }
        model.addAttribute("vehiculos",vehiculos);
        return "ConsultarVehiculos";
    }
    @GetMapping("/newVehiculo")
    public String agregar(Model model){
        model.addAttribute("vehiculo", new Vehiculo());
        return "AgregarVehiculo";
    }
    //alerta placa
    @GetMapping("/placaExistenteError")
    public String placaExistenteError(Model model, @RequestParam(name = "placaExistente") String placaExistente) {
        model.addAttribute("placaExistente", placaExistente);
        return "AgregarVehiculo";
    }

    @PostMapping("/saveVehiculo")
    public String save(@Validated Vehiculo v, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            // Si hay errores de validación, regresa al formulario con los mensajes de error
            return "AgregarVehiculo";
        } else {
            Optional<Vehiculo> existingVehiculo = service.listarVehiculoId(v.getVehplaca());
            if (existingVehiculo.isPresent()) {
                // Redirigir a ConsultarVehiculos.html con el mensaje de error como parámetro de consulta
                redirectAttributes.addAttribute("error", "No se realizó un registro. La placa ya ha sido ingresada al sistema. Corregir");
                return "redirect:/listarVehiculo";
            } else {
                service.save(v);
                return "redirect:/listarVehiculo";
            }
        }
    }
}
