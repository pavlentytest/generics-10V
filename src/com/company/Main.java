package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("dfsdfg"); // 0
        list.add(1); // 1
        list.add(new Object()); //2

        int x = (int)list.get(0);
        System.out.println(x);
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Germany");
        countries.add(1);

    }
}
