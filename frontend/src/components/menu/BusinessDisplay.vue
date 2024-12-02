<script setup>
  import {ref} from 'vue'

  const table1Data = ref([
    {name: '项目1', value: 100},
  ])
</script>

<template>
  <div class="table-container">
    <table class="my-table">
      <thead>
        <tr>
          <th>表格1</th>
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
  .my-table {
    border-collapse: collapse;
    width: 200px;
  }

  th, td {
    padding: 10px;
    text-align: center;
    border: 1px solid #ccc;
  }

  th {
    background-color: #f2f2f2;
    font-weight: bold;
  }
</style>