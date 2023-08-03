import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:9000/';

//axios.defaults.baseURL = '/api';
// axios.defaults.headers.common.Accept = 'application/json';
// axios.defaults.baseURL = 'http://localhost:9000/';
// axios.interceptors.response.use(
//     (response) => response,
//     (error) => {
//         return Promise.reject(error);
//     }
// );

// AxiosInst.interceptors.request.use((config) => {
//     config.headers.authorization = 'token';
//     config.headers['Access-Control-Allow-Origin'] = '*'; // CORS 설정(모든 리소스 허용)
//     return config;
// });

// export default AxiosInst;

// Add a request interceptor
axios.interceptors.request.use(
    function (config) {
        // Do something before request is sent
        console.log('request interceptor!!!!');
        return config;
    },
    function (error) {
        // Do something with request error
        return Promise.reject(error);
    }
);

// Add a response interceptor
axios.interceptors.response.use(
    function (response) {
        // Any status code that lie within the range of 2xx cause this function to trigger
        // Do something with response data
        console.log('response interceptor!!!!');
        return response;
    },
    function (error) {
        // Any status codes that falls outside the range of 2xx cause this function to trigger
        // Do something with response error
        return Promise.reject(error);
    }
);

export default axios;
