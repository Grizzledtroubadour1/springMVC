package com.fqbq.annotation;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface RequestMapping {
    /**
     *
     * @return
     */
    String value() default "";
}
