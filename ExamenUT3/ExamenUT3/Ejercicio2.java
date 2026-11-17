import java.util.Random;
public class Ejercicio2
{
    public static void main(String[] args){
        Random random = new Random();
        int rand = random.nextInt(31)+29;
        System.out.println("Listado de numeros primos inferiores a "+ rand);
        rand--;
        while (rand >= 1) {
            if (esPrimo(rand)){
                System.out.println(rand);
            }
            rand--;
        }
    }
    
    public static boolean esPrimo(int numero){
        for (int i = numero-1; i > 1; i--) {
            if (numero % i == 0) {
                //System.out.println(numero + "//////" + i);
                return false;
            }
        }
        return true;
    } 

}