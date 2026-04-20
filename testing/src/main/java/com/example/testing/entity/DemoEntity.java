package com.example.testing.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "demoentity")
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String DemoString;
    private int DemoInt;
}
