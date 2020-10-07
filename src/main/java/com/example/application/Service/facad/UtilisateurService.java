package com.example.application.Service.facad;

import java.util.List;
import java.util.Optional;

import com.example.application.Bean.Utilisateur;

public interface UtilisateurService {
	public void save(Utilisateur utilisateur);
	public Boolean Update(Utilisateur utilisateur);
	public List<Utilisateur> getAll();
	public Optional<Utilisateur> getUtilisateur(Long Id);

}
