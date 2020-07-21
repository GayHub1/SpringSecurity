package com.example.security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizixi
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2020年06月26日 14:25:00
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello 小酌";
    }
}
