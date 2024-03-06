import java.util.Scanner;

public class UsluSayı {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı Giriniz: ");
        n =input.nextInt();
        System.out.print("Üs olacak sayıyı Giriniz: ");
        k =input.nextInt();
        int total = 1;


        for (int i=1; i<=k; i++){
            total = total * n;
        }
        System.out.println("Sonuç: " + total);













    }
}
