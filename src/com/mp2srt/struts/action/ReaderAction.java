/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.mp2srt.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mp2srt.hibernate.Email;
import com.mp2srt.hibernate.EmailDAO;
import com.mp2srt.struts.form.ReaderForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-31-2013
 * 
 * XDoclet definition:
 * @struts.action path="/reader" name="readerForm" input="/usersend.jsp" scope="request" validate="true"
 * @struts.action-forward name="go" path="/usersend.jsp"
 */
public class ReaderAction extends Action {
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
		ReaderForm readerForm = (ReaderForm) form;// TODO Auto-generated method stub
		
		String idmail = readerForm.getIdmail();
		
		TextToSpeech tts = new TextToSpeech();
		
		EmailDAO maidao = new EmailDAO();
		Email mail = new Email();
		
		String text= null;
		
		long idm = Long.parseLong(idmail);
		
		mail = maidao.findById(idm);
    	
    	text= "The subject is "+ mail.getSujet().trim()+ " and it contains " + mail.getContenu().trim();
    	text = text.replace("\n", "").replace("\r", "").replace("  ", " ").replace("\t","");
    	text = text.trim();
    	System.out.println(text);
    	tts.playSynth(text);
		
		
		
		return mapping.findForward("go");
	}
}