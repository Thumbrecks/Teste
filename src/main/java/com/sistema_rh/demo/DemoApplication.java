package com.sistema_rh.demo;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistema_rh.demo.Pessoa; 

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        Map<String, String> pessoaCredenciais = new HashMap<>();
        Map<String, String> funcionarioCredenciais = new HashMap<>();

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Funcionario");
            System.out.println("3. Fazer Login Pessoa");
            System.out.println("4. Fazer Login Funcionario");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de nova linha

            switch (opcao) {
                case 1:
                    // Código para cadastrar Pessoa
                    // ...
                    break;

                case 2:
                    // Código para cadastrar Funcionario
                    // ...
                    break;

                case 3:
                    System.out.print("Digite seu nome de usuário: ");
                    String loginUsuario = scanner.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senhaUsuario = scanner.nextLine();

                    // Verificar as credenciais de Pessoa
                    if (pessoaCredenciais.containsKey(loginUsuario) && pessoaCredenciais.get(loginUsuario).equals(senhaUsuario)) {
                        System.out.println("\nLogin bem-sucedido!\n");

                        // Adicione o loop e as ações do menu de Pessoa aqui
                        while (true) {
                            // Menu de Pessoa
                            System.out.println("Menu de Pessoa:");
                            // Adicione as opções do menu de Pessoa aqui
                            // ...
                            System.out.print("Escolha uma opção (ou 0 para sair): ");
                            int opcaoPessoa = scanner.nextInt();
                            scanner.nextLine(); // Limpar o buffer de nova linha

                            if (opcaoPessoa == 0) {
                                break; // Sair do loop do menu de Pessoa
                            }

                            // Implemente as ações do menu de Pessoa aqui
                            // ...
                        }
                    } else {
                        System.out.println("\nLogin falhou. Credenciais inválidas.\n");
                    }
                    break;

                case 4:
                    System.out.print("Digite seu nome de usuário: ");
                    String loginUsuarioFuncionario = scanner.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senhaUsuarioFuncionario = scanner.nextLine();

                    // Verificar as credenciais de Funcionario
                    if (funcionarioCredenciais.containsKey(loginUsuarioFuncionario) && funcionarioCredenciais.get(loginUsuarioFuncionario).equals(senhaUsuarioFuncionario)) {
                        System.out.println("\nLogin bem-sucedido!\n");

                        // Adicione o loop e as ações do menu de Funcionario aqui
                        while (true) {
                            // Menu de Funcionario
                            System.out.println("Menu de Funcionario:");
                            // Adicione as opções do menu de Funcionario aqui
                            // ...
                            System.out.print("Escolha uma opção (ou 0 para sair): ");
                            int opcaoFuncionario = scanner.nextInt();
                            scanner.nextLine(); // Limpar o buffer de nova linha

                            if (opcaoFuncionario == 0) {
                                break; // Sair do loop do menu de Funcionario
                            }

                            // Implemente as ações do menu de Funcionario aqui
                            // ...
                        }
                    } else {
                        System.out.println("\nLogin falhou. Credenciais inválidas.\n");
                    }
                    break;

                case 5:
                    // Código para sair do programa
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
