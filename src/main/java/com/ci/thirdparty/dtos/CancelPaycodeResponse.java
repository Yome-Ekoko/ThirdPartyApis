package com.ci.thirdparty.dtos;

import lombok.Data;

@Data
public class CancelPaycodeResponse {
    public String statusCode;
    public String statusMessage;
    public String requestId;
}
