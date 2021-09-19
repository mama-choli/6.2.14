package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; scanner.hasNextInt(); i++) {
            int j = scanner.nextInt();
            if (i % 2 != 1) {
                deque.addFirst(j);
            }
        }
        for (Integer num : deque) {
            System.out.print(num + " ");
        }
    }
}