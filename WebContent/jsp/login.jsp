<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../tool/header.html"%>

<form action="/Login/LoginServlet" method="post">
	<p>
		ID<br><input type="text" name="id" required="required">
	</p>
	<p>
		パスワード<br><input type="password" name="password" required="required">
	</p>
	<p>
		<input type="submit" value="ログイン">
	</p>

</form>

<%@include file="../tool/footer.html"%>