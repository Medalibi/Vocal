/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.mp2srt.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.TextAction;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mp2srt.hibernate.Compte;
import com.mp2srt.hibernate.CompteDAO;
import com.mp2srt.hibernate.HibernateSessionFactory;
import com.mp2srt.struts.form.ManageuserForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-02-2014
 * 
 * XDoclet definition:
 * @struts.action path="/manageuser" name="manageuserForm" input="/adminappjsa.jsp" scope="request" validate="true"
 * @struts.action-forward name="edituser" path="/edituser.jsp" redirect="true"
 * @struts.action-forward name="remove" path="/adminappjsa.jsp" redirect="true"
 * @struts.action-forward name="adduser" path="/adduser.jsp" redirect="true"
 */
public class ManageuserAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ManageuserForm manageuserForm = (ManageuserForm) form;// TODO Auto-generated method stub
		String edit= manageuserForm.getEdit();
		String output="remove";
		Logger log = Logger.getLogger(TextAction.class);

		
		CompteDAO codao = new CompteDAO();
		Compte comp = new Compte();
		String index;
		
		if (edit.contains("Delete")){
			index = (String) edit.subSequence(7, edit.length());
			comp = codao.findById(index);
			
			Session hsf = HibernateSessionFactory.getSession();
			Transaction trans = hsf.beginTransaction();
			hsf.delete(comp); 
			trans.commit();
			hsf.close();
			
			output="remove";
			request.getSession().setAttribute("info", "User has been deleted.");
			log.info("User " + comp.getLogin() + " has been deleted.");
		}
		
		else if (edit.contains("Add")){
			output="adduser";
		}
		
		else if (edit.contains("Edit")){
			index = (String) edit.subSequence(5, edit.length());
			comp = codao.findById(index);
			
			
			request.getSession().setAttribute("login", index);
			request.getSession().setAttribute("password", comp.getPassword());
			request.getSession().setAttribute("title", comp.getTitre());
			request.getSession().setAttribute("name", comp.getPrenom());
			request.getSession().setAttribute("surname", comp.getNom());
			request.getSession().setAttribute("address", comp.getAdresseMail());
			request.getSession().setAttribute("mailpass", comp.getMailpassword());
			request.getSession().setAttribute("right", comp.getPrivilege());
			
			output="edituser";
		}
		
		return mapping.findForward(output);
	}
}