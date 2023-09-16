package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.QUIZ_NOT_FOUND_BY_ID;

public class QuizNotFoundByIdException extends AbstractApiException {
    public QuizNotFoundByIdException( ) {
        super(QUIZ_NOT_FOUND_BY_ID);
    }
}
