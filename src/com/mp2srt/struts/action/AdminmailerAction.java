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
import com.mp2srt.struts.form.AdminmailerForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-31-2013
 * 
 * XDoclet definition:
 * @struts.action path="/adminmailer" name="adminmailerForm" input="/inscription.jsp" scope="request" validate="true"
 * @struts.action-forward name="go" path="/inscription.jsp" redirect="true"
 */
public class AdminmailerAction extends Action {
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
		AdminmailerForm adminmailerForm = (AdminmailerForm) form;// TODO Auto-generated method stub
		
		
		String name = adminmailerForm.getName();
		String email = adminmailerForm.getEmail();
		String organisation = adminmailerForm.getOrganisation();
		String condution = adminmailerForm.getConduition();
		String note = adminmailerForm.getNote();
		
		Logger log = Logger.getLogger(TextAction.class);
		TextToSpeech tts = new TextToSpeech();
		Mailer mail = new Mailer();
		
		String username= "projectmpsrt@gmail.com";
		String password= "MYpassis0000";
		//String mailfrom= email;
		//String mailto= "projectmpsrt@gmail.com";
		String subject= "From " + name + " of " + organisation + " with the condution of " + condution;
		String text= "note";
		
		mail.MailSender(username, password, email, username, subject, text);
		tts.playSynth("The administrator will respond to your request.");
		
		log.trace("The person " + name + " From " + organisation + " Send an email to request an account in the application.");
		request.getSession().setAttribute("invalid", "The administrator well received your request.");
		
		return mapping.findForward("go");
	}
}