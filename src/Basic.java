import java.util.Scanner;

public class Basic {
    public  void main() {
        String usr_input = "viaml sudna";

        char[] ch = new char[usr_input.length()];
        for (int i = 0; i < usr_input.length(); i++) {
            ch[i] = usr_input.charAt(i);
        }

        for(int i=0; i<usr_input.length();i++){
            for(int j=i+1; j<usr_input.length();j++){

                if(ch[i] == ch[j]) {
                    ch[j] = (char)(ch[j]+1);
                }

                }
            }
        String str = String.valueOf(ch);
        System.out.println(str);
    }
}
