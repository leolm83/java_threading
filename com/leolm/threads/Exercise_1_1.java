package com.leolm.threads;

public class Exercise_1_1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
                            System.out.println("We are in the thread "+ Thread.currentThread().getName()+" inside");
                            System.out.println("The current Thread has the id "+Thread.currentThread().getId());
                            System.out.println("Current Thread Priority "+ Thread.currentThread().getPriority());//10
    }
    );
    thread1.start();
    }
}
