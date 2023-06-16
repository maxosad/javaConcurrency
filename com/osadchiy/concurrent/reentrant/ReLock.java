package com.osadchiy.concurrent.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class ReLock {
    public static void main(String[] args) {

        ReentrantLock locker = new ReentrantLock();
        CommonResource cr = new CommonResource();

        new Thread(new RelockThread(locker, cr, "1")).start();
        new Thread(new RelockThread(locker, cr, "2")).start();
        new Thread(new RelockThread(locker, cr, "3")).start();
    }
}
