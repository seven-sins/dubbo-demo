package org.demo.controller;

import java.util.List;

import org.demo.common.base.Response;
import org.demo.topic.rpc.TopicService;
import org.model.po.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class TopicController {

	@Reference(version="1.0.0")
	TopicService topicService;
	
	@GetMapping("/topic")
	public Response<Topic> find(Topic topic){
		List<Topic> list = topicService.find(new Topic());
		
		return new Response<Topic>(list);
	}
}
