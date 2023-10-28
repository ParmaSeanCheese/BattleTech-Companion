package com.SeanPersonal.BattletechCompanion.models;

public class Pilot extends AbstractEntity{

    private String name;

    private int pilotSkill;

    private int gunnerySkill;

    private BattleMech currentBattleMech;

    public Pilot(String name, int pilotSkill, int gunnerySkill) {
        this.name = name;
        this.pilotSkill = pilotSkill;
        this.gunnerySkill = gunnerySkill;
    }

    public Pilot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPilotSkill() {
        return pilotSkill;
    }

    public void setPilotSkill(int pilotSkill) {
        this.pilotSkill = pilotSkill;
    }

    public int getGunnerySkill() {
        return gunnerySkill;
    }

    public void setGunnerySkill(int gunnerySkill) {
        this.gunnerySkill = gunnerySkill;
    }

    public BattleMech getCurrentBattleMech() {
        return currentBattleMech;
    }

    public void setCurrentBattleMech(BattleMech currentBattleMech) {
        this.currentBattleMech = currentBattleMech;
    }
}
