package com.codeartist.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping("/{id}")
    public  String getProducer(@PathVariable String id){
        return "Hi from producer with id "+id;
    }
}
