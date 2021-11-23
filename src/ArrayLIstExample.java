import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIstExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(true){
            Thread.sleep(2000);
            arr.add(1);
            System.out.println(arr.size());
            Thread.sleep(1000);
            arr.remove(arr.size()-1);
            System.out.println("deleted");

        }

    }
}
