package com.yugiohProgress.YugiohProgress.Entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_round")
public class Round implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long roundCount;
    private Player winner;
    @ManyToMany
    @JoinTable(
        name = "player_round",
        joinColumns = @JoinColumn(name = "round_id"),
        inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    Set<Player> players;


    public Round() {
    }


    public Round(Long id, Long roundCount, Player winner) {
        this.id = id;
        this.roundCount = roundCount;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoundCount() {
        return this.roundCount;
    }

    public void setRoundCount(Long roundCount) {
        this.roundCount = roundCount;
    }

    public Player getWinner() {
        return this.winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }


    public Set<Player> getPlayers() {
        return this.players;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Round)) {
            return false;
        }
        Round round = (Round) o;
        return Objects.equals(id, round.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }




}
