<script>
import followList from './Nms.vue';
import followerList from './tab1.vue';

export default {
    components: {
        followList,
        followerList
    },
    data() {
        return { comp: 'followerList' };
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
        <button class="btn" @click="changeComponent('followerList')">follower</button>
        <button class="btn" @click="changeComponent('followList')">follow</button>
    </div>
    <div class="tab-item">
        <keep-alive>
            <component v-bind:is="comp"></component>
        </keep-alive>
    </div>
</template>

<style scoped></style>
