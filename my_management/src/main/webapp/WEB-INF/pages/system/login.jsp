<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Purple Admin</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" />
</head>

<body>
  <div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-center auth">
        <div class="row w-100">
          <div class="col-lg-4 mx-auto">
            <div class="auth-form-light text-left p-5">
              <div class="brand-logo">
                <img src="${pageContext.request.contextPath}/images/logo.svg">
              </div>
              <h4>Hello! let's get started</h4>
              <h4> ${message_login}</h4>
              <h6 class="font-weight-light">Sign in to continue.</h6>
              <form class="pt-3" method="post" id="login_form">
                <div class="form-group">
                  <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" placeholder="Username" name="managername">
                </div>
                <div class="form-group">
                  <input type="password" class="form-control form-control-lg" id="exampleInputPassword1" placeholder="Password" name="password">
                </div>
                <div class="form-group">
                  <input type="verifyCode" class="form-control form-control-lg" id="exampleverifyCode" placeholder="验证码" name="verifyCode">
                  <img class="rcCaptcha-btn rcCaptcha-img" id="verifyCodeImage" src="${pageContext.request.contextPath}/mymanagement/getVerifyCodeImage" />
                </div>
                <div class="mt-3">
                  <a class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn" onclick="test_post('login_form','${pageContext.request.contextPath}/mymanagement/dologin')" >SIGN IN</a>
                  <%--<a class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn"  href="${pageContext.request.contextPath}/mymanagement/dologin" >SIGN IN</a>--%>
                </div>
                <div class="my-2 d-flex justify-content-between align-items-center">
                  <div class="form-check">
                    <label class="form-check-label text-muted">
                      <input type="checkbox" class="form-check-input">
                      Keep me signed in
                    </label>
                  </div>
                  <a href="#" class="auth-link text-black">Forgot password?</a>
                </div>
                <div class="mb-2">
                  <button type="button" class="btn btn-block btn-facebook auth-form-btn">
                    <i class="mdi mdi-facebook mr-2"></i>Connect using facebook
                  </button>
                </div>
                <div class="text-center mt-4 font-weight-light">
                  Don't have an account? <a href="${pageContext.request.contextPath}/toregister" class="text-primary">Create</a>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      <!-- content-wrapper ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script src="${pageContext.request.contextPath}/vendors/js/vendor.bundle.base.js"></script>
  <script src="${pageContext.request.contextPath}/vendors/js/vendor.bundle.addons.js"></script>
  <!-- endinject -->
  <!-- inject:js -->
  <script src="${pageContext.request.contextPath}/js/off-canvas.js"></script>
  <script src="${pageContext.request.contextPath}/js/misc.js"></script>
  <!-- endinject -->
  <script src="${pageContext.request.contextPath}/js/common.js"></script>
  <%--<script>
      function test_post(url) {
          var testform=document.getElementById("testform");
          testform.action=url;
          testform.submit();
      }
  </script>--%>
  <script>
      $(function() {
          $(".rcCaptcha-btn").click(
              function() {
                  $(".rcCaptcha-img").attr(
                      "src",
                      '${pageContext.request.contextPath}/mymanagement/getVerifyCodeImage?'
                      + new Date().getTime());
              });
      });
  </script>
</body>

</html>
