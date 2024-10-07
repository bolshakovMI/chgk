package com.example.chgk.service;

import com.example.chgk.model.db.entity.Tournament;
import com.example.chgk.model.dto.request.TournamentInfoRequest;
import com.example.chgk.model.dto.response.GameInfoResponse;
import com.example.chgk.model.dto.response.ParticipantsInfoResponse;
import com.example.chgk.model.dto.response.TournamentInfoResponse;
import com.example.chgk.model.dto.response.TournamentTableInfoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface TournamentService {
    Page<TournamentInfoResponse> getAllTournaments(Integer page, Integer perPage, String sort, Sort.Direction order);
    TournamentInfoResponse getTournament(Long id);
    TournamentInfoResponse createTournament(TournamentInfoRequest request);
    TournamentInfoResponse updateTournament(Long id, TournamentInfoRequest request);
    void deleteTournament(Long id);
    Page<GameInfoResponse> getTournamentGames(Long id, Integer page, Integer perPage, String sort, Sort.Direction order);
    Page<ParticipantsInfoResponse> getTournamentParticipants(Long id, Integer page, Integer perPage, String sort, Sort.Direction order);
    Page<TournamentTableInfoResponse> getTournamentResults(Long id, Integer page, Integer perPage, String sort, Sort.Direction order);
    Tournament getTournamentDb(Long id);
    void countResults(Long id);
}
