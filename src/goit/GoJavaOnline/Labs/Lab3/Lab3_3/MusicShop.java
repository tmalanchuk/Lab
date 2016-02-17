package goit.GoJavaOnline.Labs.Lab3.Lab3_3;

import java.util.ArrayList;

public class MusicShop {
    private String name;
    private Guitar inst1;
    private Piano inst2;
    private Trumpet inst3;

    public Guitar getInst1() {
        return inst1;
    }

    public void setInst1(Guitar inst1) {
        this.inst1 = inst1;
    }

    public Piano getInst2() {
        return inst2;
    }

    public void setInst2(Piano inst2) {
        this.inst2 = inst2;
    }

    public Trumpet getInst3() {
        return inst3;
    }

    public void setInst3(Trumpet inst3) {
        this.inst3 = inst3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private ArrayList<MusicalInstrument> instruments = new ArrayList<MusicalInstrument>();

    public ArrayList getInstruments() {
        return instruments;
    }

    public void PrintShopData() {
        for (int i = 0; i < instruments.size(); i++)
            instruments.get(i).printInstrumentInfo();
    }
}