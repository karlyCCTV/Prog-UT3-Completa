public class AnidadoFor{
    public static void main(String[] args){
        int rowlimit = 3;
        int columnlimit = 4;
        for (int r = 1;r!=rowlimit+1;r++){
            String pos = "";
            pos ="";
            for(int c = 1;c!=columnlimit+1;c++){
                pos +=("("+ r + "," + c + ")");
            }
            System.out.println(pos);
        }
    }
}