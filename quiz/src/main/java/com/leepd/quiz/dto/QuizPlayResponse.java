package com.leepd.quiz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuizPlayResponse {

    private String url;
    private String characterName;

    public QuizPlayResponse(String ... quizInfo) {
        this.url = quizInfo[0];
        this.characterName = quizInfo[1];
    }
}
