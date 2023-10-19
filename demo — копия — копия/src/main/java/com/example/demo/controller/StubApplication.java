package com.example.demo.controller;

import com.example.demo.dto.MessageRequest;
import com.example.demo.dto.MessageResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@SpringBootApplication
@RestController
@RequestMapping("/post-message")
public class StubApplication {


    @PostMapping
    public ResponseEntity<MessageResponse> postMessage(@RequestBody MessageRequest request) {
        String msgId = request.getMsg_id();
        long timestamp = Instant.now().toEpochMilli();

        MessageResponse response = new MessageResponse(msgId, timestamp);
        return ResponseEntity.ok(response);

    }


}
