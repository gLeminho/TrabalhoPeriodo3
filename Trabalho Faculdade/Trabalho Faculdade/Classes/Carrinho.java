package Classes;

public class Carrinho {
    private String nomeUsusario = "";
    private Double precoTotal = 0.00;
    private Double filmePreco = 15.00;
    private double refrigerante = 5;
    private int quantidadeFilmes = 0;
    private int quantidadeRefrigerantes = 0;

    
    public String getNomeUsuario() {
        return nomeUsusario;
    }
    public void setNome(String nome) {
        this.nomeUsusario = nome;
    }
    public Double getPrecoTotal() {
        return precoTotal;
    }
    public void PrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    public Double getFilmePreco() {
        return filmePreco;
    }
    public void setFilmePreco(Double filmePreco) {
        this.filmePreco = filmePreco;
    }
    public double getRefrigerante() {
        return refrigerante;
    }
    public void setRefrigerante(double refrigerante) {
        this.refrigerante = refrigerante;
    }
    public int getQuantidadeFilmes() {
        return quantidadeFilmes;
    }
    public void setQuantidadeFilmes(int quantidadeFilmes) {
        this.quantidadeFilmes += quantidadeFilmes;
        CalcularPrecoTotal();
    }
    public int getQuantidadeRefrigerantes() {
        return quantidadeRefrigerantes;
    }
    public void setQuantidadeRefrigerantes(int quantidadeRefrigerantes) {
        this.quantidadeRefrigerantes += quantidadeRefrigerantes;
        CalcularPrecoTotal();
    }
    public void CalcularPrecoTotal(){
        this.precoTotal = (quantidadeRefrigerantes * refrigerante) + (quantidadeFilmes * filmePreco);
    }
    
}
