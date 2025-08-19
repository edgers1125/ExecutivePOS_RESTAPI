package com.executivePOS.RestAPI.domains.entities;

import com.executivePOS.RestAPI.domains.embeddables.Address;
import com.executivePOS.RestAPI.domains.embeddables.GovtInfo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Longs id;

    @Column(nullable = false, unique = true)
    @Email(message = "Email should be valid")
    private String email;
    @Column(nullable = false)
    private String password;

    private String personalNumber;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Embedded
    private Address address;

    @Embedded
    @Column(nullable = false)
    private GovtInfo govtInfo;

    @Column(nullable = false)
    private String contactPerson;
    @Column(nullable = false)
    private String contactPersonNumber;

    @Column(nullable = false)
    private LocalDate birthday;

}
