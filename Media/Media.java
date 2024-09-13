import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        
        double num = 0, media = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro numero da Media: ");
        num = scn.nextDouble();

        System.out.println("Digite o segundo numero da Media: ");
        media = scn.nextDouble();

        media = num + media;

        System.out.println("Digite o terceiro numero da Media: ");
        num = scn.nextDouble();

        media = (num+media)/3;

        System.out.println("O valor da media e: " + media);
    }
}