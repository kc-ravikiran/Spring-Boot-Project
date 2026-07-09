package Kiran.java.demo_usermanagement.repository;

import Kiran.java.demo_usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


// 1. interface UserRepository
//
//It is an interface, not a class
//We don’t write implementation → Spring provides it automatically
//
//
//2. extends JpaRepository<User, Long>
//This is the most important part:
//
//JpaRepository → Provided by Spring Data JPA
//User → Entity class (table it works on)
//Long → Type of primary key (@Id in User entity)


//What It Does
//By extending JpaRepository, you automatically get:
//✔ CRUD Operations
//
//save() → Insert/Update
//findById() → Get by ID
//findAll() → Get all users
//deleteById() → Delete user
//
//👉 No SQL required

// The UserRepository is a Spring Data JPA interface that extends JpaRepository to provide built-in CRUD operations for the User entity. It eliminates the need to write boilerplate DAO code, and Spring automatically generates the implementation at runtime. It acts as the data access layer between the application and the database.

// Uses
// Supports pagination and sorting
//Uses Hibernate internally
//Can define custom queries using method naming or @Query

