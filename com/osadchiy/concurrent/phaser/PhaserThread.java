package com.osadchiy.concurrent.phaser;

import java.util.concurrent.Phaser;

public class PhaserThread implements Runnable{
    private Phaser phaser;
    private String name;

    public PhaserThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        Integer phase = phaser.arriveAndAwaitAdvance();
        System.out.println(name + " " + phase);
        phase = phaser.arriveAndAwaitAdvance();
        System.out.println(name + " " + phase);
        phase = phaser.arriveAndAwaitAdvance();
        System.out.println(name + " " + phase);
        phase = phaser.arriveAndAwaitAdvance();
        System.out.println("last" + name + " " + phase);
    }
}
