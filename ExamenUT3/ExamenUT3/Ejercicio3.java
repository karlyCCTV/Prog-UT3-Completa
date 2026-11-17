import java.util.Random;
public class Ejercicio3
{
    public static void main(String[] args){
        Random random = new Random();
        int rand;
        for (int i=1;i<=20;i++){
            rand = random.nextInt(30)+5;
            
            System.out.print(rand +": ");
            char car = getCaracter(rand);
            for (int n = 0; n<=rand; n++){
                System.out.print(car);
            }
            System.out.println();
        }
    }
    
    private static char getCaracter(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return '*';
        }else if (num % 3 == 0) {
            return '+';
        }else if (num % 5 == 0){
            return '-';
        }else {
            return '#';
        }
    }
}