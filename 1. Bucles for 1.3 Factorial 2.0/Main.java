import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        System.out.println("Introduce un número");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        for(int i = 1; i<=num;i++){
            factorial = factorial * i;
            //num = num * i;
            System.out.println(factorial);
        }
        System.out.println("El factorial es " + factorial);
    }
}