package goit.GoJavaOnline.Labs.Lab3.Lab3_2;

public class Main {

    public static void main(String[] args)
    {
        Rose flr1 = new Rose();
        flr1.setName("Rose ");
        flr1.setColor("Red");
        Chamomile flr2 = new Chamomile();
        flr2.setName("Chamomile ");
        flr2.setColor("White");
        Aster flr3 = new Aster();
        flr3.setName("Aster ");
        flr3.setColor("Purple");
        Tulip flr4 = new Tulip();
        flr4.setName("Tulip ");
        flr4.setColor("Yellow");

        Bouquet dir=new Bouquet();
        dir.getFlowers().add(flr1);
        dir.getFlowers().add(flr2);
        dir.getFlowers().add(flr3);
        dir.getFlowers().add(flr4);
        dir.PrintBouquetData();

        Rosebush rb=new Rosebush();
        rb.PrintRosesData();
    }
}