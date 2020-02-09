package com.demo.mvcreversestring.service;

import org.springframework.stereotype.Component;

@Component
public class ReverseSentenceService {

	public String reverseSentence(String input) {
		if (input == null) {
			throw new IllegalArgumentException("ReverseSentenceService.reverseSentence input is null: " + input);
		}

		String[] parts = input.split(" ");

		StringBuilder builder = new StringBuilder();
		for (int i = (parts.length - 1); i >= 0; i--) {
			builder.append(parts[i]).append(" ");
		}

		return builder.toString().trim();
	}
}
