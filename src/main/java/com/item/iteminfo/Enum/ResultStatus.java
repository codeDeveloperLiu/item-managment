package com.item.iteminfo.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultStatus {
    SUCCESS(1,"调用成功"),
    FAIL(0,"调用失败"),
    ERROR(-1,"服务异常");

    private int code;

    private String meaning;
}
