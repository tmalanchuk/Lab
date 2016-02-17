package goit.GoJavaOnline.Labs.Lab3.Lab3_2;

public class Rosebush extends Rose {
    private Rose []roses;

    public Rosebush() {

        roses = new Rose[3];
        roses[0] = new Rose();
        roses[0].setName("r1");
        roses[1] = new Rose();
        roses[1].setName("r2");
        roses[2] = new Rose();
        roses[2].setName("r3");
    }

    public void PrintRosesData()
    {
        System.out.print("Rosebush: "+roses.length+" roses");
    }
}