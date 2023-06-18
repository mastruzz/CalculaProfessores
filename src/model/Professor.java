package model;

import java.util.Scanner;

public class Professor {
    private String nome;
    private String regime;

    public Professor(String nome, String regime) {
        this.nome = nome;
        this.regime = regime;
    }

    public double calcularValorAReceber() {
        Scanner scanner = new Scanner(System.in);
        double valorAReceber;
        if (regime.equalsIgnoreCase("CLT")) {
            System.out.print("Digite o salário mensal do professor: ");
            valorAReceber = scanner.nextDouble();
        } else if (regime.equalsIgnoreCase("Horista")) {
            System.out.print("Digite o número de horas trabalhadas pelo professor: ");
            double horasTrabalhadas = scanner.nextDouble();
            System.out.print("Digite o valor da hora de trabalho do professor: ");
            double valorHora = scanner.nextDouble();
            valorAReceber = horasTrabalhadas * valorHora;
        } else if (regime.equalsIgnoreCase("PJ")) {
            System.out.print("Digite o valor do contrato do professor: ");
            valorAReceber = scanner.nextDouble();
        } else {
            throw new IllegalArgumentException("Regime de pagamento inválido.");
        }
        scanner.close();
        return valorAReceber;
    }

    public void exibirValorAReceber(double valorAReceber) {
        System.out.println("Nome do professor: " + this.nome + " | Valor a receber: "+ valorAReceber);
    }
}
