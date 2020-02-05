package com.milan.mvcreversestring.service;

import org.springframework.stereotype.Component;

@Component
public class ReverseSentenceService {

    public String reverseSentence(String sentence) {
        String[] parts = sentence.split(" ");

        StringBuilder builder = new StringBuilder();
        for (int i = (parts.length - 1); i >= 0; i--) {
            builder.append(parts[i]).append(" ");
        }

        return builder.toString().trim();
    }
}
