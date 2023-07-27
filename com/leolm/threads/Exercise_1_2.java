package com.leolm.threads;

public class Exercise_1_2 {


    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
                            System.out.println("We are in the thread "+ Thread.currentThread().getName()+" inside");
                            System.out.println("The current Thread has the id "+Thread.currentThread().getId());
                            System.out.println("Current Thread Priority "+ Thread.currentThread().getPriority());//10
    }
    );
    thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e){
            System.out.println("A critical Error occurred in thread" + t.getName() + ", the error is "+ e.getMessage());
        }
    });
}

}
