public class zad3Dod{

    public static void main(String[] args) {

        stars(5);
    }
    public static void stars(int n){
        for (int i=n; i>0; i--){
            for(int j=i; j>0;j--){
                System.out.print(" ");
            }
            for(int k=2*(n-i)-3;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
