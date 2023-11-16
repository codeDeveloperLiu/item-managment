package com.item.iteminfo.Service;

import com.item.iteminfo.Dto.GetItemInfoDto;
import com.item.iteminfo.Entity.ItemInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.*;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lsy
 * @since 2022-12-21
 */
public interface IItemInfoService extends IService<ItemInfo> {

    List<ItemInfo> getItemInfo(GetItemInfoDto dto);
}
