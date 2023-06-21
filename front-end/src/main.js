import "@babel/polyfill";
import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import axios from "axios";
import Vuelidate from "@vuelidate/core";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-icons/font/bootstrap-icons.css";
import "bootstrap/dist/js/bootstrap";

// Bootstrap axios
axios.defaults.baseURL = "/api";
axios.defaults.headers.common.Accept = "application/json";
axios.interceptors.response.use(
  (response) => response,
  (error) => {
    return Promise.reject(error);
  }
);

createApp(App).use(store).use(router).use(Vuelidate).mount("#app");
