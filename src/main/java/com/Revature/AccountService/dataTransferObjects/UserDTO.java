package com.Revature.AccountService.dataTransferObjects;

import com.Revature.AccountService.beans.User;
import com.Revature.AccountService.beans.enums.SecurityLevel;

public class UserDTO {
    private long userId;
    private String firstName;
    private String lastName;
    private String pword;
    private int securityLevel;

    public UserDTO(){}

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public User convertToUser(){
        User u = new User(
                this.userId,
                this.firstName,
                this.lastName,
                this.pword,
                SecurityLevel.getSecurityLevelbyLevelId(this.securityLevel));
        return u;
    }
}
