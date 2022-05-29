package com.connection;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	

	public static void SendNotification(String email,String notification_msg){
		String to = email;
		String subject = "Drive Notification";
		String msg = "This is the Drive Notification for you :\n"+notification_msg;
		final String user="icoer.comp.placement.in@gmail.com";
		   final String pass="Icoer@123";// send mail qrcode
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587"); // this is optional
		props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(user, pass);
					}
				});
		
		//session.getProperties().put("mail.smtp.ssl.trust", "smtp.gmail.com");


		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));
			message.setSubject(subject);
			message.setText(msg);
			
			Transport.send(message);
			System.out.println("sending");
			System.out.println("Send successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
		
		 }  
	public static void main(String[] args) {
		
	}
}
