package org.demo.service.impl;

import java.util.List;

import org.demo.mapper.UserMapper;
import org.demo.rpc.UserService;
import org.model.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author seven sins
 * 2018年10月27日 下午7:46:07
 */
@Component
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> find(User user) {
		return userMapper.find(null);
	}

}
