package com.hexaware.backendCircket.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.backendCircket.dto.PlayerDto;
import com.hexaware.backendCircket.entity.Player;
import com.hexaware.backendCircket.repository.PlayerRepository;
@Service
public class PlayerServiceImpl implements IPlayerService {
	
	@Autowired
	PlayerRepository repo;

	@Override
	public List<Player> getAllPlayers() {
		return repo.findAll();
	}

	@Override
	public Player getPlayerById(Long id) {
		return repo.findById(id).orElse(null);
		
	}

	@Override
    public Player addPlayer(PlayerDto dto) {
        Player player = new Player();
        player.setName(dto.getName());
        player.setJerseyNumber(dto.getJerseyNumber());
        player.setRole(dto.getRole());
        player.setTotalMatches(dto.getTotalMatches());
        player.setTeamName(dto.getTeamName());
        player.setCountry(dto.getCountry());
        player.setDescription(dto.getDescription());
        return repo.save(player);
    }


	@Override
	public String deletePlayerById(Long id) {
		repo.deleteById(id);
		return "Deleted Successfully..!";
		
	}

	@Override
	public Player updatePlayer(Player player) {
		return repo.save(player);
	}


}
