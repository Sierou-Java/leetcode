package com.sierou.lettcode.easy;

/**
 * @author wanghongyue
 * 2020-09-02 23:08
 **/
public class ThreadTest {

    private  static  Boolean flag = true;
    private static int count=0;

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> {
            System.out.println("start");
            while (flag) {
                count++;
            }
            System.out.println("end ");

        }, "Thread-A");
        threadA.start();

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread threadB = new Thread(() -> {
            System.out.println("set flag false start ");
            flag = false;
            System.out.println("set flag false end ");
        }, "Thread-B");
        threadB.start();

    }

}
