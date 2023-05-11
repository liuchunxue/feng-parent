package com.feng.module.test.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
         * 订单拦截配置;
         * @author : http://www.chiner.pro
         * @date : 2023-5-11
         */
        @Data
        @ApiModel(value = "订单拦截配置",description = "")
        @TableName("order_intercept_config")
        public class OrderInterceptConfig implements Serializable,Cloneable{
                /** 主键 */
                @TableId
                @ApiModelProperty(name = "主键",notes = "")
                private Long id ;
                /** 编码 */
                @ApiModelProperty(name = "编码",notes = "")
                private String code ;
                /** 配置名称 */
                @ApiModelProperty(name = "配置名称",notes = "")
                private String name ;
                /** 规则表达式(开发人员配置) */
                @ApiModelProperty(name = "规则表达式(开发人员配置)",notes = "")
                private String rule ;
                /** 配置值(有多个值的，逗号分隔) */
                @ApiModelProperty(name = "配置值(有多个值的，逗号分隔)",notes = "")
                private String configVal ;
                /** 优先级别 */
                @ApiModelProperty(name = "优先级别",notes = "")
                private Integer priority ;
                /** 状态(0-禁用；1-启用) 业务人员控制 */
                @ApiModelProperty(name = "状态(0-禁用；1-启用) 业务人员控制",notes = "")
                private int status ;
                /** 是否已经配置表达式（0-否 1-是）开发人员设置 */
                @ApiModelProperty(name = "是否已经配置表达式（0-否 1-是）开发人员设置",notes = "")
                private int isBeRead ;
                /** 分类（1-信息2-库存3-海关4-价格） */
                @ApiModelProperty(name = "分类（1-信息2-库存3-海关4-价格）",notes = "")
                private int configType ;
                /** 未通过提示信息 */
                @ApiModelProperty(name = "未通过提示信息",notes = "")
                private String noPassMsg ;
                /** 备注 */
                @ApiModelProperty(name = "备注",notes = "")
                private String remark ;
                /** 创建人 */
                @ApiModelProperty(name = "创建人",notes = "")
                private String createBy ;
                /** 创建时间 */
                @ApiModelProperty(name = "创建时间",notes = "")
                private Timestamp  createTime ;
                /** 修改人 */
                @ApiModelProperty(name = "修改人",notes = "")
                private String updateBy ;
                /** 修改时间 */
                @ApiModelProperty(name = "修改时间",notes = "")
                private Timestamp updateTime ;
        }