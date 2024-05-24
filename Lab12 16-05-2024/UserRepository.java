package com.companyname.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springbootcrudrest.model.User;

/**
 * Repository interface for User entities.
 * Extends JpaRepository to provide CRUD operations and more.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository provides methods for basic CRUD operations
   }
