<script setup>
import router from "../../router/index.js";

function logout() {
  router.push('/login')
}
</script>

<template>
  <div class="nav">
    <div class="logo"><img src="/logo_header.png" alt="ロゴマーク"></div>
    <div class="service">TIREMIM</div>
    <div class="company">株式会社 あいうえお</div>
    <div class="right-side"></div>
    <div class="username">ユーザー名</div>
    <div class="status-login">
      <div class="login">ログイン中</div>
      <div class="logout" @click="logout">ログアウト</div>
    </div>
  </div>
</template>

<style scoped>
.nav {
  display: flex;
  background: #d70c24;
  width: 100%;
  height: 40px;
  align-items: center;
  gap: 10px;
  color: white;
  font-size: 14px;
}

.nav > .logo {
  width: 40px;
  height: 40px;
  background: #ffffff;
}

.nav > .logo img {
  max-height: 100%;
  width: auto;
}

.username {
  margin-left: auto;
}

.status-login {
  position: relative;
}

.login {
  background: #d70c24;
  color: white;
  width: 100px;
  font-size: 14px;
  border: none;
  height: 40px;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-left: auto;
}

.logout {
  display: flex;
  position: absolute;
  background-color: #d70c24;
  color: white;
  font-size: 14px;
  border: none;
  cursor: pointer;
  height: 0;
  top: 90%;
  left: 0;
  width: 100%;
  justify-content: center;
  align-items: center;
  overflow: hidden;
  transition: height 0.3s ease;
}

.status-login:hover .logout {
  height: 40px;
}

.logout:hover {
  opacity: 80%;
}

</style>