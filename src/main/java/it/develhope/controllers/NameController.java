package it.develhope.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName() {
        return "Vittoria";
    }

    @PostMapping
    public String postName() {
        String name = "Vittoria";
        StringBuilder reverseName = new StringBuilder(name);
        return reverseName.reverse().toString();
    }
}
