package com.osadchiy.concurrent.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private int product = 0;
    private ReentrantLock locker;
    private Condition cond;

    public Store () {
        this.locker = new ReentrantLock();
        this.cond = locker.newCondition();
    }

    public void get() {
        locker.lock();
        try{
            while (product<1)
                cond.await();

            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе" + product);


            cond.signalAll();

        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    public void put() {
        locker.lock();
        try{
            while (product>=3)
                cond.await();

            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе" + product);

            cond.signalAll();

        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}
