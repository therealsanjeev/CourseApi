package org.therealsanjeev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.therealsanjeev.model.Topic;
import org.therealsanjeev.services.TopicService;

import java.util.List;

@RestController
public class TopicController {


    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();

    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public String addTopic(@RequestBody Topic topic){

         topicService.addTopic(topic);
         return "Added Successfully!";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topic")
    public Topic updateTopic(@RequestBody Topic topic){
        return topicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
    public String deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
        return "Delete Successfully!";
    }
}
