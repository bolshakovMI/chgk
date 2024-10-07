package com.example.chgk.model.dto.response;

import com.example.chgk.model.dto.request.RoundInfoRequest;
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
public class RoundInfoResponse extends RoundInfoRequest {
    Long gameId;
    Integer round;
    Long questionId;
    String question;
    Long teamId;
    String teamName;
}
