public class zad4 {

    public static void main(String[] args) {
        zad4(5, 3, 8);
        zad4(8, 3, 5);
        zad4(5, 8, 3);
    }

    public static void stars(int n) {
        if (n % 2 == 0) n -= 1; // n = n - 1

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zad4(int x, int y, int z) {
        //sprawdzenie która jest największa
        int high;
        if (x >= y && x >= z) {
            high = x;
        } else if (y >= x && y >= z) {
            high = y;
        } else {
            high = z;
        }

        //rysowanie gwiazdek
        boolean first, second, third;
        for (int i = high; i >= 0; i--) {
            if (x <= i) first = false;
            else first = true;

            if (y <= i) second = false;
            else second = true;

            if (z <= i) third = false;
            else third = true;

            System.out.println((first==true ? "*" : " ") + " " + (second==true ? "*" : " ") + " " + (third == true ? "*" : " "));
        }
    }
}
