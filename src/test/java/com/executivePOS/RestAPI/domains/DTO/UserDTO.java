package com.executivePOS.RestAPI.domains.DTO;

import com.executivePOS.RestAPI.domains.embeddables.Address;
import com.executivePOS.RestAPI.domains.embeddables.GovtInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String email;
    private String password;
    private String personalNumber;
    private String firstName;
    private String lastName;
    private Address address;
    private GovtInfo govtInfo;
    private String contactPerson;
    private String contactPersonNumber;
    private LocalDate birthday;
}
