import java.util.Scanner;

public class TipoTriangulo{
    public static void main(String[] args) {
        
    int num1 = 0, num2 = 0, num3 = 0;
    Scanner scn = new Scanner(System.in);

    System.out.println("Esse programa mostra o tipo de Triangulo, se ele e Equilatero, Isosceles ou Escaleno!\n");
    System.out.println("Digite o valor do primeiro lado do triangulo:");
    num1 = scn.nextInt();

    System.out.println("Digite o valor do segundo lado do triangulo:");
    num2 = scn.nextInt();

    System.out.println("Digite o valor do terceiro lado do triangulo:");
    num3 = scn.nextInt();

    if(num1 == num2){
        if(num2 == num3){
        System.out.println("O triangulo e Equilatero!");
        }else{
            System.out.println("O triangulo e Isosceles!");
        }
    }else{
        System.out.println("O triangulo e Escaleno!");
    }
}
}
