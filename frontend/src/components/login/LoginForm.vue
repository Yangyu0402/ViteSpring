<script setup>
import {ref} from 'vue';
import axios from 'axios';
import router from "../../router/index.js";

const username = ref('');
const password = ref('');
const isSubmitting = ref(false);
const message = ref('');

const handleSubmit = async () => {
  isSubmitting.value = true;
  message.value = '';

  try {
    const response = await axios.post('/api/login', {
      username: username.value,
      password: password.value,
    });

    if (response.data.success) {
      message.value = 'Success！';
      isSubmitting.value = false;
      await router.push('/user');
    } else {
      message.value = response.data.message || 'Failed!';
    }
  } catch (error) {
    message.value = 'Error!';
  }
};
</script>

<template>
  <div>
    <form @submit.prevent="handleSubmit">
      <div>
        <label for="username">用户名:</label>
        <input
            type="text"
            id="username"
            v-model="username"
            required
        />
      </div>
      <div>
        <label for="password">密码:</label>
        <input
            type="password"
            id="password"
            v-model="password"
            required
        />
      </div>
      <button type="submit" :disabled="isSubmitting">
        {{ isSubmitting ? '登录中...' : '登录' }}
      </button>
    </form>

    <div v-if="message">
      <p>{{ message }}</p>
    </div>
  </div>
</template>

<style scoped>

</style>