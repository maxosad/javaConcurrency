package com.osadchiy.concurrent.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class RelockThread  implements Runnable {

    private ReentrantLock locker;
    private CommonResource cr;
    private String name;

    public RelockThread(ReentrantLock locker, CommonResource cr, String name) {
        this.locker = locker;
        this.cr = cr;
        this.name = name;
    }

    @Override
    public void run() {
        locker.lock();
        System.out.println(name + " " + cr.x++ + " " + cr.x);
        locker.unlock();

    }
}
