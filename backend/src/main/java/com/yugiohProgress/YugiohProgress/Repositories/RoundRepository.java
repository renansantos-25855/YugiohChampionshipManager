package com.yugiohProgress.YugiohProgress.Repositories;

import com.yugiohProgress.YugiohProgress.Entities.Round;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long>{
    
}
