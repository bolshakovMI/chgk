package com.example.chgk.model.dto.request;

import com.example.chgk.model.enums.TournamentLevel;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TournamentInfoRequest {

    String tournName;

    TournamentLevel level;

    @Min(value = 1, message = "Значимость не может быть меньше 1")
    @Max(value = 10, message = "Проверьте значимость: значимость не может быть больше 10")
    Integer tournFactor;

    Integer minPoints;
}
