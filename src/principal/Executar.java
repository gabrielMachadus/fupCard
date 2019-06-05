/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Controller.ControllerPessoa;
import Model.CartaoCredito;
import Model.CartaoDebito;
import Model.Pessoa;
import View.vCadPessoa;
import View.vMenu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel.Machado
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList clientes = new ArrayList<Pessoa>();
        
        //cria uma lista generica para teste
        clientes = ControllerPessoa.preencherLista();
        
        //mostra toda lista
        String vlr = ControllerPessoa.mostrarLista(clientes);
       
        
        
        
        //cria dois objetos pessoa se baseando em um objetos da lista "clientes"
        Pessoa p1 = (Pessoa) clientes.get(0);
        Pessoa p2 = (Pessoa) clientes.get(1);
        //Cria os objetos cartão de credito e debito
        /*   0: "Elo";
             1: "Visa";
             2: "Mastercard";
             3: "American Express";
             4: "Hipercard";
             5: "Diners Club";
        */
        /*CartaoDebito cd1 = new CartaoDebito( p1, 1, 400);
        CartaoDebito cd2 = new CartaoDebito( p1, 1, 5000);
        CartaoCredito cc1 = new CartaoCredito(p1, 2, 3000);
        CartaoCredito cc2 = new CartaoCredito(p1, 2, 500);
        //CartaoDebito cd2 = new CartaoDebito("4562.5432.1235.0012", p2, 2, 1060);
        /*
        //mostra informaçoes dos cartões
        JOptionPane.showMessageDialog(null,cd1.toString());
        JOptionPane.showMessageDialog(null,cd2.toString());
        JOptionPane.showMessageDialog(null,cc1.toString());
        JOptionPane.showMessageDialog(null,cc2.toString());
        //JOptionPane.showMessageDialog(null,cd2.toString());*/
        vMenu menu = new vMenu();
        menu.setVisible(true);
    }
    
   
    
}
