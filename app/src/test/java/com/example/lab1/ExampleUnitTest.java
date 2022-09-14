package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void TestMin1() {
        assertEquals(1, MyClass.Min(2, 1));
    }
    @Test
    public void TestMin2() {
        assertEquals(-1, MyClass.Min(-1, 1));
    }
    @Test
    public void TestMin3() {
        assertEquals(-2, MyClass.Min(-2, 1));
    }
    @Test
    public void TestMin4() {
        assertEquals(-1, MyClass.Min(2, -1));
    }

    @Test
    public void TestMax1() {
        assertEquals(2, MyClass.Max(2, 1));
    }
    @Test
    public void TestMax2() {
        assertEquals(1, MyClass.Max(-1, 1));
    }
    @Test
    public void TestMax3() {
        assertEquals(1, MyClass.Max(-2, 1));
    }
    @Test
    public void TestMax4() { assertEquals(2, MyClass.Max(2, -1)); }
}