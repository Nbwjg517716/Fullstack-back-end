package com.codenicolas.fullstack_backend.repository.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String name;
    private String email;

    // Constructor padre
    public User() {
    }

    // Constructor com parametrise
    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String email, String name, String username) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.username = username;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void serName(String name) {
    }
}