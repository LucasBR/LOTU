/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.*;  
import java.lang.*;  
import java.net.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MensagemLogSistema 
{
    String Mensagem;
    String Nome_PC;
    String codigo;
    
    
    public MensagemLogSistema(String cod) throws UnknownHostException
    {
        gravaMensagem(cod);
    }
    
    
    public void gravaMensagem(String cod) throws UnknownHostException
    {
        switch(cod)
        {
            /*
             * Erro no Login
             */
            case "01L":
            {
                    this.codigo = cod;
                    this.Nome_PC = InetAddress.getLocalHost().getHostName();
                    this.Mensagem = "Erro na Tentativa de Login\r\nCódigo: "+codigo+"\r\nComputador: "+Nome_PC;
                
            }
        }
    }
    
}
