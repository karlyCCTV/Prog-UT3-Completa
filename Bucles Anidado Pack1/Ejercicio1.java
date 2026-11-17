import java.util.Scanner;
public class Ejercicio1 {
    public static void main(){
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int f=1;f<=num;f++){
            for(int l=1;l<=f;l++){
                System.out.print(l);
            }
        System.out.println();
        }
    }
}