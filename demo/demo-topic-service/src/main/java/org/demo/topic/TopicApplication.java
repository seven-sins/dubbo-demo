package org.demo.topic;

import org.base.conf.annotation.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@Database
@SpringBootApplication
@EnableDubboConfiguration
public class TopicApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TopicApplication.class, args);
	}
}
