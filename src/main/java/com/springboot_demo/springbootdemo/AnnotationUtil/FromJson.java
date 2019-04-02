package com.springboot_demo.springbootdemo.AnnotationUtil;


import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface FromJson {

    // key
    String key() default StringUtils.EMPTY;

    // 是否展示, 默认展示
    boolean show() default true;
}
