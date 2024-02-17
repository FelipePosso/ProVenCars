package com.deflipe.ProVenCarz.controler;

import com.deflipe.ProVenCarz.interfaceService.IusuarioRolService;
import com.deflipe.ProVenCarz.modelo.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class UsuarioRolControlador {
    @Autowired
    private IusuarioRolService service;
    @GetMapping("/listarUsuarioRol")
    public String listarUsuarioRolControlador(Model model){
        List<UsuarioRol>usuarioRol=service.listarUsuarioRol();
        model.addAttribute("usuarioRol",usuarioRol);
        return "index";
    }
}
