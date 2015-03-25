/**
 * Created by user on 25/03/2015.
 */
public class napaled {
    public static void main(String[] args) {
        int first = 1;
        int end = 110;

        for(first=1; first<=110; first++){
            if(first % 5 == 0){
                System.out.print("VW");
            }else {
                System.out.print(first + " ");
            }
            if (first%11==0){
                System.out.print("\n");
            }
        }
    }
}


