package com.SeanPersonal.BattletechCompanion.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class BattleMech extends AbstractEntity{

    private String name;

    @ManyToMany
    private List<Weapon> weaponList;

    @OneToOne
    private Pilot cockpit;

    private int armorH;

    private int armorLA;

    private int armorLL;

    private int armorLT;

    private int armorRA;

    private int armorRL;

    private int armorRT;

    private int armorCT;

    private int structureH;

    private int structureLA;

    private int structureLL;

    private int structureLT;

    private int structureRA;

    private int structureRL;

    private int structureRT;

    private int structureCT;


    public BattleMech(String name, List<Weapon> weaponList, int armorH, int armorLA, int armorLL, int armorLT, int armorRA, int armorRL, int armorRT, int armorCT, int structureH, int structureLA, int structureLL, int structureLT, int structureRA, int structureRL, int structureRT, int structureCT) {
        this.name = name;
        this.weaponList = weaponList;
        this.armorH = armorH;
        this.armorLA = armorLA;
        this.armorLL = armorLL;
        this.armorLT = armorLT;
        this.armorRA = armorRA;
        this.armorRL = armorRL;
        this.armorRT = armorRT;
        this.armorCT = armorCT;
        this.structureH = structureH;
        this.structureLA = structureLA;
        this.structureLL = structureLL;
        this.structureLT = structureLT;
        this.structureRA = structureRA;
        this.structureRL = structureRL;
        this.structureRT = structureRT;
        this.structureCT = structureCT;
    }

    public BattleMech() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public Pilot getCockpit() {
        return cockpit;
    }

    public void setCockpit(Pilot cockpit) {
        this.cockpit = cockpit;
    }

    public int getArmorH() {
        return armorH;
    }

    public void setArmorH(int armorH) {
        this.armorH = armorH;
    }

    public int getArmorLA() {
        return armorLA;
    }

    public void setArmorLA(int armorLA) {
        this.armorLA = armorLA;
    }

    public int getArmorLL() {
        return armorLL;
    }

    public void setArmorLL(int armorLL) {
        this.armorLL = armorLL;
    }

    public int getArmorLT() {
        return armorLT;
    }

    public void setArmorLT(int armorLT) {
        this.armorLT = armorLT;
    }

    public int getArmorRA() {
        return armorRA;
    }

    public void setArmorRA(int armorRA) {
        this.armorRA = armorRA;
    }

    public int getArmorRL() {
        return armorRL;
    }

    public void setArmorRL(int armorRL) {
        this.armorRL = armorRL;
    }

    public int getArmorRT() {
        return armorRT;
    }

    public void setArmorRT(int armorRT) {
        this.armorRT = armorRT;
    }

    public int getArmorCT() {
        return armorCT;
    }

    public void setArmorCT(int armorCT) {
        this.armorCT = armorCT;
    }

    public int getStructureH() {
        return structureH;
    }

    public void setStructureH(int structureH) {
        this.structureH = structureH;
    }

    public int getStructureLA() {
        return structureLA;
    }

    public void setStructureLA(int structureLA) {
        this.structureLA = structureLA;
    }

    public int getStructureLL() {
        return structureLL;
    }

    public void setStructureLL(int structureLL) {
        this.structureLL = structureLL;
    }

    public int getStructureLT() {
        return structureLT;
    }

    public void setStructureLT(int structureLT) {
        this.structureLT = structureLT;
    }

    public int getStructureRA() {
        return structureRA;
    }

    public void setStructureRA(int structureRA) {
        this.structureRA = structureRA;
    }

    public int getStructureRL() {
        return structureRL;
    }

    public void setStructureRL(int structureRL) {
        this.structureRL = structureRL;
    }

    public int getStructureRT() {
        return structureRT;
    }

    public void setStructureRT(int structureRT) {
        this.structureRT = structureRT;
    }

    public int getStructureCT() {
        return structureCT;
    }

    public void setStructureCT(int structureCT) {
        this.structureCT = structureCT;
    }
}
