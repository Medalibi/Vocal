package com.mp2srt.hibernate;

import java.util.Date;

/**
 * AbstractEmail entity provides the base persistence definition of the Email
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmail implements java.io.Serializable {

	// Fields

	private Long idEmail;
	private Compte compte;
	private Date dateDEnvoi;
	private String sujet;
	private String sendAdresse;
	private String contenu;

	// Constructors

	/** default constructor */
	public AbstractEmail() {
	}

	/** minimal constructor */
	public AbstractEmail(Compte compte) {
		this.compte = compte;
	}

	/** full constructor */
	public AbstractEmail(Compte compte, Date dateDEnvoi, String sujet,
			String sendAdresse, String contenu) {
		this.compte = compte;
		this.dateDEnvoi = dateDEnvoi;
		this.sujet = sujet;
		this.sendAdresse = sendAdresse;
		this.contenu = contenu;
	}

	// Property accessors

	public Long getIdEmail() {
		return this.idEmail;
	}

	public void setIdEmail(Long idEmail) {
		this.idEmail = idEmail;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Date getDateDEnvoi() {
		return this.dateDEnvoi;
	}

	public void setDateDEnvoi(Date dateDEnvoi) {
		this.dateDEnvoi = dateDEnvoi;
	}

	public String getSujet() {
		return this.sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getSendAdresse() {
		return this.sendAdresse;
	}

	public void setSendAdresse(String sendAdresse) {
		this.sendAdresse = sendAdresse;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	@Override
    public String toString() {
        return sujet;
    }
}