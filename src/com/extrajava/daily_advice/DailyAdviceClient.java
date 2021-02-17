package com.extrajava.daily_advice;

/**
 * Daily Advice Client
 * @autor EvgeniiTiurin
 * @version 1.1
 * Подключаемся к серверу и принимаем от него входящий поток. Считываем клиентом его
 */

import java.io.*;
import java.net.*;

public class DailyAdviceClient {
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
