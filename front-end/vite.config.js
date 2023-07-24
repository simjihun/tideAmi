import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';

// https://vitejs.dev/config/
export default defineConfig(() => {
    return {
        plugins: [vue()],
        resolve: {
            alias: {
                '@': fileURLToPath(new URL('./src', import.meta.url))
            }
        },
        server: {
            port: 3000,
            proxy: {
                '/api/*': {
                    target: 'http://localhost:9000'
                    // ws: true,
                    // changeOrigin: true,
                    // rewrite: (path) => path.replace(/^\/api/, '')
                }
            }
        }
        // devServer: {
        //     proxy: 'http://localhost:9000'
        // }
    };
});
