import java.util.Scanner;
public class Ejercicio1
{    
    public static void main(String[] args){
        System.out.println("La suma se detendra al introducir un 0");
        System.out.print("Introduce un numero para empezar a sumar: ");
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double count = 0;
        int num = scanner.nextInt();

        while (true) {
            if (num == 0){break;}
            //System.out.println("DING");
            total += num;
            count++;
            System.out.print("Introduce un numero: ");
            num = scanner.nextInt();
        }
        //double media = total / count;
        System.out.println("La suma total es: "+ total);
        System.out.println("La media es: " +  total / count);
    }
}