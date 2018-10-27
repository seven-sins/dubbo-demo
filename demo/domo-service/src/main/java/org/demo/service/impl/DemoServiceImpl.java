package org.demo.service.impl;

import org.demo.rpc.DemoService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
	public int count() {
		return 0;
	}

}
