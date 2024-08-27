package com.deliveryboy.deliveryboy.service;


import com.deliveryboy.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired //available for container
    private KafkaTemplate<String,String>kafkaTemplate;


    private Logger logger= LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
//        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
//        this.logger.info("message produced");
       //this is just producing the message
            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
            this.logger.info("message produced");

        return true;
    }
}
