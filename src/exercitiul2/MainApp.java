package exercitiul2;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random =new Random();

        int nr1=random.nextInt(30)+1;
        int nr2=random.nextInt(30)+1;

        System.out.println("Numerele generate: " + nr1 +" si "+ nr2 );
        int cmmdc=cmmdc(nr1,nr2);

        System.out.println("Cmmdc dintre "+ nr1 + " si " + nr2 + " este "+cmmdc);

    }
    public static int cmmdc(int a , int b){
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }

        return a;
    }

}
