<script>
import axios from 'axios';
import moment from 'moment';

export default {
    name: 'test-board-list',
    data() {
        return {
            boardList: []
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
                        this.boardList = response.data.result;
                    } else {
                        console.log('get-board-list failed');
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
};
</script>

<template>
    <div>
        <el-table border :data="boardList">
            <el-table-column prop="bno" label="글번호"></el-table-column>
            <el-table-column prop="title" label="제목"></el-table-column>
            <el-table-column prop="content" label="내용"></el-table-column>
            <el-table-column prop="writer" label="작성자"></el-table-column>
            <el-table-column prop="regDate" label="등록일" :formatter="DateFormat"></el-table-column>
        </el-table>
    </div>
</template>

<style scoped></style>
