package com.jj.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SystemApplication {

    //日志固定写法
    private static final Logger LOG = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SystemApplication.class);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("Eureka地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }

}
