package com.yugiohProgress.YugiohProgress.Entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_player")
public class Player implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String uf;
    private Integer points;
    private Integer games;
    private Integer winCount;
    private Integer lossCount;
    private Integer drawCount;

    @ManyToMany(mappedBy = "players")
    Set<Round> rounds;
    


    public Player() {
    }


    public Player(Long id, String code, String name, String uf, Integer points, Integer games, 
                    Integer winCount, Integer lossCount, Integer drawCount) {

        this.id = id;
        this.code = code;
        this.name = name;
        this.uf = uf;
        this.points = points;
        this.games = games;
        this.winCount = winCount;
        this.lossCount = lossCount;
        this.drawCount = drawCount;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getPoints() {
        return this.points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGames() {
        return this.games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }


    public Integer getWinCount() {
        return this.winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getLossCount() {
        return this.lossCount;
    }

    public void setLossCount(Integer lossCount) {
        this.lossCount = lossCount;
    }

    public Integer getDrawCount() {
        return this.drawCount;
    }

    public void setDrawCount(Integer drawCount) {
        this.drawCount = drawCount;
    }




    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}


