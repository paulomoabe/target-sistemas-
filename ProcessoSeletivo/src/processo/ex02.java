package processo;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número para verificar se pertence a sequência de Fibonacci: ");
        num = scan.nextInt();

        boolean pertence = Fibonacci(num);

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean Fibonacci(int num) {
        int primeiro = 0, segundo = 1;

        while (primeiro <= num) {
            if (primeiro == num) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return false;
    }

	}


