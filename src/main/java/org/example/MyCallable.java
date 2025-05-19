package org.example;

import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    private String taskName;

    public MyCallable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        // Simulate some computation or processing
        Thread.sleep(1000);  // simulate delay
        return "Task [" + taskName + "] executed by " + Thread.currentThread().getName();
    }

    public static void main (String[]args){
        ExecutorService executor = Executors.newSingleThreadExecutor();

        MyCallable task = new MyCallable("DownloadData");
        Future<String> future = executor.submit(task);

        // Do other work here...

        // Get result of the Callable
        String result = future.get();  // this blocks until result is available
        System.out.println(result);

        executor.shutdown();
    }
}

