package org.demo.controller;

import org.demo.rpc.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class DemoController {

	@Reference(version="1.0.0")
	DemoService demoService;
	
	@GetMapping("/test")
	public Object test() {
		return demoService.count();
	}
}
