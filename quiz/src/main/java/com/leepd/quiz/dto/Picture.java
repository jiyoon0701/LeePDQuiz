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
public class Picture {
    private String url;
    public Picture(String url) {
        this.url = url;
    }
}
