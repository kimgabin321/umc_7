package umc.spring2.study.apiPayload.exception.handler;

import umc.spring2.study.apiPayload.code.BaseErrorCode;
import umc.spring2.study.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}