package com.tt.example;

import java.util.*;

/**
 * 反转 String, 使用栈
 */
public class StringReverse {
    public static void main(String[] arg) {
        String a = "asdf";
        String reverse = reverse(a.toCharArray());
        System.out.println(reverse);
    }

    private static String reverse(char[] a) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            characters.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = characters.peek();
            characters.pop();
        }
        return String.valueOf(a);
    }

}
