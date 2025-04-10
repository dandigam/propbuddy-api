package com.prop.app.service;

import com.prop.app.dto.ContactRequestDto;
import com.prop.app.entity.Contact;
import com.prop.app.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsService {

    @Autowired
    private ContactUsRepository contactRepository;

    public void saveContact(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        contact.setName(contactRequestDto.getName());
        contact.setEmail(contactRequestDto.getEmail());
        contact.setSubject(contactRequestDto.getSubject());
        contact.setMessage(contactRequestDto.getMessage());
        contactRepository.save(contact);
    }
}
