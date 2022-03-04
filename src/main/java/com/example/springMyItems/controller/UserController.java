package com.example.springMyItems.controller;

import com.example.springMyItems.entity.User;
import com.example.springMyItems.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    private UserRepository userRepository;

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/addUser")
    public String addUserPage() {
        return "saveUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user){
        userRepository.save(user);
        return "redirect:/";
    }

    @GetMapping("/editUser/{id}")
    public String editUserPage(ModelMap map, @PathVariable("id") int id) {
        Optional<User> userById = userRepository.findById(id);
        if(userById.isPresent()) {
            map.addAttribute("user", userById.get());
            return "saveUser";
        } else {
            return "redirect:/";
        }
    }
}
