package org.example;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        logThreadInfo("main thread starting", mainThread);

        Thread thread = new Thread(() -> {
            try {
                logThreadInfo("runnable thread starting", Thread.currentThread());
                System.out.println("2. Runnable");
                Thread.sleep(1000);
                System.out.println("3. Running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "worker Thread");
        System.out.println("1. New");
        thread.start();


        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("4.Terminated");

    }

    private static void logThreadInfo(String message, Thread thread) {
        System.out.printf()
        new java.util.Date(),
                message,
                thread.getId(),
                thread.getName(),
                thread.getState(),
                thread.getPriority());
    }
}
}
