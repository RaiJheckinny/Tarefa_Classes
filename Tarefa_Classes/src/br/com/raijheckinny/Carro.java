package br.com.raijheckinny;

import javax.swing.text.Style;

public class Carro {
    private String nome;
    private int velocidadeAtual;
    private int velocidadeMax;
    private int anoFabricacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    //Liga o Carro
    public void ligarCarro(){
        System.out.println("Ligando Carro");
        imprimirVelocidadeAtual();
    }
    //Acelerar o veiculo uma quantidade
    public void acelerar(int quantidade){
        if (this.velocidadeAtual > quantidade){
            System.out.println("Erro Velocidade Invalida");
        }
        if (this.velocidadeAtual <= quantidade){
            System.out.println("Velocidade Aumentada em " + quantidade);
            this.velocidadeAtual = this.velocidadeAtual + quantidade;
            imprimirVelocidadeAtual();
        }

    }
    //Desacelerar o veiculo uma quantidade
    public void desacelerar(int quantidade){
        if (this.velocidadeAtual < quantidade){
            System.out.println("Erro Velocidade Invalida");
        }

        if (this.velocidadeAtual >= quantidade){
            System.out.println("Velocidade Reduzida em " + quantidade);
            this.velocidadeAtual = this.velocidadeAtual - quantidade;
            imprimirVelocidadeAtual();
        }
    }

    //Imprimir Velocidade Atual
    public void imprimirVelocidadeAtual(){
        if (this.velocidadeAtual == 0){
            System.out.println("Veiculo Parado");
        }
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);

    }
}
