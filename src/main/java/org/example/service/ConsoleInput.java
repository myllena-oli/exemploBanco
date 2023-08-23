package org.example.service;

import org.example.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public Pessoa lerPessoaDoConsole() {
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o e-mail da pessoa:");
        String email = scanner.nextLine();

        System.out.println("Digite o CPF da pessoa:");
        String cpf = scanner.nextLine();

        return new Pessoa(nome, email, cpf);
    }
}
