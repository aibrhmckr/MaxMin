import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        int girilen;
        System.out.print("Bir sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        girilen = scanner.nextInt();
        Arrays.sort(list);
        int min = list[0];
        int max = list[0];
        for (int i : list){
            if (i < girilen){
                min = i;
            }
            if (i > girilen){
                max = i;
                break;
            }
        }
       // System.out.println(Arrays.toString(list));
        System.out.println("Girilen Sayi: "+girilen);
        System.out.println("Girilen sayidan kucuk en yakin sayi: "+min);
        System.out.println("Girilen sayidan en buyuk yakin sayi: "+max);
    }
}
