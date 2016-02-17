package goit.GoJavaOnline.Labs.Lab3.Lab3_1;

import java.util.ArrayList;

public class Directory {

    private ArrayList<File> files = new ArrayList<File>();

    public ArrayList getFiles() {
        return files;
    }

    public void PrintDirectoryData() {

        for (int i = 0; i < files.size(); i++)
        {
            System.out.println(files.get(i).getName());
            files.get(i).printFileInfo();
        }
    }
}