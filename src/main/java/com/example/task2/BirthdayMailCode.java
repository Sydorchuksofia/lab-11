package com.example.task2;

public class BirthdayMailCode implements MailCode{

    @Override
    public String generate(Client client) {
        return String.format("Dear %s  Happy Birthday", client.getName(), client.getAge());
    }
}
