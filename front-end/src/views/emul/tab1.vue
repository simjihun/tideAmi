<script>
import tab1 from '../test/TestBoardList.vue';
import tab2 from './Nms.vue';

export default {
    components: {
        tab1,
        tab2
    },
    data() {
        return { comp: 'tab1' };
    },
    methods: {
        changeComponent: function (componentName) {
            this.comp = componentName;
            console.log(this.comp);
        }
    }
};
</script>

<template>
    <div>
        <button class="btn" @click="changeComponent('tab2')">follower</button>
        <button class="btn" @click="changeComponent('tab1')">follow</button>
    </div>
    <div class="tab-item">
        <keep-alive>
            <component v-bind:is="comp"></component>
        </keep-alive>
    </div>
</template>

<style scoped></style>
