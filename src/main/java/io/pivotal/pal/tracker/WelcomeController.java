package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;


@RestController
public class WelcomeController {

    @Value("${welcome.message}")
    private String message;

    @Required
    public void welcomeController(String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}