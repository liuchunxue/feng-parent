//package com.feng.module.test.controller;
//
//import com.feng.common.constant.RedisConstant;
//import com.feng.common.controller.BaseController;
//import com.feng.common.service.RedisService;
//import com.feng.module.test.entity.Config;
//import com.feng.module.test.service.DelayQueueService;
//import com.feng.module.test.service.TestService;
//import com.jfinal.plugin.activerecord.Db;
//import org.redisson.Redisson;
//import org.redisson.api.RLock;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//@RestController
//@RequestMapping("/")
//public class TestController extends BaseController {
//    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
//    @Autowired
//    private RedisService redisService;
//    @Autowired
//    private TestService testService;
//    @Autowired
//    private DelayQueueService delayQueueService;
//    @GetMapping("/test")
//    public List<Object> test() {
//        List<Object> xx = Db.query("select * from sys_config");
//        logger.info("this is a t---------------");
//        return xx;
//    }
//
//    /**
//     * @param key
//     * @param value
//     * @return
//     */
//    @GetMapping("/setRedis")
//    public String setRedis(String key, String value) {
//        redisService.set(RedisConstant.TEST_KEY, value, 0);
//        return "yes";
//    }
//
//    /**
//     * @param key
//     * @param value
//     * @return
//     */
//    @GetMapping("/getRedis")
//    public String getRedis(String key, String value) {
//        return redisService.get(RedisConstant.TEST_KEY);
//    }
//
//    @Autowired
//    private Redisson redisson;
//
//    /**
//     * 设置库存
//     *
//     * @param value
//     * @return
//     */
//    @GetMapping("/setStock")
//    public String setStock(String key, String value) {
//        redisService.set(key, value, 0);
//        return "yes";
//    }
//
//
//    /**
//     * 分布式锁 redisson组件
//     * 扣减库存  设计模式
//     *
//     * @return
//     */
//    @RequestMapping("/deductStock")
//    public void deductStock() {
//        RLock lock = redisson.getLock("stockLock"); //获取锁
//        try {
//            //加锁:redission默认超时时间为30s，每10s续期一次，也可以自己设置时间
//            lock.lock(10, TimeUnit.SECONDS);
//            int stock = Integer.parseInt(redisService.get("stock"));//jedis.get(key)
//            if (stock > 0) {
//                int realStock = stock - 1;
//                redisService.set("stock", realStock + "", 0);//jedis.set(key,value)
//                System.out.println("扣减成功，剩余库存：" + realStock + "");
//            } else {
//                System.out.println("库存不足");
//            }
//        } finally {
//            lock.unlock();
//        }
//        //return "end";
//    }
//
//    /**
//     * @return
//     */
//    @RequestMapping("/testBinfa")
//    public String testBinfa() {
//        return "";
//    }
//
//    @RequestMapping("/synchronizedTest")
//    public String synchronizedTest() {
//        int stockPre = Integer.parseInt(redisService.get("stock"));//jedis.get(key)
//        if (stockPre <= 0) {
//            System.out.println("库存不足1");
//        }
//        synchronized (this) {
//            int stock = Integer.parseInt(redisService.get("stock"));//jedis.get(key)
//            if (stock > 0) {
//                int realStock = stock - 1;
//                redisService.set("stock", realStock + "", 0);//jedis.set(key,value)
//                System.out.println("扣减成功，剩余库存：" + realStock + "");
//            } else {
//                System.out.println("库存不足");
//            }
//        }
//        return "";
//    }
//
//    @RequestMapping("/mybaiisTest")
//    public List<Config> mybaiisTest() {
//        return testService.listConfig();
//    }
//    @RequestMapping("/findByVariable")
//    public List<Config> findByVariable() {
//        return testService.findByVariable("diagnostics.include_raw");
//    }
//
//    /**
//     * 延时队列测试
//     * @param name
//     * @param delayTime
//     * @return
//     */
//    @GetMapping("/delay")
//    public String delayQueueTest(String name,long delayTime){
//        delayQueueService.putName(name,delayTime);
//        return "ok";
//    }
//}
