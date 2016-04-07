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
<link href="<c:url value="/resources/css_videcon/animate.css" />"
	rel="stylesheet" type="text/css" />
	
	
	
	<script src="<c:url value="/resources/js_videcon/validate.js" />"></script>
</head>

<body onload>
	<section class="container">
		<section class="idea-port">
			<section class="header-idea">
				<section class="row">
					<section class="col-md-3 col-xs-3">
						<section class="logo">
							<img
								src="<c:url value="/resources/img_videcon/logo-videocon.png" />" />
						</section>
					</section>
					<section class="col-md-6 col-xs-6">
						<div style="padding: 10px;"></div>
						<section class="lang-view">

							<ul>
								<li><a href=${content_type}?lang=en
									style="display: inline; color: blue;">English |</a></li>
								<li><a href=${content_type}?lang=hi
									style="display: inline; color: blue;">हिंदी </a></li>

							</ul>

						</section>
					</section>
					<section class="col-md-3 col-xs-3">
						<section class="logo-T">
							<img src="<c:url value="/resources/img_videcon/Tesync.png"  />" />
						</section>
					</section>
				</section>
			</section>
			<section class="search-engine">
				<section class="col-md-2 col-xs-2"></section>
				<section class="col-md-8 col-xs-8">
					<section class="search_area">
						<form class="navbar-form" role="search" method="post" name="search_form" action="Search" onsubmit="return validateSearch()">
							<div class="form-group">
								<input type="text" class="form-control sear"
									placeholder="Search" name="users_keyword" required="">
									
								<button type="submit" class="btn btn-default sear_btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
								</button>
							</div>
						</form>
					</section>
				</section>
				<section class="col-md-2 col-xs-2"></section>
			</section>
			<section class="idea-show">
				<section class="row">
					<section class="col-md-12 col-xs-12">
						<section class="icon-area">
							<section class="row">
								<section class="col-md-1 col-xs-1"></section>
								<section class="col-md-2 col-xs-2">
									<section class="icons">
										<a href="Wallpaper" style="box-shadow: none;"> <img
											class="animated infinite tada"
											src="<c:url value="/resources/img_videcon/wallpaper.png" />"></a>
										<figcaption>
											<spring:message code="Image" />
										</figcaption>
									</section>
								</section>

								<section class="col-md-2 col-xs-2">
									<section class="icons">
										<a href="Video" style="box-shadow: none;"> <img
											class="animated infinite tada"
											src="<c:url value="/resources/img_videcon/video.png" />"></a>
										<figcaption>
											<spring:message code="Video" />
										</figcaption>
									</section>
								</section>

								<section class="col-md-2 col-xs-2">
									<section class="icons">
										<a href="Animation" style="box-shadow: none;"> <img
											class="animated infinite tada"
											src="<c:url value="/resources/img_videcon/animation.png" />"></a>
										<figcaption>
											<spring:message code="Animation" />
										</figcaption>
									</section>
								</section>
								<section class="col-md-2 col-xs-2">
									<section class="icons">
										<a href="Ringtone" style="box-shadow: none;"> <img
											class="animated infinite tada"
											src="<c:url value="/resources/img_videcon/music.png" />"></a>
										<figcaption>
											<spring:message code="Music" />
										</figcaption>
									</section>
								</section>
								<section class="col-md-2 col-xs-2">
									<section class="icons">
										<a href="Game" style="box-shadow: none;"> <img
											class="animated infinite tada"
											src="<c:url value="/resources/img_videcon/games.png" />"></a>
										<figcaption>
											<spring:message code="Game" />
										</figcaption>
									</section>
								</section>
								<section class="col-md-1 col-xs-1"></section>

							</section>

						</section>
					</section>
				</section>
			</section>
			<section class="banner">
				<section class="banner-head">
					<section class="row">
						<section class="col-md-7 col-xs-7">
							<section class="day-zone">
							
							
								<a href='<c:url value="/PickOfDay"></c:url>'><h4>
										<spring:message code="Pick of the Day" />
									</h4> </a>
							</section>
						</section>
						<section class="col-md-5 col-xs-5"></section>
					</section>
				</section>
				
				<spring:message code="Pick_of_the_day_banne_namer" var="Pick_of_the_day_banne_namer"/>
				<a href='<c:url value="/PickOfDay"></c:url>'>
				<img src="<c:url value="/resources/img_videcon/${Pick_of_the_day_banne_namer}"  />" />
				</a>
			</section>
			<section class="banner">
				<section class="banner-head">
					<section class="row">
						<section class="col-md-7 col-xs-7">
							<section class="day-zone">
								<a href='<c:url value="/FreeZone"></c:url>'>
									<h4>
										<spring:message code="Free Zone" />
									</h4>
								</a>
							</section>
						</section>
						<section class="col-md-5 col-xs-5"></section>
					</section>
				</section>
				<spring:message code="free_zone_banner_name" var="free_zone_banner_name"/>
				<a href='<c:url value="/FreeZone"></c:url>'>
				<img src="<c:url value="/resources/img_videcon/${free_zone_banner_name}"  />" />
				</a>
			</section>
			<section class="banner">
				<section class="banner-head">
					<section class="row">
						<section class="col-md-7 col-xs-7">
							<section class="day-zone">
							
							<a href='<c:url value="/subscription"></c:url>'><h4>
								
									<spring:message code="Subscription" />
								</h4>
								</a>
							</section>
						</section>
						<section class="col-md-5 col-xs-5"></section>
					</section>
				</section>
				<spring:message code="Subscription_banner_name" var="Subscription_banner_name"/>
				<a href='<c:url value="/subscription"></c:url>'>
				<img
					src="<c:url value="/resources/img_videcon/${Subscription_banner_name}"  />" />
					</a>
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
</body>
</html>
