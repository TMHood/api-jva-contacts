package com.esure.apijvacontacts.repository;

import com.esure.apijvacontacts.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ContactsRepository
        extends JpaRepository<ContactEntity, Long>, JpaSpecificationExecutor<ContactEntity> {

}
