package com.ai.email_writer_app.bo;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
