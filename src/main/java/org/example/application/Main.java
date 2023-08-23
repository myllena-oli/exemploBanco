package org.example.application;

import org.example.service.ConsoleInput;
import org.example.service.GravarPessoaService;
import org.example.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);
        GravarPessoaService gravarPessoaService = applicationContext.getBean(GravarPessoaService.class);
        ConsoleInput consoleInput = applicationContext.getBean(ConsoleInput.class);

        Pessoa pessoa = consoleInput.lerPessoaDoConsole();
        Long id = gravarPessoaService.gravarPessoa(pessoa);
        System.out.println("Pessoa gravada com sucesso com ID: " + id);
    }

}