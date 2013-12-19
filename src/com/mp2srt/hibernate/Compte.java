package com.mp2srt.hibernate;

import java.util.Set;

/**
 * Compte entity. @author MyEclipse Persistence Tools
 */
public class Compte extends AbstractCompte implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Compte() {
	}

	/** minimal constructor */
	public Compte(String login, Privilege privilege, String password,
			String adresseMail, String mailpassword) {
		super(login, privilege, password, adresseMail, mailpassword);
	}

	/** full constructor */
	public Compte(String login, Privilege privilege, String password,
			String nom, String prenom, String titre, String adresseMail,
			String mailpassword, Set vocabulaires, Set emails) {
		super(login, privilege, password, nom, prenom, titre, adresseMail,
				mailpassword, vocabulaires, emails);
	}

}
