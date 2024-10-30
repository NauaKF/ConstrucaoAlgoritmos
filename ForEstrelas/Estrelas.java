import java.util.Scanner;

public class Estrelas{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int i = 0, n = 0, j = 0;

        System.out.println("Digite o numero de estrelas: ");
        n = scn.nextInt();

        for (i = 0; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}