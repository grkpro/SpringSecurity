package com.rk.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/")
    public String getMessage() {
        return "<h1>Welcome to spring security</h1>";
    }
}
