package com.react.project.socMed.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "userRegistry")
public class Register {

    @Id
    private UUID userId;
    private String userName;
    private String userPassword;
    private Date userDate;
    private String userEmail;
    private String userPhone;
    private int userFriends;
    private int userPosts;

    public Register(@JsonProperty("id") UUID userId, @JsonProperty("name") String userName, @JsonProperty("password") String userPassword, @JsonProperty("date") Date userDate, @JsonProperty("email") String userEmail, @JsonProperty("phone") String userPhone, @JsonProperty("friends") int userFriends, @JsonProperty("posts") int userPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userDate = userDate;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userFriends = userFriends;
        this.userPosts = userPosts;
    }

    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserDate() {
        return userDate;
    }
    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserFriends() {
        return userFriends;
    }
    public void setUserFriends(int userFriends) {
        this.userFriends = userFriends;
    }

    public int getUserPosts() {
        return userPosts;
    }
    public void setUserPosts(int userPosts) {
        this.userPosts = userPosts;
    }
}
