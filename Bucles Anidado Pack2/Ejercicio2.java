public class Ejercicio2{
    public static void main(String[] args){
        /*
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");
        */
        
        int columnLimit = 67;
        int rowLimit =(columnLimit/2);
        if (columnLimit%2==1){
            rowLimit++;
        }
        for(int r=1;r<=rowLimit;r++){
            int rowDelL = columnLimit+1 - r;
            for(int c=1;c<=columnLimit;c++){
                //System.out.println(c+","+rowDelL+","+r);
                if(c<r || c>rowDelL){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}