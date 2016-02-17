package goit.GoJavaOnline.Labs.Lab3.Lab3_2;

import java.util.ArrayList;

public class Bouquet {
    private String name;
    private Rose flr1;
    private Chamomile flr2;
    private Aster flr3;
    private Tulip flr4;

    public Rose getRose() {
        return flr1;
    }

    public void setRose(Rose flr1) {
        this.flr1 = flr1;
    }

    public Chamomile getChamomile() {
        return flr2;
    }

    public void setChamomile(Chamomile flr2) {
        this.flr2 = flr2;
    }

    public Aster getAster() {
        return flr3;
    }

    public void setAster(Aster flr3) {
        this.flr3 = flr3;
    }

    public Tulip getTulip() {
        return flr4;
    }

    public void setTulip(Tulip flr4) {
        this.flr4 = flr4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public ArrayList getFlowers() {
        return flowers;
    }

    public void PrintBouquetData() {

        for (int i = 0; i < flowers.size(); i++)
            flowers.get(i).printFlowerInfo();
    }
}