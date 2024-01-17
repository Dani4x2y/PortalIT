package com.example.itjobportal.controllers;

import org.springframework.ui.Model;
import com.example.itjobportal.models.User;
import com.example.itjobportal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "frontend/register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, BindingResult bindingResult) {
        // Dodaj walidację danych
        if (bindingResult.hasErrors()) {
            // Obsłuż błędy walidacji, na przykład przekieruj z powrotem do formularza rejestracji z komunikatem o błędzie
            return "frontend/register";
        }

        // Zarejestruj użytkownika
        userService.registerNewUser(user);

        // Przekieruj do strony logowania po udanej rejestracji
        return "redirect:/login";
    }

}

