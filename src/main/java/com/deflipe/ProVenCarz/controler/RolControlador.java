package com.deflipe.ProVenCarz.controler;

import com.deflipe.ProVenCarz.interfaceService.IrolService;
import com.deflipe.ProVenCarz.modelo.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class RolControlador {
    @Autowired
    private IrolService service;
    @GetMapping("/listarRol")
    public String listarRolControlador(Model model) {
        List<Rol> rols = service.listarRol();
        model.addAttribute("rols", rols);
        return "index";
    }
}
