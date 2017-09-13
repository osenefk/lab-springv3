package com.objis.springinject.presentation;



import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.springinject.domaine.Client;
import com.objis.springinject.service.IServiceClient;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client1 = new Client("Birante", "SY");

		// 1. Chargement du conteneur en 4.0.0
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demo-beans.xml");
		// 2. Recuperation de bean

		IServiceClient service = (IServiceClient) appContext.getBean("service");
		// 3. Manipulation du bean
		logger.info("" + service.insererClient(client1));

	}
}	
