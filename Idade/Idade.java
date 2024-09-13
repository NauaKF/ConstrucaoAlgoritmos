import java.util.Scanner;

public class Idade{
    public static void main(String[] args) {
        
        int idade = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Esse programa indica a sua faixa etaria de idade!\n");
        System.out.println("Digite a sua idade abaixo:");
        idade = scn.nextInt();

        if(idade >= 0 && idade <= 12){
            System.out.println("Voce esta classificado na faixa etaria como Crianca!");
        }
        if(idade > 12 && idade <= 60){
            System.out.println("Voce esta classificado na faixa etaria como Adulto!");
        }
        if(idade > 60){
            System.out.println("Voce esta classificado na faixa etaria como Idoso!");
        }
    }
}