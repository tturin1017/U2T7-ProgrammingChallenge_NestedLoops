package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedLoopsTest {

    @Test
    public void testStarStaircase() {
        String result = NestedLoops.starStaircase(3);
        String expected = "*\n**\n***";
        assertEquals(expected, result);
    }

    @Test
    public void testStarStaircaseHeight1() {
        String result = NestedLoops.starStaircase(1);
        String expected = "*";
        assertEquals(expected, result);
    }

    @Test
    public void testStarStaircaseHeight5() {
        String result = NestedLoops.starStaircase(5);
        String expected = "*\n**\n***\n****\n*****";
        assertEquals(expected, result);
    }

    @Test
    public void testStarStaircaseReverse() {
        String result = NestedLoops.starStaircaseReverse(3);
        String expected = "***\n**\n*";
        assertEquals(expected, result);
    }

    @Test
    public void testStarStaircaseReverseHeight1() {
        String result = NestedLoops.starStaircaseReverse(1);
        String expected = "*";
        assertEquals(expected, result);
    }

    @Test
    public void testStarStaircaseReverseHeight5() {
        String result = NestedLoops.starStaircaseReverse(5);
        String expected = "*****\n****\n***\n**\n*";
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyBox() {
        String result = NestedLoops.emptyBox(5, 5);
        String expected = "*****\n*   *\n*   *\n*   *\n*****";
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyBoxSmall() {
        String result = NestedLoops.emptyBox(3, 3);
        String expected = "***\n* *\n***";
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyBoxInvalid() {
        String result = NestedLoops.emptyBox(1, 5);
        String expected = "";
        assertEquals(expected, result);
        
        result = NestedLoops.emptyBox(5, 1);
        expected = "";
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyBoxRectangle() {
        String result = NestedLoops.emptyBox(6, 3);
        String expected = "******\n*    *\n******";
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatRectangle() {
        String result = NestedLoops.repeatRectangle("HELLO", 5);
        String expected = "HELLO\nELLOH\nLLOHE\nLOHEL\nOHELL";
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatRectangleSmall() {
        String result = NestedLoops.repeatRectangle("AB", 3);
        String expected = "AB\nBA\nAB";
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatRectangleSingleChar() {
        String result = NestedLoops.repeatRectangle("A", 3);
        String expected = "A\nA\nA";
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatRectangleOneRow() {
        String result = NestedLoops.repeatRectangle("HELLO", 1);
        String expected = "HELLO";
        assertEquals(expected, result);
    }

}
