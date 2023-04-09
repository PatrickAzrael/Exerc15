import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int hora;
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        hora = leia.nextInt();

        double ganho;
        System.out.println("Informe o valor que você ganha por hora trabalhada: ");
        ganho = leia.nextDouble();
        leia.close();
        double resultado;
        resultado = (ganho * hora);
        double inss;
        double sind;
        double SL;
        double ir;

        inss = resultado * 0.08;
        sind = resultado * 0.05;
        ir = resultado * 0.11;
        SL = resultado - ir - sind - inss;

        System.out.println("O salário bruto foi de [" + resultado + "]");
        System.out.println("o valor pago ao INSS foi de [" + inss + "]");
        System.out.println("O valor pago ao Sindicato foi de [" + sind + "]");
        System.out.println("O valor pago de Imposto de renda foi de [" + ir + "]");
        System.out.printf("O salário líquido foi de [R$ %.2f]", SL);

    }

}