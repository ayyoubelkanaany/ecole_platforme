package com.example.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.Bean.Cours;
import com.example.application.Bean.Utilisateur;

public interface CoursRepository extends JpaRepository<Cours, Long>{

}
