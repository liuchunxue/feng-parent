package com.feng.module.test.entity;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @ClassNameDelay
 * @Description
 * @Author liucx
 * @Date2020/9/15 15:42
 **/
public class Delay implements Delayed {
    private String name;
    //延时时间
    private long delayTime;

    public Delay(String name, long delayTime, TimeUnit unit) {
        this.name = name;
        this.delayTime = System.currentTimeMillis() + (delayTime > 0 ? unit.toMillis(delayTime) : 0);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return delayTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        Delay item = (Delay) o;
        long diff = this.delayTime - item.delayTime;
        if (diff <= 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
