package com.example.servicefeign.controller;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HiController
 * author Administrator
 * Date 2019/7/16 16:16
 */

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi sc;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return sc.sayHiFromClientOne(name);
    }
}
