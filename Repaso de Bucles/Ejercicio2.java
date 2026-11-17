import java.util.Scanner;
public class Ejercicio2{
    public static boolean prime(int num){
        int result;
        for (int i = num-1; i>1; i--){
            result = num%i;
            if(result==0){
                 return false;
            }
        }
        return true;
    }
    public static void main(){
        System.out.println("Introduce un numero: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(prime(num));
    }
}