package com.example.chgk.model.dto.request;

import com.example.chgk.model.enums.QuestionComplexity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QuestionPackRequest {
    Integer number;
    QuestionComplexity minComplexity;
    QuestionComplexity maxComplexity;
}
