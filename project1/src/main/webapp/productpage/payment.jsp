<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>payment</title>
<%@ include file="header.jsp" %>
<link rel="stylesheet" href="../css/header.css">
<script src="../js/header.js" defer></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="stylesheet" href="../css/payment.css">
</head>
<body>
	<div class="pcontainer">
		<div class="pwrapper">
			<h3 class="sub1">쇼핑백</h3>
			<div class="sbag">
				<span class="s1">이미지</span>
				<span class="s1">ICT logo ballcap</span>
				<span class="s1">1</span>
				<span class="s1">79000</span>
			</div>
			<h3 class="sub2">주문자 정보</h3>
			<form action="#" method="post" class="pform">
				<ul class="pform2">
					<li>
						<label for="uid">주문자</label> 
						<input type="text" id="uid"	name="uid" maxlength="10" required>
					</li>
					<li>
						<label for="upostcode">우편번호</label> 
						<input type="text" id="upostcode" name="upostcode" placeholder="우편번호">
						<input type="button" onclick="sample6_execDaumPostcode()" value="검색하기">
					</li>
					<li>
						<label for="uaddr">주소</label> 
						<input type="text" id="uaddr" name="uaddr" placeholder="주소"><br>
						<input type="text" id="uaddrdetail" name="uaddrdetail" placeholder="상세주소">
					</li>
					<li>
						<label for="utelephone">일반전화</label> 
						<select name="utelephone1">
							<option value="">02</option>
							<option value="">031</option>
							<option value="">051</option>
							<option value="">010</option>
							<option value="">011</option>
							<option value="">018</option>
						</select>
						<input type="tel" id="utelephone" name="utelephone2" maxlength="4" required>
						<input type="tel" id="utelephone" name="utelephone3" maxlength="4" equired>
					</li>
					<li>
						<label for="uphone">휴대전화</label> 
						<select name="uphone1">
							<option value="">010</option>
							<option value="">011</option>
							<option value="">018</option>
						</select>
						<input type="tel" id="uphone" name="uphone2" maxlength="4" required>
						<input type="tel" id="uphone" name="uphone3" maxlength="4" equired>
					</li>
					<li>
						<label for="uemail">이메일</label> 
						<input type="tel" id="uemail" name="uemail1" required>
						<input type="tel" id="uemail" name="uemail2" equired>
						<select name="uemail3">
							<option value="naver">직접입력</option>
							<option value="naver">naver</option>
							<option value="daum">daum</option>
							<option value="google">google</option>
							<option value="nate">nate</option>
						</select>
					</li>
				</ul>
			</form>
			<p class="ppay">
				<input type="submit" value="결제하기"> 
			</p>
		</div>
	</div>
</body>
</html>