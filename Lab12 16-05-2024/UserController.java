package com.companyname.springbootcrudrest.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.springbootcrudrest.exception.ResourceNotFoundException;
import com.companyname.springbootcrudrest.model.User;
import com.companyname.springbootcrudrest.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    /**
     * Get all users.
     * 
     * @return List of all users.
     */
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Get a user by ID.
     * 
     * @param userId ID of the user to retrieve.
     * @return ResponseEntity containing the user if found.
     * @throws ResourceNotFoundException if the user is not found.
     */
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(
            @PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
        return ResponseEntity.ok().body(user);
    }

    /**
     * Create a new user.
     * 
     * @param user User object to create.
     * @return Created user.
     */
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    /**
     * Update a user by ID.
     * 
     * @param userId ID of the user to update.
     * @param userDetails User object with updated details.
     * @return ResponseEntity containing the updated user.
     * @throws ResourceNotFoundException if the user is not found.
     */
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable(value = "id") Long userId,
            @Valid @RequestBody User userDetails) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
        
        // Update user details
        user.setEmailId(userDetails.getEmailId());
        user.setLastName(userDetails.getLastName());
        user.setFirstName(userDetails.getFirstName());
        user.setUpdatedAt(new Date());
        
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    /**
     * Delete a user by ID.
     * 
     * @param userId ID of the user to delete.
     * @return Map containing a boolean value indicating whether the deletion was successful.
     * @throws ResourceNotFoundException if the user is not found.
     */
    @DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(
            @PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));

        userRepository.delete(user);
        
        // Response map to indicate successful deletion
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
