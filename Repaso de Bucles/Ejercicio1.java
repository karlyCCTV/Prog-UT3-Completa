import java.util.Scanner;
public class Ejercicio1
{
    public static void main(String[] args){
        System.out.println("Introduce un numero");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result;
        for (int i = num-1; i>1; i--){
            result = num%i;
            if(result==0){
                System.out.println(i + " es divisor de " + num + ":" + num + "/" + i + "=" + result);
            }
        }
    }
}