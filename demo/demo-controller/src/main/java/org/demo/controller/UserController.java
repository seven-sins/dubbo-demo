package org.demo.controller;

import java.util.List;

import org.demo.common.base.Response;
import org.demo.rpc.UserService;
import org.model.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class UserController {

	@Reference(version="1.0.0")
	UserService userService;
	
	@GetMapping("/user")
	public Response<User> find(User user){
		List<User> list = userService.find(new User());
		
		return new Response<User>(list);
	}
}
