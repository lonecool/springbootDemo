/*
package com.example.wyh.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling
@EnableAsync
public class TimerMultithreading {

    @Async
    @Scheduled(fixedDelay = 2000)
    public void first() throws InterruptedException {
        System.out.println("当前为第一个任务：" + LocalDateTime.now() + "\r\n线程:" + Thread.currentThread().getName());
        System.out.println();
        Thread.sleep(4000);
    }
    @Async
    @Scheduled(fixedDelay = 1000)
    public void second() throws InterruptedException {
        System.out.println("当前为第二个任务：" + LocalDateTime.now() + "\r\n线程:" + Thread.currentThread().getName());
        System.out.println();
        //Thread.sleep(1000);
    }
}

*/
