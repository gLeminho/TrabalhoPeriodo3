package Classes;

import java.time.LocalDate;


public class LocacaoFilme {
    private int id;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private String clienteNome;
    private double valorTotal;

    // Construtor
    public LocacaoFilme(int id, LocalDate dataLocacao, LocalDate dataDevolucao, String clienteNome,double valorTotal) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.clienteNome = clienteNome;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

