import java.util.Scanner;

public class Cores{
    public static void main(String[] args) {
    
    String cor = " ";

    Scanner scn = new Scanner(System.in);

    System.out.println("Digite a cor desejada: ");
    cor = scn.next();

    switch(cor){
        case "verde": case "VERDE":
        System.out.println("\nVerde da cor das folhas");
        break;
        
        case "vermelho": case "VERMELHO":
        System.out.println("\nVermelho da cor do sangue");
        break;

        case "azul": case "AZUL":
        System.out.println("\nAzul da cor do ceu");
        break;

        case "amarelo": case "AMARELO":
        System.out.println("\nAmarelo cor do sol");
        break;

        default:
        System.out.println("Cor invalida! Tente novamente");
    }
    }
}