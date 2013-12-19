package com.mp2srt.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCompte entity provides the base persistence definition of the Compte
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCompte implements java.io.Serializable {

	// Fields

	private String login;
	private Privilege privilege;
	private String password;
	private String nom;
	private String prenom;
	private String titre;
	private String adresseMail;
	private String mailpassword;
	private Set vocabulaires = new HashSet(0);
	private Set emails = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCompte() {
	}

	/** minimal constructor */
	public AbstractCompte(String login, Privilege privilege, String password,
			String adresseMail, String mailpassword) {
		this.login = login;
		this.privilege = privilege;
		this.password = password;
		this.adresseMail = adresseMail;
		this.mailpassword = mailpassword;
	}

	/** full constructor */
	public AbstractCompte(String login, Privilege privilege, String password,
			String nom, String prenom, String titre, String adresseMail,
			String mailpassword, Set vocabulaires, Set emails) {
		this.login = login;
		this.privilege = privilege;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.titre = titre;
		this.adresseMail = adresseMail;
		this.mailpassword = mailpassword;
		this.vocabulaires = vocabulaires;
		this.emails = emails;
	}

	// Property accessors

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Privilege getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAdresseMail() {
		return this.adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getMailpassword() {
		return this.mailpassword;
	}

	public void setMailpassword(String mailpassword) {
		this.mailpassword = mailpassword;
	}

	public Set getVocabulaires() {
		return this.vocabulaires;
	}

	public void setVocabulaires(Set vocabulaires) {
		this.vocabulaires = vocabulaires;
	}

	public Set getEmails() {
		return this.emails;
	}

	public void setEmails(Set emails) {
		this.emails = emails;
	}

}