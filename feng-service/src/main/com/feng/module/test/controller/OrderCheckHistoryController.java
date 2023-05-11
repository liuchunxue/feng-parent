package com.feng.module.test.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.module.test.entity.OrderCheckHistory;
import com.feng.module.test.service.OrderCheckHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 订单检查记录;(order_check_history)表控制层
 * @author : http://www.chiner.pro
 * @date : 2023-5-10
 */
@Api(tags = "订单检查记录对象功能接口")
@RestController
@RequestMapping("/orderCheckHistory")
public class OrderCheckHistoryController{
    @Autowired
    private OrderCheckHistoryService orderCheckHistoryServiceImpl;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("/queryById/{id}")
    public ResponseEntity<OrderCheckHistory> queryById(@PathVariable Long id){
        return ResponseEntity.ok(orderCheckHistoryServiceImpl.queryById(id));
    }

    /**
     * 分页查询
     *
     * @param orderCheckHistory 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<Page<OrderCheckHistory>> paginQuery(OrderCheckHistory orderCheckHistory, Page pageRequest){
        //1.分页参数
//        long current = pageRequest.getPar();
//        long size = pageRequest.getPageSize();
//        //2.分页查询
//        /*把Mybatis的分页对象做封装转换，MP的分页对象上有一些SQL敏感信息，还是通过spring的分页模型来封装数据吧*/
//        com.baomidou.mybatisplus.extension.plugins.pagination.Page<OrderCheckHistory> pageResult = orderCheckHistoryService.paginQuery(orderCheckHistory, current,size);
//        //3. 分页结果组装
//        List<OrderCheckHistory> dataList = pageResult.getRecords();
//        long total = pageResult.getTotal();
//        PageImpl<OrderCheckHistory> retPage = new PageImpl<OrderCheckHistory>(dataList,pageRequest,total);
        return null;
    }

    /**
     * 新增数据
     *
     * @param orderCheckHistory 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping("/save")
    public ResponseEntity<OrderCheckHistory> add(OrderCheckHistory orderCheckHistory){
        return ResponseEntity.ok(orderCheckHistoryServiceImpl.insert(orderCheckHistory));
    }

    /**
     * 更新数据
     *
     * @param orderCheckHistory 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PostMapping("/edit")
    public ResponseEntity<OrderCheckHistory> edit(OrderCheckHistory orderCheckHistory){
        return ResponseEntity.ok(orderCheckHistoryServiceImpl.update(orderCheckHistory));
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
        return ResponseEntity.ok(orderCheckHistoryServiceImpl.deleteById(id));
    }
}