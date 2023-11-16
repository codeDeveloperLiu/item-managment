package com.item.iteminfo.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum DataStatus {
    EFFECTIVE(1,"生效"),
    INEFFECTIVE(0,"失效");


    private int code;
    private String name;
}
