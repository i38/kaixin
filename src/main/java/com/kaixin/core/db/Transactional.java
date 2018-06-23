package com.kaixin.core.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 通过H2完成注解式事务声明
 */

@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Transactional {
}