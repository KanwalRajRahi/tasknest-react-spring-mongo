package com.tasknest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "boards")
public class Board {
    @Id
    private String id;
    private String name;
    private LocalDateTime createdAt;

    // Constructors
    public Board() {
        this.createdAt = LocalDateTime.now();
    }
    
    public Board(String name) { 
        this.name = name; 
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
} 