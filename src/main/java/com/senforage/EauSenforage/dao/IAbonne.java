package com.senforage.EauSenforage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.senforage.EauSenforage.entities.Abonne;

@Repository
public interface IAbonne extends JpaRepository<Abonne, Integer>{

	@Query("SELECT a FROM Abonne a WHERE a.nomClient=:nomClient")
	public Abonne getAbonneByNom(@Param(value="nomClient") String nomClient);

}
