package com.esure.apijvacontacts.entity;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode()
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ContactEntity {
    private static final int MAX_NAME_LENGTH = 30;
    private static final int MAX_PHONE_LENGTH = 20;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    @Id
    private Long id;

    @Size(max = MAX_NAME_LENGTH)
    @NotNull
    private String name;

    @Size(max = MAX_PHONE_LENGTH)
    @NotNull
    private String phone;
}