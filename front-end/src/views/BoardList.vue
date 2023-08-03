<script>
import axios from 'axios';
import moment from 'moment';

export default {
    name: 'test-board-list',
    mounted() {
        //페이지 시작시 자동 함수 실행
        this.getBoardList();
    },
    watch: {
        options: {
            handler() {
                this.getBoardList();
            },
            deep: true
        }
    },
    data() {
        return {
            headers: [
                { text: '글 번호', align: 'center', value: 'bno' },
                { text: '제목', align: 'start', value: 'title' },
                { text: '내용', align: 'center', value: 'content' },
                { text: '작성자', align: 'center', value: 'writer' },
                { text: '등록일', align: 'center', value: 'reg_date' }
            ],
            items: []
        };
    },
    created() {
        this.getBoardList();
    },
    methods: {
        DateFormat(row) {
            return moment(row.regDate).format('YYYY-MM-DD hh:MM:ss');
        },
        getBoardList() {
            axios
                .get('http://localhost:9000/test/board-list.do')
                .then((response) => {
                    if (response.data.success) {
                        console.log(response.data.result);
                        this.items = response.data.result;
                    } else {
                        console.log('get-board-list failed');
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
        // createAccountInfoList() {
        //     for (var i = 0; i < this.account.length; i++) {
        //         this.item.IdNo = this.account[i].IdNo;
        //         this.items.push(this.item);
        //         this.item = {};
        //     }
        // }
    }
};
</script>

<template>
    <EasyDataTable :headers="headers" :items="items" />
</template>
