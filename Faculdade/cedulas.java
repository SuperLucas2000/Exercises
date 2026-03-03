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