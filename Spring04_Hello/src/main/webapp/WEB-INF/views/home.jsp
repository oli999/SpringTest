<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home.jsp</title>
</head>
<body>
<h3>인덱스 페이지 입니다.</h3>
<p>오늘의 인물 : ${personToday }</p>
<ul>
	<li><a href="fortune.do">오늘의 운세</a></li>
</ul>
</body>
</html>