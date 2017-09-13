package com.objis.springinject.dao;

import org.springframework.stereotype.Repository;

import com.objis.springinject.domaine.Client;

/**
 * @author SENE Ousseynou
 * si la propri�te value n'est pas renseign� et qu'il existe plusieurs classes qui impl�mentent l'interface, spring aura un conflit
 * sur lequel des beans � inject�r : org.springframework.beans.factory.BeanCreationException
 * Exception du type :
 */
@Repository(value = "dao") // Pour rester coherent avec le principe de autowire
public class ClientDaoImpl implements IClientDao {

	public String ajouterClient(Client client) {
		// TODO Auto-generated method stub
		return "Creation Client";
	}

}
