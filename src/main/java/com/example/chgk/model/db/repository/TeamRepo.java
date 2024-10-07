package com.example.chgk.model.db.repository;

import com.example.chgk.model.db.entity.UserInfo;
import com.example.chgk.model.enums.CommonStatus;
import com.example.chgk.model.db.entity.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team, Long> {

    Page<Team> findAllByStatusIsNot(Pageable pageable, CommonStatus status);

    Team findFirstByCaptain(UserInfo captain);

    Team findFirstByViceCaptain(UserInfo viceCaptain);

    Team findFirstByTeamName(String teamName);

    boolean existsByTeamName(String teamName);

    boolean existsByCaptain(UserInfo captain);

    boolean existsByViceCaptain(UserInfo viceCaptain);
}
