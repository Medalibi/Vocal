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
 * @struts.form name="manageuserForm"
 */
public class ManageuserForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** edit property */
	private String edit;

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
	 * Returns the edit.
	 * @return String
	 */
	public String getEdit() {
		return edit;
	}

	/** 
	 * Set the edit.
	 * @param edit The edit to set
	 */
	public void setEdit(String edit) {
		this.edit = edit;
	}
}