package com.example.chgk.model.dto.response;

import com.example.chgk.model.dto.request.QuestionInfoRequest;
import com.example.chgk.model.enums.QuestionStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionInfoResponse extends QuestionInfoRequest {
    Long id;
    QuestionStatus status;
}
