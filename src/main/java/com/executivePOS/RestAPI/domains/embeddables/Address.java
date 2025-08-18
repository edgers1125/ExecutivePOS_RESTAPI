package com.executivePOS.RestAPI.domains.embeddables;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {
    private String line1;
    private String line2;
    private String city;
    private String stateProvince;
    private String postalCode;
    private Double latitude;
    private Double longitude;
    private String placeId;
}
