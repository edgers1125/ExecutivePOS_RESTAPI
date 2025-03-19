package domain.entities;

import jakarta.annotation.Generated;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String employeeNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeStatus status;

    private String position;

    private String department;

    @Column(nullable = false)
    private Integer workNumber;

    @Column(nullable = false)
    private String bankName;

    @Column(nullable = false)
    private Integer bankNumber;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)

    private CompanyEntity company;


    public enum EmployeeStatus{
        ACTIVE, SUSPENDED, RESIGNED,ON_LEAVE
    }
}
