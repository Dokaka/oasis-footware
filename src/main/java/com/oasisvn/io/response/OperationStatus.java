package com.oasisvn.io.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationStatus {
    private int status;
    private boolean success;
    private String message;
    private Object data;
}
