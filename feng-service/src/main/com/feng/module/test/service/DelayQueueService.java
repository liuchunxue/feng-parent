package com.feng.module.test.service;


import com.feng.module.test.entity.Delay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassNameDelayQueueService
 * @Description
 * @Author liucx
 * @Date2020/9/15 16:22
 **/
@Service
public class DelayQueueService {
    private final static Logger logger = LoggerFactory.getLogger(DelayQueueService.class);
    DelayQueue<Delay> queue = new DelayQueue<>();

    public void putName(String name, long delayTime) {
        Delay d = new Delay(name, delayTime, TimeUnit.SECONDS);
        queue.put(d);
    }

    @PostConstruct
    public void take() throws InterruptedException {
        logger.info("启动take-----------------------------------");
        ThreadDelay th = new ThreadDelay();
        th.start();

    }

    class ThreadDelay extends Thread {
        @Override
        public void run() {
            for (; ; ) {
                Delay delay = null;
                try {
                    delay = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info(delay.getName());
            }
        }
    }
}
