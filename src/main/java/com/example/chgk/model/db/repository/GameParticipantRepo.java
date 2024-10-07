package com.example.chgk.model.db.repository;

import com.example.chgk.model.enums.ParticipantStatus;
import com.example.chgk.model.enums.Stage;
import com.example.chgk.model.db.entity.Game;
import com.example.chgk.model.db.entity.GameParticipant;
import com.example.chgk.model.db.entity.Team;
import com.example.chgk.model.db.entity.Tournament;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameParticipantRepo  extends JpaRepository<GameParticipant, Long> {

    @Query("select GP from GameParticipant GP where GP.game.tournament.id = :tournament and GP.status != 2")
    Page<GameParticipant> findAllByTournament(@Param("tournament") Long tournament, Pageable pageable);

    Page<GameParticipant> findAllByGameAndStatusIsNot(Game game, ParticipantStatus status, Pageable pageable);

    GameParticipant findByGameAndParticipant(Game game, Team participant);

    Page<GameParticipant> findAllByGameAndStatus(Game game, ParticipantStatus status, Pageable pageable);

    List<GameParticipant> findAllByGameAndStatus(Game game, ParticipantStatus status);

    @Query("select GP from GameParticipant GP where GP.participant.id = :participantId " +
            "and GP.status <> :status " +
            "and GP.game.tournament.id = :tournamentId " +
            "and GP.game.stage = :stage " +
            "and GP.game.id <> :gameId")
    GameParticipant findByParticipantAndStatusIsNotAndTournamentAndGameIsNot(@Param("participantId") Long participantId,
                                                                             @Param("status") ParticipantStatus status,
                                                                             @Param("tournamentId") Long tournamentId,
                                                                             @Param("stage") Stage stage,
                                                                             @Param("gameId") Long gameId);

    @Query("select GP from GameParticipant GP where GP.game.tournament = :tournament " +
            "and GP.participant = :participant and GP.game.stage = :stage and GP.status = :status")
    GameParticipant findByTournamentAndParticipantAndStageAndStatus(@Param("tournament") Tournament tournament,
                                                            @Param("participant") Team participant,
                                                            @Param("stage") Stage stage,
                                                            @Param("status") ParticipantStatus status);
}
