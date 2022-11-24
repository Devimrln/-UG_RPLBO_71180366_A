package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){
        this.email = email;
        this.username = username;
        this.totalMention = totalMention;
    }
    public void printInfo(){
        System.out.println("Username: " + username);
        System.out.println("Email :" + email);
        System.out.println("Total Mention : " + totalMention);
    }
    public void login(String email){

    }
    public void post(String caption){

    }
}
