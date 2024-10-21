package com.learning.ecommerce.dtos;

public class RegisterUserDto {
    private String email;
    
    private String password;
    
    private String fullName;
    
    // getters and setters here..
    public String getFullName(){
        return this.fullName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
