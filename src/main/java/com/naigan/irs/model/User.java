package com.naigan.irs.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

    @NotNull(message="UserId must not be blank")
    @Size(min = 4,max=15,message = "UserId must between 4 to 15 characters")
    private String userId;

    @NotNull(message="password must not be blank")
    @Size(min = 8,max=15,message = "UserId must between 8 to 15 characters")
    private String password;

    @NotNull(message="Name must not be blank")
    @Size(min = 4,max=15,message = "Name must between 4 to 15 characters")
    private String name;

    @NotNull(message="City must not be blank")
    private String city;

    @NotNull(message="Email must not be blank")
    @Email
    private String email;

    @NotNull(message="PhoneNumber must not be blank")
    @Size(min = 10,max=10,message = "Phone Number must be 10 digits")
    private String phone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
