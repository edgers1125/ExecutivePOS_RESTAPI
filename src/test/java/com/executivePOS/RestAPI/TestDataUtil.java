package com.executivePOS.RestAPI;

import com.executivePOS.RestAPI.domains.embeddables.Address;
import com.executivePOS.RestAPI.domains.embeddables.GovtInfo;
import com.executivePOS.RestAPI.domains.entities.UserEntity;

import java.time.LocalDate;

public class TestDataUtil {
    private TestDataUtil(){
    }

    public static UserEntity user1(){
        Address address1 = Address.builder()
                .line1("123 Mango St")
                .line2("Brgy. Malinis")
                .city("Quezon City")
                .stateProvince("NCR")
                .latitude(14.6760)
                .longitude(121.0437)
                .placeId("place123")
                .build();

        GovtInfo govtInfo1 = GovtInfo.builder()
                .tinNo("123-456-789")
                .sssNo("34-5678901-2")
                .pagibigNo("1234-5678-9012")
                .philhealthNo("12-345678901-2")
                .build();

        LocalDate birthday1 = LocalDate.of(1995, 3, 15);

        UserEntity user = UserEntity.builder()
                .email("juan.delacruz@example.com")
                .password("securePass123")
                .personalNumber("09171234567")
                .firstName("Juan")
                .lastName("Dela Cruz")
                .address(address1)
                .govtInfo(govtInfo1)
                .contactPerson("Maria Dela Cruz")
                .contactPersonNumber("09981234567")
                .birthday(birthday1)
                .build();
        return user;
    }

    public static UserEntity user2(){
        Address address2 = Address.builder()
                .line1("45 Sampaguita Ave")
                .line2("Phase 2, Green Village")
                .city("Cebu City")
                .stateProvince("Cebu")
                .latitude(10.3157)
                .longitude(123.8854)
                .placeId("place456")
                .build();

        GovtInfo govtInfo2 = GovtInfo.builder()
                .tinNo("987-654-321")
                .sssNo("12-3456789-0")
                .pagibigNo("8765-4321-0987")
                .philhealthNo("98-765432109-8")
                .build();

        LocalDate birthday2 = LocalDate.of(2000, 7, 8);

        UserEntity user = UserEntity.builder()
                .email("ana.santos@example.com")
                .password("myPass456")
                .personalNumber("09281239876")
                .firstName("Ana")
                .lastName("Santos")
                .address(address2)
                .govtInfo(govtInfo2)
                .contactPerson("Pedro Santos")
                .contactPersonNumber("09191239876")
                .birthday(birthday2)
                .build();
        return user;
    }
    public static UserEntity user3(){
        Address address3 = Address.builder()
                .line1("78 Rizal Blvd")
                .line2("Purok 5")
                .city("Davao City")
                .stateProvince("Davao del Sur")
                .latitude(7.1907)
                .longitude(125.4553)
                .placeId("place789")
                .build();

        GovtInfo govtInfo3 = GovtInfo.builder()
                .tinNo("456-789-123")
                .sssNo("56-7890123-4")
                .pagibigNo("3456-7890-1234")
                .philhealthNo("34-567890123-4")
                .build();

        LocalDate birthday3 = LocalDate.of(1988, 12, 1);

        UserEntity user = UserEntity.builder()
                .email("mark.reyes@example.com")
                .password("testPass789")
                .personalNumber("09051239876")
                .firstName("Mark")
                .lastName("Reyes")
                .address(address3)
                .govtInfo(govtInfo3)
                .contactPerson("Liza Reyes")
                .contactPersonNumber("09351239876")
                .birthday(birthday3)
                .build();
        return user;
    }
}
