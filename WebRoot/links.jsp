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
						<li><a href="index.jsp">Home</a></li>
						<li><a href="inscription.jsp">Inscription</a></li>
						<li><a href="about.jsp">About</a></li>
						<li><a href="links.jsp" class="active">Links</a></li>
						<li><a href="contact.jsp">Contact</a></li>
					</ul>
				</div>
				<!-- end #menu -->

						<div id="content">
							<div class="post">
								<h2 class="title">Useful links</h2>
								<p>&nbsp;</p>
								<div class="entry">
								  <ul>
								    <li><strong>Faculty of Science of Tunis</strong><strong>:</strong>
								      <ul>
								        <blockquote>
								          <p><strong><a href="www.fst.rnu.tn">www.fst.rnu.tn</a></strong></p>
							            </blockquote>
							          </ul>
								    </li>
								    <li><strong>University of Tunis El Manar:								      </strong>
								      <ul>
								        <blockquote>
								          <p><strong><a href="www.utm.rnu.tn">www.utm.rnu.tn</a></strong></p>
							            </blockquote>
								      </ul>
							        </li>
								    <li><strong>MP2-SRT Group Facebook:</strong>							        </li>
							      
								    <ul>
								      <blockquote>
								        <p><a href="www.facebook.com/groups/MPSRTEL"><strong>www.facebook.com/groups/MPSRTEL</strong></a></p>
								        <p>&nbsp;</p>
							          </blockquote>
							        </ul>
							      </ul>
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
									<h2>Login</h2>
									<div id="login" >
										<html:form action="signin" method="post" focus="login">
											<div>
											<p>Username:
											  <input type="text" name="login" id="login" value="login" />
                                            </p>
											<p>Password: 
										      <input type="password" name="password" id="password" value="passowrd" />
									        </p>
												<p>
												  <input type="submit" id="signin" value="Log In" />
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
