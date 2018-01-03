<%--
  Created by IntelliJ IDEA.
  User: ghw06
  Date: 2018/1/3
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file upload</title>
</head>
<body>
<form action="fileUpload.do" method="post" enctype="multipart/form-data">
    <label>文件上传</label>
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>
</body>
</html>
