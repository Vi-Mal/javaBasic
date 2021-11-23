import java.util.ArrayList;

public class Finda{

    public static long repeatedString(String s, long n) {
        long size = s.length();
        long repeated = n/size;
        long left = n - (size * repeated);
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }

        repeated = (repeated * count) + extra;

        return repeated;
    }

    public static void main(String[] args){
        long a = repeatedString("abc", 10);
        System.out.println("1st "+a);
        long b = repeatedString("aba", 10);
        System.out.println("2nd "+b);
    }
}
