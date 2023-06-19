const { defineConfig } = require("@vue/cli-service");
const path = require("path");
const csp = require("case-sensitive-paths-webpack-plugin");

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
  configureWebpack: {
    resolve: {
      alias: {
        "@": path.resolve(__dirname, "./src"),
      },
    },
    plugins: [new csp()],
  },
});
