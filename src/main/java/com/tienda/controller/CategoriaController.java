/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */

package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author isaac.salazar
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping("/listado")
    public String page(Model model) {
        var categorias = categoriaService.getCategorias(false);
        
        model.addAttribute("categorias", categorias);
        model.addAttribute("categorias", categorias.size());
        return "/categoria/listado";
    }

}
