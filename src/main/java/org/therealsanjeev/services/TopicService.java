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
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring", "Spring Framework","Spring Framework Description"),
//            new Topic("java", "Core Java","Core Java Description"),
//            new Topic("javascript", "JavaScript","JavaScript Description")));


    public List<Topic> getAllTopics(){
        List<Topic> topics= new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public Topic getTopic(String id){
//        for (Topic it:topics) {
//            if(it.getId().equals(id)){
//                return it;
//            }
//        }
//        return new Topic("null","null","null");

        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic){
//        for (Topic it:topics) {
//            if(it.getId().equals(topic.getId())){
//                it.setName(topic.getName());
//                it.setDescription(topic.getDescription());
//                break;
//            }
//        }
//
//

        return topicRepository.save(topic);
    }

    public void deleteTopic(String  id){
//        int i=0;
//        for (Topic it:topics) {
//            if(it.getId().equals(id)){
//                topics.remove(i);
//                return;
//            }
//            i++;
//        }

        topicRepository.delete(id);
    }
}
