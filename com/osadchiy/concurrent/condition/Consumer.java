package com.osadchiy.concurrent.condition;

public class Consumer implements Runnable {
    Store store;

    public Consumer (Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }
}
