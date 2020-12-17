package com.senforage.EauSenforage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom; 
	@OneToMany(mappedBy="village",fetch=FetchType.LAZY)
	private List<Abonne> abonnes = new ArrayList<>();
	@OneToMany(mappedBy="village", fetch=FetchType.LAZY)
	private List<User> users = new ArrayList<>();
	
	public Village() {
		//super();
	}
	public Village(int id, String nom, List<Abonne> abonnes, List<User> users) {
		//super();
		this.id = id;
		this.nom = nom;
		this.abonnes = abonnes;
		this.users = users;
	}
	public Village(int id, String nom) {
		//super();
		this.id = id;
		this.nom = nom;
		
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Abonne> getAbonnes() {
		return abonnes;
	}
	public void setAbonnes(List<Abonne> abonnes) {
		this.abonnes = abonnes;
	}
	@Override
	public String toString() {
		return "Village [id=" + id + ", nom=" + nom + ", abonnes=" + abonnes + "]";
	}
	
	
	}
