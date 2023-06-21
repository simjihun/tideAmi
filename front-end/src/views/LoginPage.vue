<template>
  <div>
    <h1>Login Page</h1>
  </div>
  <div>
    {{ msg }}
  </div>
</template>

<script>
export default {
  name: "LoginPage",
  data() {
    return {
      msg: "Login Page~",
    };
  },
};
</script>
