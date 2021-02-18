package com.extrajava.thread_tester;

import java.lang.management.RuntimeMXBean;

/**
 * Thread Tester
 * @autor EvgeniiTiurin
 * @version 1.1
 * Тестирование многопоточности
 */

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Возвращаемся в метод main");
    }
}
