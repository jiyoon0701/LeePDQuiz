package com.leepd.quiz.exception;


import static com.leepd.quiz.exception.QuizErrorCode.FILE_TYPE_NOT_IMAGE;

public class FileTypeNotImageFileException extends AbstractApiException {
    public FileTypeNotImageFileException() {
        super(FILE_TYPE_NOT_IMAGE);
    }
}
