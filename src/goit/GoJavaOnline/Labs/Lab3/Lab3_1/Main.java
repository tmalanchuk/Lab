package goit.GoJavaOnline.Labs.Lab3.Lab3_1;


public class Main {

    public static void main(String[] args)
    {
        TextFile txtFile = new TextFile();
        txtFile.setName("My first txt file");
        txtFile.setData("My first txt data");

        AudioFile audioFile = new AudioFile();
        audioFile.setName("My first audio file");
        audioFile.setType("mp3");

        ImageFile imageFile = new ImageFile();
        imageFile.setName("My first image file");
        imageFile.setSize(4000);


        Directory dir = new Directory();
        dir.getFiles().add(txtFile);
        dir.getFiles().add(audioFile);
        dir.getFiles().add(imageFile);
        dir.PrintDirectoryData();
    }
}