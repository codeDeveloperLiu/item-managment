package com.item.iteminfo.Service.impl;

import com.item.iteminfo.Dto.GetItemInfoDto;
import com.item.iteminfo.Entity.ItemInfo;
import com.item.iteminfo.Mapper.ItemInfoMapper;
import com.item.iteminfo.Service.IItemInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
@Service
public class ItemInfoServiceImpl extends ServiceImpl<ItemInfoMapper, ItemInfo> implements IItemInfoService {

    @Autowired
    private ItemInfoMapper itemInfoMapper;

    @Override
    public List<ItemInfo> getItemInfo(GetItemInfoDto dto) {
        return itemInfoMapper.getItemInfo(dto);
    }
}
