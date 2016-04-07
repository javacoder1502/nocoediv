
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page pageEncoding="utf-8"%>

<script src="<c:url value="/resources/js_videcon/validate.js" />"></script>


<section class="header-videocon">

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
					<li><a
						href="<c:url value="/${language_change_url}?lang=en" />"
						style="display: inline; color: blue;">English |</a></li>
					<li><a
						href="<c:url value="/${language_change_url}?lang=hi" />"
						style="display: inline; color: blue;">हिंदी </a></li>

				</ul>

			</section>

		</section>


		<section class="col-md-3 col-xs-3">
			<section class="logo-T">
				<img src="<c:url value="/resources/img_videcon/Tesync.png" />" />
			</section>
		</section>
	</section>
</section>


<section class="search-engine">
	<section class="col-md-2 col-xs-2"></section>
	<section class="col-md-8 col-xs-8">
		<section class="search_area">
			<form class="navbar-form" role="search" method="post"  name="search_form" action="Search" onsubmit="return validateSearch()">
				<div class="form-group">
					<input type="text" class="form-control sear" placeholder="Search"
						name="users_keyword" required="">
					<button type="submit" class="btn btn-default sear_btn">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					</button>
				</div>
			</form>
		</section>
	</section>
	<section class="col-md-2 col-xs-2"></section>
</section>



<section class="nav-area">
	<ul class="navi navbar">
		<li class="active"><a href="index" style="color: #fff;"> <span>
					<spring:message code="Home" />
			</span>

		</a></li>
		<li><a href="Wallpaper" style="color: #fff;"> <span> <spring:message
						code="Images" />
			</span>

		</a></li>
		<li><a href="Video" style="color: #fff;"> <span> <spring:message
						code="Videos" />
			</span>

		</a></li>
		<li><a href="Animation" style="color: #fff;"> <span> <spring:message
						code="Animations" />
			</span>

		</a></li>
		
		
		<li><a href="Ringtone" style="color: #fff;"> <span> <spring:message
						code="Music" />
			</span>

		</a></li>
		
		<li><a href="Game" style="color: #fff;"> <span> 
		<spring:message code="Games" />
			</span>

		</a></li>
	</ul>
</section>