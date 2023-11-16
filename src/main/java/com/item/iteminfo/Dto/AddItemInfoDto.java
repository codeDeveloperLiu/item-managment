package com.item.iteminfo.Dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @Author: liusy
 * @Date: 2022/12/29 9:27
 * @Description:
 */
@Data
@ApiModel
public class AddItemInfoDto {

    /**
     * 物品名称
     */
    @NotBlank(message = "物品名称不能为空")
    private String itemName;
    /**
     * 物品描述
     */
    private String itemDesc;
    /**
     * 购入时间/获取时间
     */
    private LocalDateTime gainDate;
    /**
     * 生产时间
     */
    private LocalDateTime productDate;
    /**
     * 过期时间
     */
    private LocalDateTime expireDate;
    /**
     * 有效期
     */
    @NotNull(message = "有效期不能为空")
    private Integer validPeriod;
    /**
     * 有效期单位
     */
    private Integer validPeriodUnitD;
    /**
     * 物品种类编码
     */
    private Integer itemTypeId;
}
