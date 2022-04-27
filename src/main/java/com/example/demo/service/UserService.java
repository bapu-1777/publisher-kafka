package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.util.KafkaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class is used to perform business operation
 *
 * @author Mayank Vekariya
 *
 */

@Service("userService")
public class UserService {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    /**
     * This methods are used to publish customer records as msgs to kafka topic
     *
     * @return
     */


    public String singleUser(User user) {
        System.out.println("1");
        if (user!=null) {
                kafkaTemplate.send(KafkaConstants.TOPIC, user);
                System.out.println("************Msg published to Kafka topic***************");

        }
        return "Customer Record Added To Kafka Queue Successfully";

    }

    public String moreUsers(List<User> users) {
        if (!users.isEmpty()) {
            for (User c : users) {
                kafkaTemplate.send(KafkaConstants.TOPIC, c);
                System.out.println("************Msg published to Kafka topic***************");
            }
        }
        return "Customer Record Added To Kafka Queue Successfully";
    }

}
