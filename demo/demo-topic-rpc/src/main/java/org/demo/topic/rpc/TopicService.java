package org.demo.topic.rpc;

import java.util.List;

import org.model.po.Topic;

public interface TopicService {

	public void update(Topic topic);
	
	public List<Topic> find(Topic topic);
}
