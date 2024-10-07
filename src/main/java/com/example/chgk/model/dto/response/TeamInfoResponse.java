package com.example.chgk.model.dto.response;

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
public class TeamInfoResponse {
    Long id;
    String teamName;
    UserInfoResponse captain;
    UserInfoResponse viceCaptain;
    Integer points;
    Integer correctAnswers;
    Double correctAnswersPct;
}
