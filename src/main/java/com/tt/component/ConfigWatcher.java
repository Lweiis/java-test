package com.tt.component;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConfigWatcher implements Watcher {

    @Autowired
    private ZooKeeper zooKeeper;

    private static final String CONFIG_PATH = "/config";

    @Override
    public void process(WatchedEvent event) {
        try {
            // 处理配置变化事件
            byte[] configData = zooKeeper.getData(CONFIG_PATH, this, null);
            String configValue = new String(configData);
            System.out.println("Config changed, new value: " + configValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
