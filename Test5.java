public class Test5 {
    public static void main(String[] args) {
        System.out.println("  *   *");
        System.out.println(" *** ***");
        for(int i = 3; i>=0; i--){
            for(int j = 0; j<=3-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
