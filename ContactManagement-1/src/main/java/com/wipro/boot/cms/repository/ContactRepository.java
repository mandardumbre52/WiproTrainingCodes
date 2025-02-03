package com.wipro.boot.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.boot.cms.model.Contact;
import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Sorting Methods
    List<Contact> findByOrderByContactName();
    List<Contact> findByOrderByContactNameAsc();
    List<Contact> findByOrderByContactNameDesc();
}
