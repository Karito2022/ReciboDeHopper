package com.karitoreyes.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReciboDeHopperController {

    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Alambre de cobre";
        double price = 5.25;
        String description = "Tiras de metal, otra ilustración de nanosegundos.";
        String seller = "Tienda de la esquina Pequeñas Cosas";
    
    	model.addAttribute("name", name);
    	model.addAttribute("itemName", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("seller", seller);
    	
        return "index.jsp";
    }

    
}