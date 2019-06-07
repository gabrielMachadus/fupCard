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
public class Pessoa {
   
   private String nome = "ex: João Carlos Amadeu";
   private String endereco = "ex: Rua exemplo, 300, Inconfidencia, Porto do Sol - RS";
   private String cpf = "000.000.000-00";
   private String rg="11234567890";
   private String telefone="(00)000-000-000";

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa() {
    }
    
    public Pessoa(String nome,String endereco,String cpf,String rg,String telefone) {
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;    
    }
    
   @Override
    public String toString() {
        return "\nNome: "+this.getNome()
                +"\nCPF: "+this.getCpf()
                +"   RG: "+this.getRg()
                +"\nEndereço: "+this.getEndereco()
                +"   Telefone: "+this.getTelefone();
    }
    
   
   
}
