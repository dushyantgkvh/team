package com.exampple.demo.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(path = "/player")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	@GetMapping(path = "/hello")
	public String getMessage() {
		return "Hello Word";
	}
	
	@GetMapping()
	public List<Player> getPlayer() {
		return playerService.getAllPlayer();
	}
	
	@GetMapping(path="/{id}")
	public Player getSinglePlayer(@PathVariable("id") int id) {
		return playerService.getPlayerById(id);
	}
	
	@PostMapping()
	public void savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}
	
	@PostMapping("/all")
	public void saveAllPlayer(@RequestBody List<Player> players) {
		playerService.saveAllPlayer(players);
	}
	
	@DeleteMapping()
	public void deletePlayer(@RequestParam("id") int id) {
		playerService.deletePlayer(id);
	}
}
