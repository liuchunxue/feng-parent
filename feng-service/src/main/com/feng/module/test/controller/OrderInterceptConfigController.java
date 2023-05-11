package com.feng.module.test.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.module.test.entity.OrderInterceptConfig;
import com.feng.module.test.service.OrderInterceptConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        /**
         * 订单拦截配置;(order_intercept_config)表控制层
         * @author : http://www.chiner.pro
         * @date : 2023-5-11
         */
        @Api(tags = "订单拦截配置对象功能接口")
        @RestController
        @RequestMapping("/config")
        public class OrderInterceptConfigController{
        @Autowired
        private OrderInterceptConfigService orderInterceptConfigServiceImpl;

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        @ApiOperation("通过ID查询单条数据")
        @GetMapping("queryById/{id}")
        public ResponseEntity<OrderInterceptConfig> queryById(@PathVariable Long id){
        return ResponseEntity.ok(orderInterceptConfigServiceImpl.queryById(id));
        }

        /**
         * 分页查询
         *
         * @param orderInterceptConfig 筛选条件
         * @param pageRequest 分页对象
         * @return 查询结果
         */
        @ApiOperation("分页查询")
        @GetMapping("/configList")
        public ResponseEntity<Page<OrderInterceptConfig>> paginQuery(OrderInterceptConfig orderInterceptConfig, Page pageRequest){
//        //1.分页参数
//        long current = pageRequest.getPageNumber();
//        long size = pageRequest.getPageSize();
//        //2.分页查询
//        /*把Mybatis的分页对象做封装转换，MP的分页对象上有一些SQL敏感信息，还是通过spring的分页模型来封装数据吧*/
//        com.baomidou.mybatisplus.extension.plugins.pagination.Page<OrderInterceptConfig> pageResult = orderInterceptConfigService.paginQuery(orderInterceptConfig, current,size);
//        //3. 分页结果组装
//        List<OrderInterceptConfig> dataList = pageResult.getRecords();
//        long total = pageResult.getTotal();
//        PageImpl<OrderInterceptConfig> retPage = new PageImpl<OrderInterceptConfig>(dataList,pageRequest,total);
        return ResponseEntity.ok(null);
        }

        /**
         * 新增数据
         *
         * @param orderInterceptConfig 实例对象
         * @return 实例对象
         */
        @ApiOperation("新增数据")
        @PostMapping("/add")
        public ResponseEntity<OrderInterceptConfig> add(OrderInterceptConfig orderInterceptConfig){
        return ResponseEntity.ok(orderInterceptConfigServiceImpl.insert(orderInterceptConfig));
        }

        /**
         * 更新数据
         *
         * @param orderInterceptConfig 实例对象
         * @return 实例对象
         */
        @ApiOperation("更新数据")
        @PostMapping("/edit")
        public ResponseEntity<OrderInterceptConfig> edit(OrderInterceptConfig orderInterceptConfig){
        return ResponseEntity.ok(orderInterceptConfigServiceImpl.update(orderInterceptConfig));
        }

        /**
         * 通过主键删除数据
         *
         * @param id 主键
         * @return 是否成功
         */
        @ApiOperation("通过主键删除数据")
        @PostMapping("/deleteById")
        public ResponseEntity<Boolean> deleteById(Long id){
        return ResponseEntity.ok(orderInterceptConfigServiceImpl.deleteById(id));
        }
        }