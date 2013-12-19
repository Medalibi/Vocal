package com.mp2srt.hibernate;

/**
 * Vocabulaire entity. @author MyEclipse Persistence Tools
 */
public class Vocabulaire extends AbstractVocabulaire implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Vocabulaire() {
	}

	/** minimal constructor */
	public Vocabulaire(Compte compte) {
		super(compte);
	}

	/** full constructor */
	public Vocabulaire(Compte compte, String nomVocab) {
		super(compte, nomVocab);
	}

}
