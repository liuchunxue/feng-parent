package com.feng.module.test.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 订单检查记录;
 * @author : http://www.chiner.pro
 * @date : 2023-5-10
 */
@Data
@ApiModel(value = "订单检查记录",description = "")
//@t("order_check_history")
@TableName("order_check_history")
public class OrderCheckHistory implements Serializable,Cloneable{
    /** 主键 */
    @TableId
    @ApiModelProperty(name = "主键",notes = "")
    private Long id ;
    /** 检查批次号-一次检查自动生成一个批次号 */
    @ApiModelProperty(name = "检查批次号-一次检查自动生成一个批次号",notes = "")
    private String batchNo ;
    /** 配置id */
    @ApiModelProperty(name = "配置id",notes = "")
    private Long configId ;
    /** 配置编码 */
    @ApiModelProperty(name = "配置编码",notes = "")
    private String configCode ;
    /** cbs订单号 */
    @ApiModelProperty(name = "cbs订单号",notes = "")
    private Long cbsOrderId ;
    /** 配置说明 */
    @ApiModelProperty(name = "配置说明",notes = "")
    private String configRemak ;
    /** 订单实际值（多个值逗号分隔） */
    @ApiModelProperty(name = "订单实际值（多个值逗号分隔）",notes = "")
    private String orderVal ;
    /** 是否自动触发（1-是 2-否（手动触发）） */
    @ApiModelProperty(name = "是否自动触发（1-是 2-否（手动触发））",notes = "")
    private Integer isAuto ;
    /** 是否检查通过（0-否 1-是） */
    @ApiModelProperty(name = "是否检查通过（0-否 1-是）",notes = "")
    private Long isPass ;
    /** 异常提示 */
    @ApiModelProperty(name = "异常提示",notes = "")
    private String noPassMsg ;
    /** 备注 */
    @ApiModelProperty(name = "备注",notes = "")
    private String remark ;
    /** 创建人 */
    @ApiModelProperty(name = "创建人",notes = "")
    private String createBy ;
    /** 创建时间 */
    @ApiModelProperty(name = "创建时间",notes = "")
    private Timestamp createTime ;
    /** 修改人 */
    @ApiModelProperty(name = "修改人",notes = "")
    private String updateBy ;
    /** 修改时间 */
    @ApiModelProperty(name = "修改时间",notes = "")
    private Timestamp updateTime ;

}