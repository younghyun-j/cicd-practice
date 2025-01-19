package com.cicdpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CiCiTest {

    @DisplayName("hello 매개변수를 전달하면 world 값을 반환한다")
    @Test
    void ci_test() throws Exception {
        //given
        CiTest ciTest = new CiTest();

        //when
        String result = ciTest.test("hello");

        //then
        Assertions.assertEquals("world", result);
    }
}