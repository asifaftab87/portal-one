
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" type="text/css" href="/static/css/login.css" />
 <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="/static/images/user.png" class="user-custon-icon" alt="User Icon" style="padding-top: 20px;" />
    </div>

    <!-- Login Form -->
    <c:if test="${userExists}">
    	<p class="text-warning">
    		User Already exists, please login
    	</p>
    </c:if>
    <form action="login" method="post">
      <input type="text" id="username" class="fadeIn second" name="username" placeholder="Email">
      <input type="password" id="password" class="fadeIn third" name="password" placeholder="Password">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="/forgotPassword">Forgot Password?</a>
      <br />
      <a class="text-primary" href="/registration">Sign Up</a>
    </div>

  </div>
</div>