package com.esure.apijvacontacts.repository;


import com.esure.apijvacontacts.entity.ContactEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("it")
class ContactsRepositoryIT {

    @Autowired
    private ContactsRepository repository;

    @Test
    void findAllTest() {
        final List<ContactEntity> contacts = repository.findAll();
        assertThat(contacts.size()).isEqualTo(3);
    }
}
