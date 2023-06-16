package com.osadchiy.concurrent.phaser;

import java.util.concurrent.Phaser;

public class Pha {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();

        new Thread(new PhaserThread(phaser, "1")).start();
        new Thread(new PhaserThread(phaser, "2")).start();
    }
}
