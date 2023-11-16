package com.item.iteminfo.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.item.iteminfo.Dto.GetItemTypeInfoDto;
import com.item.iteminfo.Enum.DataStatus;
import com.item.iteminfo.PublicParam.Result;
import com.item.iteminfo.Dto.AddItemTypeInfoDto;
import com.item.iteminfo.Entity.ItemTypeInfo;
import com.item.iteminfo.Service.IItemTypeInfoService;
import com.item.iteminfo.Static.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
@RestController
@RequestMapping("/itemTypeInfo")
@Slf4j
@Api(tags = "物品类别相关接口")
public class ItemTypeInfoController {

    @Autowired
    private IItemTypeInfoService itemTypeInfoService;

    @PostMapping("/addItemTypeInfo")
    @ApiOperation(value = "新增物品类型信息")
    public Result<Void> addItemTypeInfo(@RequestBody AddItemTypeInfoDto dto){
        ItemTypeInfo itemTypeInfo = new ItemTypeInfo();
        itemTypeInfo.setItemTypeName(dto.getName());
        itemTypeInfo.setStatus(DataStatus.EFFECTIVE.getCode());
        itemTypeInfo.setCreateDate(LocalDateTime.now());
        itemTypeInfoService.save(itemTypeInfo);
        return Results.success();
    }

    @PostMapping("/getItemTypeInfoById")
    @ApiOperation(value = "根据编码获取物品类型信息")
    public Result<Object> getItemTypeInfoById(@RequestBody GetItemTypeInfoDto dto){
        List<ItemTypeInfo> res = itemTypeInfoService.list(new QueryWrapper<ItemTypeInfo>()
                .lambda().eq(ItemTypeInfo::getItemTypeId, dto.getId())
                        .eq(ItemTypeInfo::getStatus,DataStatus.EFFECTIVE.getCode()));
        return Results.success(res);
    }

    @GetMapping("/getItemTypeInfo")
    @ApiOperation(value = "获取物品类型全部信息")
    public Result<Object> getItemTypeInfo(){
        List<ItemTypeInfo> res = itemTypeInfoService.list(new QueryWrapper<ItemTypeInfo>()
                .lambda().eq(ItemTypeInfo::getStatus,DataStatus.EFFECTIVE.getCode()));
        return Results.success(res);
    }

}
