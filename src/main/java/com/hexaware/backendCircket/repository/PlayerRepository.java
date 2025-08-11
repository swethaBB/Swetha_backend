package com.hexaware.backendCircket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.backendCircket.dto.TeamMatchesView;
import com.hexaware.backendCircket.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
	
	@Query("SELECT p.teamName AS teamName, SUM(p.totalMatches) AS totalMatches " +
	           "FROM Player p GROUP BY p.teamName")
	    List<TeamMatchesView> findTeamNameAndTotalMatches();

}
