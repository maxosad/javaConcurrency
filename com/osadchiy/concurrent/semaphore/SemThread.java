package com.osadchiy.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class SemThread implements Runnable{

    private String name;
    private Semaphore semaphore;

    public SemThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(name + " is waiting");
        try {
            semaphore.acquire();
            System.out.println(name + " is eating");
            System.out.println(name + " is eating");
            System.out.println(name + " is eating");
            semaphore.release();
            System.out.println(name + " is stand");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
