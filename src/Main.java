import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Marcos";
        double salario = 2000.00;
        Funcionario func = new Funcionario(nome, salario);
        System.out.println(func);


        nome = "Josue";
        salario = 5000.00;
        String departamento = "Suporte tecnico";
        Funcionario gerent = new Gerente(nome,salario,departamento);
        System.out.println(gerent);
    }
}