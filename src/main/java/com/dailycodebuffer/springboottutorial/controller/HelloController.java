package com.dailycodebuffer.springboottutorial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

       // @RequestMapping(value ="/", method = RequestMethod.GET)
        @GetMapping("/") // Two line is same.
        public String helloWorld() {
            return "Welcome to Daily Code Buffers!!";
        }
}

