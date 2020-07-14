package com.online.school.resource;

import com.online.school.dto.ClassDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/producer")
    public String sendMsg(){
        ClassDto classDto = new ClassDto();
        rabbitTemplate.convertAndSend("ex-raj","ro-key",classDto);
        return "Msg send successfully...!";
    }


}
