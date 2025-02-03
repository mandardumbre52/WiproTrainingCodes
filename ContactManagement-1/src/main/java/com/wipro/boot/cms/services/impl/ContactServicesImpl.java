package com.wipro.boot.cms.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.wipro.boot.cms.model.Contact;
import com.wipro.boot.cms.repository.ContactRepository;
import com.wipro.boot.cms.services.IContactServices;

@Service
public class ContactServicesImpl implements IContactServices {
    private ContactRepository contactRepo;

    // Constructor Injection
    @Autowired 
    public ContactServicesImpl(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    @Override
    public List<Contact> getContactsInOrder() {
        return contactRepo.findAll(Sort.by("contactName").descending());
    }
}
