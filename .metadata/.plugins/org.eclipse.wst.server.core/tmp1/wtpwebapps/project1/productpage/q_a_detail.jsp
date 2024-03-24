<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>q_a_detail</title>
<script src="https://kit.fontawesome.com/80123590ac.js" crossorigin="anonymous"></script>
<%@ include file="header.jsp" %>
<link rel="stylesheet" href="../css/header.css">
<script src="../js/header.js" defer></script>
<link rel="stylesheet" href="../css/q_a_write.css">
<link rel="stylesheet" href="../css/footer.css">
</head>
<body>
	<div class="qawritercontainer">
		<div class="qawriterwrapper">
			<h3 class="qawritertitle">Q & A 게시글</h3>
			<ul class="qawriterul">
				<li class="qawriterli">
					<label for="qawriteritem" class="qawriteritem1 qawriteritem3">항목</label>
					<select name="qawriteritem1" class="qawriteritem">
						
					</select>
				</li>
				<li class="qawriterli">
					<label for="qawriteritem" class="qawriteritem1 qawriteritem3">이름</label>
					<select name="qawriteritem1" class="qawriteritem">
						
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
<%@ include file="footer.jsp" %>
</body>
</html>