const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  outputDir: "../src/main/resources/static", //vue 빌드 결과물 경로
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8081',
        changeOrigin: true
      }
    }
  },
  transpileDependencies: true
})
