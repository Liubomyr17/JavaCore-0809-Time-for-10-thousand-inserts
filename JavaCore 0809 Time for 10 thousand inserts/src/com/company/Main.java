package com.company;

/*

0809 Время для 10 тысяч вставок

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время своего исполнения в миллисекундах.

Требования:
1. Программа должна выводить числа на экран.
2. Метод main должен вызывать метод getTimeMsOfInsert только два раза.
3. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
4. Метод getTimeMsOfInsert должен вызывать метод insert10000 только один раз.
5. Метод getTimeMsOfInsert должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.


 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }
    public static long getTimeMsOfInsert(List list) {
        Date startTime = new Date();
        insert1000(list);
        Date currentTime = new Date();
        long getTimeMs = currentTime.getTime() - startTime.getTime();
        return getTimeMs;
    }
    public static void insert1000(List list) {
        for(int i=0; i<10000; i++) {
            list.add(0, new Object());
        }
    }
}




