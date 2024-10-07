package com.example.chgk.model.db.repository;

import com.example.chgk.model.db.entity.UserInfo;
import com.example.chgk.model.db.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepo  extends JpaRepository<Tournament, Long> {
    Tournament findFirstByOrganizer(UserInfo organizer);
    boolean existsByTournName(String tournName);
}
