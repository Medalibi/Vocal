/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.mp2srt.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


/** 
 * MyEclipse Struts
 * Creation date: 12-18-2013
 * 
 * XDoclet definition:
 * @struts.form name="signinForm"
 */
public class SigninForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** login property */
	private String login;

	/** password property */
	private String password;

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
ActionErrors errors =new  ActionErrors();
		
		if (login.length()<3 && login.length()<30 )
		{
			errors.add("loginError", new ActionMessage("login.error"));	
		}
		
		
		if (password.length()<3 && password.length()<30 )
		{
			errors.add("passwordError", new ActionMessage("password.error"));	
		}
		
		
		return errors;
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
}