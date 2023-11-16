package com.item.iteminfo.Static;

import com.item.iteminfo.Enum.ResultStatus;
import com.item.iteminfo.PublicParam.Result;

public class Results {

    public static Result<Object> success(Object obj){
        Result<Object> res=new Result<>();
        res.setCode(ResultStatus.SUCCESS.getCode());
        res.setRes(obj);
        return res;
    }

    public static Result<Object> fail(Object obj,String msg){
        Result<Object> res=new Result<>();
        res.setCode(ResultStatus.FAIL.getCode());
        res.setRes(obj);
        res.setMsg(msg);
        return res;
    }

    public static Result<Void> success(){
        Result<Void> res=new Result<>();
        res.setCode(ResultStatus.SUCCESS.getCode());
        return res;
    }

    public static Result<Void> fail(String msg){
        Result<Void> res=new Result<>();
        res.setMsg(msg);
        res.setCode(ResultStatus.FAIL.getCode());
        return res;
    }

    public static Result<Void> error(String msg){
        Result<Void> res=new Result<>();
        res.setMsg(msg);
        res.setCode(ResultStatus.ERROR.getCode());
        return res;
    }
}
