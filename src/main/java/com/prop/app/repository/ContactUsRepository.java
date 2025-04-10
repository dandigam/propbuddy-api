package com.prop.app.repository;

import com.prop.app.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactUsRepository extends JpaRepository<Contact, Long> {
}
