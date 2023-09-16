package com.leepd.quiz.controller;

import com.leepd.quiz.dto.QuizCreateRequest;
import com.leepd.quiz.service.QuizCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
public class QuizCreateController {
    private final QuizCreateService quizCreateService;

    @PostMapping(value = "/quiz/create", consumes = {"multipart/form-data"})
    public ResponseEntity<Void> createQuiz(@RequestParam("image") MultipartFile file,
                                           @RequestParam("quiz") String characterName) {
        QuizCreateRequest quizCreateRequest = new QuizCreateRequest();
        quizCreateRequest.setCharacterName(characterName);
        quizCreateService.createQuiz(file,quizCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
