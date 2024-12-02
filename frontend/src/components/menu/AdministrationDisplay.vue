<script setup>
  import {ref} from 'vue'

  const table1Data = ref([
    {name: '项目3', value: 100},
  ])
</script>

<template>
  <div class="table-container">
    <table class="menu">
      <thead>
        <tr>
          <th>管理メニュー</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(item, index) in table1Data" :key="index">
          <td>{{ item.name }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<style scoped>



</style>