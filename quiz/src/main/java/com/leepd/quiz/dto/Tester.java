package com.leepd.quiz.dto;

import jakarta.persistence.Embeddable;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@Embeddable
@NoArgsConstructor
public class Tester {
    private String name;

    public Tester(String name) {
        this.name = name;
    }

}
