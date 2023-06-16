const { defineConfig } = require("@vue/cli-service");

module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 3000,
    historyApiFallback: true,
    proxy: {
      "/api/*": {
        target: "http://localhost:9000",
        ws: true,
        changeOrigin: true,
        pathRewrite: {
          "^/api/*": "",
        },
      },
    },
  },
});
