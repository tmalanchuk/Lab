package goit.GoJavaOnline.Labs.Lab3.Lab3_1;

public class AudioFile extends File {
    private String type;

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printFileInfo(){
        System.out.println(getType());
    }
}