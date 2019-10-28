package com.example.wyh.base;

/*import com.example.wyh.common.HttpCode;
import com.example.wyh.common.MyException;
import com.example.wyh.common.MyException;*/
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseBase implements Serializable{
    private int code;
    private String msg;
    private Object content;

    public static ResponseBase success(Object content){
        ResponseBase responseBase = new ResponseBase();
        responseBase.setCode(200);
        responseBase.setMsg("ok");
        responseBase.setContent(content);
        return responseBase;
    }

/*    public static ResponseBase fail(MyException ex){
        ResponseBase responseBase = new ResponseBase();
        responseBase.setCode(ex.getCode());
        responseBase.setMsg(ex.getMsg());
        return responseBase;
    }

    public static ResponseBase error(){
        ResponseBase responseBase = new ResponseBase();
        responseBase.setCode(HttpCode.ERROR.getCode());
        responseBase.setMsg(HttpCode.ERROR.getMsg());
        return responseBase;
    }*/

    public ResponseBase msg(String msg){
        this.msg=msg;
        return this;
    }
}
