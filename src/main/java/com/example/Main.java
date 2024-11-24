package com.example;

import java.util.List;

import com.example.task1.Student;
import com.example.task2.BirthdayMailCode;
import com.example.task2.Client;
import com.example.task2.MailCode;
import com.example.task2.MailInfo;
import com.example.task2.MailSender;


public class Main {
    public static void main(String[] args) {

        // Student student = Student.builder()
        //         .firstName("Sasha")
        //         .lastName("Podruchko")
        //         .age(31)
        //         .gender("female")
        //         .courses(List.of())
        //         .course("new course")
        //         .build();

        // System.out.println(student);

        // StudentBuilder studentBuilder = new StudentBuilder();
        // studentBuilder.firstName("Sasha").lastName("Podruchko").age(31).build();
        // System.out.println(studentBuilder);

        Client client = Client.builder().name("client").age(2).email("test").build();
        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, client1 -> "rnd");

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
    
}


