/* EXERCÍCIO DA PLATAFORMA BEECROWD 
1018 - cédulas

DESCRIÇÃO
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.*/

import java.util.Scanner;

public class cedulas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int preco = scn.nextInt();
        System.out.println(preco);
        int resto;


        if (preco > 0) {
            resto = preco % 100;
            preco = preco / 100;

            System.out.println(preco + " nota(s) de R$ 100,00");

            if (resto >= 0) {
                preco = resto / 50;
                System.out.println(preco + " nota(s) de R$ 50,00");
                resto = resto % 50;

                if (resto >= 0) {
                    preco = resto / 20;
                    System.out.println(preco + " nota(s) de R$ 20,00");
                    resto = resto % 20;

                    if (resto >= 0) {
                        preco = resto / 10;
                        System.out.println(preco + " nota(s) de R$ 10,00");
                        resto = resto % 10;

                        if (resto >= 0) {
                            preco = resto / 5;
                            System.out.println(preco + " nota(s) de R$ 5,00");
                            resto = resto % 5;

                            if (resto >= 0) {
                                preco = resto / 2;
                                System.out.println(preco + " nota(s) de R$ 2,00");
                                resto = resto % 2;

                                if (resto >= 0) {
                                    preco = resto / 1;
                                    System.out.println(preco + " nota(s) de R$ 1,00");
                                    resto = resto % 1;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
