package com.deflipe.ProVenCarz.controler;

import com.deflipe.ProVenCarz.interfaceService.IcategoriaService;
import com.deflipe.ProVenCarz.modelo.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class CategoriaControlador {
    @Autowired
    private IcategoriaService service;
    @GetMapping("/listarCategoria")
    public String listarCategoriaControlador(Model model){
        List<Categoria>categorias=service.listarCategoria();
        model.addAttribute("categorias",categorias);
        return "index";
    }
}
