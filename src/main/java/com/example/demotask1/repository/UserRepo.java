package com.example.task1.repository;


import com.example.task1.model.userModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<userModels, Integer> {

}
