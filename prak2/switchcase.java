/**
 * Created by user on 24/03/2015.
 */
public class switchcase {
    public static void main(String[] args) {
        //variabel
        int nilai = 6;
        //seleksi kondisi (else-if)
        if (nilai == 1){
            System.out.println("Satu");
        }
        else if (nilai == 2) {
            System.out.println("Dua");
        }
        else if (nilai == 3) {
            System.out.println("Tiga");
        }
        else if (nilai == 4) {
            System.out.println("Empat");
        }
        else if (nilai == 5) {
            System.out.println("Lima");
        }
        else if (nilai == 6) {
            System.out.println("Enam");
        }
        else if (nilai == 7) {
            System.out.println("Tujuh");
        }
        else if (nilai == 8) {
            System.out.println("Delapan");
        }
        else  if (nilai == 9) {
            System.out.println("Sembilan");
        }else{
            System.out.println("Nol/Kosong");
        }

        int angka = 5;
        //switch case
        switch (angka){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("BLANK");
                System.exit(0);
        }
    }
}