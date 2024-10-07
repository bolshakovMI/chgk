package com.example.chgk.model.dto.response;

import com.example.chgk.model.dto.request.GameInfoRequest;
import com.example.chgk.model.enums.GameStatus;
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
public class GameInfoResponse extends GameInfoRequest {
    Long id;
    TournamentInfoResponse tournament;
    Integer vacant;
    GameStatus status;
}
