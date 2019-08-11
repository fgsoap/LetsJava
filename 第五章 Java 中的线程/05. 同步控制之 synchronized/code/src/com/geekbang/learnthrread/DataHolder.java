package com.geekbang.learnthrread;

public class DataHolder {

    private static long numberStatic = 0;
    private Object lockObj = new Object();
    private long number = 0;

    // TODO 一个synchronized解决问题
    public synchronized static void changeStatic(long delta) {
        numberStatic += delta;
    }

    public static void printStatic() {
        System.out.println("static Number=" + numberStatic);
    }

    // TODO 一个synchronized解决问题
    public synchronized void change(long delta) {
        number += delta;
    }

    public void changeSyncBlock(long delta) {
        int abc = 99;
        synchronized (lockObj) {
            number += delta;
        }
        int cde = 987;
    }

    public void print() {
        System.out.println("Number=" + number);
    }

}
