package com.hexaware.backendCircket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hexaware.backendCircket.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
