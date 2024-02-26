package com.deflipe.ProVenCarz.controler;

import com.deflipe.ProVenCarz.interfaceService.IusuarioService;
import com.deflipe.ProVenCarz.modelo.Usuario;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class UsuarioControlador {
    @Autowired
    private IusuarioService service;

    @GetMapping("/listarUsuario")
    public String listarUsuarioControlador(Model model){
        List<Usuario> usuariosS = service.listarUsuario();
        model.addAttribute("usuariosS", usuariosS);
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam("usulogin") String usulogin,
                        @RequestParam("usupassword") String usupassword,
                        Model model, HttpServletRequest request) {
        Optional<Usuario> optionalUser = service.findByUsulogin(usulogin);

        if (optionalUser.isPresent()) {
            Usuario user = optionalUser.get();
            if (user.getUsupassword().equals(usupassword)) {
                // Si la autenticación es exitosa, agregar el usuario a la sesión
                request.getSession().setAttribute("usuario", user);
                // Para listar solo los datos del usuario autenticado
                model.addAttribute("usuarioAutenticado", user);
                if (user.getUsulogin().equals("felipe@gmail.com")|| user.getUsulogin().equals("andres@gmail.com")){
                    return "ingresado";
                } else if (user.getUsulogin().equals("camila@gmail.com")|| user.getUsulogin().equals("martha@gmail.com")){
                    return "ingresado";
                }else if (user.getUsulogin().equals("juan@gmail.com")|| user.getUsulogin().equals("julian@gmail.com")){
                    return "ingresado";
                }
            }
        }
        // Si la autenticación falla, mostrar una alerta con JavaScript
        model.addAttribute("error", "Datos incorrectos, intente de nuevo");
        return "login";
    }

}