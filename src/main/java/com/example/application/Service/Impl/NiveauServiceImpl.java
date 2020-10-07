package com.example.application.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.Bean.Niveau;
import com.example.application.Dao.NiveauRepository;
import com.example.application.Service.facad.NiveauService;
@Service
public class NiveauServiceImpl implements NiveauService{
  @Autowired
  private NiveauRepository niveauRepository;
	@Override
	public void saveNiveau(Niveau niveau) {
		this.niveauRepository.save(niveau);
		
	}

	@Override
	public void deleteNiveau(Long Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Niveau> getAllNiveau() {
		
		return this.niveauRepository.findAll();
	}

}
