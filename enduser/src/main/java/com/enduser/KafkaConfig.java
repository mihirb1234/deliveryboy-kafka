package com.enduser;


import com.enduser.Config.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {


    @KafkaListener(topics=AppConstants.LOCATION_UPDATE_TOPIC,groupId=AppConstants.GROUP_ID) //annotation that listens continously
    public void UpdatedLocation(String value){
        System.out.println(value);
    }
}
