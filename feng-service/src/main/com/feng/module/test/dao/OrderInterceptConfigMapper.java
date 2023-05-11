package com.feng.module.test.dao;

//import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feng.module.test.entity.OrderInterceptConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单拦截配置;(order_intercept_config)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-5-11
 */
@Mapper
public interface OrderInterceptConfigMapper  extends BaseMapper<OrderInterceptConfig> {
    /**
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
//    Page<OrderInterceptConfig> selectByPage(Page<OrderInterceptConfig> page , Wrapper<OrderInterceptConfig> wrapper);
}