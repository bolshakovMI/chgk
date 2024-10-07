package com.example.chgk.model.db.repository;

import com.example.chgk.model.db.entity.Tournament;
import com.example.chgk.model.db.entity.TournamentTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentTableRepo extends JpaRepository<TournamentTable, Long> {
    Page<TournamentTable> findAllByTournament(Tournament tournament, Pageable pageable);
}
