package com.item.iteminfo.Dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: liusy
 * @Date: 2023/1/3 14:06
 * @Description:
 */
@Data
public class GetItemTypeInfoDto {

    @NotNull(message = "编码不能为空")
    private int id;
}
