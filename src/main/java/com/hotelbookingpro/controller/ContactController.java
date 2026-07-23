package com.hotelbookingpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactForm() {
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(@RequestParam("name") String name,
                                  @RequestParam("email") String email,
                                  @RequestParam("message") String message,
                                  Model model) {
        
        
        model.addAttribute("successMessage", "Merci " + name + " ! Votre message a bien été envoyé. Nous vous répondrons bientôt à " + email + ".");
        return "contact";
    }
}
