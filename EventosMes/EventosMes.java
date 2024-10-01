import java.util.Scanner;

public class EventosMes{
    public static void main(String[] args) {
        
        int mes = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o mes que deseja verificar os eventos: ");
        System.out.println("[1] Janeiro\n[2] Fevereiro\n[3] Marco\n[4] Abril\n[5] Maio\n[6] Junho");
        System.out.println("[7] Julho\n[8] Agosto\n[9] Setembro\n[10] Outubro\n[11] Novembro\n[12] Dezembro");
        mes = scn.nextInt();

        switch(mes){
            case 1:
            System.out.println("\n1 de janeiro: Confraternização universal (Ano Novo)");
            break;

            case 2:
            System.out.println("\n12 e 13 de fevereiro: Carnaval\n14 de fevereiro: Quarta-Feira de Cinzas");
            break;

            case 3:
            System.out.println("\n29 de marco: Sexta-Feira Santa\n 31 de marco: Pascoa");
            break;

            case 4:
            System.out.println("\n21 de abril: Tiradentes");
            break;

            case 5:
            System.out.println("\n1º de maio: Dia do Trabalho\n12 de maio: Dia das Maes\n30 de maio: Corpus Christi");
            break;

            case 6:
            System.out.println("\n12 de junho: Dia dos Namorados");
            break;

            case 7:
            System.out.println("\nSem data comemorativa nesse mes");
            break;

            case 8:
            System.out.println("\n11 de agosto: Dia dos Pais");
            break;

            case 9:
            System.out.println("\n7 de setembro: Independencia do Brasil");
            break;

            case 10:
            System.out.println("\n12 de outubro: Nossa Senhora Aparecia e Dia das Criancas\n28 de outubro: Dia do Servidor Publico");
            break;

            case 11:
            System.out.println("\n2 de novembro: Finados\n15 de novembro: Proclamacao da Republica\n20 de novembro: Dia da Consiciencia Negra");
            break;

            case 12:
            System.out.println("\n25 de dezembro: Natal");
            break;

            default:
            System.out.println("\nOpcao Invalida! Tente novamente.");
        }

    }
}