package com.example.application.Bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Matiere implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String Nom;
@OneToOne
@JoinColumn(name = "Id_Niveau")
private Niveau Niveaus;
public Matiere() {
	super();
}
public Matiere(String nom) {
	super();
	Nom = nom;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}

public Niveau getNiveaus() {
	return Niveaus;
}
public void setNiveaus(Niveau niveaus) {
	Niveaus = niveaus;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Id == null) ? 0 : Id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Matiere other = (Matiere) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
