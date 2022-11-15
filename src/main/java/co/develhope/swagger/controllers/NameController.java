package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName() {
        return "Antonio Fasanella";
    }
}
