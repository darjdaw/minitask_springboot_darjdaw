package com.example.battleship.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    public Task() {
       this.completed = false;
    }

    private boolean completed = false;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Long getId() {
        return id;
    }
}