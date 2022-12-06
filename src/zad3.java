public class zad3 {

    public static void main(String[] args) {

        stars(5);
    }

    public static void stars(int n){
        if(n % 2==0) n=n-1;

        for (int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
