package com.exampple.demo.player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

	public List<Player> findDistinctPlayerNameByPlayerNameLikeOrderByPlayerNameDesc(String name);
}
