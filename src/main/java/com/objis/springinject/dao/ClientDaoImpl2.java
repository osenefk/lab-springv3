package com.objis.springinject.dao;

import org.springframework.stereotype.Repository;

import com.objis.springinject.domaine.Client;

@Repository // Pour rester coherent avec le principe de autowire
public class ClientDaoImpl2 implements IClientDao {

	public String ajouterClient(Client client) {
		// TODO Auto-generated method stub
		return "Creation Client";
	}

}
