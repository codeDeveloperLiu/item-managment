package com.item.iteminfo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
@TableName("item_type_query")
@ApiModel(value = "ItemTypeQuery对象")
@Data
public class ItemTypeQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer itemId;

    private Integer itemTypeId;


}
