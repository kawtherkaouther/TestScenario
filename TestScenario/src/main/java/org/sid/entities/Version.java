package org.sid.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="version")

@Getter
@Setter
@ToString
public class Version {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idVersion")
	private int id;
	
	@Column(name="DateCreation")
	private Date date_creation;
	
	@Column(name="Dateupdated")
	private Date date_updated;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="Scenario")
	private Set<Scenario> scenario;

}
