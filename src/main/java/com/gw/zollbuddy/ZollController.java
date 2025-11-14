package com.gw.zollbuddy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ZollController {

    @GetMapping("/")
    public String getMethodName() {
        return "{age:12}";
    }
    
}