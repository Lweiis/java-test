package com.tt.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config/")
public class ConfigController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping(value = "get")
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }
}