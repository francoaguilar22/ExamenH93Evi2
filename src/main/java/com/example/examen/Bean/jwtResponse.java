package com.example.examen.Bean;

public class jwtResponse {

    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public jwtResponse (String token){
        this.token = token;
    }

    public jwtResponse (){

    }

}
