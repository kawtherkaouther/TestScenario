package org.sid.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="projet")

@Getter
@Setter
@ToString
public class Projet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProjet")
	private int id;
	
	@Column(name="NomProjet")
	private String Nom;
	
	@ManyToOne
	@JoinColumn(name="Client_idClient", nullable=false)
	private Client Client;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="Test")
	private Set<Test> test;
	
	

}
