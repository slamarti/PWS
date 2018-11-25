package com.slamarti.hlw.aanmelden.controller;

import com.slamarti.hlw.aanmelden.model.LeerlingGegevens;
import com.slamarti.hlw.aanmelden.service.LeerlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AanmeldController {

    private LeerlingService leerlingService;

    @Autowired
    public AanmeldController(LeerlingService leerlingService) {
        this.leerlingService = leerlingService;
    }

    @GetMapping(value="/register")
    public String registerForm(Model model) {
        model.addAttribute("leerling", new LeerlingGegevens());
        return "register";
    }

    @PostMapping("/register")
    public String registerSubmit(Model model, @ModelAttribute("leerling") LeerlingGegevens leerling) {
        boolean success = leerlingService.storeLeerlingGegevens(leerling);
        model.addAttribute("success", success);
        return "saved";
    }
}
