package goit.GoJavaOnline.Labs.Lab3.Lab3_3;

public class Main {

    public static void main(String[] args){
        Guitar inst1 = new Guitar();
        inst1.setName("Gibson ");
        inst1.setColor(" White");
        inst1.setNumber(5);

        Piano inst2 = new Piano();
        inst2.setName("Yamaha ");
        inst2.setColor(" Black");
        inst2.setNumber(2);

        Trumpet inst3 = new Trumpet();
        inst3.setName("Brahner ");
        inst3.setColor(" Gold");
        inst3.setNumber(5);

        MusicShop item = new MusicShop();
        item.getInstruments().add(inst1);
        item.getInstruments().add(inst2);
        item.getInstruments().add(inst3);
        item.PrintShopData();
    }
}