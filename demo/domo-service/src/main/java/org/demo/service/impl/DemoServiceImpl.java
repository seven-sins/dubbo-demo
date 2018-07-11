package org.demo.service.impl;

import org.demo.rpc.DemoService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
	public int count() {
		return 0;
	}

}
