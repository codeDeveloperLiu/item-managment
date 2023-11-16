package com.item.iteminfo.PublicParam;

import lombok.Data;

@Data
public class Result<T> {

    private int code=1;

    private String msg="调用成功";

    private T res;

}
