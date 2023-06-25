package com.ci.thirdparty.controllers;

import com.ci.thirdparty.dtos.TokenRequest;
import com.ci.thirdparty.dtos.TokenResponse;
import com.ci.thirdparty.models.Token;
import com.ci.thirdparty.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vi/token")

public class TokenController {
    @Autowired
    private TokenService tokenService;

    @PostMapping("/token")
    public TokenResponse generateToken(@RequestBody TokenRequest tokenRequest)
    {
        return tokenService.generateToken(tokenRequest);
    }
}
