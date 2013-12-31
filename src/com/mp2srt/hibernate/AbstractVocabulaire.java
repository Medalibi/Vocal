package com.mp2srt.hibernate;

/**
 * AbstractVocabulaire entity provides the base persistence definition of the
 * Vocabulaire entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVocabulaire implements java.io.Serializable {

	// Fields

	private Long idVocab;
	private Compte compte;
	private String nomVocab;

	// Constructors

	/** default constructor */
	public AbstractVocabulaire() {
	}

	/** minimal constructor */
	public AbstractVocabulaire(Compte compte) {
		this.compte = compte;
	}

	/** full constructor */
	public AbstractVocabulaire(Compte compte, String nomVocab) {
		this.compte = compte;
		this.nomVocab = nomVocab;
	}

	// Property accessors

	public Long getIdVocab() {
		return this.idVocab;
	}

	public void setIdVocab(Long idVocab) {
		this.idVocab = idVocab;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public String getNomVocab() {
		return this.nomVocab;
	}

	public void setNomVocab(String nomVocab) {
		this.nomVocab = nomVocab;
	}
	
	@Override
    public String toString() {
        return nomVocab;
    }

}