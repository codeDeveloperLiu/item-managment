package com.item.iteminfo.Config;

import com.item.iteminfo.PublicParam.Result;
import com.item.iteminfo.Static.Results;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

/**
 * @Author: liusy
 * @Date: 2022/12/29 10:41
 * @Description:
 */
@Slf4j
@Component
@RestControllerAdvice
public class GlobalExceptionHandler   {

    @ExceptionHandler(BindException.class)
    public Result<Void> handler(BindException e){
        log.error("ExceptionError{}",e.getMessage());
        return Results.fail(Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public Result<Void> handler(RuntimeException e){
        log.error("ExceptionError{}",e.getMessage());
        return Results.error(e.getMessage());

    }
}