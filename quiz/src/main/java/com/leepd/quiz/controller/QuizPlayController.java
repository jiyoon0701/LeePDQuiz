package com.leepd.quiz.controller;

import com.leepd.quiz.dto.QuizPlayResponse;
import com.leepd.quiz.service.QuizPlayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuizPlayController {
    private final QuizPlayService quizPlayService;

    @PostMapping("/quiz/{id}")
    public ResponseEntity<QuizPlayResponse> playQuiz(@PathVariable("quizId") String quizId) {
        QuizPlayResponse response = quizPlayService.playQuiz(quizId);
        return ResponseEntity.ok(response);
    }

}
