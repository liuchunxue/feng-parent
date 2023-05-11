package com.feng.module.test.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feng.module.test.entity.OrderCheckHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 订单检查记录;(order_check_history)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-5-10
 */
@Mapper
public interface OrderCheckHistoryMapper  extends BaseMapper<OrderCheckHistory> {
   OrderCheckHistory selectById(@Param("id") long id);
    /**
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
//    IPage<OrderCheckHistory> selectByPage(IPage<OrderCheckHistory> page , @Param(Constants.WRAPPER) Wrapper<OrderCheckHistory> wrapper);
}