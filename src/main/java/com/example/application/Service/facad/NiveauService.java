package com.example.application.Service.facad;

import java.util.List;

import com.example.application.Bean.Niveau;

public interface NiveauService {
public void saveNiveau(Niveau niveau);
public void deleteNiveau(Long Id);
public List<Niveau> getAllNiveau();
}
