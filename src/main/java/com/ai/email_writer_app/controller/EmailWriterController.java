package com.ai.email_writer_app.controller;

import com.ai.email_writer_app.bo.EmailRequest;
import com.ai.email_writer_app.service.EmailWriterSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailWriterController {
    @Autowired
    EmailWriterSvc emailWriterSvc;

    @PostMapping
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailWriterSvc.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
