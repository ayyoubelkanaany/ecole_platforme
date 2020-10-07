package com.example.application.Bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class QuestionCours implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String Question;
private Date DatePoste;
@OneToOne
@JoinColumn(name = "Id_cours")
private Cours Cours;
public QuestionCours() {
	super();
}
public QuestionCours(String question, Date datePoste, com.example.application.Bean.Cours cours) {
	super();
	Question = question;
	DatePoste = datePoste;
	Cours = cours;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getQuestion() {
	return Question;
}
public void setQuestion(String question) {
	Question = question;
}
public Date getDatePoste() {
	return DatePoste;
}
public void setDatePoste(Date datePoste) {
	DatePoste = datePoste;
}
public Cours getCours() {
	return Cours;
}
public void setCours(Cours cours) {
	Cours = cours;
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
	QuestionCours other = (QuestionCours) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
