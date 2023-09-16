package com.leepd.quiz.exception;

import static com.leepd.quiz.exception.QuizErrorCode.INPUT_NULL_DATA_ON_QUIZ_TAGS;

public class InputNullDataOnQuizTagsException extends AbstractApiException {
    public InputNullDataOnQuizTagsException() {
        super(INPUT_NULL_DATA_ON_QUIZ_TAGS);
    }
}
