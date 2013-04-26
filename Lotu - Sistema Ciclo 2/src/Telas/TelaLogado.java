/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import Telas.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 *
 * @author Rafael Zurawski
 */
public class TelaLogado extends javax.swing.JFrame {
    String login;
    String RI;
   

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaLogado(String logado, String reg) {
        initComponents();
        Logado.setText(logado);
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        tbxNumCartao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tbx_comprovante = new javax.swing.JTextField();
        tbx_quantPassagehs = new javax.swing.JTextField();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        Logado = new javax.swing.JTextField();
        tbx_deslogar = new javax.swing.JButton();
        btn_trocarSenha = new javax.swing.JButton();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        tbx_cadastraUsuario = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        tbx_gerarRecarga = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tbx_gerarRecargaCartao = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        jDialog1.setTitle("Operação Concluída!");

        org.jdesktop.layout.GroupLayout jDialog1Layout = new org.jdesktop.layout.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lotus - EPR");
        setBounds(new java.awt.Rectangle(0, 0, 462, 479));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(470, 500));
        setMinimumSize(new java.awt.Dimension(470, 500));
        setPreferredSize(new java.awt.Dimension(538, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("LOTUS - Sistema");

        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setTitle("Recarga Cartão");
        jInternalFrame1.setVisible(true);

        jButton1.setText("Recarregar Cartão");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Número do Cartão");

        jLabel4.setText("Qnt. Passagens:");

        jLabel5.setText("Comprovante");

        tbx_quantPassagehs.setEditable(false);

        org.jdesktop.layout.GroupLayout jInternalFrame1Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel5)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tbx_quantPassagehs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, tbxNumCartao, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, tbx_comprovante))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tbx_comprovante, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tbxNumCartao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(tbx_quantPassagehs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jInternalFrame2.setVisible(true);

        jLabel2.setText("Logado Como:");

        Logado.setEditable(false);

        tbx_deslogar.setText("Deslogar");
        tbx_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbx_deslogarMouseClicked(evt);
            }
        });

        btn_trocarSenha.setText("Trocar Senha");

        org.jdesktop.layout.GroupLayout jInternalFrame2Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame2Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btn_trocarSenha)
                    .add(jInternalFrame2Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(Logado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tbx_deslogar)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jInternalFrame2Layout.createSequentialGroup()
                        .add(jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(Logado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(10, 10, 10)
                        .add(btn_trocarSenha, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, tbx_deslogar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jInternalFrame3.setTitle("Usuários");
        jInternalFrame3.setVisible(true);

        tbx_cadastraUsuario.setText("Cadastrar Usuário");
        tbx_cadastraUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbx_cadastraUsuarioMouseClicked(evt);
            }
        });

        tbx_gerarRecarga.setText("Pedido de Recarga");
        tbx_gerarRecarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbx_gerarRecargaMouseClicked(evt);
            }
        });

        jLabel6.setText("Número do Cartão");

        org.jdesktop.layout.GroupLayout jInternalFrame3Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jInternalFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tbx_cadastraUsuario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSeparator3)
                    .add(tbx_gerarRecarga, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jInternalFrame3Layout.createSequentialGroup()
                        .add(jLabel6)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(tbx_gerarRecargaCartao))
                .addContainerGap())
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .add(tbx_cadastraUsuario)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tbx_gerarRecargaCartao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tbx_gerarRecarga)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(jInternalFrame1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jInternalFrame3))
                                    .add(jInternalFrame2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(163, 163, 163)
                                .add(jLabel1))
                            .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 413, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 29, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jSeparator2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jInternalFrame2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jInternalFrame1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jInternalFrame3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (tbx_comprovante.getText().equals("111111111111111"))
        {
            if (tbxNumCartao.getText().equals("111111111"))
            {
                JOptionPane.showMessageDialog(null, "Cartão Carregado com sucesso!");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void tbx_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbx_deslogarMouseClicked
    dispose();
    TelaLogin login = new TelaLogin();
    login.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_tbx_deslogarMouseClicked

    private void tbx_gerarRecargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbx_gerarRecargaMouseClicked
     new Thread(new Runnable(){    

                    public void run() {
                        //setVisible(false);
                        TelaPedidoRecarga tela = new TelaPedidoRecarga();
                        tela.setVisible(true);
                        
                    }
    }).start();        // TODO add your handling code here:
    }//GEN-LAST:event_tbx_gerarRecargaMouseClicked

    private void tbx_cadastraUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbx_cadastraUsuarioMouseClicked
       new Thread(new Runnable(){    

                    public void run() {
                        //setVisible(false);
                        TelaCadastroUsuarios cad = new TelaCadastroUsuarios();
                        cad.setVisible(true);
                        
                    }
    }).start();        
    }//GEN-LAST:event_tbx_cadastraUsuarioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(final String logado, final String reg) {
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaLogado(logado,null).setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Logado;
    private javax.swing.JButton btn_trocarSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField tbxNumCartao;
    private javax.swing.JButton tbx_cadastraUsuario;
    private javax.swing.JTextField tbx_comprovante;
    private javax.swing.JButton tbx_deslogar;
    private javax.swing.JButton tbx_gerarRecarga;
    private javax.swing.JTextField tbx_gerarRecargaCartao;
    private javax.swing.JTextField tbx_quantPassagehs;
    // End of variables declaration//GEN-END:variables
}
