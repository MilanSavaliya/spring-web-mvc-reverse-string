package com.demo.mvcreversestring.dto.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T extends Serializable> {
    private T output;
    private boolean success;
    private HttpStatus status;
}
