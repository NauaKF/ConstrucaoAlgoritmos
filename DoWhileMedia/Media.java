import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        double num = 0.0, aux = 0.0, resultado = 0.0, cont = 0.0;

        do{
            System.out.println("Digite o valor desejado: ");
            num = scn.nextDouble();

            aux = num;
            resultado = resultado + aux;

            if(num != 0){
                cont++;
            }
        } while(num != 0);
        System.out.println("\nMedia = " + (resultado/cont));
    }
}