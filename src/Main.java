import java.io.*;

public class Main {
    public static void main(String[] args) {
        //BufferedReader
        try {
            FileReader fileReader=new FileReader("test.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String i=bufferedReader.readLine();
            while(i!=null){
                System.out.println(i);
                i= bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //BufferedWriter
        /*String str="Group84";
        File file=new File("test.txt");
        try {
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}
