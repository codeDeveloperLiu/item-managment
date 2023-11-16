package com.item.iteminfo.Config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.item.iteminfo.mapper"})
public class MybatisConfig {
}
