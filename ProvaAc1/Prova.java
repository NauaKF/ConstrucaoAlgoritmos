import java.util.Scanner;

public class Prova{
    public static void main(String[] args) {

        double ac1 = 0, ac2 = 0, ag = 0, af = 0, media = 0, minimo = 0;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Esse programa calcula a media final de um aluno da Facens");
        
        System.out.println("Digite a sua nota da AC1:");
        ac1 = scn.nextDouble();

        System.out.println("Digite a sua nota da AC2:");
        ac2 = scn.nextDouble();

        System.out.println("Digite a sua nota da AG:");
        ag = scn.nextDouble();

        System.out.println("Digite a sua nota da AF:");
        af = scn.nextDouble();

        System.out.println("\nDigite a media minima para a aprovacao");
        minimo = scn.nextDouble();

        media = (ac1*0.15) + (ac2*0.3) + (ag*0.1) + (af*0.45);
    
        if(media >= 0 && media <= 10){
            if(media < minimo && media >= 0){
            System.out.println("Reprovado! Sua media = " + media);
            }

            if(media >= minimo && media <= 10){
                System.out.println("Aprovado! Sua media = " + media);
            }
        }else{
            System.out.println("O valor ultrapassou o limite!");
        }
    }
}