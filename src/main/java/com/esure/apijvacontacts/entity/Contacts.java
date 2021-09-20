package com.esure.apijvacontacts.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contacts")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode()
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Contacts {
    private static final long MAX_NAME_LENGTH = 30;
    private static final long MAX_PHONE_LENGTH = 20;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",insertable = false)
    @Id
    private Long id;

    @Max(MAX_NAME_LENGTH)
    @NotNull
    private String name;

    @Max(MAX_PHONE_LENGTH)
    @NotNull
    private String phone;
}