<script setup xmlns="http://www.w3.org/1999/html">
import LoginForm from "../components/login/LoginForm.vue";
</script>

<template>
  <div class="common-layout">
    <div class="login-header">
      <div class="header-content">
        ログイン
      </div>
    </div>

    <div class="login-main">
      <LoginForm></LoginForm>
    </div>

    <div class="login-footer">
      <img src="/logo_footer.png" alt="Logo" class="footer-logo">
      <span class="copyright-content">Copyright © StellaS Co., Ltd. All Rights Reserved.</span>
    </div>

  </div>
</template>

<style scoped>

.login-header {
  height: 11vh;
  display: flex;
  justify-content: flex-start;
  align-items: flex-end;
  background-color: #cccccc;
}

.header-content {
  margin-left: 2vw;
  margin-bottom: 18px;
  font-weight: bold;
  font-size: 16px;
}

.login-main {
  height: 67vh;
  background: linear-gradient(to bottom, #ffffff 61.4%, #dddddd 38.6%);
}

.login-footer {
  height: 22vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
}

.copyright-content {
  font-size: 20px;
}

</style>