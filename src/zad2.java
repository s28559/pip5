import java.util.Scanner;

public class zad2 {


    public static void main(String[] args) {

        int n;
        int i=2;
        int x0=0;
        int x1=1;
        int x2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą i naciśnij ENTER");
        n = sc.nextInt();
        do {
            if(n==0){
                System.out.println(n+" "+"wyraz ciągu jest równy"+" "+x0);

            } else if (n==1) {
                System.out.println(n+" "+"wyraz ciągu jest równy"+" "+x1);

            }else {
                if(n>1){
                    x2=x0+x1;
                    x0=x1;
                    x1=x2;
                    System.out.println(i+" "+"wyraz ciągu jest równy"+" "+x2);
                    i++;
                }
            }
        } while (i<n);
    }
}
