import java.util.Scanner;

public class MaiorQue{
    public static void main(String[] args) {
        
        int num1 = 0, num2 = 0;
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Esse programa informa qual numero e o maior, e se ele e positivo, negativo ou igual a zero!\n");
        System.out.println("Digite o primeiro numero:");
        num1 = scn.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scn.nextInt();

        if(num1 == num2){
            if(num1 == 0){
                System.out.println("Os dois numeros sao iguais a zero!");
            }
            if(num1 > 0){
                System.out.println("Os dois numeros sao iguais e positivos!");
            }
            if(num1 < 0){
                System.out.println("Os dois numeros sao iguais e negativos!");
            }
        }

        if(num1 > num2){
            if(num1 == 0){
                System.out.println("O primeiro numero digitado e igual a zero, e o segundo numero e negativo!");
            }
            if(num1 > 0 && num2 == 0){
                System.out.println("O primeiro numero digitado e positivo e o segundo numero e igual a zero!");
            }
            if(num1 > 0 && num2 > 0){
                System.out.println("Os dois numeros digitados sao positivos!");
            }
            if(num1 < 0 && num2 < 0){
                System.out.println("Os dois numeros digitados sao negativos");
            }
            System.out.println("O numero " + num1 + " e maior que o numero " + num2);
        }
        if(num1 < num2){
            if(num2 == 0){
                System.out.println("O primeiro numero digitado e negativo, e o segundo numero e igual a zero!");
            }
            if(num2 > 0 && num1 == 0){
                System.out.println("O primeiro numero digitado e igual a zero e o segundo numero e positivo!");
            }
            if(num1 > 0 && num2 > 0){
                System.out.println("Os dois numeros digitados sao positivos!");
            }
            if(num1 < 0 && num2 < 0){
                System.out.println("Os dois numeros digitados sao negativos");
            }
            System.out.println("O numero " + num2 + " e maior que o numero " + num1);
        }
        
    }
}