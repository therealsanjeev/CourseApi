package org.therealsanjeev.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.therealsanjeev.model.Topic;
import org.therealsanjeev.repository.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics= new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public Topic getTopic(String id){

        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic){

        return topicRepository.save(topic);
    }

    public void deleteTopic(String  id){

        topicRepository.delete(id);
    }
}
