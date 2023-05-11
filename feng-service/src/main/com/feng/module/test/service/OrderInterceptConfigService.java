package com.feng.module.test.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.module.test.entity.OrderInterceptConfig;

/**
         * 订单拦截配置;(order_intercept_config)表服务接口
         * @author : http://www.chiner.pro
         * @date : 2023-5-11
         */
        public interface OrderInterceptConfigService{

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        OrderInterceptConfig queryById(Long id);

        /**
         * 分页查询
         *
         * @param orderInterceptConfig 筛选条件
         * @param current 当前页码
         * @param size  每页大小
         * @return
         */
        Page<OrderInterceptConfig> paginQuery(OrderInterceptConfig orderInterceptConfig, long current, long size);
        /**
         * 新增数据
         *
         * @param orderInterceptConfig 实例对象
         * @return 实例对象
         */
        OrderInterceptConfig insert(OrderInterceptConfig orderInterceptConfig);
        /**
         * 更新数据
         *
         * @param orderInterceptConfig 实例对象
         * @return 实例对象
         */
        OrderInterceptConfig update(OrderInterceptConfig orderInterceptConfig);
        /**
         * 通过主键删除数据
         *
         * @param id 主键
         * @return 是否成功
         */
        boolean deleteById(Long id);
        }