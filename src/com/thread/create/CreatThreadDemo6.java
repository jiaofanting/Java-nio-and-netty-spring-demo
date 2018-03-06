package com.thread.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池创建线程
 * Created by Fant.J.
 * 2018/2/24 11:09
 */
public class CreatThreadDemo6 {
    public static void main(String[] args) {
        //创建一个具有10个线程的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        long threadpoolUseTime = System.currentTimeMillis();
        for (int i = 0;i<10;i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"线程执行了...");
                }
            });
        }
        long threadpoolUseTime1 = System.currentTimeMillis();
        System.out.println("多线程用时"+(threadpoolUseTime1-threadpoolUseTime));
        //销毁线程池
        threadPool.shutdown();
        threadpoolUseTime = System.currentTimeMillis();
//        for (int i = 0;i<10;i++){
//            System.out.println(i+"模拟线程执行...");
//        }
//        long threadpoolUseTime2 = System.currentTimeMillis();
//        System.out.println("非多线程用时"+(threadpoolUseTime2-threadpoolUseTime));
    }

}
