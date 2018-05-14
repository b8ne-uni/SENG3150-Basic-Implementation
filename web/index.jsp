<%--
  Created by IntelliJ IDEA.
  User: b8ne
  Date: 6/5/18
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/head.jsp" %>

<div class="container">
  <div class="row justify-content-center">
    <div class="col-6">
      <form action="loginaction" method="post">
        <div class="form-group">
          <label for="username">Username</label>
          <input type="text" name="username" class="form-control" id="username" aria-describedby="usernameHelp" placeholder="Enter username">
          <small id="usernameHelp" class="form-text text-muted">Input 'ben' for a valid username</small>
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input type="password" name="password" class="form-control" id="exampleInputPassword1" aria-describedby="passwordHelp" placeholder="Password">
          <small id="passwordHelp" class="form-text text-muted">Input 'qwerty' for a valid password</small>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
      </form>
    </div>
  </div>
</div>

<%@ include file="includes/foot.jsp" %>
