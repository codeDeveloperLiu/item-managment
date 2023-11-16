package com.item.iteminfo.PublicParam;

import lombok.Data;

/**
 * @Author: liusy
 * @Date: 2022/12/30 10:59
 * @Description:
 */
@Data
public class PageRequest {

    private int pageNum=1;

    private int pageSize=10;
}
