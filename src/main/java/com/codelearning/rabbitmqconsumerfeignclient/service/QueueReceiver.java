package com.codelearning.rabbitmqconsumerfeignclient.service;

import com.codelearning.rabbitmqconsumerfeignclient.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface QueueReceiver {
    ResponseEntity<String> messageGetFromQueue(String m);
}
