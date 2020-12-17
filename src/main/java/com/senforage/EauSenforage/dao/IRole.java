package com.senforage.EauSenforage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.senforage.EauSenforage.entities.Role;

@Repository
public interface IRole extends JpaRepository<Role, Integer>{

	@Query("SELECT r FROM Role r WHERE r.nom=:nom")
	public Role geRoleByNom(@Param(value="nom") String nom);

}
