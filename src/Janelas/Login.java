/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Modos.Administração.ModoAdministração;
import Modos.Root.ModoRoot;
import Modos.Tecnico.ModoTécnico;
import Objetos.Dados;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Custódio Quingumba
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form BoasVindas
     */
    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icones/figicon.png")).getImage());
        int i = new Random().nextInt(8);
        String imageName = "/imagens/" + i + ".jpg";
        switch (i) {
            case 0:
                txtUsuario.setBackground(new Color(0xE9EAEC));
                txtSenha.setBackground(new Color(0xE9EAEC));
                txtUsuario.setForeground(Color.black);
                txtSenha.setForeground(Color.black);
                break;
            case 1:
                txtUsuario.setBackground(new Color(0x01030F));
                txtSenha.setBackground(new Color(0x01030F));
                txtUsuario.setForeground(new Color(0x8dc53c));
                txtSenha.setForeground(new Color(0x8dc53c));
                break;
            case 2:
                txtUsuario.setBackground(new Color(0x323d43));
                txtSenha.setBackground(new Color(0x323d43));
                txtUsuario.setForeground(new Color(0xf4f5f3));
                txtSenha.setForeground(new Color(0xf4f5f3));
                break;
            case 3:
                txtUsuario.setBackground(new Color(0xe4eaea));
                txtSenha.setBackground(new Color(0xe4eaea));
                txtUsuario.setForeground(new Color(0xCC00CC));
                txtSenha.setForeground(new Color(0xCC00CC));
                break;
            case 4:
                txtUsuario.setBackground(new Color(0x494b53));
                txtSenha.setBackground(new Color(0x494b53));
                txtUsuario.setForeground(new Color(0x33CC00));
                txtSenha.setForeground(new Color(0x33CC00));
                break;
            case 5:
                txtUsuario.setBackground(new Color(0x0e1c25));
                txtSenha.setBackground(new Color(0x0e1c25));
                txtUsuario.setForeground(new Color(0xf4f5f3));
                txtSenha.setForeground(new Color(0xf4f5f3));
                break;
            case 6:
                txtUsuario.setBackground(new Color(0x4f006f));
                txtSenha.setBackground(new Color(0x4f006f));
                txtUsuario.setForeground(new Color(0xF2F2F2));
                txtSenha.setForeground(new Color(0xF2F2F2));
                break;
            case 7:
                txtUsuario.setBackground(new Color(0x1a446a));
                txtSenha.setBackground(new Color(0x1a446a));
                txtUsuario.setForeground(new Color(0xf4f5f3));
                txtSenha.setForeground(new Color(0xf4f5f3));
                break;

            default:
                throw new AssertionError();
        }
        try {
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageName)));
        } catch (Exception e) {
            System.out.println(e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        barra = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(360, 208));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(382, 208));
        jPanel1.setMinimumSize(new java.awt.Dimension(382, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(51, 204, 0));
        lbUsuario.setText("Usuário: ");
        jPanel1.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 380, 40));

        lbSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(51, 204, 0));
        lbSenha.setText("Senha: ");
        jPanel1.add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 380, 34));

        txtUsuario.setBackground(new java.awt.Color(228, 234, 234));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(228, 234, 234));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(51, 0, 51));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 380, 34));

        btnLogar.setBackground(new java.awt.Color(242, 242, 242));
        btnLogar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(204, 0, 204));
        btnLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/entrar.png"))); // NOI18N
        btnLogar.setText("Logar");
        btnLogar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        btnLogar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogar.setIconTextGap(20);
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 150, 50));

        btnCadastrar.setBackground(new java.awt.Color(242, 242, 242));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 51, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Cadastrar.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCadastrar.setIconTextGap(20);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 150, 50));

        txtSenha.setBackground(new java.awt.Color(50, 61, 67));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(51, 51, 51));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(51, 0, 51));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 380, 34));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 380, 10));

        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        barra.setOpaque(false);
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });
        barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/marca-cruzada.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        barra.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 380, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo Log.jpg"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        // TODO add your handling code here:
        if (new Dados().Logar(txtUsuario.getText(), txtSenha.getText())) {

            if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("A")) {

                ModoRoot amb = new ModoRoot();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
                if (new Dados().VefificarAllRacionar()) {

                    AdmAcoes adm = new AdmAcoes();
                    adm.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                    adm.setVisible(true);
                }

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("T")) {

                ModoTécnico amb = new ModoTécnico();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
                if (new Dados().VefificarAllRacionar()) {

                    AdmAcoes adm = new AdmAcoes();
                    adm.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                    adm.setVisible(true);
                }

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("F")) {

                ModoAdministração amb = new ModoAdministração();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
                if (new Dados().VerificarDiaAtual()) {
                    new PagamentoDeHoje().setVisible(true);
                }

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("R")) {

                ModoAdministração amb = new ModoAdministração();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
                if (new Dados().VerificarDiaAtual()) {
                    new PagamentoDeHoje().setVisible(true);
                }

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("V")) {

                ModoAdministração amb = new ModoAdministração();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("C")) {

                ModoAdministração amb = new ModoAdministração();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
                if (new Dados().VerificarDiaAtual()) {
                    new PagamentoDeHoje().setVisible(true);
                }

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("G")) {

                ModoAdministração amb = new ModoAdministração();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
                if (new Dados().VerificarDiaAtual()) {
                    new PagamentoDeHoje().setVisible(true);
                }

            } else if (new Dados().getPrevilegString(txtUsuario.getText()).equalsIgnoreCase("D")) {

                ModoAdministração amb = new ModoAdministração();
                amb.setUsuario(new Dados().getNomeUsuário(txtUsuario.getText()));
                amb.setIdUsuario(Integer.parseInt(new Dados().getIdUsuário(txtUsuario.getText())));
                amb.setPrevilegio(new Dados().getPrevilegString(txtUsuario.getText()));
                amb.setVisible(true);
            }
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Senha ou Usuário Errado!");
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new NovoUsuario().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnLogarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased
    int X = 0, Y = 0;
    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        // TODO add your handling code here:
        X = evt.getX();
        Y = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - X, evt.getYOnScreen() - Y);
    }//GEN-LAST:event_barraMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
