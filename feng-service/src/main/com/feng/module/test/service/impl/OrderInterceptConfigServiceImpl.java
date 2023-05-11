package com.feng.module.test.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.module.test.dao.OrderInterceptConfigMapper;
import com.feng.module.test.entity.OrderInterceptConfig;
import com.feng.module.test.service.OrderInterceptConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单拦截配置;(order_intercept_config)表服务实现类
 *
 * @author : http://www.chiner.pro
 * @date : 2023-5-11
 */
@Service
public class OrderInterceptConfigServiceImpl implements OrderInterceptConfigService {
    @Autowired
    private OrderInterceptConfigMapper orderInterceptConfigMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public OrderInterceptConfig queryById(Long id) {
        return orderInterceptConfigMapper.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param orderInterceptConfig 筛选条件
     * @param current              当前页码
     * @param size                 每页大小
     * @return
     */
    public Page<OrderInterceptConfig> paginQuery(OrderInterceptConfig orderInterceptConfig, long current, long size) {
        //1. 构建动态查询条件
//        LambdaQueryWrapper<OrderInterceptConfig> queryWrapper = new LambdaQueryWrapper<>();
//        if (StrUtil.isNotBlank(orderInterceptConfig.getCode())) {
//            queryWrapper.eq(OrderInterceptConfig::getCode, orderInterceptConfig.getCode());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getName())) {
//            queryWrapper.eq(OrderInterceptConfig::getName, orderInterceptConfig.getName());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getRule())) {
//            queryWrapper.eq(OrderInterceptConfig::getRule, orderInterceptConfig.getRule());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getConfigVal())) {
//            queryWrapper.eq(OrderInterceptConfig::getConfigVal, orderInterceptConfig.getConfigVal());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getRemark())) {
//            queryWrapper.eq(OrderInterceptConfig::getRemark, orderInterceptConfig.getRemark());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getCreateBy())) {
//            queryWrapper.eq(OrderInterceptConfig::getCreateBy, orderInterceptConfig.getCreateBy());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getUpdateBy())) {
//            queryWrapper.eq(OrderInterceptConfig::getUpdateBy, orderInterceptConfig.getUpdateBy());
//        }
        //2. 执行分页查询
//        Page<OrderInterceptConfig> pagin = new Page<>(5, 10, null);
//        IPage<OrderInterceptConfig> selectResult = orderInterceptConfigMapper.selectByPage(pagin, queryWrapper);
//        pagin.setPages(selectResult.getPages());
//        pagin.setTotal(selectResult.getTotal());
//        pagin.setRecords(selectResult.getRecords());
        //3. 返回结果
        return null;
    }

    /**
     * 新增数据
     *
     * @param orderInterceptConfig 实例对象
     * @return 实例对象
     */
    public OrderInterceptConfig insert(OrderInterceptConfig orderInterceptConfig) {
        orderInterceptConfigMapper.insert(orderInterceptConfig);
        return orderInterceptConfig;
    }

    /**
     * 更新数据
     *
     * @param orderInterceptConfig 实例对象
     * @return 实例对象
     */
    public OrderInterceptConfig update(OrderInterceptConfig orderInterceptConfig) {
        //1. 根据条件动态更新
//        LambdaUpdateChainWrapper<OrderInterceptConfig> chainWrapper = new LambdaUpdateChainWrapper<OrderInterceptConfig>(orderInterceptConfigMapper);
//        if (StrUtil.isNotBlank(orderInterceptConfig.getCode())) {
//            chainWrapper.eq(OrderInterceptConfig::getCode, orderInterceptConfig.getCode());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getName())) {
//            chainWrapper.eq(OrderInterceptConfig::getName, orderInterceptConfig.getName());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getRule())) {
//            chainWrapper.eq(OrderInterceptConfig::getRule, orderInterceptConfig.getRule());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getConfigVal())) {
//            chainWrapper.eq(OrderInterceptConfig::getConfigVal, orderInterceptConfig.getConfigVal());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getRemark())) {
//            chainWrapper.eq(OrderInterceptConfig::getRemark, orderInterceptConfig.getRemark());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getCreateBy())) {
//            chainWrapper.eq(OrderInterceptConfig::getCreateBy, orderInterceptConfig.getCreateBy());
//        }
//        if (StrUtil.isNotBlank(orderInterceptConfig.getUpdateBy())) {
//            chainWrapper.eq(OrderInterceptConfig::getUpdateBy, orderInterceptConfig.getUpdateBy());
//        }
//        //2. 设置主键，并更新
//        chainWrapper.set(OrderInterceptConfig::getId, orderInterceptConfig.getId());
//        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
//        if (ret) {
//            return queryById(orderInterceptConfig.getId());
//        } else {
//            return orderInterceptConfig;
//        }

        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Long id) {
        int total = orderInterceptConfigMapper.deleteById(id);
        return total > 0;
    }
}