<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 12/11/2019
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/convert" method="post">
    <h1>Product Discount Calculator</h1>
    <br>
    Product Description
    <input type="text" name = "description"/><br>
    List Price
    <input type="text" name = "list"/><br>
    Discount Percent
    <input type="text" name = "discount"/>(%)<br>
    <input type="submit" name="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
