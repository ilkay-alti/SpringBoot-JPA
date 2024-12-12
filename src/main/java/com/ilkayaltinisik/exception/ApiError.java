package com.ilkayaltinisik.exception;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {

    private String id;
    private String errorTime;
    private T errors;
}
