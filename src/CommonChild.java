import java.util.ArrayList;
import java.util.Scanner;


public class CommonChild {

    public Integer findChild(String str, String str2) {
        int count = 0;
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i) == str2.charAt(j)) {
                    if (!arr.contains(str.charAt(i))) {
                        arr.add(str.charAt(i));
                        break;
                    }
                }
            }
        }

        ArrayList<Character> arr3 = new ArrayList<Character>();

        for (int k = 0; k < str2.length(); k++) {
            if (arr.contains(str2.charAt((char) k)) && !arr3.contains(str2.charAt((char)k))) {
                    arr3.add(str2.charAt((char) k));

            }
        }

        for (int x = 0; x < arr.size(); x++) {
            if (arr.get(x) == arr3.get(x)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "ELGGYJWKTDHLXJRBJLRYEJWVSUFZKYHOIKBGTVUTTOCGMLEXWDSXEBKRZTQUVCJNGKKRMUUBACVOEQKBFFYBUQEMYNENKYYGUZSP";
        String str2= "FRVIFOVJYQLVZMFBNRUTIYFBMFFFRZVBYINXLDDSVMPWSQGJZYTKMZIPEGMVOUQBKYEWEYVOLSHCMHPAZYTENRNONTJWDANAMFRX";
        CommonChild obj = new CommonChild();
        System.out.println(obj.findChild(str.toUpperCase(), str2.toUpperCase()));
    }
}

