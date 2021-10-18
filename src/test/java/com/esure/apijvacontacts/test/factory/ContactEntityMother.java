package com.esure.apijvacontacts.test.factory;

import com.esure.apijvacontacts.entity.ContactEntity;

public class ContactEntityMother {

    public static ContactEntity fredBloggs() {
        return new ContactEntity().setId(1L).setName("Fred Bloggs").setPhone("27964");
    }
}
