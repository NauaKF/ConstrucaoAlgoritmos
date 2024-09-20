import java.util.Scanner;

public class VerificaA{

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String s;
        int i = 0;
        int n = 0;
        int a = 0;

        System.out.println("\nString: ");
        s = ler.nextLine().toUpperCase();
        
        n = s.length();

        for(i=0; i<n; i++){
            if(s.charAt(i) == 'A'){
                a = a+1;
            }
        }

        System.out.println("\nQuantidade de 'A' na String = " + a);
    }
}   
