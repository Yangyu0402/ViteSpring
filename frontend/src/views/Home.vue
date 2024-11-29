<script setup>

</script>

<template>
  <h1>Vite App</h1>
  <nav>
    <RouterLink :to="{ name: 'User' }">
      <button type="button" class="button-flat button-red">Go to User</button>
    </RouterLink>
    <RouterLink :to="{ name: 'Welcome' }">
      <button type="button" class="button-flat button-red">Go to Welcome</button>
    </RouterLink>
        <RouterLink :to="{ name: 'Login' }">
      <button type="button" class="button-flat button-red">Go to Login</button>
    </RouterLink>
  </nav>
</template>

<style scoped>
</style>