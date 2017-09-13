package com.objis.springinject.dao;

import org.springframework.stereotype.Repository;

import com.objis.springinject.domaine.Client;

/**
 * @author SENE Ousseynou
 * si la propriéte value n'est pas renseigné et qu'il existe plusieurs classes qui implémentent l'interface, spring aura un conflit
 * sur lequel des beans à injectér : org.springframework.beans.factory.BeanCreationException
 * Exception du type :
 */
@Repository(value = "dao") // Pour rester coherent avec le principe de autowire
public class ClientDaoImpl implements IClientDao {

	public String ajouterClient(Client client) {
		// TODO Auto-generated method stub
		return "Creation Client";
	}

}
