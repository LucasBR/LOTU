/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import Classes.*;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;


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
   
   
        public void setCampoVermelho()
        {
            lbl_nome.setForeground(Color.RED);
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
        NOMEValidado = VerificaString(vNome,"Nome");
        
        // Validação Cidade
        String vCidade = tbx_cidade.getText();
        boolean CIDADEValidado = false;
        CIDADEValidado = VerificaString(vCidade, "Cidade");
        
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
        
        if(validaNum == null)
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
        
        if (validou == false)
        {
            switch(idVerificacao)
            {
                case "CPF":
                {
                  setCampoVermelho();  
                }
            }
           
        }
        else
        {
           
        }
        
        
        return validou;
        
    }
    
    /*
     * Verificação de Campos Obrigatórios que não podem estar vazios
     */
    
    public boolean VerificaString(String verifica, String idVerificacao)
    {
        boolean retorno = false;
        if(verifica == null)
        {
            retorno =  false; 
        }
        else
        {
            retorno = true;
        }
        
        if (retorno == false)
        {
          
           
        }
        else
        {
            
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
        lbl_Cidade = new javax.swing.JInternalFrame();
        lbl_nome = new javax.swing.JLabel();
        tbx_nome = new javax.swing.JTextField();
        lbl_CPF = new javax.swing.JLabel();
        tbx_cpf = new javax.swing.JTextField();
        lbl_RG = new javax.swing.JLabel();
        tbx_RG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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

        lbl_Cidade.setTitle("                                       User Generator v1.0");
        lbl_Cidade.setVisible(true);

        lbl_nome.setText("Nome:");

        tbx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_nomeActionPerformed(evt);
            }
        });

        lbl_CPF.setText("CPF:");

        tbx_cpf.setToolTipText("Informe o CPF sem pontos");

        lbl_RG.setText("RG:");

        jLabel6.setText("Cidade:");

        lbl_UF.setText("UF");

        lbl_CEP.setText("CEP:");

        jLabel9.setText("PAÍS:");

        jLabel10.setText("Nome da Mãe:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Rua:");

        lbl_Email.setText("Email:");

        lbl_01.setText("Campos em");

        lbl_02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_02.setForeground(new java.awt.Color(255, 0, 0));
        lbl_02.setText("vermelho");

        lbl_03.setText("contem algum erro !");

        javax.swing.GroupLayout lbl_CidadeLayout = new javax.swing.GroupLayout(lbl_Cidade.getContentPane());
        lbl_Cidade.getContentPane().setLayout(lbl_CidadeLayout);
        lbl_CidadeLayout.setHorizontalGroup(
            lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_CidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_CidadeLayout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_nome))
                    .addGroup(lbl_CidadeLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_nomeMae))
                    .addGroup(lbl_CidadeLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_rua))
                    .addGroup(lbl_CidadeLayout.createSequentialGroup()
                        .addComponent(lbl_Email)
                        .addGap(10, 10, 10)
                        .addComponent(tbx_email))
                    .addGroup(lbl_CidadeLayout.createSequentialGroup()
                        .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(lbl_CidadeLayout.createSequentialGroup()
                                    .addComponent(lbl_CPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbx_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl_CidadeLayout.createSequentialGroup()
                                    .addComponent(lbl_RG)
                                    .addGap(18, 18, 18)
                                    .addComponent(tbx_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl_CidadeLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_UF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl_CidadeLayout.createSequentialGroup()
                                    .addComponent(lbl_CEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_pais))
                                .addGroup(lbl_CidadeLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_bairro)))
                            .addGroup(lbl_CidadeLayout.createSequentialGroup()
                                .addComponent(lbl_01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_02)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_03)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lbl_CidadeLayout.setVerticalGroup(
            lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_CidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_01)
                    .addComponent(lbl_02)
                    .addComponent(lbl_03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(tbx_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CPF)
                    .addComponent(tbx_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_RG)
                    .addComponent(tbx_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tbx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_UF)
                    .addComponent(tbx_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CEP)
                    .addComponent(tbx_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tbx_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tbx_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tbx_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tbx_nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_CidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap(139, Short.MAX_VALUE))
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Cidade)
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
                    .addComponent(lbl_Cidade)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbx_cpfGerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lbl_Cidade.getAccessibleContext().setAccessibleDescription("Cadastrar Usuários e gerador de Número de Cartão");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbx_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_nomeActionPerformed
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_01;
    private javax.swing.JLabel lbl_02;
    private javax.swing.JLabel lbl_03;
    private javax.swing.JLabel lbl_CEP;
    private javax.swing.JLabel lbl_CPF;
    private javax.swing.JInternalFrame lbl_Cidade;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_RG;
    private javax.swing.JLabel lbl_UF;
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
