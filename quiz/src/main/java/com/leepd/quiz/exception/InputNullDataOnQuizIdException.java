package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.INPUT_NULL_DATA_ON_QUIZ_ID;

public class InputNullDataOnQuizIdException extends AbstractApiException {
    public InputNullDataOnQuizIdException() {
        super(INPUT_NULL_DATA_ON_QUIZ_ID);
    }
}
