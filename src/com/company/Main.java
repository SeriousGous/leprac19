package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Generator g = new Generator();
        final int N = 2678958;
        ArrayList<String> a = new ArrayList();

        for(int i=0;i<N;i++){
            a.add(g.getNumber());
        }

        System.out.println(a.get(3456));
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        Collections.sort(a);
        long m = System.nanoTime();

        if(a.contains(number))
            System.out.println("Поиск перебором: номер найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        else
            System.out.println("Поиск перебором: номер не найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        m = System.nanoTime();
        if(Collections.binarySearch(a,number) > 0)
            System.out.println("Бинарный поиск: номер найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        else
            System.out.println("Бинарный поиск: номер не найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        HashSet<String> h = new HashSet<>(a);
        m = System.nanoTime();
        if(h.contains(number))
            System.out.println("Поиск в HashSet: номер найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        else
            System.out.println("Поиск в HashSet: номер не найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        TreeSet<String> t = new TreeSet<>(a);
        m = System.nanoTime();
        if(t.contains(number))
            System.out.println("Поиск в TreeSet: номер найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");
        else
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + (double)(System.nanoTime() - m) + " нс");

    }
}