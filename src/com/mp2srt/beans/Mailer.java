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

	//private String username = "projectmpsrt@gmail.com";
	//private String password = "MYpassis0000";
	
	 
	public void MailSender(final String username, final String password, String mailfrom, String mailto, String subject, String text) {
	 
		
	 
			
	 
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
				message.setFrom(new InternetAddress(mailfrom));   
				message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(mailto));               
				message.setSubject(subject);                      
				message.setText(text);						  
	 
				Transport.send(message);
	 
				System.out.println("Mail sent");
	 
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		
	}
	
}
