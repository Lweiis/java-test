package com.tt;

import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZKConfigController {

    @Autowired
    private ZooKeeper zooKeeper;

    private static final String CONFIG_PATH = "/config";

    @PostMapping("/update-config/{value}")
    public void updateConfig(@PathVariable String value) throws Exception {
//        String newConfigValue = "new_config_value";
        zooKeeper.setData(CONFIG_PATH, value.getBytes(), -1);
    }
}
