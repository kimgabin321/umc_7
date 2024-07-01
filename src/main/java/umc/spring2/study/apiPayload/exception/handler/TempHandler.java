package umc.spring2.study.apiPayload.exception.handler;

import umc.spring2.study.apiPayload.code.BaseErrorCode;
import umc.spring2.study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}