import java.util.Scanner;
public class Ejercicio3
{
    public static void main(){
        System.out.println("Introduce un número: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result;
        for (int i = num-1; i>1; i--){
            result = num%i;
            if(result==0 && result%2==0){
                System.out.println(i + " es divisor par de " + num + ":  " + num + "/" + i + "=" + result);
            }
        }
    }
}