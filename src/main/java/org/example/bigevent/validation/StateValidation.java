package org.example.bigevent.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.bigevent.anno.State;

public class StateValidation implements ConstraintValidator<State,String> {
    /**
     *
     * @param value 将来要验证的数据
     * @param context
     * @return  如果返回false则不通过
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        //提供校验规则
        if(value == null){
            return false;
        }if (value.equals("已发布")||value.equals("草稿")){
            return true;
        }
        return false;
    }
}
