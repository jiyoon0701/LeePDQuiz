package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.INPUT_NULL_DATA_ON_ANSWER;

public class InputNullDataOnAnswerException extends AbstractApiException {
    public InputNullDataOnAnswerException() {
        super(INPUT_NULL_DATA_ON_ANSWER);
    }
}
