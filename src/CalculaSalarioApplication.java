import model.Professor;

import java.util.Scanner;

public class CalculaSalarioApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Digite o regime de pagamento (CLT, Horista ou PJ): ");
        String regimePagamento = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, regimePagamento);
        double valorAReceber = professor.calcularValorAReceber();
        professor.exibirValorAReceber(valorAReceber);

        scanner.close();
    }
}
