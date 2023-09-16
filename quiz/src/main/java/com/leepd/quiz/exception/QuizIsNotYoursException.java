package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.QUIZ_IS_NOT_YOURS;

public class QuizIsNotYoursException extends AbstractApiException {

    public QuizIsNotYoursException( ) {
        super(QUIZ_IS_NOT_YOURS);
    }
}
