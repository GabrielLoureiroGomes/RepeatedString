package com.loureiro.repeatedString;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RepeatedStringTest {

    RepeatedString repeatedString = new RepeatedString();

    @Test
    public void repeatedStringTest() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("r", 3);
        expected.put("s", 1);
        expected.put("e", 3);
        expected.put("u", 1);
        expected.put("g", 2);
        expected.put("i", 2);
        expected.put("l", 2);
        expected.put("m", 1);
        expected.put("o", 3);

        String text = "Gabriel Loureiro Gomes";
        Map<String, Integer> map = repeatedString.characterCounter(text);
        repeatedString.printString(map);

        Assert.assertEquals(map, expected);
    }
}
