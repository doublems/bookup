package org.doublem.bookstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping("/health")
    public String healthCheckTemplate(){
        return "Good";
    }

}
