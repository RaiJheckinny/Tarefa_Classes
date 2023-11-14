package br.com.raijheckinny;

public class TestCarro {
    public static void main(String arg[]){

        Carro carro = new Carro();
        Marca marca = new Marca();

        //Setando Atributos de Carro
        carro.setNome("Chevrolet Onix");
        carro.setAnoFabricacao(2010);
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMax(120);

        //Setando Atributos de Marca
        marca.setNome("Chevrolet");
        marca.setFundada(1911);

        //Funcionamento Do Carro
        carro.ligarCarro();
        carro.acelerar(40);
        carro.desacelerar(30);
        carro.desacelerar(10);
    }
}
