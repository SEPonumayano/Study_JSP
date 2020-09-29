<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>追加</title>
</head>
<body>
<p>カートに追加する商品</p>
<form action="CartAdd" method="post">
商品<input type="text" name="name">
価格<input type="text" name="price">
<input type="submit" value="追加">
<br/>
<br>
<a href="http://localhost:8080/Testmodel/CartGet">一覧</a>
</form>
</body>
</html>