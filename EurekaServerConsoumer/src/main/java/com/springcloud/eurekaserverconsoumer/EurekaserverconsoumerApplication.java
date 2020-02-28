package com.springcloud.eurekaserverconsoumer;

import com.springcloud.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "EUREKA-SERVER-PROVIDER",configuration = MySelfRule.class)
public class EurekaserverconsoumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverconsoumerApplication.class, args);
	}

}
