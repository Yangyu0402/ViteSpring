<script setup>

import Header from "../components/header/Header.vue";
import BusinessDisplay from "../components/menu/BusinessDisplay.vue";
import BusinessDisplay2 from "../components/menu/BusinessDisplay2.vue";
import AdministrationDisplay from "../components/menu/AdministrationDisplay.vue";
</script>

<template>
  <div class="menu-layout">
    <div class="menu-header">
      <Header></Header>
    </div>

    <div class="menu-main">
      <BusinessDisplay></BusinessDisplay>
      <BusinessDisplay2></BusinessDisplay2>
      <AdministrationDisplay></AdministrationDisplay>
    </div>

  </div>
</template>

<style scoped>

.menu-layout {
  display: flex;
  flex-direction: column;
  height: 100vh;
}

.menu-main {
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
  align-content: center;
  flex-grow: 1;
  padding: 30vh;
}

</style>