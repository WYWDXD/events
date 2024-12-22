package org.example.bigevent.anno;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.example.bigevent.validation.StateValidation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Documented //元注解
@Target({FIELD})//元注解
@Retention(RetentionPolicy.RUNTIME)//元注解
@Constraint(
        validatedBy = {StateValidation.class}
)
public @interface State {
    //提供校验失败后的的信息
    String message() default "state参数的值只能是已发布或者草稿";
    //指定分组
    Class<?>[] groups() default {};
    //负载，获取到State注解的附加信息
    Class<? extends Payload>[] payload() default {};
}
