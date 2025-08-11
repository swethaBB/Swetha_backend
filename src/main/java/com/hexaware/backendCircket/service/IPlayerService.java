package com.hexaware.backendCircket.service;


import java.util.List;

import com.hexaware.backendCircket.dto.PlayerDto;
import com.hexaware.backendCircket.entity.Player;

public interface IPlayerService {
    public List<Player> getAllPlayers();
    public Player getPlayerById(Long id);
    public Player addPlayer(PlayerDto dto);
    public Player updatePlayer( Player player);
    public String deletePlayerById(Long id);
}

