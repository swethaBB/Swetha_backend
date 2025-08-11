package com.hexaware.backendCircket.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.backendCircket.dto.PlayerDto;
import com.hexaware.backendCircket.entity.Player;
import com.hexaware.backendCircket.service.IPlayerService;

@RestController
@RequestMapping("/api/circket")
public class PlayerRestController {
	
	@Autowired
	IPlayerService service;
	
	 @GetMapping("/getallplayers")
	 public List<Player> getAllPlayers(){
		return service. getAllPlayers();
	 }
	 
	 @GetMapping("/getplayerbyid/{id}")
	 public Player getPlayerById(@PathVariable Long id) {
		 return service.getPlayerById(id);
	 }
	 
	 @PostMapping("/addplayers")
	 public Player addPlayer(@RequestBody PlayerDto dto) {
		return service.addPlayer(dto);
	 }
	 
	 @GetMapping("/deletebyid/{id}")
	 public String deletePlayerById(Long id) {
		 service.deletePlayerById(id);
		return "Deleted";
		 
	 }
	 @PutMapping("/update")
	 public Player updatePlayer(@RequestBody Player player) {
		return service.updatePlayer(player);
		 
	 }
}
