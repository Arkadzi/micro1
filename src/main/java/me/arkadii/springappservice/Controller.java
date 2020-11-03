package me.arkadii.springappservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @RequestMapping("/1")
    public String hello() {
        return "hello";
    }
}
