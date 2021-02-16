package com.pk4u.testregistrationfirebase.Models;

public class User {
    private String name,email,pass,phone;

    public User(){ }

    public User(String name, String email, String pass, String phone) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPass() { return pass; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPass(String pass) { this.pass = pass; }
    public void setPhone(String phone) { this.phone = phone; }
}
