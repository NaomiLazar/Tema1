package exercitul1;

import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int a=scanner.nextInt();
        if (a<1){
            System.out.println("Numarul trebuie sa fie pozitiv!");
        }
        else {
            System.out.print("Divizorii lui "+ a +" sunt: ");
            boolean estePrim=true;
            int nrDivizori =0;

            for(int i=1;i<=a;i++){
                if(a%i==0) {
                    System.out.print(i +" ");
                    nrDivizori++;
                    if (i != 1 && i != a){
                        estePrim=false;
                    }
                }
            }
            System.out.println();
            if(nrDivizori==2){
                System.out.println(a+" este numar prim!");
            }
            else {
                System.out.println(a+ " nu este numar prim!");
            }
        }
        scanner.close();

    }
}

