package com.leepd.quiz.exception;

import static com.leepd.quiz.exception.QuizErrorCode.INPUT_NULL_DATA_ON_PICTURE;

public class InputNullDataOnPictureException extends AbstractApiException {
    public InputNullDataOnPictureException() {
        super(INPUT_NULL_DATA_ON_PICTURE);
    }
}
