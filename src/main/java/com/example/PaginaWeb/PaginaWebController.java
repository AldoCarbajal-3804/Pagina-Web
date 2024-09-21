package com.example.PaginaWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaWebController {

    @GetMapping("/")
    public String mostrarIndex(Model model) {
        return "index";
    }
}
