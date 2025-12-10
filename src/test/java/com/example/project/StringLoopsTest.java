package com.example.project;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class StringLoopsTest {

    @Test
    void testRemoveA_and_removeA2() {
        StringLoops s = new StringLoops();
        assertEquals("bc", s.removeA("abc"));
        assertEquals("bc", s.removeA2("abc"));

        assertEquals("", s.removeA("aaa"));
        assertEquals("", s.removeA2("aaa"));

        assertEquals("hello", s.removeA("hello"));
        assertEquals("hello", s.removeA2("hello"));
    }

    @Test
    void testReverseString_updown() {
        StringLoops s = new StringLoops();
        assertEquals("cba", s.reverseString("abc"));
        assertEquals("cba", s.reverseString2("abc"));

        assertEquals("", s.reverseString(""));
        assertEquals("", s.reverseString2(""));
    }

    @Test
    void testReplaceCharacterV1_examples() {

        StringLoops loops = new StringLoops();
        assertEquals("c*nned be*ns *nd b*n*n*s",
                loops.replaceCharacterV1("a", "canned beans and bananas", "*"));

        assertEquals("cannedbeansandbananas",
                loops.replaceCharacterV1(" ", "canned beans and bananas", ""));

        assertEquals("Rapapappap",
                loops.replaceCharacterV1("t", "Ratatattat", "p"));

        assertEquals("Nice? Day today?",
                loops.replaceCharacterV1("!", "Nice! Day today!", "?"));

        assertEquals("It’s the braIn draIn paIn traIn",
                loops.replaceCharacterV1("i", "it’s the brain drain pain train", "I"));

        assertEquals(" t’s the bra n dra n pa n tra n",
                loops.replaceCharacterV1("i", "it’s the brain drain pain train", " "));

        assertEquals("DBDBDBDBDBC",
                loops.replaceCharacterV1("A", "ABABABABABC", "D"));

        assertEquals("ABABABABABC",
                loops.replaceCharacterV1("a", "ABABABABABC", "D"));
    }

    @Test
    void testReplaceCharacterV2_examples() {
        StringLoops loops = new StringLoops();
        assertEquals("c*nned be*ns *nd b*n*n*s",
                loops.replaceCharacterV2("a", "canned beans and bananas", "*"));

        assertEquals("cannedbeansandbananas",
                loops.replaceCharacterV2(" ", "canned beans and bananas", ""));

        assertEquals("Rapapappap",
                loops.replaceCharacterV2("t", "Ratatattat", "p"));

        assertEquals("Nice? Day today?",
                loops.replaceCharacterV2("!", "Nice! Day today!", "?"));

        assertEquals("It’s the braIn draIn paIn traIn",
                loops.replaceCharacterV2("i", "it’s the brain drain pain train", "I"));

        assertEquals(" t’s the bra n dra n pa n tra n",
                loops.replaceCharacterV2("i", "it’s the brain drain pain train", " "));

        assertEquals("DBDBDBDBDBC",
                loops.replaceCharacterV2("A", "ABABABABABC", "D"));

        assertEquals("ABABABABABC",
                loops.replaceCharacterV2("a", "ABABABABABC", "D"));
    }

    @Test
    void testCountString_examples() {
        StringLoops loops = new StringLoops();

        assertEquals(5, loops.countString("an", "canned beans and bananas"));
        assertEquals(3, loops.countString("tat", "Ratatattat"));
        assertEquals(1, loops.countString("lower", "sunflower"));
        assertEquals(3, loops.countString("haha", "Hahahahaha"));
        assertEquals(3, loops.countString("rain", "rain drain pain train"));
        assertEquals(1, loops.countString("was", "I was about to call you"));
        assertEquals(0, loops.countString("but", "I was about to call you"));
        assertEquals(12, loops.countString("i", "iiiit's supercalifragilisticexpialidociousi"));
    }

    @Test
    void testRemoveString_examples() {
        StringLoops loops = new StringLoops();

        assertEquals("cned bes d bas",
                loops.removeString("an", "canned beans and bananas"));

        assertEquals("Raat",
                loops.removeString("tat", "Ratatattat"));

        assertEquals("sunf",
                loops.removeString("lower", "sunflower"));

        assertEquals("Ha",
                loops.removeString("haha", "Hahahahaha"));

        assertEquals("Hahahahaha",
                loops.removeString("HAHA", "Hahahahaha"));

        assertEquals("it’s the b d pain t",
                loops.removeString("rain", "it’s the brain drain pain train"));

        assertEquals("ool",
                loops.removeString("lol", "lolololol"));

        assertEquals("I  about to call you, n’t I?",
                loops.removeString("was", "I was about to call you, wasn’t I?"));

        assertEquals("I was about to call you, wasn’t I?",
                loops.removeString("but", "I was about to call you, wasn’t I?"));

        assertEquals("C",
                loops.removeString("AB", "ABABABABABC"));

        assertEquals("C",
                loops.removeString("AB", "AAAAABBBBBC"));
    }

    @Test
    void testCommaSeparated() {
        StringLoops loops = new StringLoops();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));

        loops.commaSeparated(0, 5);
        loops.commaSeparated(-3, 2);
        loops.commaSeparated(8, 1);
        loops.commaSeparated(-4, -10);
        loops.commaSeparated(4, 4);
        loops.commaSeparated(0, 0);
        loops.commaSeparated(0, 1);
        loops.commaSeparated(-3, 12);

        System.out.flush();
        System.setOut(oldOut);

        String output = out.toString().replace("\r\n", "\n");

        assertTrue(output.contains("0, 1, 2, 3, 4, 5\n"));
        assertTrue(output.contains("-3, -2, -1, 0, 1, 2\n"));
        assertTrue(output.contains("8, 7, 6, 5, 4, 3, 2, 1\n"));
        assertTrue(output.contains("-4, -5, -6, -7, -8, -9, -10\n"));
        assertTrue(output.contains("4\n"));
        assertTrue(output.contains("0\n"));
        assertTrue(output.contains("0, 1\n"));
        assertTrue(output.contains("-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12\n"));
    }

    @Test
    void testIsPalindrome_examples() {
        StringLoops loops = new StringLoops();

        // Expected true cases
        assertTrue(loops.isPalindrome("A"));
        assertTrue(loops.isPalindrome("mom"));
        assertTrue(loops.isPalindrome("dad"));
        assertTrue(loops.isPalindrome("bob"));
        assertTrue(loops.isPalindrome("noon"));
        assertTrue(loops.isPalindrome("deed"));
        assertTrue(loops.isPalindrome("12321"));
        assertTrue(loops.isPalindrome("aaaaaaa"));
        assertTrue(loops.isPalindrome("baaabbaaab"));
        assertTrue(loops.isPalindrome("civic"));
        assertTrue(loops.isPalindrome("kayak"));
        assertTrue(loops.isPalindrome("racecar"));
        assertTrue(loops.isPalindrome("my gym"));
        assertTrue(loops.isPalindrome("step on no pets"));
        assertTrue(loops.isPalindrome("45TTTT54"));
        assertTrue(loops.isPalindrome("no lemon no melon"));
        assertTrue(loops.isPalindrome("a nut for a jar of tuna"));
        assertTrue(loops.isPalindrome("! 1 2 3 4 M 6M4321!"));
        assertTrue(loops.isPalindrome("was it a car or a cat i saw"));
        assertTrue(loops.isPalindrome("a man a plan a canal panama"));

        // Expected false cases
        assertFalse(loops.isPalindrome("mod"));
        assertFalse(loops.isPalindrome("dang"));
        assertFalse(loops.isPalindrome("boo"));
        assertFalse(loops.isPalindrome("noonish"));
        assertFalse(loops.isPalindrome("indeed"));
        assertFalse(loops.isPalindrome("1234432"));
        assertFalse(loops.isPalindrome("civics"));
        assertFalse(loops.isPalindrome("kayaks"));
        assertFalse(loops.isPalindrome("racing car"));
        assertFalse(loops.isPalindrome("my gyms"));
        assertFalse(loops.isPalindrome("step on pets"));
        assertFalse(loops.isPalindrome("1 3 2 4 3 2 1"));
        assertFalse(loops.isPalindrome("AAADAA"));
        assertFalse(loops.isPalindrome("BaaBaaaB"));
    }

    @Test
    void testMultiPrint_examples() {
        StringLoops loops = new StringLoops();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(out));

        loops.multiPrint("hello", 4);
        loops.multiPrint("beetlejuice", 3);
        loops.multiPrint("hi there", 2);
        loops.multiPrint("boop!", 1);
        loops.multiPrint("dance party", 0);
        loops.multiPrint("anything", -4);

        System.out.flush();
        System.setOut(oldOut);

        String output = out.toString().replace("\r\n", "\n");

        assertTrue(output.contains("[hello hello hello hello]\n"));
        assertTrue(output.contains("[beetlejuice beetlejuice beetlejuice]\n"));
        assertTrue(output.contains("[hi there hi there]\n"));
        assertTrue(output.contains("[boop!]\n"));
        assertTrue(output.contains("[]\n"));
    }

}
