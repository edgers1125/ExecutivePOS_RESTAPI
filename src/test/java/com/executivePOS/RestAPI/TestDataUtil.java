package com.executivePOS.RestAPI;

import com.executivePOS.RestAPI.domains.embeddables.Address;
import com.executivePOS.RestAPI.domains.embeddables.GovtInfo;
import com.executivePOS.RestAPI.domains.entities.UserEntity;

public class TestDataUtil {
    private TestDataUtil(){
    }

    public static UserEntity user1(){
        Address address = Address.builder()
                .line1()
                .line2()
                .city()
                .stateProvince()
                .latitude()
                .longitude()
                .placeId()
                .build();
        GovtInfo govtInfo = GovtInfo.builder()
                .tinNo()
                .sssNo()
                .pagibigNo()
                .philhealthNo()
                .build();
        return UserEntity.builder()
                .email("ejnavarro555@gmail.com")
                .password()
                .personalNumber()
                .firstName()
                .lastName()
                .address(address)
                .govtInfo(govtInfo)
                .contactPerson()
                .contactPersonNumber()
                .birthday(d)
                .build();
    }
}
