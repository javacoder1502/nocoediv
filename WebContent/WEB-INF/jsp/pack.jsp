<%@ page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>TESYNC</title>
<link href="<c:url value="/resources/css_videcon/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css_videcon/videocon.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css_videcon/style-nav.css" />"
	rel="stylesheet" type="text/css" />

</head>

<body>
	<section class="container">
		<section class="videocon-port">



			<jsp:include page="/WEB-INF/headers/header.jsp" />

			


			<section style="float: left; width: 100%; background-color: #cacaca;">
				<section class="videocon-show">


					<section class="port">
						<section class="row">



							<c:forEach items="${contentDesc}" var="contentDesc">
								<section class="col-md-4 col-xs-4">
									<section class="left-pre">
										<a href="<c:url value= "downloadSearch?content_name=${contentDesc.content_prv}" />"
											style="box-shadow: none;"> <img
											src="<c:url value="../IdeaWap/CMS/Preview/${contentDesc.content_prv}" />" />
										</a>
									</section>
								</section>
							</c:forEach>
						</section>



					</section>
				</section>

				<section class="banner">
				
				<spring:message code="common_banner" var="common_banner"/>
					<img src="<c:url value="/resources/img_videcon/${common_banner}" />" />
				</section>
				
			<section class="back">
					<form>
					<spring:message code="Back" var="Back_lang"/>
					<input type="button" value="${Back_lang}" class="bk"
							onclick="history.go(-1);">
					</form>
				</section>
			
			
			
			
			<section class="footer">
				<p>
					<spring:message code="copyright@2016" />
				</p>
			</section>
		</section>
	</section>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="<c:url value="/resources/js_videcon/bootstrap.js" />"></script>
	<script src="<c:url value="/resources/js_videcon/change.js" />"></script>
</body>
</html>
