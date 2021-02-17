package com.extrajava.daily_advice;

/**
 * Daily Advice Server
 * @autor EvgeniiTiurin
 * @version 1.1
 * Подключаемся к серверу и принимаем от него входящий поток. Считываем клиентом его
 */

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее",
    "Два слова: не годится", "Будьте честны хотя бы сегодня. Скажите своему начальнику всё, что вы *на самом деле* о нём думаете",
    "возможно вам стоит подобрать другую причёску"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while (true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
