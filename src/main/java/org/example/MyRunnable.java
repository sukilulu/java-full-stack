package org.example;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Single thread without returning value!");
        System.out.println("current running thread ID"+Thread.currentThread().getId());
    }

    public static void main (String[] args){
        //(Main thread)
        System.out.println("Main thread ID:" + Thread.currentThread().getId());

        //Manually Thread #1: use Myrunnable class
        MyRunnable task = new MyRunnable();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
