package ru.gb.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import ru.gb.mail.repository.UserEmail;
import ru.gb.task.service.TaskService;
import ru.gb.user.model.User;

@Service
public class UserServiceEmail {
//    @Autowired
//    private UserEmail userEmail;
//
//    @Autowired
//    private TaskService taskService;
//
//    @Autowired
//    EmailService emailService;

    public ResponseEntity<?> notificationByMail(User user){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(user.getEmail());
        mailMessage.setSubject("Вам поступила новая задача");
        mailMessage.setText("");
        return ResponseEntity.ok("Сотрудник оповещен");
    }
}
