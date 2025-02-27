package com.example.securitysetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.securitysetup.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {
 
}
