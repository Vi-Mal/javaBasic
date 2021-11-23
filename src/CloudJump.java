import java.util.ArrayList;
import java.util.List;

public class CloudJump {
        public  int jumpingOnClouds(List<Integer> c) {
            int jump=0;
            for(int i=0; i< c.size(); i++){
                if(c.get(i)==0){
                    jump ++;
                    if( i!=0 && i!=c.size()-1 && c.get(i-1)==0 && c.get(i+1)==0){
                            c.set(i,1);
                            jump--;
                    }
                }
            }
            return jump-1;
        }

        public void main(){
            System.out.println(jumpingOnClouds(new ArrayList<>(List.of(0,0,0,0,1,0))));
            System.out.println(jumpingOnClouds(new ArrayList<>(List.of(0,0,1,0,0,1,0))));
        }
}
