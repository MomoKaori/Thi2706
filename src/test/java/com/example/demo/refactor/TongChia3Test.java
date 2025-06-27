package com.example.demo.refactor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongChia3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void tongChia3VoiSoBeHon3() {
        assertEquals(0,TongChia3.tongChia3(2));
    }
    @Test
    void tongChia3VoiSo0() {
        assertEquals(0,TongChia3.tongChia3(0));
    }
    @Test
    void tongChia3VoiSoAm() {
        assertEquals(0,TongChia3.tongChia3(-1));
    }
    @Test
    void tongChia3VoiSoBatKy() {
        assertEquals(84,TongChia3.tongChia3(23));
    }


}