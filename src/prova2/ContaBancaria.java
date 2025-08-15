package prova2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    public int id;
    public String titular;
    public String numero;
    public String agencia;
    public double saldo;
    public double limite;
    public String tipo;
    public List<Transacao> transacoes = new ArrayList<>();

// Implementando o método construtor vazio da classe 'ContaBancaria'
    public ContaBancaria(){

    }

// Implementando o método construtor cheio da classe 'ContaBancaria'
    public ContaBancaria(int id, String titular, String numero, String agencia, double saldo, double  limite, String tipo, List<Transacao> transacoes){
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
        this.transacoes = transacoes;
    }
}
