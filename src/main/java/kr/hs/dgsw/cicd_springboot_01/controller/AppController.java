package kr.hs.dgsw.cicd_springboot_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String hello() {
        return "Hello World! cicd 0101010101 김명준 병신";
    }
}
