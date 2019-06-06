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
public class Cartao {
    private String numero_cartao;
    private Pessoa cliente;
    private int bandeira = 1; //Padrão Visa
    private double taxa;
    private double limite = 500;
    
  
    /**
     *
     * @param codigo - código da bandeira
     * @return - nome da bandeir
     */
    public String mostraBandeira(int codigo){
        switch(codigo){
            case 1:
                return "Elo";
            case 2:
                return "Visa";
            case 3:
                return "Mastercard";
            case 4:
                return "American Express";
            case 5:
                return "Hipercard";
            case 6:
                return "Diners Club";
        }
        return "Selecione uma Bandeira Válida!"; 
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public int getBandeira() {
        return bandeira;
    }

    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double calcula_taxa(){
        return 0;
    }
    public Cartao(Pessoa cliente, int bandeira, double limite) {
        this.numero_cartao = geraNumCartao();
        this.cliente = cliente;
        this.bandeira = bandeira;
        this.taxa = 0;
        this.limite = limite;
    }
    
    /**
     * Este metodo gera o numero do cartão aleatóriamente
     * @return 
     */
    private String geraNumCartao(){
        String n = "";
        for (int i = 0; i < 16; i++) {
            int numAleatorio = (int)(Math.random() * 9 ) + 1;
            n+=numAleatorio;
        }       
        return n;
    }

    /**
     *este metodo traz as informações do objeto formatadas
     * @return informações do objeto cartão
     */
    @Override
    public String toString() {
        return "\nInformações do Cartão:" + "\nNúmero : " + this.getNumero_cartao()
                + "\nBandeira: " + mostraBandeira(this.getBandeira()) 
                + "     Taxa: " + this.getTaxa() 
                + "%    Limite: R$ " + this.getLimite() 
                + "\n\nInformações do Cliente: " + this.getCliente();
    }
    
    
    
    
}
