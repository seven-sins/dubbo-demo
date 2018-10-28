package org.demo.topic.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.base.mapper.BaseMapper;
import org.model.po.Topic;

@Mapper
public interface TopicMapper extends BaseMapper<Topic> {
	
}
