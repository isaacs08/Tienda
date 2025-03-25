/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.tienda.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author isaac.salazar
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model, HttpSession session) {
        //model.addAttribute("attribute", "value");
        Long idUsuario = (Long) session.getAttribute("idUsuario");
        return "index";
    }

//    @RequestMapping("/informacion")
//    public String contacto(Model model) {
//        //model.addAttribute("attribute", "value");
//        return "contacto";
//    }

}
