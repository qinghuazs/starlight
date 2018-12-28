package com.qinghuazs.config;

import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.springframework.stereotype.Component;

@Component
public class MetaObjectHandlerConfig implements MetaObjectHandler {

    public void insertFill(MetaObject metaObject) {
        System.out.println("插入方法实体填充");
        setFieldValByName("testDate", new Date(), metaObject);
    }

    public void updateFill(MetaObject metaObject) {
        System.out.println("更新方法实体填充");
    }
}