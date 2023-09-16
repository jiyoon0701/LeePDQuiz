package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.INPUT_NULL_DATA_ON_AUTHOR;

public class InputNullDataOnAuthorException extends AbstractApiException {
    public InputNullDataOnAuthorException() {
        super(INPUT_NULL_DATA_ON_AUTHOR);
    }
}
