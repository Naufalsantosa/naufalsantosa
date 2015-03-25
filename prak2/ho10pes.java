/**
 * Created by user on 25/03/2015.
 */
public class ho10pes {
    public static void main(String[] args) {
        int star = 7;
        //proses
        for (int i = 1; i <= star; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
