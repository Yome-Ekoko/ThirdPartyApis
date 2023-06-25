package com.ci.thirdparty.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Data
public class Paycode {
    private String requestId;
    private String wallet;
    private String  walletId;
    private String  amount;
    private String  tempPin;
    private String   callbackUrl;
}
