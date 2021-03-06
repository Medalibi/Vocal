/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.mp2srt.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 01-02-2014
 * 
 * XDoclet definition:
 * @struts.form name="usermanForm"
 */
public class UsermanForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** title property */
	private String title;

	/** address property */
	private String address;

	/** name property */
	private String name;

	/** surname property */
	private String surname;

	/** login property */
	private String login;

	/** right property */
	private String right;

	/** password property */
	private String password;

	/** man property */
	private String man;

	/** mailpass property */
	private String mailpass;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the title.
	 * @return String
	 */
	public String getTitle() {
		return title;
	}

	/** 
	 * Set the title.
	 * @param title The title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/** 
	 * Returns the address.
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/** 
	 * Set the address.
	 * @param address The address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** 
	 * Returns the name.
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Set the name.
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Returns the surname.
	 * @return String
	 */
	public String getSurname() {
		return surname;
	}

	/** 
	 * Set the surname.
	 * @param surname The surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/** 
	 * Returns the login.
	 * @return String
	 */
	public String getLogin() {
		return login;
	}

	/** 
	 * Set the login.
	 * @param login The login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/** 
	 * Returns the right.
	 * @return String
	 */
	public String getRight() {
		return right;
	}

	/** 
	 * Set the right.
	 * @param right The right to set
	 */
	public void setRight(String right) {
		this.right = right;
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Returns the man.
	 * @return String
	 */
	public String getMan() {
		return man;
	}

	/** 
	 * Set the man.
	 * @param man The man to set
	 */
	public void setMan(String man) {
		this.man = man;
	}

	/** 
	 * Returns the mailpass.
	 * @return String
	 */
	public String getMailpass() {
		return mailpass;
	}

	/** 
	 * Set the mailpass.
	 * @param mailpass The mailpass to set
	 */
	public void setMailpass(String mailpass) {
		this.mailpass = mailpass;
	}
}