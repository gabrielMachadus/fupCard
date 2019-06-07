/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pessoa;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel.Machado
 */
public class ControllerPessoa {
    public static ArrayList<Pessoa> cadastrarPessoa(ArrayList<Pessoa> clientes){
        Pessoa p = new Pessoa();
        p.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente:",p.getNome()));
        p.setEndereco(JOptionPane.showInputDialog("Digite o Endereço:",p.getEndereco()));
        p.setRg(JOptionPane.showInputDialog("Digite o RG:",p.getRg()));
        p.setCpf(JOptionPane.showInputDialog("Digite o CPF:",p.getCpf()));
        p.setTelefone(JOptionPane.showInputDialog("Digite o telefone:",p.getTelefone()));
        clientes.add(p);
        return clientes;
    }
    
    public static ArrayList<Pessoa> AlterarPessoa(ArrayList<Pessoa> clientes,int indice){
        Pessoa p = new Pessoa();
        p = clientes.get(indice);
        p.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente:",p.getNome()));
        p.setEndereco(JOptionPane.showInputDialog("Digite o Endereço:",p.getEndereco()));
        p.setRg(JOptionPane.showInputDialog("Digite o RG:",p.getRg()));
        p.setCpf(JOptionPane.showInputDialog("Digite o CPF:",p.getCpf()));
        p.setTelefone(JOptionPane.showInputDialog("Digite o telefone:",p.getTelefone()));
        clientes.add(indice,p);
        return clientes;
    }
    
     public  ArrayList<Pessoa> RemoverPessoa(ArrayList<Pessoa> clientes){
        Pessoa p = new Pessoa();
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(mostrarLista(clientes)));
        p = clientes.get(codigo);
        clientes.remove(p);
        return clientes;
    }
     
     public  ArrayList<String> mostrarLista(ArrayList<Pessoa> clientes){
        ArrayList<String> dados = new ArrayList<String>();
        int i =0 ;
         for(Pessoa p: clientes){
            dados.add(i +" - "+ p.getNome());
            i++;
        }
        return dados;
     }
     
     
     
     public  ArrayList<Pessoa> preencherLista(){
         ArrayList<Pessoa> lista = new ArrayList<>();
         Pessoa p0 = new Pessoa("João Bernardo dos Santos", "Rua X, 1263, POA - RS", "833.543.000-63", "74455541559", "(51)342-999-999");
         Pessoa p1 = new Pessoa("Carlos Miguel Nascimento", "Rua Y, 1523, POA - RS", "312.000.234-63", "04431241559", "(51)654-999-999");
         Pessoa p2 = new Pessoa("Andrei Reis Machado", "Rua A, 1123, POA - RS", "123.123.000-63", "74452841559", "(51)999-123-999");
         Pessoa p3 = new Pessoa("Gabriel Machado da Silva", "Rua D, 1223, POA - RS", "543.423.000-63", "94455541559", "(51)123-234-999");
         Pessoa p4 = new Pessoa("Julia da Silva", "Rua XB, 12613, POA - RS", "033.000.645-63", "97455141549", "(51)999-345-999");
         lista.add(p0);
         lista.add(p1);
         lista.add(p2);
         lista.add(p3);
         lista.add(p4);
         return lista;
     }
    
}
