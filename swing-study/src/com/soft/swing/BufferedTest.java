package com.soft.swing;
/**
 * created by 国庆
 * 2019.04.04
 */
import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        String[] content ={"你不喜欢我，", "我一点都不介意。", "因为我活下来，", "不是为了取悦你！"};
        File file = new File("D:\\word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            for (int i = 0;i<content.length;i++){
                bufferedWriter.write(content[i]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fileReader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            int k =0;
            while ((s = bufferedReader.readLine()) !=null){
                k++;
                System.out.println("第"+k+"行"+s);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
