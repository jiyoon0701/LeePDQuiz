package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.NO_MORE_QUIZ_DATA;

public class NoMoreQuizDataException extends AbstractApiException {
    public NoMoreQuizDataException() {
        super(NO_MORE_QUIZ_DATA);
    }
}
