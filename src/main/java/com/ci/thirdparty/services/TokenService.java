package com.ci.thirdparty.services;

import com.ci.thirdparty.dtos.TokenRequest;
import com.ci.thirdparty.dtos.TokenResponse;
import com.ci.thirdparty.models.Token;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    public TokenResponse generateToken(TokenRequest tokenRequest);

}
