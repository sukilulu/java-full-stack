package org.example;

public class BlockThread {
    public static void main(String[] args){
        Object lock =new Object();

        Thread t1 =new Thread(()->{
            synchronized (lock) {
                System.out.println("t1 acqcuired the lock and will sleep");
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock){
                System.out.println("t2 successfully acquired the lock");
            }
        });

        t1.start();

    }

}
