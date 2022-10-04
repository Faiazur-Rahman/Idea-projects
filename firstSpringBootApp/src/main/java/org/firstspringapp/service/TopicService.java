package org.firstspringapp.service;

import org.firstspringapp.entity.Topic;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Service
public class TopicService {

    FileWriter file = new FileWriter("C:\\Users\\BS943\\Desktop\\TopicObjectList.json");

    public TopicService() throws IOException {
    }
    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
            new Topic("java", "Java", "Java description"),
            new Topic("python", "Python", "Python description"))
    );

    public List<Topic> getTopics(){
        Map<String, String> integer = new HashMap<>(20);
        return topics;
    }

    public String getTopic(String id){
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(Object::toString)
                .orElse("Not Found");
    }

    public void addTopic(Topic topic) throws IOException {
        file.write(topic.toString());
        file.flush();
//        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++){
            if (topics.get(i).getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.remove(id);
    }
}
