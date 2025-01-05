package exercitiul3;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(21);

        System.out.println("Numarul generat: "+n);

        if(esteFibonacci(n))
        {
            System.out.println(n +" apartine sirului lui Fibonacci");
        }
        else{
            System.out.println(n+ " nu apartine sirului lui Fibonacci");
        }
    }
    public static boolean esteFibonacci(int n){
        int a=0,b=1;

        while (a<n){
            int temp=a;
            a=b;
            b=temp+b;
        }
        return(a==n);
    }

}
