package com.example.demo.security;

public class UserRecord {
    private Long id;
    private String email;
    private String password;
    private String role;

    public UserRecord(Long id, String email, String password, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
}