package com.mp2srt.hibernate;

import java.util.Set;

/**
 * Privilege entity. @author MyEclipse Persistence Tools
 */
public class Privilege extends AbstractPrivilege implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Privilege() {
	}

	/** minimal constructor */
	public Privilege(String status) {
		super(status);
	}

	/** full constructor */
	public Privilege(String status, Set comptes) {
		super(status, comptes);
	}

}
