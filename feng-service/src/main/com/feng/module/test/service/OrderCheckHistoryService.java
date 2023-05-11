package com.feng.module.test.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.module.test.entity.OrderCheckHistory;

/**
 * 订单检查记录;(order_check_history)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2023-5-10
 */
public interface OrderCheckHistoryService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderCheckHistory queryById(long id);

    /**
     * 分页查询
     *
     * @param orderCheckHistory 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<OrderCheckHistory> paginQuery(OrderCheckHistory orderCheckHistory, long current, long size);
    /**
     * 新增数据
     *
     * @param orderCheckHistory 实例对象
     * @return 实例对象
     */
    OrderCheckHistory insert(OrderCheckHistory orderCheckHistory);
    /**
     * 更新数据
     *
     * @param orderCheckHistory 实例对象
     * @return 实例对象
     */
    OrderCheckHistory update(OrderCheckHistory orderCheckHistory);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(long id);
}