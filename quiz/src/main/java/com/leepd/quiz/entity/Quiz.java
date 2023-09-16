package com.leepd.quiz.entity;

import com.leepd.quiz.dto.Answer;
import com.leepd.quiz.dto.Picture;
import com.leepd.quiz.dto.Tester;
import com.leepd.quiz.exception.InputNullDataOnAnswerException;
import com.leepd.quiz.exception.InputNullDataOnAuthorException;
import com.leepd.quiz.exception.InputNullDataOnPictureException;
import com.leepd.quiz.exception.InputNullDataOnQuizIdException;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Table(name = "Quiz")
@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Quiz {

    @EmbeddedId
    private QuizId quizId;
    private long viewCount;
    @Embedded
    private Tester tester;
    @Embedded
    private Picture picture;
    @Embedded
    private Answer answer;

    private LocalDateTime createdDateTime;

    public Quiz(QuizId quizId, Tester tester, Picture picture, Answer answer) {
        this.viewCount = 0;
        setQuizId(quizId);
        setAuthor(tester);
        setAnswer(answer);
        setPicture(picture);
        createdDateTime = LocalDateTime.now();

    }

    private void setQuizId(QuizId quizId) {
        if (quizId == null) {
            throw new InputNullDataOnQuizIdException();
        }
        this.quizId = quizId;
    }

    private void setAuthor(Tester tester) {
        if (tester == null) {
            throw new InputNullDataOnAuthorException();
        }
        this.tester = tester;
    }

    private void setAnswer(Answer answer) {
        if (answer == null) {
            throw new InputNullDataOnAnswerException();
        }
        this.answer = answer;
    }

    private void setPicture(Picture picture) {
        if (picture == null) {
            throw new InputNullDataOnPictureException();
        }
        this.picture = picture;
    }

    public String[] playQuiz() {
        this.viewCount++;
        return new String[]{this.picture.getUrl(), this.answer.getAnswer()};
    }

}
