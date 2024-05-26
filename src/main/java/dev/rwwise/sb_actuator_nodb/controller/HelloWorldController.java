/* Copyright &#169; 2024 Richard W. Wise All Rights Reserved. */
package dev.rwwise.sb_actuator_nodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }
}
