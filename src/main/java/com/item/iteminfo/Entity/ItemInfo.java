package com.item.iteminfo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
@TableName("item_info")
@ApiModel(value = "ItemInfo对象")
@Data
public class ItemInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("物品编码")
    @TableId(value = "item_id", type = IdType.AUTO)
    private Integer itemId;

    @ApiModelProperty("物品名称")
    private String itemName;

    @ApiModelProperty("物品描述")
    private String itemDesc;

    @ApiModelProperty("购入时间/获取时间")
    private LocalDateTime gainDate;

    @ApiModelProperty("生产日期")
    private LocalDateTime productDate;

    @ApiModelProperty("过期日期")
    private LocalDateTime expireDate;

    @ApiModelProperty("有效期")
    private Integer validPeriod;

    @ApiModelProperty("有效期单位编码")
    private Integer validPeriodUnitD;

    @ApiModelProperty("1-生效 0-失效")
    private Integer status;
}
