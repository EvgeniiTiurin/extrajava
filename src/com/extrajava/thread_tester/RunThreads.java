package com.extrajava.thread_tester;

/**
 * Run Threads
 * @autor EvgeniiTiurin
 * @version 1.1
 * Запуск двух потоков и вывод их названий
 */

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread betta = new Thread(runner);
        alpha.setName("Поток альфа");
        betta.setName("Поток бетта");
        alpha.start();
        betta.start();
    }

    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Сейчас работает " + threadName);
        }
    }
}
