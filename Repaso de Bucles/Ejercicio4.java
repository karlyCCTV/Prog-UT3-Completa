import java.util.Scanner;
public class Ejercicio4 {
    public static void main(){
        System.out.println("Introduce un número: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result;
        int t_result = 0;
        boolean first = true;
        for (int i = num-1; i>1; i--){
            result = num%i;
            if(result==0){
                t_result = t_result + i;
                if (first!=true){
                    System.out.print(" + " +i);
                }else{
                    System.out.print(i);
                }
                first = false;
            }
        }
        System.out.print(" = " + t_result);
        System.out.println();
    }
}