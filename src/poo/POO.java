package poo;

import java.util.Scanner;

class POO {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setCor("Preto");
        meuCarro.setnumPortas(4);
        meuCarro.setPlaca("ASDA-1232");
        meuCarro.setTipo("gol");

        meuCarro.imprimeDadosDoCarro();
        
        Pessoa Pessoa = new Pessoa ();
        
        Pessoa.setNome("Jose");
        Pessoa.setCorDoCabelo("Preto");
        Pessoa.setBioTipo("Magro");
        Pessoa.setIdade(23);
        
        imprimePessoa();
        
    }

}
