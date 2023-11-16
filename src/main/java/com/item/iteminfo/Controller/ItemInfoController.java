package com.item.iteminfo.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.item.iteminfo.Dto.AddItemInfoDto;
import com.item.iteminfo.Dto.GetItemInfoDto;
import com.item.iteminfo.Entity.ItemInfo;
import com.item.iteminfo.Entity.ItemTypeQuery;
import com.item.iteminfo.Enum.DataStatus;
import com.item.iteminfo.PublicParam.Result;
import com.item.iteminfo.Service.IItemInfoService;
import com.item.iteminfo.Service.IItemTypeQueryService;
import com.item.iteminfo.Static.Results;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
@RestController
@RequestMapping("/itemInfo")
@Slf4j
public class ItemInfoController {

    @Autowired
    private IItemInfoService itemInfoService;
    @Autowired
    private IItemTypeQueryService itemTypeQueryService;

    @PostMapping("/addItemInfo")
    @ApiOperation(value = "新增物品信息")
    @Transactional
    public Result<Void> addItemInfo(@RequestBody AddItemInfoDto dto){
        //保存物品信息
        ItemInfo itemInfo = new ItemInfo();
        BeanUtils.copyProperties(dto,itemInfo);
        itemInfo.setStatus(DataStatus.EFFECTIVE.getCode());
        itemInfoService.save(itemInfo);
        //保存物品与类型关联信息
        ItemTypeQuery itemTypeQuery = new ItemTypeQuery();
        itemTypeQuery.setItemId(itemInfo.getItemId());
        itemTypeQuery.setItemTypeId(dto.getItemTypeId());
        itemTypeQueryService.save(itemTypeQuery);
        return Results.success();
    }

    @PostMapping("/getItemInfo")
    @ApiOperation(value = "按条件获取物品信息")
    public Result<Object> getItemInfo(@RequestBody GetItemInfoDto dto){
        List<ItemInfo> itemInfo = itemInfoService.getItemInfo(dto);
        return Results.success(itemInfo);
    }

}
