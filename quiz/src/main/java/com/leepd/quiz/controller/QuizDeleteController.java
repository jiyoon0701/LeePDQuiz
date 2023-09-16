package com.leepd.quiz.controller;

import com.leepd.quiz.service.QuizCreateService;
import com.leepd.quiz.service.QuizDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
public class QuizDeleteController {
    private final QuizDeleteService quizDeleteService;

    @DeleteMapping(value = "/quiz/delete", consumes = {"multipart/form-data"})
    public ResponseEntity<Void> deleteMyQuiz(@PathVariable("quizId") String quizId){
        quizDeleteService.deleteQuiz(quizId);
        return ResponseEntity.ok().build();
    }

}
