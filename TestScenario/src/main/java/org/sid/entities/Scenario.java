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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="scenario")

@Getter
@Setter
@ToString
public class Scenario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idScenario")
	private int id;
	
	@Column(name="NomScenario")
	private String Nom;
	
	private String Objectif;
	
	private String requiert;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="Test")
	private Set<Test> test;
	
	@ManyToOne
	@JoinColumn(name="Version_idVersion", nullable=false)
	private Version version;
	

    @OneToOne(cascade=CascadeType.ALL , mappedBy="Personne")
	private Set<Personne> personne;

}
