package com.demo.mvcreversestring.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReverseStringRequestDTO {
    @NotNull
    private String input;
}
