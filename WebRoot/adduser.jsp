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
						<li><a href="adminappjsa.jsp">Administrator</a></li>
						<li><a href="adduser.jsp" class="active">Add User</a></li>
						<li><a href="editiser">Edit User</a></li>
						<li><a href="#">About</a></li>
					</ul>
				</div>
				<!-- end #menu -->

						<div id="content">
							<div class="post">
								<h2 class="title">Users Account</h2>
								<p>&nbsp;</p>
								<div class="entry">
								  <ul>
								    <li>
                                    <strong>This is the list of the application users</strong> 
									</li>
							      </ul>
								  <blockquote>
                                  <html:form method="get" action="userman">
                                    <p><strong>Login:</strong>
                                    <input type="text" id="login" name="login" value="" size="40" /></p>
                                    <p><strong>Password:</strong>
                                    <input type="password" id="password" name="password" value="" size="40" /></p>
                                    <p><strong>Title:</strong>
                                    <input type="text" id="title" name="title" value="" size="40" /></p>
                                    <p><strong>Name:</strong>
                                    <input type="text" id="name" name="name" value="" size="40" /></p>
                                    <p><strong>Surname:</strong>
                                    <input type="text" id="surname" name="surname" value="" size="40" /></p>
                                    <p><strong>Mail address:</strong>
                                    <input type="text" id="address" name="address" value="" size="40" /></p>
                                    <p><strong>Mail password:</strong>
                                    <input type="password" id="mailpass" name="mailpass" value="" size="40" /></p>
                                    <p><strong>Rights:</strong>
                                    <input type="text" id="right" name="right" value="" size="10" />
                                    1: User, 2: Admin, 3: Superuser</p>
								    <p>
									<input type="submit" id="man" name="man" value="Add User" />
									</p>
									<p><font color="green" size=2><bean:write name="info" ignore="true" /></font></p>
                                   </html:form>
                                  
							      </blockquote>
							      
							      
							       <blockquote>
								    
							        
							      </blockquote>
							      
							      
								  
                              </div>
							</div>
							
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
									<h2>Welcome Administrator</h2>
									<div id="login" >
										
									<html:form action="logout" method="post">
									<div>
											<p>From this page you manage the users account of this application.</p>
											<p><font color="white" size=3 > <b>
											<bean:write name="name" ignore="true" /></b> </font><br />
											</p>
											<p>
											  <input type="submit" id="logout" value="Logout" />
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
	<p>University of Tunis El Manar -        University Campus Tunis	<br />
    FST Campus Universitaire           2092 El Manar Tunis <br />
    Tél : +216 71 872 600 - Fax : +216 71 871 666</p>
</div>
</body>
</html>
</html:html>
