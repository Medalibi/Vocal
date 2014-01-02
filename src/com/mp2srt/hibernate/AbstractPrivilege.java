package com.mp2srt.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPrivilege entity provides the base persistence definition of the
 * Privilege entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrivilege implements java.io.Serializable {

	// Fields

	private Long idPrivilege;
	private String status;
	private Set comptes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPrivilege() {
	}

	/** minimal constructor */
	public AbstractPrivilege(String status) {
		this.status = status;
	}

	/** full constructor */
	public AbstractPrivilege(String status, Set comptes) {
		this.status = status;
		this.comptes = comptes;
	}

	// Property accessors

	public Long getIdPrivilege() {
		return this.idPrivilege;
	}

	public void setIdPrivilege(Long idPrivilege) {
		this.idPrivilege = idPrivilege;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getComptes() {
		return this.comptes;
	}

	public void setComptes(Set comptes) {
		this.comptes = comptes;
	}
	public String toString(){
		return status;
		
	}

}