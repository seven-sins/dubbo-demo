package org.demo.sys.rpc;

import java.util.List;

import org.model.po.User;

public interface UserService {

	public List<User> find(User user);
	
}
