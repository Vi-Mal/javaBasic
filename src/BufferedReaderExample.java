import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BufferedReaderExample {


//    public static void main(String[] args)throws Exception{
//        InputStreamReader r=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(r);
//        System.out.println("Enter your name");
//        String name=br.readLine();
//        System.out.println("Welcome "+name);
//    }


    public static void main(String[] args)throws Exception{
        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
