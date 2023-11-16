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
@TableName("item_type_info")
@ApiModel(value = "ItemTypeInfo对象")
@Data
public class ItemTypeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("物品种类编码")
    @TableId(value = "item_type_id", type = IdType.AUTO)
    private Integer itemTypeId;

    @ApiModelProperty("物品种类名称")
    private String itemTypeName;

    private LocalDateTime createDate;

    @ApiModelProperty("1-生效 0-失效")
    private Integer status;


}
