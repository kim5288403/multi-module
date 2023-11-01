package org.example.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class WriteRequest {
    @NotBlank(message = "content 는 필수 값입니다.")
    private String content;
}
