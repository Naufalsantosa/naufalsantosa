/**
 * Created by user on 25/03/2015.
 */
public class six {
    public static void main(String[] args) {

        float jumlah=0, i=1;
        double hasil;

        while (i<=10){
            jumlah = jumlah + i;
            i++;
        }

        jumlah = jumlah / (i-1);
        System.out.println("Hasilnya sama dengan?" +jumlah);
        System.out.println("Oke.. bisa");
    }
}
