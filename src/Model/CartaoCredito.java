/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gabriel.Machado
 */
public class CartaoCredito extends Cartao{
     public CartaoCredito( Pessoa cliente, int bandeira, double limite) {
        super( cliente, bandeira, limite);
        super.setTaxa(calcula_taxa());
    }    

    @Override
    public double calcula_taxa() {
        if(super.getLimite()>1000){
          super.setTaxa(5);
        }else{
          super.setTaxa(2);
        }
        return  super.getTaxa();
    }
    
    @Override
    public String toString() {
        return "\nInformações do Cartão de Crédito:" + "\nNúmero : " + this.getNumero_cartao()
                + "\nBandeira: " + super.mostraBandeira(this.getBandeira()) 
                + "     Taxa: " + this.getTaxa() 
                + "%    Limite: R$ " + this.getLimite() 
                + "\n\nInformações do Cliente: " + this.getCliente();
    }
    
}