/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Carro {

    String tipo;
    String cor;
    String placa;
    int numPortas;

    void imprimeDadosDoCarro() {
        System.out.println("--------CARRO-------");
        System.out.println("cor:" + cor);
        System.out.println("N° Portas:" + numPortas);
        System.out.println("PLACA:" + placa);
        System.out.println("Modelo" + tipo);

          
    }

    public String getTipo() {
        return tipo;

    }

    public void setTipo(String Tipo) {
        this.tipo = tipo;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.cor = cor;

    }

    public String getPlaca() {
        return placa;

    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public int getnumPortas() {
        return numPortas;

    }

    public void setnumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
