package com.leepd.quiz.repository;

import com.leepd.quiz.entity.Quiz;
import com.leepd.quiz.entity.QuizId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, QuizId> {

    Quiz save(Quiz quiz);

    Optional<Quiz> findById(QuizId quizId);

    default String nextId() {
        return UUID.randomUUID().toString();
    }

    boolean existsById(QuizId quizId);

    void deleteById(QuizId quizId);

  //  List<Quiz> findAllByAuthor_UserId(UserId userId);

}
