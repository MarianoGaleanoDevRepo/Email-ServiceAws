package com.galeano.emailservice.application;

import com.galeano.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import com.galeano.emailservice.adapters.EmailSenderGateway;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {
 private final EmailSenderGateway emailSenderGateway;
    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to,subject,body);

    }
}
