package com.hotelbookingpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ReservationController {

    @GetMapping("/reservations/new")
    public String newReservation() {
        return "reservation_form";
    }

    @PostMapping("/reservations")
    public String processReservation(@RequestParam(required = false) String destination,
                                     @RequestParam(required = false) String hotel,
                                     @RequestParam(required = false) String checkin,
                                     @RequestParam(required = false) String checkout,
                                     @RequestParam(required = false) Integer guests,
                                     @RequestParam(required = false) Integer rooms,
                                     RedirectAttributes redirectAttributes) {

        if (destination == null || destination.isEmpty() ||
            hotel == null || hotel.isEmpty() ||
            checkin == null || checkin.isEmpty() ||
            checkout == null || checkout.isEmpty() ||
            guests == null || rooms == null) {
            
            redirectAttributes.addFlashAttribute("error", "Veuillez remplir tous les champs obligatoires pour confirmer votre réservation.");
            return "redirect:/reservations/new";
        }

        // Mock reservation processing
        redirectAttributes.addFlashAttribute("success", "Votre réservation à " + hotel + " (" + destination + ") a été confirmée avec succès !");
        return "redirect:/reservations/new";
    }
}

