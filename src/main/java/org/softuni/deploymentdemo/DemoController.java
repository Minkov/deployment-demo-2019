package org.softuni.deploymentdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/api/demo")
    public String getDemo() {
        return "It works";
    }
}
