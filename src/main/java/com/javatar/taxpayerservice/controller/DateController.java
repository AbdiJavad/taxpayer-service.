package com.javatar.taxpayerservice.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("hi")
public class DateController {

    @GetMapping
    public String date(@PathParam(value = "name") String name) {
        return "Hello " + name;
    }
}
