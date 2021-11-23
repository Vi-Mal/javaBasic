import java.util.ArrayList;
import java.util.Arrays;

public class FindDatatype {
    public ArrayList<String> retData(String str){
        int Scount=0,Icount=0,Dcount=0;
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str.split(" ")));

        for(String i : arr){

            if(i.matches("\\d+")){
                Icount += 1;
            }
            else if(i.matches("[0-9]*(.[0-9]*)?")){
                Dcount+=1;
            }
            else{
                Scount += 1;
            }
        }
        arr.clear();
        arr.add(Integer.toString(Icount));
        arr.add(Integer.toString(Dcount));
        arr.add(Integer.toString(Scount));

        return arr;
    }

    public static void main(String[] args){
        String str = "my 1.789 10.00 4.5672 age is 10";
        FindDatatype obj = new FindDatatype();
        ArrayList<String> t = obj.retData(str);
//        for(String i : t){
//            System.out.println(i);
//        }
        System.out.printf("String : %s\nInteger : %s\nDouble : %s ",t.get(2),t.get(1),t.get(2));
    }
}
