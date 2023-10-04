package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}