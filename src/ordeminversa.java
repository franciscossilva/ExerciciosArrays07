import java.util.Scanner;

public class ordeminversa {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero inteiro: ");
        int numero = scanner.nextInt();
        int numeroinvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroinvertido = numeroinvertido * 10 + digito;
            numero /= 10;
        }
        System.out.println("O numero na ordem iversa é: " + numeroinvertido);






    }
}
