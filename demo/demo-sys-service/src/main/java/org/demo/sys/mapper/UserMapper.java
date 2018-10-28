package org.demo.sys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.base.mapper.BaseMapper;
import org.model.po.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
	
}
