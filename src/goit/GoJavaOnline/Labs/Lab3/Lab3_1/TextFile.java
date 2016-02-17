package goit.GoJavaOnline.Labs.Lab3.Lab3_1;

public class TextFile extends File {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void printFileInfo(){
        System.out.println(getData());
    }
}