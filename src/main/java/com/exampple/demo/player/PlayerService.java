package com.exampple.demo.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public PlayerService() {
		System.out.println("Service layer is created");

	}

	public void saveAllPlayer(List<Player> players) {
		playerRepository.saveAll(players);

	}

	// Returns all players
	public List<Player> getAllPlayer() {
		return playerRepository.findAll();
	}

	//Return by id
	public Player getPlayerById(int id) {

		Player player = null;
		try {
			player = playerRepository.findById(id).get();

		} catch (Exception e) {
          e.printStackTrace();
		}

		return player;
	}

	// Save or update the player
	public Player savePlayer(Player player) {
		return playerRepository.save(player);
	}

	// Remove the player
	public void deletePlayer(int id) {
		playerRepository.deleteById(id);
	}

}
