<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- getter setter만 있으면 javaBeans로 친다 -->
    <jsp:useBean id="repository" class="dao.ProductRepository"
	scope="session"></jsp:useBean>
	<%@ page import="java.util.List"%>
<%@ page import="dto.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="Menu.jsp"></jsp:include>

 <div class="p-5 bg-primary text-white">
   
	  <div class="container">
	   
	    <h1 class="display-3">
	      상품 상세 정보
	    </h1>
	  </div>
	</div>
	 <%
	//getParameter은 무조건 String으로 받음
    // poduct.jsp?id=p1234 이런식으로 넘어온 값 얻기
    String id = request.getParameter("id");
    Product product = repository.getProductByID(id);
    %>
<div class="container">
    <div class="row "> 
    	<div class="col-md-4">
    	<h3><%= product.getName() %></h3>
    	<p><%= product.getDescription() %></p>
    	<p><%= product.getUnitPrice() %>원</p>
    	<!-- 누르면 상품정보 페이지 -->
    	<p>
    	<a href="#" class="btn btn-info">상품 주문 &raquo;</a>
<a href="./products.jsp" class="btn btn-secondary">상품 목록 &raquo;</a>
    	</p>
    	</div>
    </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>