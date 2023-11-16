package com.item.iteminfo.Config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;


public class AutoGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create(
                "jdbc:mysql://192.168.1.201:3306/local?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false",
                "root",
                "123456")
                .globalConfig(builder -> {
                    builder.author("lsy") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .enableSwagger() // 开启 swagger 模式
                            // 指定输出目录
                            //直接右键复制项目根目录的绝对路径
                            .outputDir("F:\\item-info\\src//main//java//com//item//iteminfo");
                })
                .packageConfig(builder -> {
                    builder.parent("com.item.iteminfo") // 设置父包名
                            // 设置mapperXml生成路径
                            //直接右键复制项目mapper文件夹的绝对路径
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,"F://item-info//src//main//resources//mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("item_type_query"); // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine())// 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
