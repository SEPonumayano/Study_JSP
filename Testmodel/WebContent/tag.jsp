<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.lang.Math" import="java.util.List,java.util.ArrayList" import="java.util.Map,java.util.HashMap"%>
<%

//配列
int[] array={0,1,2};
request.setAttribute("array",array);

//リスト
List<String> list=new ArrayList<>();
list.add("zero");
list.add("one");
list.add("two");
request.setAttribute("list",list);

//マップ
Map<String,String> map=new HashMap<>();
map.put("zero","零");
map.put("one","壱");
map.put("two","弐");

request.setAttribute("map",map);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPタグ</title>
</head>
<body>

<!-- jspタグを使った出力 -->
<jsp:useBean id="product" class="chapter17.Product" scope="request" />
<p>
<jsp:getProperty name="product" property="id" />:
<jsp:getProperty name="product" property="name" />:
<jsp:getProperty name="product" property="price" />
</p>

<!-- ELを使った出力 -->
<p>${product.id}:${product.name}:${product.price}</p>

<!-- 乱数表示 -->
<p>${Math.random()}</p>

<!-- 三項演算子 -->
<p>${Math.random()<0.5 ? "あたり":"はずれ"}</p>

<!-- 要素の取り出し -->
<p>${array[1]}<br></p>
<p>${list[2]}<br></p>
<p>${map["one"]}<br></p>
<p>${map.two}<br></p>
</body>
</html>