/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import Classes.*;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import sun.org.mozilla.javascript.internal.regexp.SubString;


/**
 *
 * @author aluno
 */
public class TelaCadastroUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuarios
     */
    public TelaCadastroUsuarios() {
        initComponents();
        lbl_01.setVisible(false);
        lbl_02.setVisible(false);
        lbl_03.setVisible(false);
        //lbl_senha.setVisible(false);
    }
   
   
        public void setCampoVermelho(JLabel Campo)
        {
           Campo.setForeground(Color.RED);
        }
        
        public void SetCampoPreto(JLabel Campo)
        {
            Campo.setForeground(Color.BLACK);
        }
    
    public boolean ValidaCadastro()
    {
        boolean valida = false;
        /*
         * Validação Individual, Retornando o Validade de Cada Teste
         */
        
        // Validação do CPF
        String vCPF;
        vCPF = tbx_cpf.getText();
        boolean CPFValidado = false;
        CPFValidado = VerificaNumeros(vCPF,"CPF");
                
        // Validação do RG
        String vRG;
        vRG = tbx_RG.getText();
        boolean RGValidado = false;
        RGValidado = VerificaNumeros(vRG,"RG");
        
        // Validação do CEP
        String vCEP;
        vCEP =  tbx_CEP.getText();
        boolean CEPValidado = false;
        CEPValidado = VerificaNumeros(vCEP,"CEP");
       
        /*
         * Verificação de campos que não podem estar em branco
         */
        
        // Validação do NOME
        String vNome = tbx_nome.getText();
        boolean NOMEValidado = false;
        NOMEValidado = VerificaString(vNome,"NOME");
        
        // Validação Cidade
        String vCidade = tbx_cidade.getText();
        boolean CIDADEValidado = false;
        CIDADEValidado = VerificaString(vCidade, "CIDADE");
        
        // Validação UF
        String vUF = tbx_UF.getText();
        boolean UFValidado = false;
        UFValidado = VerificaString(vUF, "UF");
        
        // Validação Email
        String vEmail = tbx_email.getText();
        boolean EmailValidado = false;
        EmailValidado = VerificaString(vEmail, "E-Mail");
        /*
         * Validação GERAL
         */
        if (CPFValidado == true && RGValidado == true && CEPValidado == true && NOMEValidado == true && CIDADEValidado == true && UFValidado == true && EmailValidado == true)
        {
            valida = true;
        }
        else
        {
            valida = false;
        }

        return valida;

    }
    
    /*
     * 
     * Validação dos Campos Apenas Números
     * 
     */
    public boolean VerificaNumeros(String validaNum, String idVerificacao)
    {
        boolean validou = false;
        
        if(validaNum.length() < 1 || validaNum == null)
        {
            validou = false;  
        }
        for (char letra : validaNum.toCharArray())  
            if(letra < '0' || letra > '9')
            {
                validou = false;
                break;
            }
            else
            {
                validou = true;
            }
        switch(idVerificacao)
        {
            case "CPF":
            {
                if (validaNum.length() < 11)
                {
                    validou = false;
                }
                else if(validaNum.length() > 11)
                {
                    validou = false;
                }
                else
                {
                    validou = true;
                }
            }
                
            case "RG":
            {
                if(validaNum.length() < 10)
                {
                    validou = false;
                }
                else if(validaNum.length() > 10)
                {
                    validou = false;
                }
                else
                {
                    validou = true;
                }
            }
            
            case "CEP":
            {
                if(validaNum.length() < 8)
                {
                    validou = false;
                }
                else if(validaNum.length() > 8)
                {
                    validou = false;
                }
                else
                {
                    validou = true;
                }
            }
                    
                        
                    
        }
        
        if (validou == false)
        {
            switch(idVerificacao)
            {
                case "CPF":
                {
                    setCampoVermelho(lbl_CPF);
                }
                case "RG":
                {
                    setCampoVermelho(lbl_RG);
                }
                    
                case "CEP":
                {
                    setCampoVermelho(lbl_CEP); 
                }
            }
          
        }
        else
        {
            
            switch(idVerificacao)
            {
                case "CPF":
                {
                    SetCampoPreto(lbl_CPF);
                }
                case "RG":
                {
                    SetCampoPreto(lbl_RG);
                }
                    
                case "CEP":
                {
                    SetCampoPreto(lbl_CEP); 
                }
            }
           
        }
        
        
        return validou;
        
    }
    
    /*
     * Verificação de Campos Obrigatórios que não podem estar vazios
     */
    
    public boolean VerificaString(String verifica, String idVerificacao)
    {
        boolean retorno = false;
        if(verifica.length() < 1)
        {
            retorno =  false;
        }
        else
        {
            retorno = true;
        }
        System.out.println(idVerificacao);
        if (retorno == false)
        {
            switch(idVerificacao)
            {
                case "CPF":
                {
                    setCampoVermelho(lbl_CPF);
                }
                case "RG":
                {
                    setCampoVermelho(lbl_RG);
                }
                case "NOME":
                {
                    setCampoVermelho(lbl_nome);
                }
                
                case "CIDADE":
                {
                    setCampoVermelho(lbl_cidade);
                }
                    
                case "UF":
                {
                    setCampoVermelho(lbl_UF);
                }
                case "E-Mail":
                {
                    setCampoVermelho(lbl_Email);
                }
                
                
            }
          
           
        }
        else
        {
           switch(idVerificacao)
            {
                case "NOME":
                {
                    SetCampoPreto(lbl_nome);
                }
                
                case "CIDADE":
                {
                    SetCampoPreto(lbl_cidade);
                }
                    
                case "UF":
                {
                    SetCampoPreto(lbl_UF);
                }
                case "E-Mail":
                {
                    SetCampoPreto(lbl_Email);
                }
                
                
            }  
        }
        
        return retorno;
    }
    
    
    public void SetSenha(String cpf)
    {
        if (cpf.length() < 1)
        {
            JOptionPane.showMessageDialog(null, "Campo CPF não pode estar vazio!");
            tbx_cpf.setFocusCycleRoot(true);
        }
        else if (cpf.length() < 11)
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o CPF para definir a senha!");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Senha definida com sucesso!");
            lbl_senha.setText(cpf);
        }
    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Frm_UserGen = new javax.swing.JInternalFrame();
        lbl_nome = new javax.swing.JLabel();
        tbx_nome = new javax.swing.JTextField();
        lbl_CPF = new javax.swing.JLabel();
        tbx_cpf = new javax.swing.JTextField();
        lbl_RG = new javax.swing.JLabel();
        tbx_RG = new javax.swing.JTextField();
        lbl_cidade = new javax.swing.JLabel();
        tbx_cidade = new javax.swing.JTextField();
        lbl_UF = new javax.swing.JLabel();
        tbx_UF = new javax.swing.JTextField();
        lbl_CEP = new javax.swing.JLabel();
        tbx_CEP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tbx_pais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbx_nomeMae = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tbx_bairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tbx_rua = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        tbx_email = new javax.swing.JTextField();
        lbl_01 = new javax.swing.JLabel();
        lbl_02 = new javax.swing.JLabel();
        lbl_03 = new javax.swing.JLabel();
        tbx_cpfGerado = new javax.swing.JInternalFrame();
        tbx_numCartao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        tbx_numCartaoGerado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tbx_ufCartaoGerado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tbx_validadeGerada = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tbx_SaldoCartao = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btn_definirSenha = new javax.swing.JButton();
        lbl_senha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("LOTUS - SISTEMA");

        jLabel2.setText("Cadastro de Usuários");

        Frm_UserGen.setTitle("                                       User Generator v1.0");
        Frm_UserGen.setVisible(true);

        lbl_nome.setText("Nome:");

        tbx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_nomeActionPerformed(evt);
            }
        });
        tbx_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_nomeKeyPressed(evt);
            }
        });

        lbl_CPF.setText("CPF:");

        tbx_cpf.setToolTipText("Informe o CPF sem pontos");
        tbx_cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_cpfKeyPressed(evt);
            }
        });

        lbl_RG.setText("RG:");

        tbx_RG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_RGKeyPressed(evt);
            }
        });

        lbl_cidade.setText("Cidade:");

        tbx_cidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_cidadeKeyPressed(evt);
            }
        });

        lbl_UF.setText("UF");

        tbx_UF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_UFKeyPressed(evt);
            }
        });

        lbl_CEP.setText("CEP:");

        tbx_CEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_CEPKeyPressed(evt);
            }
        });

        jLabel9.setText("PAÍS:");

        tbx_pais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_paisKeyPressed(evt);
            }
        });

        jLabel10.setText("Nome da Mãe:");

        tbx_nomeMae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_nomeMaeKeyPressed(evt);
            }
        });

        jLabel11.setText("Bairro:");

        tbx_bairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_bairroKeyPressed(evt);
            }
        });

        jLabel12.setText("Rua:");

        tbx_rua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_ruaKeyPressed(evt);
            }
        });

        lbl_Email.setText("Email:");

        tbx_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbx_emailKeyPressed(evt);
            }
        });

        lbl_01.setText("Campos em");

        lbl_02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_02.setForeground(new java.awt.Color(255, 0, 0));
        lbl_02.setText("vermelho");

        lbl_03.setText("contem algum erro !");

        javax.swing.GroupLayout Frm_UserGenLayout = new javax.swing.GroupLayout(Frm_UserGen.getContentPane());
        Frm_UserGen.getContentPane().setLayout(Frm_UserGenLayout);
        Frm_UserGenLayout.setHorizontalGroup(
            Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frm_UserGenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Frm_UserGenLayout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_nome))
                    .addGroup(Frm_UserGenLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_nomeMae))
                    .addGroup(Frm_UserGenLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_rua))
                    .addGroup(Frm_UserGenLayout.createSequentialGroup()
                        .addComponent(lbl_Email)
                        .addGap(10, 10, 10)
                        .addComponent(tbx_email))
                    .addGroup(Frm_UserGenLayout.createSequentialGroup()
                        .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Frm_UserGenLayout.createSequentialGroup()
                                    .addComponent(lbl_CPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbx_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Frm_UserGenLayout.createSequentialGroup()
                                    .addComponent(lbl_RG)
                                    .addGap(18, 18, 18)
                                    .addComponent(tbx_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Frm_UserGenLayout.createSequentialGroup()
                                    .addComponent(lbl_cidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_UF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Frm_UserGenLayout.createSequentialGroup()
                                    .addComponent(lbl_CEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_pais))
                                .addGroup(Frm_UserGenLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_bairro)))
                            .addGroup(Frm_UserGenLayout.createSequentialGroup()
                                .addComponent(lbl_01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_02)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_03)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Frm_UserGenLayout.setVerticalGroup(
            Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frm_UserGenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_01)
                    .addComponent(lbl_02)
                    .addComponent(lbl_03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(tbx_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CPF)
                    .addComponent(tbx_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_RG)
                    .addComponent(tbx_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cidade)
                    .addComponent(tbx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_UF)
                    .addComponent(tbx_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CEP)
                    .addComponent(tbx_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tbx_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tbx_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tbx_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tbx_nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frm_UserGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email)
                    .addComponent(tbx_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbx_cpfGerado.setTitle("                       Card Number Generator v1.0");
        tbx_cpfGerado.setToolTipText("");
        tbx_cpfGerado.setVisible(true);

        tbx_numCartao.setEditable(false);

        jButton1.setText("Gerar Cartão");

        jLabel16.setText("Número do Cartão:");

        tbx_numCartaoGerado.setEditable(false);

        jLabel17.setText("UF:");

        tbx_ufCartaoGerado.setEditable(false);

        jLabel18.setText("Validade:");

        tbx_validadeGerada.setEditable(false);

        jLabel19.setText("CPF do Usuário:");

        jTextField1.setEditable(false);

        jLabel20.setText("Saldo:");

        tbx_SaldoCartao.setEditable(false);

        javax.swing.GroupLayout tbx_cpfGeradoLayout = new javax.swing.GroupLayout(tbx_cpfGerado.getContentPane());
        tbx_cpfGerado.getContentPane().setLayout(tbx_cpfGeradoLayout);
        tbx_cpfGeradoLayout.setHorizontalGroup(
            tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_numCartaoGerado))
                    .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                        .addComponent(tbx_numCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                        .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_ufCartaoGerado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_validadeGerada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_SaldoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tbx_cpfGeradoLayout.setVerticalGroup(
            tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbx_cpfGeradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbx_numCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbx_numCartaoGerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tbx_ufCartaoGerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tbx_validadeGerada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbx_cpfGeradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tbx_SaldoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        btn_cadastrar.setText("CADASTRAR USUÁRIO");
        btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarMouseClicked(evt);
            }
        });

        jInternalFrame1.setTitle("Password Setter v1.0");
        jInternalFrame1.setVisible(true);

        btn_definirSenha.setText("Definir Senha");
        btn_definirSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_definirSenhaMouseClicked(evt);
            }
        });

        lbl_senha.setText("jLabel3");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_senha)
                    .addComponent(btn_definirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_definirSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_senha)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Frm_UserGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbx_cpfGerado)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Frm_UserGen)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbx_cpfGerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Frm_UserGen.getAccessibleContext().setAccessibleDescription("Cadastrar Usuários e gerador de Número de Cartão");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbx_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_nomeActionPerformed
        String cpf;
        cpf = tbx_cpf.getText();
        if (cpf.length() > 11)
        {
            cpf = cpf.substring(11);
            tbx_cpf.setText(cpf);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tbx_nomeActionPerformed

    private void btn_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarMouseClicked
    boolean verifica = ValidaCadastro();

    if (verifica == true)
    {
        lbl_01.setVisible(false);
        lbl_02.setVisible(false);
        lbl_03.setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "Usuário Cadastrado com sucesso!");
        dispose();
        /*
         *  TODO Gravação do Novo Usuário
         */
    }
    else
    {
         lbl_01.setVisible(true);
         lbl_02.setVisible(true);
         lbl_03.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Erro ao Cadastrar o usuário!");
    }
    }//GEN-LAST:event_btn_cadastrarMouseClicked

    private void btn_definirSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_definirSenhaMouseClicked
        SetSenha(tbx_cpf.getText());
    }//GEN-LAST:event_btn_definirSenhaMouseClicked

    private void tbx_cpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_cpfKeyPressed
        String cpf;
        cpf = tbx_cpf.getText();
        if (cpf.length() > 10)
        {
            cpf = cpf.substring(1,11);
            tbx_cpf.setText(cpf);

        }
    }//GEN-LAST:event_tbx_cpfKeyPressed

    private void tbx_RGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_RGKeyPressed
        String rg;
        rg = tbx_RG.getText();
        if (rg.length() > 9)
        {
            rg = rg.substring(1,10);
            tbx_RG.setText(rg);
        }
    }//GEN-LAST:event_tbx_RGKeyPressed

    private void tbx_nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_nomeKeyPressed
        String nome;
        nome = tbx_nome.getText();
        if (nome.length() > 39)
        {
            nome = nome.substring(1,40);
            tbx_nome.setText(nome);
        }    
        
    }//GEN-LAST:event_tbx_nomeKeyPressed

    private void tbx_cidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_cidadeKeyPressed
            String cidade;
        cidade = tbx_cidade.getText();
        if (cidade.length() > 24)
        {
            cidade = cidade.substring(1,25);
            tbx_cidade.setText(cidade);
        }    
            
    }//GEN-LAST:event_tbx_cidadeKeyPressed

    private void tbx_paisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_paisKeyPressed
                String pais;
        pais = tbx_pais.getText();
        if (pais.length() > 19)
        {
            pais = pais.substring(1,20);
            tbx_pais.setText(pais);
        }         
    }//GEN-LAST:event_tbx_paisKeyPressed

    private void tbx_ruaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_ruaKeyPressed
        String rua;
        rua = tbx_rua.getText();
        if (rua.length() > 39)
        {
            rua = rua.substring(1,40);
            tbx_rua.setText(rua);
        }                // TODO add your handling code here:
    }//GEN-LAST:event_tbx_ruaKeyPressed

    private void tbx_nomeMaeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_nomeMaeKeyPressed
            String mae;
        mae = tbx_nomeMae.getText();
        if (mae.length() > 34)
        {
            mae = mae.substring(1,35);
            tbx_nomeMae.setText(mae);
        }
    }//GEN-LAST:event_tbx_nomeMaeKeyPressed

    private void tbx_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_emailKeyPressed
                 String email;
        email = tbx_email.getText();
        if (email.length() > 39)
        {
            email = email.substring(1,40);
            tbx_email.setText(email);
        }
    }//GEN-LAST:event_tbx_emailKeyPressed

    private void tbx_UFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_UFKeyPressed
                    String uf;
        uf = tbx_UF.getText();
        if (uf.length() > 1)
        {
            uf = uf.substring(1,2);
            tbx_UF.setText(uf);
        }
    }//GEN-LAST:event_tbx_UFKeyPressed

    private void tbx_CEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_CEPKeyPressed
       String cep;
        cep = tbx_CEP.getText();
        if (cep.length() > 7)
        {
            cep = cep.substring(1,8);
            tbx_CEP.setText(cep);
        }
    }//GEN-LAST:event_tbx_CEPKeyPressed

    private void tbx_bairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_bairroKeyPressed
          String bairro;
        bairro = tbx_bairro.getText();
        if (bairro.length() > 34)
        {
            bairro = bairro.substring(1,35);
            tbx_bairro.setText(bairro);
        }
    }//GEN-LAST:event_tbx_bairroKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus lok and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Frm_UserGen;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_definirSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_01;
    private javax.swing.JLabel lbl_02;
    private javax.swing.JLabel lbl_03;
    private javax.swing.JLabel lbl_CEP;
    private javax.swing.JLabel lbl_CPF;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_RG;
    private javax.swing.JLabel lbl_UF;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JTextField tbx_CEP;
    private javax.swing.JTextField tbx_RG;
    private javax.swing.JTextField tbx_SaldoCartao;
    private javax.swing.JTextField tbx_UF;
    private javax.swing.JTextField tbx_bairro;
    private javax.swing.JTextField tbx_cidade;
    private javax.swing.JTextField tbx_cpf;
    private javax.swing.JInternalFrame tbx_cpfGerado;
    private javax.swing.JTextField tbx_email;
    private javax.swing.JTextField tbx_nome;
    private javax.swing.JTextField tbx_nomeMae;
    private javax.swing.JTextField tbx_numCartao;
    private javax.swing.JTextField tbx_numCartaoGerado;
    private javax.swing.JTextField tbx_pais;
    private javax.swing.JTextField tbx_rua;
    private javax.swing.JTextField tbx_ufCartaoGerado;
    private javax.swing.JTextField tbx_validadeGerada;
    // End of variables declaration//GEN-END:variables
}
