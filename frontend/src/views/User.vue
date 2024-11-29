<script setup>
import axios from 'axios';
import {ref, onMounted} from 'vue';

const users = ref([]);

onMounted(() => {
  axios.get('/api/users').then((response) => {
    users.value = response.data;
  });
});
</script>

<template>
    <h1>用户列表</h1>
    <ul>
      <li v-for="user in users" :key="user.id">
        {{ user.id }} - {{ user.username }} - {{ user.password }}
      </li>
    </ul>
</template>

<style scoped>

</style>