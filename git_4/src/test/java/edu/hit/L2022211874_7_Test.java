package edu.hit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2022211874_7_Test {

    /**
     * 测试目的：
     * 测试字符串长度为 1 的特殊情况，pairs 为空。
     * 测试用例：
     * 输入字符串为 "a"，pairs 为空。
     */
    @Test
    public void testSingleCharacterString() {
        Solution7 solution = new Solution7();
        String s = "a";
        List<List<Integer>> pairs = new ArrayList<>();

        String expected = "a";
        String actual = solution.smallestStringWithSwaps(s, pairs);

        assertEquals("字符串长度为 1 且 pairs 为空时，结果应与输入相同", expected, actual);
    }

    /**
     * 测试目的：
     * 测试字符串为多个字符，但 pairs 为空的情况。
     * 测试用例：
     * 输入字符串为 "abc"，pairs 为空。
     */
    @Test
    public void testNoPairs() {
        Solution7 solution = new Solution7();
        String s = "abc";
        List<List<Integer>> pairs = new ArrayList<>();

        String expected = "abc";
        String actual = solution.smallestStringWithSwaps(s, pairs);

        assertEquals("pairs 为空时，字符串应保持不变", expected, actual);
    }

    /**
     * 测试目的：
     * 测试字符串和非空 pairs，验证基本交换功能。
     * 测试用例：
     * 输入字符串为 "dcab"，pairs 为 [[0,3],[1,2]]。
     * 预期输出为 "bacd"。
     */
    @Test
    public void testBasicSwap() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );

        String expected = "bacd";
        String actual = solution.smallestStringWithSwaps(s, pairs);

        assertEquals("基本交换功能测试失败", expected, actual);
    }

    /**
     * 测试目的：
     * 测试字符串和多个 pairs，验证复杂交换情况。
     * 测试用例：
     * 输入字符串为 "dcab"，pairs 为 [[0,3],[1,2],[0,2]]。
     * 预期输出为 "abcd"。
     */
    @Test
    public void testComplexSwap() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2),
                Arrays.asList(0, 2)
        );

        String expected = "abcd";
        String actual = solution.smallestStringWithSwaps(s, pairs);

        assertEquals("复杂交换情况测试失败", expected, actual);
    }

    /**
     * 测试目的：
     * 测试字符串的全排列交换。
     * 测试用例：
     * 输入字符串为 "cba"，pairs 为 [[0,1],[1,2]]。
     * 预期输出为 "abc"。
     */
    @Test
    public void testFullPermutationSwap() {
        Solution7 solution = new Solution7();
        String s = "cba";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2)
        );

        String expected = "abc";
        String actual = solution.smallestStringWithSwaps(s, pairs);

        assertEquals("全排列交换测试失败", expected, actual);
    }

    /**
     * 测试目的：
     * 测试存在多个不相交的连通分量。
     * 测试用例：
     * 输入字符串为 "dcabef"，pairs 为 [[0,3],[1,2]]。
     * 预期输出为 "bacdef"。
     */
    @Test
    public void testMultipleComponents() {
        Solution7 solution = new Solution7();
        String s = "dcabef";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );

        String expected = "bacdef";
        String actual = solution.smallestStringWithSwaps(s, pairs);

        assertEquals("多个连通分量的测试失败", expected, actual);
    }
}
