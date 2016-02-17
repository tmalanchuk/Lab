package goit.GoJavaOnline.Labs.Lab3.Lab3_1;

public class ImageFile extends File{
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printFileInfo(){
        System.out.println(getSize());
    }
}