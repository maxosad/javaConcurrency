package com.osadchiy.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class Sem {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        new Thread(new SemThread("first", sem)).start();
        new Thread(new SemThread("second", sem)).start();
        new Thread(new SemThread("third", sem)).start();
    }
}
