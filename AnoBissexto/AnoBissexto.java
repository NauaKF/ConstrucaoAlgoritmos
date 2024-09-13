import java.util.Scanner;

public class AnoBissexto{
    public static void main(String[] args) {
        
    int ano = 0;
    Scanner scn = new Scanner(System.in);

    System.out.println("Esse programa informa se o ano digitado e Bissexto!\n");
    System.out.println("Digite o ano que deseja verificar:");
    ano = scn.nextInt();

    if(ano % 4 == 0){
        System.out.println("Esse ano e Bissexto!");
    }else{
        System.out.println("Esse ano nao e Bissexto!");
    }
}
}
