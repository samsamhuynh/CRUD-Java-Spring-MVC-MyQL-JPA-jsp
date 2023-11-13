<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List by CategoryID</title>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>Product List by CategoryID</h1>
    <table>
        <tr>
            <th>Product's ID</th>
            <th>Product's Name</th>
            <th>CategoryID</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.getProductID()}</td>
                <td>${product.getProductName()}</td>
                <td>${product.getCategoryID()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getDescription()}</td>
                <td>
                    <a href="">Show Products</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>