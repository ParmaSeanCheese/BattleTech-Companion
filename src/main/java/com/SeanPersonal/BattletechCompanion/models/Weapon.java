package com.SeanPersonal.BattletechCompanion.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Weapon extends AbstractEntity {

    private String name;

    private int heat;

    private int damage;

    private int rangeS;

    private int rangeM;

    private int rangeL;

    @ManyToMany(mappedBy = "weaponList")
    private List<BattleMech> BattleMechList;

    public Weapon(String name, int heat, int damage, int rangeS, int rangeM, int rangeL) {
        this.name = name;
        this.heat = heat;
        this.damage = damage;
        this.rangeS = rangeS;
        this.rangeM = rangeM;
        this.rangeL = rangeL;
    }

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRangeS() {
        return rangeS;
    }

    public void setRangeS(int rangeS) {
        this.rangeS = rangeS;
    }

    public int getRangeM() {
        return rangeM;
    }

    public void setRangeM(int rangeM) {
        this.rangeM = rangeM;
    }

    public int getRangeL() {
        return rangeL;
    }

    public void setRangeL(int rangeL) {
        this.rangeL = rangeL;
    }
}
