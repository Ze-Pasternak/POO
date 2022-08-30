
package poo;
import java.util.Scanner;
 class POO {

   
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setnumPortas(4);
        meuCarro.setPlaca("ASDA-1232");
        meuCarro.setTipo("gol");
        
        System.out.println("--------CARRO-------");
        System.out.println("cor:" + meuCarro.getCor());
        System.out.println("N° Portas:" + meuCarro.getnumPortas());
        System.out.println("PLACA:" + meuCarro.getPlaca());
        System.out.println("Modelo" + meuCarro.getTipo());
        
        
    }
    
}
