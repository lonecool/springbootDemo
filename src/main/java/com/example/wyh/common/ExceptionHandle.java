/*
package com.example.wyh.common;

import com.example.wyh.base.ResponseBase;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handleException(Exception e) {

        if (e instanceof ArithmeticException) {
            return ResponseBase.fail(new MyException()).msg("这是一个算术异常");
        } else {
            return ResponseBase.error().msg("这是一个未知异常");
        }
    }
}
*/
