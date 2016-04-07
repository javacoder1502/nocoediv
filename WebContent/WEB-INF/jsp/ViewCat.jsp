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

			<section class="videocon-show">
				<c:forEach items="${contentCatAndImages}" var="outerList">
					<section class="banner" style="margin-top: 0px;">
						<section class="banner-Vhead">
							<section class="row">
								<section class="col-md-7 col-xs-7">
									<section class="day-zone">
										<%-- <h4>${outerList.cat_name}</h4> --%>
										<h4>
											<spring:message code="${outerList.cat_name}" />
										</h4>
									</section>
								</section>
								<section class="col-md-5 col-xs-5">

									<a
										href='<c:url value="${content_type}?selectedValue=${outerList.cat_name}"/>'>
										<h5 style="color: #fff; text-align: center;">
										
										<spring:message code="View All"/>
										</h5>
									</a>
								</section>
							</section>
						</section>

						<section class="port">
							<section class="row">

								<c:forEach items="${outerList.ls}" var="outerlist">
									<section class="col-md-4 col-xs-4">
										<section class="left-pre">

											<img
												src="<c:url value="../IdeaWap/CMS/Preview/${outerlist}" />" />
										</section>
									</section>
								</c:forEach>

							</section>
						</section>
					</section>
				</c:forEach>



				<section class="back">
					<form>
					<spring:message code="Back" var="Back_lang"/>
					<input type="button" value="${Back_lang}" class="bk"
							onclick="history.go(-1);">
					</form>
				</section>
				
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
