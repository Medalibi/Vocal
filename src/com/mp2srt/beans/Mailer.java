package com.mp2srt.beans;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

	
	
	 
	public static void mailsender() {
	 
		
	 
			final String username = "projectmpsrt@gmail.com";
			final String password = "MYpassis0000";
	 
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
	 
			Session session = Session.getInstance(props,
			  new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			  });
	 
			try {
	 
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("projectmpsrt@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("alibimohamed@gmail.com"));
				message.setSubject("Weekly meeting H3ABioNet");
				message.setText("Dear Administrator,"
					+ "\n\n there is an attempt to hack into your aplication" 
						+ "\n");
	 
				Transport.send(message);
	 
				System.out.println("Mail sent");
	 
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		
	}
	
}
