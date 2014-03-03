package com.dantala.my.testing;

import java.util.StringTokenizer;

public class TestingStuff {

    public static void main(String[] args) {

        String temp = "hello        world";

        StringTokenizer st = new StringTokenizer(temp);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
