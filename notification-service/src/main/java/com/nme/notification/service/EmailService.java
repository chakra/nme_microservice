package com.nme.notification.service;

import com.nme.notification.domain.NotificationType;
import com.nme.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
