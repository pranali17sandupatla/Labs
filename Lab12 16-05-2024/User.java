package com.companyname.springbootcrudrest.model;

import java.util.Date;

import jakarta.persistence.*;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Entity class representing a User.
 * Annotated with JPA and Spring Data annotations for ORM and auditing support.
 */
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    // Primary key field
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedby;

    // ID field with auto generation strategy
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    // First name field with not null constraint
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name field with not null constraint
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Email address field with not null constraint
    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    // Created at field with auditing support for creation date
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    // Created by field with auditing support for creator's identifier
    @Column(name = "created_by", nullable = false, updatable = false)
    @CreatedBy
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    // Updated at field with auditing support for last modification date
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Updated by field with auditing support for last modifier's identifier
    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    public String getUpdatedby() {
        return updatedby;
    }
    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }
}
