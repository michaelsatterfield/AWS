package com.example.resume_backend.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Data;

// The Client class represents an entity in the database.
// The class is annotated with @Entity, which indicates that this class is an entity.
// The class contains fields that represent the columns in the database table.
// The class also contains getters and setters for the fields.
// The class is used by the service and repository classes to interact with the database.
// The Client class is a simple POJO (Plain Old Java Object) that represents a client entity.
// The class contains fields for the client's id, name, position, and salary.
@Entity
@Table(name = "clients") // Renaming the database table
@Data
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment

    private Long id;
    private String name; //will remove for fn lm
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String dateOfBirth;
    private String city;
    private String state;
    private String contactType;
    private String leadSource;
    private String referredBy;

        // Relationship with Cases
     //   @OneToMany(mappedBy = "client") // "client" is the field in Cases
    //    private List<Cases> cases; // List of cases associated with this client

    // Getters and setters not needed with Lombok
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getPosition() {
//         return position;
//     }

//     public void setPosition(String position) {
//         this.position = position;
//     }

//     public Double getSalary() {
//         return salary;
//     }

//     public void setSalary(Double salary) {
//         this.salary = salary;
//     }
 }