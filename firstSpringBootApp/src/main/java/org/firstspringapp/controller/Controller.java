package org.firstspringapp.controller;

import java.util.*;
import com.squareup.okhttp.*;
import com.google.gson.Gson;
import org.firstspringapp.entity.TestPojo;
import org.firstspringapp.service.BaseResponse;
import org.firstspringapp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TopicService topicService;

    @GetMapping("/")
    public String sayHi() {
        return "Hi";
    }

    @GetMapping("/consume-api")
    public BaseResponse<TestPojo> consumeAPI()  {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://universities.hipolabs.com/search?country=United+States")
                .addHeader("Content-Type", "application/json")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String str = response.body().string();
            BaseResponse<TestPojo> mockResponseBaseResponse = new BaseResponse<>();
            mockResponseBaseResponse.setMessage("Successful");
            mockResponseBaseResponse.setStatus("200");
            Gson gson = new Gson();
            List<TestPojo> testPojo = Arrays.asList(gson.fromJson(str, TestPojo[].class));
            mockResponseBaseResponse.setData(testPojo);
            return mockResponseBaseResponse;
        }
        catch (Exception e){
            BaseResponse<TestPojo> mockResponseBaseResponse = new BaseResponse<>();
            mockResponseBaseResponse.setMessage("Internal server error.");
            mockResponseBaseResponse.setStatus("500");
            return mockResponseBaseResponse;
        }
    }

//    @RequestMapping("/topics")
//    public List<Topic> allTopics() {
//        return topicService.getTopics();
//    }
//
//    @RequestMapping("/topics/{id}")
//    public String getTopic(@PathVariable String id) {
//        return topicService.getTopic(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/topics")
//    public void addTopic(@RequestBody Topic topic) throws IOException {
//        topicService.addTopic(topic);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
//    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
//        topicService.updateTopic(id, topic);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
//    public void deleteTopic(@PathVariable String id) {
//        topicService.deleteTopic(id);
//    }
}
