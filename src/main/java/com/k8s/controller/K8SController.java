package com.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s  是否自动构建2222 ";
    }
}
