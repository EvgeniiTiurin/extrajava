package com.extrajava.thread_tester;

/**
 * Thread Tester
 * @autor EvgeniiTiurin
 * @version 1.1
 * Тестирование многопоточности
 */

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("Вершина стека");
    }
}
