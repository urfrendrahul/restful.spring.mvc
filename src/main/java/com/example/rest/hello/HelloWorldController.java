package com.example.rest.hello;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/hello-world", method=RequestMethod.GET)
    public Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/hello", method = GET)
    public String getHello() {
        return "Hello world";
    }
}
