package com.example.servicefeign.service.impl;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * SchedualServiceHiHystric
 * author Administrator
 * Date 2019/7/16 16:49
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
