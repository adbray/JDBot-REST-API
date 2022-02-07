package com.github.anth.bray.RESTAPI.user;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    private final Long id;
    private String username;
    private int lvl;
    private int experience;

    public User() {
        this.id = 1L;
        this.username = "";
        this.lvl = 0;
        this.experience = 0;
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
        this.lvl = 1;
        this.experience = 0;
    }

    public User(Long id, String username, int lvl, int exp) {
        this.id = id;
        this.username = username;
        this.lvl = lvl;
        this.experience = exp;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public int getLevel() {
        return lvl;
    }

    public void setLevel(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return experience;
    }

    public void setExp(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", level=" + lvl +
                ", exp=" + experience +
                '}';
    }


}
