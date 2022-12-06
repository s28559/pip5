import java.util.Scanner;

public class zad1 {


    public static void main(String[] args){

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą i naciśnij ENTER");
        n = sc.nextInt();
        if (n>0){
            System.out.println("Liczba w przedziale od 0 do"+" "+n);
            for(int i=0; i<=n;i++){
                System.out.println(i);
            }


        }else{
            if(n<0){
                System.out.println("Liczba w przedziale od 0 do"+" "+n);
                for(int i=0; i>=n;i--){
                    System.out.println(i);
                }

            }
        }
    }
}
