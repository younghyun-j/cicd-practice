package com.cicdpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CiTest2Test {

    @DisplayName("hello 매개변수를 전달하면 world 값을 반환한다")
    @Test
    void hello_world_test() throws Exception {
        //given
        CiTest2 ciTest = new CiTest2();

        //when
        String result = ciTest.test("hello");

        //then
        Assertions.assertEquals("world", result);
    }

    @DisplayName("jpa 매개변수를 전달하면 hibernate 값을 반환한다")
    @Test
    void jpa_hibernate_test() throws Exception {
        //given
        CiTest2 ciTest = new CiTest2();

        //when
        String result = ciTest.test("jpa");

        //then
        Assertions.assertEquals("hibernate", result);
    }

    @Test
    void spring_boot_test() throws Exception {
        //given
        CiTest2 ciTest = new CiTest2();

        //when
        String result = ciTest.test("spring");

        //then
        Assertions.assertEquals("boot", result);
    }

}