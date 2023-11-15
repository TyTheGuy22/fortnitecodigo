package com.fortnite.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FortniteController {

	   @GetMapping("/fortnite")
	    public String mostrarVentana() {
	        return "ventana";
	    }
	    @GetMapping("/imagenes")
	    public String mostrarImagenes(Model model) {
	        // Puedes pasar cualquier dato adicional al modelo si es necesario
	        return "imagenes";
	    }
}

