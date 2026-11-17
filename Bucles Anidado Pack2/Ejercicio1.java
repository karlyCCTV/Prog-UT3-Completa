public class Ejercicio1 {
    public static void main() {
        int rowtype;
        int row=1;
        while(row<=11){
            rowtype = (row%2);
            char out;
            int column=1;
            while(column<=11){
                if (column%2==rowtype){
                    System.out.print('X');
                }else{
                    System.out.print('O');
                }
                column++;
            }
            System.out.println();
            row++;
        }
    }
}