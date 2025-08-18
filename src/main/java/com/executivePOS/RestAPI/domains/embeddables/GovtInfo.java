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
public class GovtInfo {
    private String tinNo;
    private String sssNo;
    private String pagibigNo;
    private String philhealthNo;
}
