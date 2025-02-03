package com.wipro.boot.cms;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.wipro.boot.cms.model.Contact;
import com.wipro.boot.cms.services.IContactServices;

@SpringBootApplication
public class ContactManagement1Application implements CommandLineRunner {
    @Autowired
    private IContactServices contactService;

    public static void main(String[] args) {
        SpringApplication.run(ContactManagement1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Contact> contacts = contactService.getContactsInOrder();
        contacts.forEach(System.out::println);
    }
}
