package com.example.TiendaCelulares.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controladorindex {
    @GetMapping("/mostrarHtml")
    public String mostrarHtml() {
        return "index";
    }
}
