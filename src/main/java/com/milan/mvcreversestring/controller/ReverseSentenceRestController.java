package com.milan.mvcreversestring.controller;

import com.milan.mvcreversestring.dto.request.ReverseStringRequestDTO;
import com.milan.mvcreversestring.dto.response.BaseResponse;
import com.milan.mvcreversestring.service.ReverseSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

@RestController
@RequestMapping("/v1/reverse")
public class ReverseSentenceRestController {

    @Autowired
    private ReverseSentenceService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse reverse(@Valid @RequestBody ReverseStringRequestDTO request) {
        String reversedSentence = service.reverseSentence(request.getInput());
        return BaseResponse.builder().output(reversedSentence).success(true).status(HttpStatus.OK).build();
    }


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public BaseResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        HashMap<String, String> output = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach((err) -> {
            String key = ((FieldError) err).getField();
            String value = err.getDefaultMessage();
            output.put(key, value);
        });

        return BaseResponse.builder().output(output).success(false).status(HttpStatus.BAD_REQUEST).build();
    }
}
