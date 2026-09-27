package session02;

import java.util.Scanner;

public class TimSoChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập một số nguyên");
        int n = sc.nextInt();

        if (n  == 0){
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        } else if (n % 2 == 0) {
            System.out.println("N là số chẵn !");
        } else {
            System.out.println("N là số lẻ !");
        }
        sc.close();
    }
}