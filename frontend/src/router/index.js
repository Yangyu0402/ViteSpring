import {createRouter, createWebHistory} from 'vue-router';
import User from '../views/User.vue';
import Welcome from "../views/Welcome.vue";
import Login from "../views/Login.vue";
import Home from "../views/Home.vue";
import Menu from "../views/Menu.vue";

const routes = [
    {
        path: '/login',
        name: 'Login',
        component: Login,
        meta: { title: 'ログイン画面' },
    },
    {
        path: '/menu',
        name: 'Menu',
        component: Menu,
        meta: { title: 'メニュー画面' },
    },
    {
        path: '/',
        name: 'Home',
        component: Home,
    },
    {
        path: '/user',
        name: 'User',
        component: User,
    },
    {
        path: '/welcome',
        name: 'Welcome',
        component: Welcome,
    },
];

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes,
});

router.beforeEach(async (to) => {
  if (to.meta.title) {
    document.title = to.meta.title;
  }
});

export default router;
