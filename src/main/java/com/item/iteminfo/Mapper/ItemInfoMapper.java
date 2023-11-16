package com.item.iteminfo.Mapper;

import com.item.iteminfo.Dto.GetItemInfoDto;
import com.item.iteminfo.Entity.ItemInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
public interface ItemInfoMapper extends BaseMapper<ItemInfo> {

    List<ItemInfo> getItemInfo(@Param(value = "dto") GetItemInfoDto dto);
}
