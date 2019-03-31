package com.soft.swing;
import java.io.File;
/**
 * Created by 国庆
 * 2019.04.01
 */
public class FolderTest {
    public static void main (String[] args) {
      String path="C:\\Java";
        File file=new File(path);
        File[]  files =file.listFiles();
        for (File f :
                files) {
            if (!f.isDirectory()){
                String srcFileName = f.getName();
                int position = srcFileName.indexOf(".");
                String suffixName = srcFileName.substring(position);
                if (suffixName.equals(".jpg") ||suffixName.equals(".png")){
                System.out.println(f);
            }
        }
    }
    }
}
