package com.example.task1.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="users")
public class userModels {
    @Id
    @Column(name = "user_id")
    private String first_name;
    private String last_name;
    private Integer contact_info;
    private Integer user_id;
    private String role;
    private Date createdDate;
    private Date lastModifiedDate;
    private String lastModifiedBy;
    private String createdBy;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getContact_info() {
        return contact_info;
    }

    public void setContact_info(Integer contact_info) {
        this.contact_info = contact_info;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public userModels(String first_name, String last_name, Integer contact_info, Integer user_id, String role, Date createdDate, Date lastModifiedDate, String lastModifiedBy, String createdBy) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.contact_info = contact_info;
        this.user_id = user_id;
        this.role = role;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
    }


    public userModels() {

    }
}
