package prova2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import prova1.Musica;

public class CadastroApp {
    public static void main(String[] args) {
    
    // Instanciando três transações a partir do método construtor cheio previamente criado
        Transacao transacao1 = new Transacao(001, "Saque", 500, LocalDateTime.now(), "Cancelada");
        Transacao transacao2 = new Transacao(002, "Depósito", 2500, LocalDateTime.now(), "Bem-sucedida");
        Transacao transacao3 = new Transacao(003, "Transferência", 1689, LocalDateTime.now(), "Reembolsado");

    // Declarando e instanciando uma conta bancária
        ContaBancaria conta = new ContaBancaria(0001_110023, "John Doe dos Santos", "02394122", "0001/00", 109789, 24567.00, "Corrente", List.of(transacao1, transacao2, transacao3));
    
        System.out.println("\n\n============== C O N T A   B A N C Á R I A ==============");
        System.out.println("\n-> ID : " + conta.id);
        System.out.println("-> TITULAR : " + conta.titular);
        System.out.println("-> NÚMERO : " + conta.numero);
        System.out.println("-> AGÊNCIA : " + conta.agencia);
        System.out.println("-> SALDO : " + conta.saldo);
        System.out.println("-> LIMITE : " + conta.limite);
        System.out.println("-> CORRENTE : " + conta.tipo); 
        System.out.println("\n============== T R A N S A Ç Õ E S ==============");

        for(Transacao transacoes: conta.transacoes){

            System.out.println("\n-> ID : " + transacoes.id);
            System.out.println("-> SAQUE : " + transacoes.tipo);
            System.out.println("-> VALOR : " + transacoes.valor);
            System.out.println("-> DATA E HORA : " + transacoes.dataHora);
            System.out.println("-> STATUS : " + transacoes.status); 
        }
        System.out.println("\n\n\n");
    }
}
