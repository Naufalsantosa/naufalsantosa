/**
 * Created by user on 25/03/2015.
 */
public class pitu {
    public static void main(String[] args) {
        int first = 1;
        int end = 10;
        float jumlah = 0;
        double rata =0;
        System.out.println("Mengetahui rata-rata");
        System.out.println("Nilai awal..=" +first);
        System.out.println("Nilai akhir..=" +end);
        while(first<=end){
            jumlah=jumlah+first;
            first++;
        }
        rata=jumlah/end;
        System.out.println("Jumlah deretan diatas= "+jumlah);
        System.out.println("rata-rata "+rata);

    }
}
