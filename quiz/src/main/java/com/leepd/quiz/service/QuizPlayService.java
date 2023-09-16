package com.leepd.quiz.service;

import com.leepd.quiz.dto.QuizPlayResponse;
import com.leepd.quiz.entity.Quiz;
import com.leepd.quiz.entity.QuizId;
import com.leepd.quiz.exception.QuizNotFoundByIdException;
import com.leepd.quiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class QuizPlayService {
    private final QuizRepository quizRepository;

    public QuizPlayResponse playQuiz(String quizId) {
        Quiz quiz = quizRepository.findById(QuizId.of(quizId))
                .orElseThrow(QuizNotFoundByIdException::new);
        String[] quizInfo = quiz.playQuiz();
        return new QuizPlayResponse(quizInfo);

    }
}
