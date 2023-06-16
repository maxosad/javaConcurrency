package com.osadchiy.concurrent.condition;

public class Condition {
    public static void main(String[] args) {
        Store store = new Store();
        new Thread(new Consumer(store)).start();
        new Thread(new Producer(store)).start();
    }

}
