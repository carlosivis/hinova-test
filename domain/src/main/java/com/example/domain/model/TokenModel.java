package com.example.domain.model;

import java.io.Serializable;

public class TokenModel implements Serializable {

    private String Token;

    public String getToken() {
        return this.Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }
}
