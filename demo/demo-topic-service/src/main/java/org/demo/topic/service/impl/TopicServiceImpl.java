package org.demo.topic.service.impl;

import java.util.List;

import org.demo.topic.mapper.TopicMapper;
import org.demo.topic.rpc.TopicService;
import org.model.po.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author seven sins
 * 2018年10月27日 下午7:46:07
 */
@Component
@Service(version = "1.0.0")
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	TopicMapper topicMapper;
	
	@Override
	public List<Topic> find(Topic topic) {
		return topicMapper.find(topic);
	}

	@Override
	public void update(Topic topic) {
		topicMapper.update(topic);
	}

}
