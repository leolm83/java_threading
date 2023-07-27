package com.leolm.threads;

class Exercise_1{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(
            new Runnable(){
                @Override
                public void run(){
                            System.out.println("We are in the thread "+ Thread.currentThread().getName()+" inside");
                            System.out.println("The current Thread has the id "+Thread.currentThread().getId());
                            System.out.println("Current Thread Priority "+ Thread.currentThread().getPriority());//10
                }
            }
        );
        thread1.setName("New Worker Thread");
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("We are in the thread "+ Thread.currentThread().getName()+" before");
        thread1.start();
        System.out.println("We are in the thread "+ Thread.currentThread().getName()+" after");
        Thread.sleep(10000);

    }
}