package lab3;

import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int n= scanner.nextInt();
        int aux=n;
        int rez=0;
        while (aux!=0){
            rez=(10*rez)+aux%10;
            aux=aux/10;
        }
        if(rez==n){
            System.out.print("Numarul " + n + " este palindrom");
        }
    }
}