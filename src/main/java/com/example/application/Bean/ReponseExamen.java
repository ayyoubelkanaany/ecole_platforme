package com.example.application.Bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class ReponseExamen implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id ;
private Boolean Etat;
@OneToOne
@JoinColumn(name = "Id_QuestionExamen")
private QuestionExamen Question;
public ReponseExamen() {
	super();
}
public ReponseExamen(QuestionExamen question) {
	super();
	Question = question;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public Boolean getEtat() {
	return Etat;
}
public void setEtat(Boolean etat) {
	Etat = etat;
}
public QuestionExamen getQuestion() {
	return Question;
}
public void setQuestion(QuestionExamen question) {
	Question = question;
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
	ReponseExamen other = (ReponseExamen) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
