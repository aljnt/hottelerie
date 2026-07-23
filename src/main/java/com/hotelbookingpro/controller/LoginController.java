package com.hotelbookingpro.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, 
                             @RequestParam String password, 
                             HttpSession session,
                             Model model) {
        
        // Simulation simple des utilisateurs
        if ("admin".equals(username) && "admin".equals(password)) {
            session.setAttribute("userRole", "ADMIN");
            session.setAttribute("username", "Administrateur");
            return "redirect:/hotels";
        } 
        else if ("user".equals(username) && "user".equals(password)) {
            session.setAttribute("userRole", "USER");
            session.setAttribute("username", "Client");
            return "redirect:/hotels";
        } 
        else {
            model.addAttribute("error", "Identifiants incorrects (Essayez admin/admin ou user/user)");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
