package org.sid.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Personne")

@Getter
@Setter
@ToString
public class Personne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPersonne")
	private int id;
	
	@Column(name="NomPersonne")
	private String Nom;
	
	private String specialite;
	
    @OneToOne(cascade=CascadeType.ALL , mappedBy="Scenario")
	private Set<Scenario> scenario;
	

}
