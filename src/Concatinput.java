import java.util.ArrayList;

public class Concatinput {

    public Integer con(String str, ArrayList<Integer> arr) {
        int k = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                arr.add(Character.getNumericValue((str.charAt(i))));
            }
                while (i == str.length() - 1 && arr.size() != k) {
                        arr.set(0, arr.get(0) + arr.get(k));
                        arr.remove(k);
                }
        }
        return arr.get(0);
    }

    public String con(String str, String b){
        StringBuilder bBuilder = new StringBuilder(b);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' ') {
                bBuilder.append(str.charAt(i));
        }
        }
        return bBuilder.toString();
    }

    public static void main (String[]args){
        String str = "1 2 3 4 5 ", b = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Concatinput obj = new Concatinput();
        if (Character.toString(str.charAt(0)).matches("\\d+")){
            System.out.println(obj.con(str,arr));
            System.out.println(obj.con(str,arr).getClass().getSimpleName());
        }else{
            System.out.println(obj.con(str,b));
            System.out.println(obj.con(str,b).getClass().getSimpleName());
        }

    }
}
