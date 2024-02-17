package com.deflipe.ProVenCarz.controler;

import com.deflipe.ProVenCarz.interfaceService.IdatosPersonalesService;
import com.deflipe.ProVenCarz.modelo.DatosPersonales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class DatosPersonalesControlador {
    @Autowired
    private IdatosPersonalesService service;
    @GetMapping("/listarDatosPersonales")
    public String listarDatosPersonalesControlador(Model model){
        List<DatosPersonales>datosPersonalesS=service.listarDatosPersonales();
        model.addAttribute("datosPersonalesS",datosPersonalesS);
        return "ActualizarDatos";
    }

    @PostMapping("/saveDatosPersonales")
    public String save(@Validated DatosPersonales dP, Model model){
        service.save(dP);
        return "redirect:/listarDatosPersonales";
    }

    @GetMapping("/editar/{datid}")
    public String editar(@PathVariable int datid, Model model){
        Optional<DatosPersonales>datosPersonales=service.listarDatosPersonalesId(datid);
        model.addAttribute("datosPersonales",datosPersonales);
        return "FormularioActDatos";
    }
}



















