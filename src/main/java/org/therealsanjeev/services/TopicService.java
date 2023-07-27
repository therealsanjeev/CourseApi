package org.therealsanjeev.services;


import org.springframework.stereotype.Service;
import org.therealsanjeev.model.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework","Spring Framework Description"),
            new Topic("java", "Core Java","Core Java Description"),
            new Topic("javascript", "JavaScript","JavaScript Description")));


    public List<Topic> getAllTopics(){
        return topics;
    }


    public Topic getTopic(String id){
        for (Topic it:topics) {
            if(it.getId().equals(id)){
                return it;
            }
        }
        return new Topic("null","null","null");
    }

    public List<Topic> addTopic(Topic topic) {
        topics.add(topic);
        return topics;
    }

    public Topic updateTopic(Topic topic){
        for (Topic it:topics) {
            if(it.getId().equals(topic.getId())){
                it.setName(topic.getName());
                it.setDescription(topic.getDescription());
                break;
            }
        }
        return topic;
    }

    public void deleteTopic(String  id){
        int i=0;
        for (Topic it:topics) {
            if(it.getId().equals(id)){
                topics.remove(i);
                return;
            }
            i++;
        }
    }
}
