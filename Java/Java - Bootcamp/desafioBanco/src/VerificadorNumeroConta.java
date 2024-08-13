import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);

            // Se nenhum erro foi lançado, então o número de conta é válido
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Captura a exceção caso o número de conta não tenha exatamente 8 dígitos
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        // Se chegou até aqui, o número de conta é válido
    }
}