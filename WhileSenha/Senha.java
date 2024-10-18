import java.util.Scanner;

public class Senha{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int senha = 1010;
        int senhaDigitada = 0;

        while(senhaDigitada != senha){
            System.out.println("Digite a senha de 4 digitos: ");
            senhaDigitada = scn.nextInt();
        }
        System.out.println("Acertou!");
    }
}