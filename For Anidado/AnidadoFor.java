public class AnidadoFor{
    public static void main(String[] args){
        int rowlimit = 3;
        int columnlimit = 4;
        for (int r = 1;r!=rowlimit+1;r++){
            for(int c = 1;c!=columnlimit+1;c++){
                System.out.print("("+r+","+c+")");
            }
            System.out.println();
        }
    }
}