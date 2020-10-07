package com.example.application.Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
@Entity
public class Cours implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private Date DateAjout;
@OneToOne
@JoinColumn(name = "Id_Posteur")
private Utilisateur Posteur;
@OneToOne
@JoinColumn(name = "Id_Categorie")
private CategorieCours Categorie;

public Cours() {
	super();
}
public Cours(Date dateAjout, Utilisateur posteur, CategorieCours categorie) {
	super();
	DateAjout = dateAjout;
	Posteur = posteur;
	Categorie = categorie;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public Date getDateAjout() {
	return DateAjout;
}
public void setDateAjout(Date dateAjout) {
	DateAjout = dateAjout;
}
public Utilisateur getPosteur() {
	return Posteur;
}
public void setPosteur(Utilisateur posteur) {
	Posteur = posteur;
}

public CategorieCours getCategorie() {
	return Categorie;
}
public void setCategorie(CategorieCours categorie) {
	Categorie = categorie;
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
	Cours other = (Cours) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
