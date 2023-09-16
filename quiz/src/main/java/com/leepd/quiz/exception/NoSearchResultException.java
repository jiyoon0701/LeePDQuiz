package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.NO_SEARCH_RESULT;

public class NoSearchResultException extends AbstractApiException {
    public NoSearchResultException() {
        super(NO_SEARCH_RESULT);
    }
}
