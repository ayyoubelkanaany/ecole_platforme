package com.example.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.Bean.QuestionCours;
import com.example.application.Bean.Utilisateur;

public interface QuestionCoursRepository extends JpaRepository<QuestionCours, Long>{

}
