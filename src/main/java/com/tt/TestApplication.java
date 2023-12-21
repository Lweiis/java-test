package com.tt;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.tt.service")
@PropertySource({"classpath:/consumer-config.properties"
        , "classpath:/provider-config.properties"})
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class TestApplication {

    @RequestMapping("/")
    String home() {
        return "Hello Worldsss!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}

