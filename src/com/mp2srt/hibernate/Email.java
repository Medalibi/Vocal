package com.mp2srt.hibernate;

import java.util.Date;

/**
 * Email entity. @author MyEclipse Persistence Tools
 */
public class Email extends AbstractEmail implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Email() {
	}

	/** minimal constructor */
	public Email(Compte compte) {
		super(compte);
	}

	/** full constructor */
	public Email(Compte compte, Date dateDEnvoi, String sujet,
			String sendAdresse, String contenu) {
		super(compte, dateDEnvoi, sujet, sendAdresse, contenu);
	}

}
