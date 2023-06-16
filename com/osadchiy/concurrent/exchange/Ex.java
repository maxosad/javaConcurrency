package com.osadchiy.concurrent.exchange;

import java.util.concurrent.Exchanger;

public class Ex {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new ExchangeThread("first", exchanger)).start();
        new Thread(new ExchangeThread("second", exchanger)).start();
        new Thread(new ExchangeThread("third", exchanger)).start();
        new Thread(new ExchangeThread("fourth", exchanger)).start();
        //четное количество должно быть
    }
}
