package com.gjing.projects.web;

import cn.gjing.tools.swagger.core.EnableSingleDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Gjing
 */
@EnableSingleDoc
@EnableEurekaClient
@SpringBootApplication
public class K8sWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sWebDemoApplication.class, args);
    }

}
