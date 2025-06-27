package com.example.demo.refactor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongSoChia3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void tongChia3VoiSoBeHon3() {
        assertEquals(0, TongSoChia3.tongChia3(2));
    }
    @Test
    void tongChia3Voi3() {
        assertEquals(3, TongSoChia3.tongChia3(3));
    }
    @Test
    void tongChia3VoiSo0() {
        assertEquals(0, TongSoChia3.tongChia3(0));
    }
    @Test
    void tongChia3VoiSoAm() {
        assertEquals(0, TongSoChia3.tongChia3(-1));
    }
    @Test
    void tongChia3VoiSoBatKyLonHon3() {
        assertEquals(84, TongSoChia3.tongChia3(23));
    }


}