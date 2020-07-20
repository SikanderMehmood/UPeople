package com.People.Domain;

import java.util.List;

public class DomainPerson {
    private String name;
    private String email;
    private String password;
    private String collegeName;
    private boolean medical;
    private boolean engineering;
    private int fscMarks;
    private String UniversityName;
    private String role; //role can be student or senoir or guest ot Other
    private String status;
    private List<String> uniList;

    public DomainPerson(String name, String email, String password, String collegeName, boolean medical, boolean engineering, int fscMarks, String universityName, String role, String status,List uniList) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.collegeName = collegeName;
        this.medical = medical;
        this.engineering = engineering;
        this.fscMarks = fscMarks;
        UniversityName = universityName;
        this.role = role;
        this.uniList=uniList;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public boolean isMedical() {
        return medical;
    }

    public void setMedical(boolean medical) {
        this.medical = medical;
    }

    public boolean isEngineering() {
        return engineering;
    }

    public void setEngineering(boolean engineering) {
        this.engineering = engineering;
    }

    public int getFscMarks() {
        return fscMarks;
    }

    public void setFscMarks(int fscMarks) {
        this.fscMarks = fscMarks;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
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
