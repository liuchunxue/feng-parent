package com.feng.module.test.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.module.test.dao.OrderCheckHistoryMapper;
import com.feng.module.test.entity.OrderCheckHistory;
import com.feng.module.test.service.OrderCheckHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 订单检查记录;(order_check_history)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-5-10
 */
@Service
public class OrderCheckHistoryServiceImpl implements OrderCheckHistoryService {
    @Autowired
    private OrderCheckHistoryMapper orderCheckHistoryMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public OrderCheckHistory queryById(long id){
        return orderCheckHistoryMapper.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param orderCheckHistory 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    public Page<OrderCheckHistory> paginQuery(OrderCheckHistory orderCheckHistory, long current, long size){
        //1. 构建动态查询条件
//        LambdaQueryWrapper<OrderCheckHistory> queryWrapper = new LambdaQueryWrapper<>();
//        if(StrUtil.isNotBlank(orderCheckHistory.getConfigCode())){
//            queryWrapper.eq(OrderCheckHistory::getConfigCode, orderCheckHistory.getConfigCode());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getConfigRemak())){
//            queryWrapper.eq(OrderCheckHistory::getConfigRemak, orderCheckHistory.getConfigRemak());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getOrderVal())){
//            queryWrapper.eq(OrderCheckHistory::getOrderVal, orderCheckHistory.getOrderVal());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getBatchNo())){
//            queryWrapper.eq(OrderCheckHistory::getBatchNo, orderCheckHistory.getBatchNo());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getRemark())){
//            queryWrapper.eq(OrderCheckHistory::getRemark, orderCheckHistory.getRemark());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getCreateBy())){
//            queryWrapper.eq(OrderCheckHistory::getCreateBy, orderCheckHistory.getCreateBy());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getUpdateBy())){
//            queryWrapper.eq(OrderCheckHistory::getUpdateBy, orderCheckHistory.getUpdateBy());
//        }
//        //2. 执行分页查询
//        Page<OrderCheckHistory> pagin = new Page<>(current , size , true);
//        IPage<OrderCheckHistory> selectResult = orderCheckHistoryMapper.selectByPage(pagin , queryWrapper);
//        pagin.setPages(selectResult.getPages());
//        pagin.setTotal(selectResult.getTotal());
//        pagin.setRecords(selectResult.getRecords());
//        //3. 返回结果
//        return pagin;
        return null;
    }

    /**
     * 新增数据
     *
     * @param orderCheckHistory 实例对象
     * @return 实例对象
     */
    public OrderCheckHistory insert(OrderCheckHistory orderCheckHistory){
        orderCheckHistoryMapper.insert(orderCheckHistory);
        return orderCheckHistory;
    }

    /**
     * 更新数据
     *
     * @param orderCheckHistory 实例对象
     * @return 实例对象
     */
    public OrderCheckHistory update(OrderCheckHistory orderCheckHistory){
//        //1. 根据条件动态更新
//        LambdaUpdateChainWrapper<OrderCheckHistory> chainWrapper = new LambdaUpdateChainWrapper<OrderCheckHistory>(orderCheckHistoryMapper);
//        if(StrUtil.isNotBlank(orderCheckHistory.getConfigCode())){
//            chainWrapper.eq(OrderCheckHistory::getConfigCode, orderCheckHistory.getConfigCode());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getConfigRemak())){
//            chainWrapper.eq(OrderCheckHistory::getConfigRemak, orderCheckHistory.getConfigRemak());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getOrderVal())){
//            chainWrapper.eq(OrderCheckHistory::getOrderVal, orderCheckHistory.getOrderVal());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getBatchNo())){
//            chainWrapper.eq(OrderCheckHistory::getBatchNo, orderCheckHistory.getBatchNo());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getRemark())){
//            chainWrapper.eq(OrderCheckHistory::getRemark, orderCheckHistory.getRemark());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getCreateBy())){
//            chainWrapper.eq(OrderCheckHistory::getCreateBy, orderCheckHistory.getCreateBy());
//        }
//        if(StrUtil.isNotBlank(orderCheckHistory.getUpdateBy())){
//            chainWrapper.eq(OrderCheckHistory::getUpdateBy, orderCheckHistory.getUpdateBy());
//        }
//        //2. 设置主键，并更新
//        chainWrapper.set(OrderCheckHistory::getId, orderCheckHistory.getId());
//        boolean ret = chainWrapper.update();
//        //3. 更新成功了，查询最最对象返回
//        if(ret){
//            return queryById(orderCheckHistory.getId());
//        }else{
//            return orderCheckHistory;
//        }
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(long id){
        int total = orderCheckHistoryMapper.deleteById(id);
        return total > 0;
    }
}