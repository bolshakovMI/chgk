package com.example.chgk.model.dto.response;

import com.example.chgk.model.enums.TournamentStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.chgk.model.dto.request.TournamentInfoRequest;
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
public class TournamentInfoResponse extends TournamentInfoRequest {
    Long id;
    TournamentStatus status;
}
