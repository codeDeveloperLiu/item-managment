package com.item.iteminfo.Dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class AddItemTypeInfoDto {

    /**
     * 种类名称
     */
    @NotBlank(message = "种类名称不能为空")
    private String name;


}
