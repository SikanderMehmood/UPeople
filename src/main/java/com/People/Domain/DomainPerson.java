package com.People.Domain;

public class DomainPerson {
    private String email;
    private String password;
    private String role; //role can be student or senoir or guest ot Other
    private String status;


    public DomainPerson() {
    }

    public DomainPerson(String email, String password, String role, String status) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.status=status;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}