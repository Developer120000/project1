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
<link rel="stylesheet" href="../css/payment.css">
<script src="../js/payment.js" defer></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="stylesheet" href="../css/footer.css">
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
						<input type="text" class="ip1" id="uid"	name="uid" required>
					</li>
					<li>
						<label for="upostcode">우편번호</label> 
						<input type="text" id="sample6_postcode1" class="ip2">
						<input type="button" class="ip2" id="sb1" onclick="sample6_execDaumPostcode1()" value="검색하기"><br>
					</li>
					<li>
						<label for="uaddr">주소</label> 
						<input type="text" id="sample6_address1" class="ip1"><br>
						<input type="text" id="sample6_detailAddress1" class="ip1">
					</li>
					<li class="ip3">
						<label for="utelephone" class="ip4">일반전화</label>
						<select name="utelephone1" class="ip2 ts1">
							<option value="">02</option>
							<option value="">031</option>
							<option value="">051</option>
							<option value="">010</option>
							<option value="">011</option>
							<option value="">018</option>
						</select>
						<input type="tel" class="ip2 ts1" id="utelephone" name="utelephone1" maxlength="4" required>
						<input type="tel" class="ip2 ts1" id="utelephone2" name="utelephone2" maxlength="4" required>
					</li>
					<li class="ip3">
						<label for="uphone" class="ip4">휴대전화</label> 
						<select name="uphone1" class="ip2 ts1">
							<option value="">010</option>
							<option value="">011</option>
							<option value="">018</option>
						</select>
						<input type="tel" class="ip2 ts1" id="uphone" name="uphone1" maxlength="4" required>
						<input type="tel" class="ip2 ts1" id="uphone2" name="uphone2" maxlength="4" required>
					</li>
					<li class="ip3">
						<label for="uemail" class="ip4">이메일</label> 
						<input type="tel" class="ip2 ts1" id="uemail" name="uemail1" required>
						<input type="tel" class="ip2 ts1" id="uemail2" name="uemail2" required>
						<select name="uemail3" class="ip2 ts1">
							<option value="naver">직접입력</option>
							<option value="naver">naver</option>
							<option value="daum">daum</option>
							<option value="google">google</option>
							<option value="nate">nate</option>
						</select>
					</li>
				</ul>
			</form>
			<h3 class="sub2">배송 정보</h3>
			<form action="" method="post" class="dc">
				<input type="checkbox" id="dc4" class="dc1">
			    <label for="dc4" class="dc3">&nbsp;주문자 정보와 동일</label>
			    <input type="checkbox" id="dc5" class="dc1">
			    <label for="dc5" class="dc3">&nbsp;새로운 배송지</label>
			</form>
			<form action="#" method="post" class="pform">
				<ul class="pform2">
					<li>
						<label for="uname2">수령자</label> 
						<input type="text" class="ip1" id="uname2" name="uname2" required>
					</li>
					<li>
						<label for="upostcode2">우편번호</label> 
<!-- 						<input type="text" class="ip2" id="upostcode2" name="upostcode2"> -->
<!-- 						<input type="button" class="ip2" id="sb1" onclick="DaumPostcode2" value="검색하기"> -->
						<input type="text" id="sample6_postcode2" class="ip2"">
						<input type="button" class="ip2" id="sb1" onclick="sample6_execDaumPostcode2()" value="검색하기"><br>
					</li>
					<li>
						<label for="uaddr2">주소</label> 
						<input type="text" id="sample6_address2" class="ip1"><br>
						<input type="text" id="sample6_detailAddress2" class="ip1">
					</li>
					<li class="ip3">
						<label for="utelephone3" class="ip4">일반전화</label>
						<select name="utelephone2" class="ip2 ts1">
							<option value="">02</option>
							<option value="">031</option>
							<option value="">051</option>
							<option value="">010</option>
							<option value="">011</option>
							<option value="">018</option>
						</select>
						<input type="tel" class="ip2 ts1" id="utelephone3" name="utelephone2" maxlength="4" required>
						<input type="tel" class="ip2 ts1" id="utelephone4" name="utelephone2" maxlength="4" required>
					</li>
					<li class="ip3">
						<label for="uphone3" class="ip4">휴대전화</label> 
						<select name="uphone2" class="ip2 ts1">
							<option value="">010</option>
							<option value="">011</option>
							<option value="">018</option>
						</select>
						<input type="tel" class="ip2 ts1" id="uphone3" name="uphone2" maxlength="4" required>
						<input type="tel" class="ip2 ts1" id="uphone4" name="uphone2" maxlength="4" required>
					</li>
					<li>
						<label for="uemail3">배송메시지</label> 
						<input type="text" class="ip1 ts1" id="uemail3" name="uemail2" required>
					</li>
				</ul>
			</form>
			<h3 class="sub2">결제 방식</h3>
			<form action="" method="post" class="pay1">
				<input type="checkbox" id="pay2">
				<label for="pay2" class="pay3">&nbsp;포인트 결제</label>
				<input type="button" class="pp1" onclick="" value="포인트 잔액"><br>
			</form>
			<div class="text5">
				<p>최소 결제 가능 금액은 결제 금액에서 배송비를 제외한 금액입니다.</p>
				<p>제품 택에 동봉되어 있는 마크를 인증하시면 정품 등록과 A/S 서비스를 받으실 수 있습니다.</p>
			</div>	
			<div class="lastprice">
				<span class="s1">최종 결제 금액</span>
				<span class="s1">79000</span>
			</div>
			<p class="ppay">
				<input type="submit" class="ppay1" value="결제하기"> 
			</p>
		</div>
	</div>
<%@ include file="footer.jsp" %>
</body>
</html>