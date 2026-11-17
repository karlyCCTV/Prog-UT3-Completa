import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1;i<=num;i++){
            if(i%3==0){
                System.out.println(i + " / 3" + " = " + i/3);
            }
        }
    }
}