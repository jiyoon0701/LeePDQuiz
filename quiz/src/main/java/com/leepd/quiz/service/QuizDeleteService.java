package com.leepd.quiz.service;

import com.leepd.quiz.entity.QuizId;
import com.leepd.quiz.repository.QuizRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class QuizDeleteService {

    private final QuizRepository quizRepository;
    public void deleteQuiz(String quizId) {
        deleteQuizData(quizId);
    }
    private void deleteQuizData(String quizId) {
        quizRepository.deleteById(QuizId.of(quizId));
    }

}
