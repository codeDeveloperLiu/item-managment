package com.item.iteminfo.Dto;

import com.item.iteminfo.PublicParam.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: liusy
 * @Date: 2022/12/30 10:57
 * @Description:
 */
@Data
@ApiModel
public class GetItemInfoDto extends PageRequest {
    /**
     * 物品名称
     */
    private String itemName;
    /**
     * 购入时间/获取时间 开始
     */
    private LocalDateTime gainDateStart;
    /**
     * 购入时间/获取时间 结束
     */
    private LocalDateTime gainDateEnd;
    /**
     * 物品类型编码
     */
    private Integer itemTypeId;
    /**
     * 1-生效 0-失效
     */
    private Integer status;
}
