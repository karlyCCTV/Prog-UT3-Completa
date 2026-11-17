import java.util.Random;
public class Ejercicio5
{
    public static void main(){
        Random random = new Random();
        int numero = random.nextInt(101);
        int total = 0;
        int h_odd = 0;
        int count = 0;
        while(numero!=0){
            total = total + numero;
            count++;
            if (numero%2!=0 && numero>h_odd){
                h_odd = numero;
            }
            numero = random.nextInt(101);
            //System.out.print(numero + ",");
        }
        //System.out.println();
        System.out.println("Valores de generación:");
        System.out.println("Media: " + total / count);
        System.out.println("Suma total: " + total);
        System.out.println("Numero impar mas alto: " + h_odd);
        //System.out.println("Cantidad de numeros generados: " + count);
    }
}