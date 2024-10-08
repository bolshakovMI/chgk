package com.example.chgk.model.db.repository;

import com.example.chgk.model.enums.Stage;
import com.example.chgk.model.db.entity.Game;
import com.example.chgk.model.db.entity.Result;
import com.example.chgk.model.db.entity.Team;
import com.example.chgk.model.db.entity.Tournament;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ResultRepo  extends JpaRepository<Result, Long> {

    Page<Result> findAllByGame(Game game, Pageable pageable);

    Result findByGameAndTeam(Game game, Team team);

    @Query(value = "select R from Result R where R.game.tournament = :tournament and R.game.stage = :stage and R.place >= :place order by R.place ASC, R.points DESC")
    List<Result> findAllByTournamentAndStageAndPlaceAfter(Tournament tournament, Stage stage, Integer place);
}
