package com.example.chgk.model.db.entity;

import com.example.chgk.model.enums.TournamentLevel;
import com.example.chgk.model.enums.TournamentStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tournaments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "tourn_name", unique = true)
    String tournName;

    TournamentLevel level;

    @Column(name = "tourn_factor")
    Integer tournFactor;

    @Column(name = "min_points")
    Integer minPoints;

    @OneToMany(mappedBy = "tournament")
    @JsonManagedReference(value = "tournament_games")
    List<Game> games;

    TournamentStatus status;

    @Column(name = "created_at")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDateTime createdAt;

    @Column(name = "updated_at")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDateTime updatedAt;

    @ManyToOne
    UserInfo organizer;
}
