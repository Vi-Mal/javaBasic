import java.util.ArrayList;

public class PositiveNegative {

    public  ArrayList<Float> count(int[] arr){
        float Ncount = 0,Ocount = 0,Pcount = 0;

        for (int j : arr) {
            if (j < 0) {
                Ncount++;
            } else if (j > 0) {
                Pcount++;
            } else if (j == 0) {
                Ocount++;
            }
        }

        ArrayList<Float> arry =new ArrayList<Float>();

        arry.add(Pcount);arry.add(Ncount);arry.add(Ocount);

        return arry;
    }

    public static void main(String[] args){
        int[] arr = {1,1,0,-1,-1};
        PositiveNegative obj = new PositiveNegative();
        System.out.printf(" %f \n %f \n %f",
                obj.count(arr).get(0)/arr.length,
                obj.count(arr).get(1)/arr.length,
                obj.count(arr).get(2)/arr.length);
    }

























//    public static void main(String[] args) {
//        int[] arr = new int[]{1,1,0,-1,-1};
//        double n = arr.length;
//        double posc = 0, negc = 0, zeroc = 0;
//        double posv, negv, zerov;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] < 0) {
//                negc++;
//            } else if (arr[j] > 0) {
//                posc++;
//            } else {
//                zeroc++;
//            }
//        }
//        posv = posc / n;
//        negv = negc / n;
//        zerov = zeroc / n;
//        System.out.println(posv);
//        System.out.println(negv);
//        System.out.println(zerov);
//    }



}
