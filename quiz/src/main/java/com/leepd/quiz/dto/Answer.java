package com.leepd.quiz.dto;

import jakarta.persistence.Embeddable;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@Getter
@ToString
public class Answer {
    private String answer;

    public Answer(String answer) {
        this.answer = answer;
    }
}
