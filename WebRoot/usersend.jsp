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
	
	<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>Speech Recognition Mail Sender</title>
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
						
                        <li><a href="#">Home</a></li>
						<li><a href="usersend.jsp" class="active">SentBox</a></li>
						<li><a href="usercompose.jsp">Compose</a></li>
						<li><a href="#">Links</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</div>
				<!-- end #menu -->

						<div id="content">
							<div class="post">
								<h2 class="title">Sent Box</h2>
								<p>&nbsp;</p>
								<div class="entry">
								  <ul>
								    <li><strong>Welcome this is the list of the mail you have send</strong></li>
							      </ul>
								  <blockquote>
                                    <html:form action="reader" method="post" focus="idmail">
							      
							       <blockquote>
								    <table border="1" align="left" cellpadding="2" cellspacing="2" class="active" style="border:1px solid black;border-collapse: collapse;">
								      <col width="10px" />
								      <col width="80px" />
								      <col width="40px" />
								      <col width="100px" />
								      
								      <tr>
								      <th>Read</th>
								      <th>Subject</th>
								      <th>Send Address</th>
								      <th>Date of sent</th>
								      
								      </tr>
								      
								      <logic:iterate name="listmail" id="listmailId">
								      <tr class="alternate-row" style="border:1px solid black;" >
								      <td style="border:1px solid black;"><input type="submit" id="idmail" name="idmail" value="<bean:write name="listmailId" property="idEmail"/>"/></td> 
							          <td style="border:1px solid black;"><bean:write name="listmailId" property="sujet"/></td> 
								        <td style="border:1px solid black;"><bean:write name="listmailId" property="sendAdresse"/></td> 
								        <td style="border:1px solid black;"><bean:write name="listmailId" property="dateDEnvoi"/></td> 
								       	</tr> 
							          </logic:iterate>
							        </table>
							        
							      </blockquote>
							      
							      </html:form>
							      </blockquote>
<p>&nbsp;</p>
<p>&nbsp;</p>
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
									<h2>Welcome</h2>
									<div id="login" >
										<html:form action="logout" method="post">
									<div>
											
											<p> <font color="white" size=3 > <b><bean:write name="name" ignore="true" /></b> </font><br />
											Your mail: <b><bean:write name="mail" ignore="true" /></b> <br />
											Sheck out you old mail.</p>
											<p>
											  <input type="submit" id="logout" value="Logout" />
											</p>
												
									</div>
								    </html:form>
									</div>
									<div style="clear: both;">&nbsp;</div>
								</li>
								<li>
								<img src="images/vocal-icon.png" alt="" width="180" height="170" /> 
									
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
	<p>University of Tunis El Manar -        University Campus Tunis	<br />
    FST Campus Universitaire           2092 El Manar Tunis <br />
    Tél : +216 71 872 600 - Fax : +216 71 871 666</p>
</div>
</body>
</html>
</html:html>
