<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Speech Recognition Mail Sender</title>
	<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  
  <div id="wrapper">
	<div id="wrapper-bgtop">
		<div id="wrapper-bgbtm">
			<!-- end #header -->
			<div id="page">
				<div id="page-bgtop">
					<div id="page-bgbtm">
									<div id="menu">
					<ul>
						<li><a href="index.jsp" class="active">Home</a></li>
						<li><a href="inscription.jsp">Inscription</a></li>
						<li><a href="about.jsp">About</a></li>
						<li><a href="links.jsp">Links</a></li>
						<li><a href="contact.jsp">Contact</a></li>
					</ul>
				</div>
				<!-- end #menu -->

						<div id="content">
							<div class="post">
								<h2 class="title">Welcome to the Speech Recognition Mail Sender Application</h2>
								<p>&nbsp;</p>
								<p>&nbsp;</p>
								<div class="entry">
								  <p><span id="result_box" lang="en" xml:lang="en">The purpose of the application of sending mail by voice recognition is to assist disabled people wrote and send e-mails through an interactive interface voice recognition and voice or sound response to each task performed by the program.</span></p>
								  <p>This application is a Java Enterprise Edition based  application developed at the <strong>Faculty of Science of Tunis</strong> by a group of student from  the <strong>Professional Master of Network System and Telecommunication</strong>, as a Mini-Project  supervised by <strong>Mr. Riadh Bouhouch</strong>. It&rsquo;s based on <strong>Java Speech API</strong> for the voice  recognition.</p>
                              </div>
							</div>
							<div class="post">
							  <div class="entry"> </div>
							</div>
							<div style="clear: both;">&nbsp;</div>
						</div>
						<!-- end #content -->
						<div id="sidebar">
						  <div id="logo">
								<h1><a href="index.html">MP2-SRT FST </a></h1>
								<h3> design by <a href="index.html">Group G.4</a></h3>
								<h3>&nbsp;</h3>
							</div>
							<ul>
								<li>
									<h2>Login</h2>
									<div id="login" >
									<html:form action="signin" method="post" focus="login">
									<div>
											<p>Username:
											  <input type="text" name="login" id="login" value="login" />
                                              <font color="red" size=2> <html:errors property="loginError"/> </font>
                                            </p>
                                            
											<p>Password: 
										      <input type="password" name="password" id="password" value="passowrd" />
                                              <font color="red" size=2> <html:errors property="passwordError"/> </font>
									        </p>
									        
												<p>
												  <input type="submit" id="signin" value="Log In" />
												</p>
												<p>
													<font color="red" size=2> <bean:write name="invalid" ignore="true" /> </font>
												</p>
										  </div>
								      </html:form>
										
									</div>
									<div style="clear: both;">&nbsp;</div>
								</li>
								<li>
									<h2><img src="images/vocal-icon.png" alt="" width="180" height="170" /></h2>
</li>
								<li>
									<h2>&nbsp;</h2>
								</li>
								<li> </li>
							</ul>
						</div>
						<!-- end #sidebar -->
						<div style="clear: both;">&nbsp;</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div style="clear: both;">&nbsp;</div>
<div id="footer">
	<p>University of Tunis El Manar -        University Campus Tunis <br />
FST Campus Universitaire           2092 El Manar Tunis <br />
T�l : +216 71 872 600 - Fax : +216 71 871 666</p>
</div>
    
  </body>
</html:html>
