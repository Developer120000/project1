<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>product_berkethat</title>
<%@ include file="header.jsp" %>
<script src="https://kit.fontawesome.com/80123590ac.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="../css/header.css">
<script src="../js/header.js" defer></script>
<link rel="stylesheet" href="../css/ballcap.css">
<script src="../js/product.js" defer></script>
<link rel="stylesheet" href="../css/footer.css">
<!-- <script defer src="js 파일 위치"></script> -->
</head>
<body>
	<section class="ccontainer">
		<div class="cwrapper">
			<div class="newsslider">
			    <div class="newsslide"><i>회원 가입시 1000000만 포인트 증정!!!!!</i></div>
			    <div class="newsslide"><i>오후 3시 이전 주문시 당일 배송 출발</i></div>
			    <div class="newsslide"><i>매달 백만원 이상 구매시 상품 지급</i></div>
			</div>
			<form action="#" class="sortform">
				<select name="sort" class="sort">
					<option value="최신순">최신순</option>
					<option value="가격낮은순">가격낮은순</option>
					<option value="가격높은순">가격높은순</option>
					<option value="판매순">판매순</option>
				</select>
			</form>
			<div class="citem">
				<i class="fa-regular fa-heart heart"></i>
				<i class="fa-solid fa-heart heart2"></i>
				<img src="../img/suncap/scap1-1.jpg" class="cimg">
				<div class="ctext">
					<span class="cname">neat suncap</span>
					<span class="cprice">69000</span>
				</div>
			</div>
			<div class="citem">
				<i class="fa-regular fa-heart heart"></i>
				<i class="fa-solid fa-heart heart2"></i>
				<img src="../img/suncap/scap2-1.jpg" class="cimg">
				<div class="ctext">
					<span class="cname">golf suncap</span>
					<span class="cprice">79000</span>
				</div>
			</div>
			<div class="citem">
				<i class="fa-regular fa-heart heart"></i>
				<i class="fa-solid fa-heart heart2"></i>
				<img src="../img/suncap/scap3-1.jpg" class="cimg">
				<div class="ctext">
					<span class="cname">RR suncap</span>
					<span class="cprice">59000</span>
				</div>
			</div>
			<div class="citem" style="border-right: 1px solid black;">
				<i class="fa-regular fa-heart heart"></i>
				<i class="fa-solid fa-heart heart2"></i>
				<img src="../img/suncap/scap4-1.jpg" class="cimg">
				<div class="ctext">
					<span class="cname">D camo suncap</span>
					<span class="cprice">99000</span>
				</div>
			</div>
		</div>
	</section>	
<%@ include file="footer.jsp" %>
	
</body>
</html>