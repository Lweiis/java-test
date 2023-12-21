package com.tt.controller;

import com.tt.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.context.annotation.Bean;


public class DubboController {
    @DubboReference
    private DemoService demoService;
}
