package com.ilkayaltinisik.dto;

import java.sql.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
    @NotEmpty(message = "Fistname alanı boş bırakılamaz")
    @Size(min = 3, max = 30)
    private String firstName;
    private String lastName;
    private Date birthOfDate;
}
