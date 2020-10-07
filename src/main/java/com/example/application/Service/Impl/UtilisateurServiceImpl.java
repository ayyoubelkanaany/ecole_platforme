package com.example.application.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.Bean.Utilisateur;
import com.example.application.Dao.UtilisateurRepository;
import com.example.application.Service.facad.UtilisateurService;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
	@Override
	public void save(Utilisateur utilisateur) {
		this.utilisateurRepository.save(utilisateur);
	}

	@Override
	public Boolean Update(Utilisateur utilisateur) {
		
		return null;
	}

	@Override
	public List<Utilisateur> getAll() {
		
		return this.utilisateurRepository.findAll();
	}

	@Override
	public Optional<Utilisateur> getUtilisateur(Long Id) {
		return this.utilisateurRepository.findById(Id);
	}

}
