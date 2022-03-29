package com.yugiohProgress.YugiohProgress.Repositories;

import com.yugiohProgress.YugiohProgress.Entities.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
    
}
