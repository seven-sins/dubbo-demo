package org.demo;

import org.base.conf.annotation.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * @author seven sins
 * @date 2017年10月28日 上午1:12:26
 */
@Database
@SpringBootApplication
@EnableDubboConfiguration
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
