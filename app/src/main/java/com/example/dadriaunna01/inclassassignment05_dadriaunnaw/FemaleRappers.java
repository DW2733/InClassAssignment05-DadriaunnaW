package com.example.dadriaunna01.inclassassignment05_dadriaunnaw;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 2/27/17.
 */

public class FemaleRappers implements Serializable

{
    private String femaleRappername;
    private String popSong;
    private boolean barsOrNah;
    private int awards;


    public FemaleRappers(String name, String popSong, boolean daTruth, int awards) {
        this.femaleRappername = name;
        this.popSong = popSong;
        this.barsOrNah = daTruth;
        this.awards = awards;

    }


    public String getName() {
        return femaleRappername;
    }

    public void setName(String name) {
        this.femaleRappername = name;
    }

    public boolean isDaTruth() {
        return barsOrNah;
    }

    public void setDaTruth(boolean daTruth) {
        this.barsOrNah = daTruth;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    public String getPopSong() {
        return popSong;
    }

    public void setPopSong(String popSong) {
        this.popSong = popSong;
    }

    @Override
    public String toString() {
        return "FemaleRappers{" +
                "Name:'" + femaleRappername +
                "\n Bars or Nah:" + barsOrNah +
                "\n Awards:" + awards +
                "\n Top Song:" + popSong;
    }
}
