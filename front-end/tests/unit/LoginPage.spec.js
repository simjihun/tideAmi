import Vue from "vue";
import LoginPage from "@/views/LoginPage";
import { container } from "webpack";
import { shallowMount } from "@vue/test-utils";

describe("LoginPage", () => {
  test("1", () => {
    shallowMount(LoginPage);
  });

  let wrapper;
  beforeEach(() => {
    wrapper = shallowMount(LoginPage);
  });
  test("1", () => {
    expect(wrapper.vm.msg).toBe("Login Page~");
  });
});

// describe("LoginPage.vue", () => {
//   it("should render correct contents", () => {
//     expect(container);

//     const Constructor = Vue.extend(LoginPage);
//     const vm = new Constructor().$mount();
//     expect(vm.$el.querySelector("h1").textContent).toEqual("Login Page");
//   });
// });
