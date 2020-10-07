package com.example.application.Bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Utilisateur implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String Nom;
private String Prenom;
private double Telephone;
private int Age;
private String Mail;
private String Adress;
private String image;
private String password;
@OneToOne
@JoinColumn(name = "Id_Niveau")
private Niveau Niveau;
public Utilisateur() {
	super();
}
public Utilisateur(String nom, String prenom, double telephone, int age, String mail, String adress, String image,
		com.example.application.Bean.Niveau niveau) {
	super();
	Nom = nom;
	Prenom = prenom;
	Telephone = telephone;
	Age = age;
	Mail = mail;
	Adress = adress;
	this.image = image;
	Niveau = niveau;
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
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public double getTelephone() {
	return Telephone;
}
public void setTelephone(double telephone) {
	Telephone = telephone;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getMail() {
	return Mail;
}
public void setMail(String mail) {
	Mail = mail;
}
public String getAdress() {
	return Adress;
}
public void setAdress(String adress) {
	Adress = adress;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Niveau getNiveau() {
	return Niveau;
}
public void setNiveau(Niveau niveau) {
	Niveau = niveau;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
	Utilisateur other = (Utilisateur) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
