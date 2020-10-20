package com.react.project.socMed.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "userLogin")
public class Login {

    @Id
    private UUID userId;
    private String userEmail;
    private String userPassword;
    private boolean loggedIn;

    public Login(@JsonProperty("id") UUID userId, @JsonProperty("login") boolean loggedIn, @JsonProperty("email") String userEmail, @JsonProperty("password") String userPassword) {
        this.userId = userId;
        this.loggedIn = loggedIn;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
