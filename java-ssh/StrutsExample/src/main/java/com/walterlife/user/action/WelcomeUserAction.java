package com.walterlife.user.action;

public class WelcomeUserAction  {
    private String username;

    public String getUsername() {
        return username;
    } 

    public void setUsername(String username) {
        this.username = username;
    } 

    // struts logic
    public String execute() {
        return "SUCCESS"; 
    } 
}
