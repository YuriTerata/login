<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../tool/header.html"%>

<c:if test="${miss=='miss'}">
	<p><font color="red">IDもしくはパスワードが違います</font></p>
</c:if>

<form action="/Login/LoginServlet" method="post">
	<p>
		ID<br>
		<input type="text" name="id" required="required">
	</p>
	<p>
		パスワード<br>
		<input type="password" name="password" required="required">
	</p>
	<p>
		<input type="submit" value="ログイン">
	</p>

</form>

<%@include file="../tool/footer.html"%>