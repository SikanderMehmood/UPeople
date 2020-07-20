package com.People.Model;

import java.util.List;

public class ModelPerson {
    private String name;
    private String email;
    private String password;
    private String collegeName;
    private boolean preMedical;
    private boolean preengineering;
    private int fscMarks;
    private String uniName;
    private List<String> uniList;

    private String role; //role can be student or senoir or guest ot Other


    public ModelPerson() {
    }

    public ModelPerson(String name, String email, String password, String collegeName, boolean preMedical, boolean preengineering, int fscMarks, String uniName, String role, List<String> uniList) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.collegeName = collegeName;
        this.preMedical = preMedical;
        this.preengineering = preengineering;
        this.fscMarks = fscMarks;
        this.uniName = uniName;
        this.role = role;
        this.uniList = uniList;
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

    public String getCollegeName() {
        return collegeName;
    }

    public List<String> getUniList() {
        return uniList;
    }

    public void setUniList(List<String> uniList) {
        this.uniList = uniList;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public boolean isPreMedical() {
        return preMedical;
    }

    public void setPreMedical(boolean preMedical) {
        this.preMedical = preMedical;
    }

    public boolean isPreengineering() {
        return preengineering;
    }

    public void setPreengineering(boolean preengineering) {
        this.preengineering = preengineering;
    }

    public int getFscMarks() {
        return fscMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFscMarks(int fscMarks) {
        this.fscMarks = fscMarks;
    }
}
