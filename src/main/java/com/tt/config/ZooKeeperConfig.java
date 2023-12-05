package com.tt.config;

import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooKeeperConfig {

    @Value("${zookeeper.connect-string}")
    private String connectString;

    @Bean(name = "zoo")
    public ZooKeeper zooKeeper() throws Exception {
        return new ZooKeeper(connectString, 5000, null);
    }
}
