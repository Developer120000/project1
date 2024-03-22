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
<link rel="stylesheet" href="../css/q_a_write.css">
</head>
<body>
	<div class="qawritercontainer">
		<div class="qawriterwrapper">
			<h3 class="qawritertitle">Q & A 작성하기</h3>
			<ul class="qawriterul">
				<li class="qawriterli">
					<label for="qawriteritem" class="qawriteritem1 qawriteritem3">항목</label>
					<select name="qawriteritem1" class="qawriteritem">
						<option value="">주문/결제</option>
						<option value="">취소/환불</option>
						<option value="">출고/배송</option>
						<option value="">반품/교환</option>
						<option value="">재입고문의</option>
						<option value="">제품문의</option>
						<option value="">기타문의</option>
					</select>
				</li>
				<li class="qawriterli">
					<label for="qawriteritem1-1" class="qawriteritem1">제목</label>
					<input type="text" class="qawriteritem1-1" id="qawriteritem1-1" required>
				</li>
				<li>
					<input type="text" class="qawiter" required>
				</li>
			</ul>
		<div class="qawrite">
			<input type="reset" class="qawrite1" value="취소">
			<input type="submit" class="qawrite2" value="작성하기"> 
		</div>
		</div>
	</div>
</body>
</html>