package com.starter.app.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Hello_WorldController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Hello_World helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello_World(counter.incrementAndGet(), String.format(template, name));
    }
}
