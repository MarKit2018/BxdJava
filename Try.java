package day00;
import java.io.*;
public class Try {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:/java/day01/Demo.java");
        File file2 =new File("E:/java.txt");
        try{
            BufferedReader read = new BufferedReader(new FileReader(file1));
            FileWriter write = new FileWriter(file2,true);
            String temp;
            while((temp = read.readLine())!=null)
            {
                write.write(temp);
            }
            write.close();
            read.close();
            System.out.println("内容已从"+file1+"复制追加到"+file2);
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
