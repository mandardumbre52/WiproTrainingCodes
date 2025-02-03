package com.wipro.boot.cms.services;

import java.util.List;
import com.wipro.boot.cms.model.Contact;

public interface IContactServices {
    List<Contact> getContactsInOrder();
}
