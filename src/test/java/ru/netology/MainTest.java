package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testRemain() {
        Main bonusServiceHome = new Main();
        int amount = 900;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 100;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain2() {
        Main bonusServiceHome = new Main();
        int amount = 10;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 990;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain3() {
        Main bonusServiceHome = new Main();
        int amount = 1;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 999;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain4() {
        Main bonusServiceHome = new Main();
        int amount = 1100;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 900;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain5() {
        Main bonusServiceHome = new Main();
        int amount = 1000;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected); //операция сравнения
    }
}
