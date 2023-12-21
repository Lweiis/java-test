package com.tt.example;

public class BiasLockExample {

    public static void main(String[] args) {
        Object obj = new Object();

        // 线程1获取偏向锁
        synchronized (obj) {
            System.out.println("Thread 1 acquires the lock");
            // 在线程1持有锁的情况下，线程1再次进入同步块不会重新获取锁
            synchronized (obj) {
                System.out.println("Thread 1 re-enters the lock");
            }
        }

        // 线程2尝试获取偏向锁
        new Thread(() -> {
            synchronized (obj) {
                System.out.println("Thread 2 acquires the lock");
            }
        }).start();
    }
}