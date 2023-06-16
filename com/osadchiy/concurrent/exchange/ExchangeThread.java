package com.osadchiy.concurrent.exchange;

import java.util.concurrent.Exchanger;

public class ExchangeThread implements Runnable{
    private String message;
    private Exchanger<String> exchanger;

    public ExchangeThread(String message, Exchanger<String> exchanger) {
        this.message = message;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            String recivedMessage = exchanger.exchange(message);
            System.out.println(message + ": " + recivedMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
