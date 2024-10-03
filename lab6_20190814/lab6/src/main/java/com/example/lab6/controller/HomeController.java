package com.example.lab6.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/inicio")
    public String home() {
        return "index";
    }

    @GetMapping("/eventos")
    public String eventos() {
        return "eventos";
    }

    @GetMapping("/artistas")
    public String artistas() {
        return "artistas";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
}
