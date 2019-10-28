package com.example.wyh.base;

public class ControllerBase<T> {
    ServiceBase<T> serviceBase;

    public Object insert(T t){
        return ResponseBase.success(serviceBase.insert(t));
    }

    public Object delete(Integer id){
        return ResponseBase.success(serviceBase.delete(id));
    }

    public Object update(T t){
        return ResponseBase.success(serviceBase.update(t));
    }

    public Object query(T t){
        return ResponseBase.success(serviceBase.query(t));
    }
}
