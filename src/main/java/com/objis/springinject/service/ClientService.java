package com.objis.springinject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.objis.springinject.dao.IClientDao;
import com.objis.springinject.domaine.Client;

@Service(value = "service") 
//Si le nom du bean n'est pas spécifier alors l'id du bean correspond au nom de la classe avec un minuscule : clientService


public class ClientService implements IServiceClient {

	@Autowired
	IClientDao dao;

	public IClientDao getDao() {
		return dao;
	}

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.objis.springinject.service.IServiceClient#insererClient(com.objis.
	 * springinject.domaine.Client)
	 */
	public String insererClient(Client client) {
		return dao.ajouterClient(client);
	}

}
