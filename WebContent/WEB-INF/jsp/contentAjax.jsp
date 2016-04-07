<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${contentDesc}" var="contentDesc">
	<section class="col-md-4 col-xs-4">
		<section class="left-pre">
		  <a href="<c:url value= "downloadSearch?content_name=${contentDesc.content_prv}" />" >
		<img src="<c:url value="../IdeaWap/CMS/Preview/${contentDesc.content_prv}" />"/> 
		</a>
		</section>
	</section>
</c:forEach>