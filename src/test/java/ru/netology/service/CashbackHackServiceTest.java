package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTellUnder1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(500);
        int expected = 500;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldTellEquell1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldTellUpper1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1600);
        int expected = 400;
        assertEquals(actual,expected);
    }
}