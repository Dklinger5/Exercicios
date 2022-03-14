package Exercicios.Faceis;

import java.io.IOException;
import java.util.Scanner;

/*      1. Faça um algoritmo que leia a idade de uma pessoa expressada em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

        2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        números 4, 5 e 6. A soma das duas médias. A média das médias.

        3. Informar um saldo e imprimir o saldo com reajuste de 1%.

        4. Escrever um algoritmo que lê:
        - a porcentagem do IPI a ser acrescido no valor das peças
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

        5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$788,00)

        6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        antecessor e seu sucessor.

*/

public class Exercicio01 {

    static void showMenu() {
        System.out.println("A resposta de qual exercicio você gostaria de verificar ?");
        System.out.println("  1.  ");
        System.out.println("  2.  ");
        System.out.println("  3.  ");
        System.out.println("  4.  ");
        System.out.println("  5.  ");
        System.out.println("  6.  ");
        System.out.println("Choose one (q to quit) : ");
    }

    static void helpOn(char what) {
        switch (what) {
            case '1':
                Scanner x = new Scanner(System.in);
                System.out.println("Quantos anos você tem ?");
                int a = x.nextInt();
                System.out.println("Quantos meses você tem ?");
                int b = x.nextInt();
                System.out.println("Quantos dias você tem ?");
                int c = x.nextInt();
                System.out.println(exercicio1(a, b, c));
                break;
            case '2':
                exercicio2();
                break;
            case '3':
                Scanner l = new Scanner(System.in);
                System.out.println("Qual o seu saldo ?");
                int d = l.nextInt();
                System.out.println("Quanto que é o reajuste ? (em %, pode ser negativo) ");
                int e = l.nextInt();
                System.out.println(exercicio3(d, e));
                break;
            case '4':
                Scanner p = new Scanner(System.in);
                System.out.println("Qual é o IPI (Imposto sobre Produto Industrializado)? ");
                int f = p.nextInt();
                System.out.println("Qual o código da peça 1? ");
                System.out.println("Qual o valor unitário da peça 1? ");
                int h = p.nextInt();
                System.out.println("Qual a quantidade de peça 1?");
                int i = p.nextInt();
                System.out.println("Qual o código da peça 2? ");
                System.out.println("Qual o valor unitário da peça 2? ");
                int k = p.nextInt();
                System.out.println("Qual a quantidade de peça 2?");
                int m = p.nextInt();
                System.out.println("O valor a pagar é: " + exercicio4(f, h, k, i, m));
                break;
            case '5':
                Scanner r = new Scanner(System.in);
                System.out.println("Qual é o seu salário ?");
                double s = r.nextDouble();
                System.out.println("Conforme o salário que você informou, você recebe: " + exercicio5((int) Math.round(s)) + " Salários Minimos");
                System.out.println("Falta mais: " + exercicio5quantofalta(s) + " Para fechar o próximo salário minimo");
                break;
            case '6':
                Scanner n = new Scanner(System.in);
                System.out.println(" Qual número você gostaria de escolher ?");
                int o = n.nextInt();
                exercicio6(o);
                break;
            case 'q':
                break;
        }
    }

    public static int exercicio1(int anos, int meses, int dias) {
        anos *= 365;
        meses *= 30;
        return (anos + meses + dias);
    }

    public static void exercicio2() {
        int a = ((8 + 9 + 7) / 3);
        int b = ((4 + 5 + 6) / 3);
        int c = (((8 + 9 + 7) / 3) + ((4 + 5 + 6) / 3));
        int d = ((((8 + 9 + 7) / 3) + (((4 + 5 + 6) / 3))) / 2);

        System.out.println("A media de 8, 9 e 7 é: " + a);
        System.out.println("A média de 4,5 e 6 é: " + b);
        System.out.println("A soma das duas médias é: " + c);
        System.out.println("A média das médias é: " + d);
    }

    public static double exercicio3(int saldo, int reajuste) {
        double saldocomreajuste;
        double reajustemnum = (reajuste * 0.01);
        double reajustevalor = (saldo * reajustemnum);
        saldocomreajuste = saldo + reajustevalor;
        return saldocomreajuste;
    }

    public static double exercicio4(int ipi, int valor1,
                                    int valor2, int quant1, int quant2) {

        return (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
    }

    public static int exercicio5(int salario) {

        return (salario / 1212);
    }

    public static double exercicio5quantofalta(double salario) {

        return (salario % 1212);
    }

    public static void exercicio6(int numerointeiro) {
        System.out.println("O antecessor é:" + (numerointeiro - 1) + "\n" + "E o seu sucessor:" + (numerointeiro + 1));
    }


    public static void main(String[] args) throws IOException {
        char choice;
        Exercicio01.showMenu();
        choice = (char) System.in.read();
        Exercicio01.helpOn(choice);


    }
}
