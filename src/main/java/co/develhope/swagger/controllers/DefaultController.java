package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping(value = "/")
    public String getWelcome() {
        return "Welcome to this example";
    }
}
