/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Objetos.Dados;
import Objetos.LoginOBJ;
import Objetos.SalarioOBJ;
import Objetos.TemaOBJ;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Custódio Quingumba
 */
public class NovoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NovoUsuario
     */
    private int idUsuario, idTema;
    private List<SalarioOBJ> salario = new Dados().Salarios();
    private Color CorBotao, CorLetra, CorFundo;
    List<TemaOBJ> tema = new ArrayList<>();

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
        String imageName = "/imagens/plano" + idTema + ".jpg";
        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageName)));
        if (idTema == 1) {
            lbTitulo.setForeground(new Color(0xCC00CC));
            btCadastrar.setBackground(new Color(0x241f24));
            btCancelar.setBackground(new Color(0x241f24));
            cbCategoria.setBackground(new Color(0x241f24));
        }
    }

    public Color getCorBotao() {
        return CorBotao;
    }

    public void setCorBotao(Color CorBotao) {
        this.CorBotao = CorBotao;
    }

    public Color getCorLetra() {
        return CorLetra;
    }

    public void setCorLetra(Color CorLetra) {
        this.CorLetra = CorLetra;
    }

    public Color getCorFundo() {
        return CorFundo;
    }

    public void setCorFundo(Color CorFundo) {
        this.CorFundo = CorFundo;
        pFundo.setBackground(CorFundo);
        if (CorFundo != new Color(0xfbfbfc)) {
            lbTitulo.setForeground(new Color(0xfbfbfc));
        }
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public NovoUsuario() {
        initComponents();
        for (SalarioOBJ salar : salario) {
            cbCategoria.addItem(salar.getCategoria());
        }
        setIconImage(new ImageIcon(getClass().getResource("/Icones/figicon.png")).getImage());
        CbFunc.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        txsenha = new javax.swing.JPasswordField();
        txsenha2 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CbAdm = new javax.swing.JCheckBox();
        CbRH = new javax.swing.JCheckBox();
        CbFunc = new javax.swing.JCheckBox();
        cbCEO = new javax.swing.JCheckBox();
        CbContabilidade = new javax.swing.JCheckBox();
        CbTec = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaRaiz = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        CbAproCom = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        CbGeral = new javax.swing.JCheckBox();
        txtNomeUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOVO USUÁRIO");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pFundo.setBackground(new java.awt.Color(255, 255, 255));
        pFundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        pFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setText("CATEGORIA");
        pFundo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 110, 30));

        cbCategoria.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbCategoria.setForeground(new java.awt.Color(204, 0, 204));
        cbCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        pFundo.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 310, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("Senha Raiz:");
        pFundo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 160, -1));

        txtEmail.setBackground(new java.awt.Color(232, 233, 235));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        pFundo.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 500, 34));

        btCancelar.setBackground(new java.awt.Color(242, 242, 242));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(204, 0, 204));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar.png"))); // NOI18N
        btCancelar.setText("Voltar");
        btCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btCancelar.setIconTextGap(20);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        pFundo.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 130, 50));

        btCadastrar.setBackground(new java.awt.Color(242, 242, 242));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(204, 0, 204));
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/finalizado.png"))); // NOI18N
        btCadastrar.setText("Finalizar");
        btCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btCadastrar.setIconTextGap(10);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        pFundo.add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 130, 50));

        txsenha.setBackground(new java.awt.Color(232, 233, 235));
        txsenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txsenha.setBorder(null);
        pFundo.add(txsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 304, 34));

        txsenha2.setBackground(new java.awt.Color(232, 233, 235));
        txsenha2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txsenha2.setBorder(null);
        pFundo.add(txsenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 280, 34));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        pFundo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 280, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pFundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 500, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Confirmar Senha:");
        pFundo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 250, 34));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pFundo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 304, 10));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Novo Usuário");
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pFundo.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 210, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Email: ");
        pFundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Senha: ");
        pFundo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("Previlégio");
        pFundo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, 30));

        CbAdm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbAdm.setForeground(new java.awt.Color(204, 0, 204));
        CbAdm.setText("ADM");
        CbAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbAdmMouseClicked(evt);
            }
        });
        CbAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAdmActionPerformed(evt);
            }
        });
        pFundo.add(CbAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 70, 30));

        CbRH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbRH.setForeground(new java.awt.Color(204, 0, 204));
        CbRH.setText("RH");
        CbRH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbRH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbRHMouseClicked(evt);
            }
        });
        CbRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbRHActionPerformed(evt);
            }
        });
        pFundo.add(CbRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 60, 30));

        CbFunc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbFunc.setForeground(new java.awt.Color(204, 0, 204));
        CbFunc.setText("DFIN");
        CbFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbFuncMouseClicked(evt);
            }
        });
        CbFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbFuncActionPerformed(evt);
            }
        });
        pFundo.add(CbFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 80, 30));

        cbCEO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCEO.setForeground(new java.awt.Color(204, 0, 204));
        cbCEO.setText("CEO");
        cbCEO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbCEO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCEOMouseClicked(evt);
            }
        });
        cbCEO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCEOActionPerformed(evt);
            }
        });
        pFundo.add(cbCEO, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 160, 30));

        CbContabilidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbContabilidade.setForeground(new java.awt.Color(204, 0, 204));
        CbContabilidade.setText("Contabilidade");
        CbContabilidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbContabilidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbContabilidadeMouseClicked(evt);
            }
        });
        CbContabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbContabilidadeActionPerformed(evt);
            }
        });
        pFundo.add(CbContabilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 150, 30));

        CbTec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbTec.setForeground(new java.awt.Color(204, 0, 204));
        CbTec.setText("Técnico");
        CbTec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbTec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbTecMouseClicked(evt);
            }
        });
        CbTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTecActionPerformed(evt);
            }
        });
        pFundo.add(CbTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setText("A Senha Raiz pertence ao Administrador ou gerente chefe do sistema");
        pFundo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 310, 23));

        txtSenhaRaiz.setBackground(new java.awt.Color(232, 233, 235));
        txtSenhaRaiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSenhaRaiz.setBorder(null);
        txtSenhaRaiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaRaizKeyReleased(evt);
            }
        });
        pFundo.add(txtSenhaRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 300, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        pFundo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 300, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 204));
        jLabel9.setText("o previlégio predifinido é Geral(Para funcionários dem cargos)");
        pFundo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 330, 23));

        CbAproCom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbAproCom.setForeground(new java.awt.Color(204, 0, 204));
        CbAproCom.setText("Comercial & Apro");
        CbAproCom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbAproCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbAproComMouseClicked(evt);
            }
        });
        CbAproCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAproComActionPerformed(evt);
            }
        });
        pFundo.add(CbAproCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 0));
        jLabel10.setText("Nome: ");
        pFundo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, 30));

        CbGeral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbGeral.setForeground(new java.awt.Color(204, 0, 204));
        CbGeral.setText("Geral");
        CbGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CbGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbGeralMouseClicked(evt);
            }
        });
        CbGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbGeralActionPerformed(evt);
            }
        });
        pFundo.add(CbGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 100, 30));

        txtNomeUsuario.setBackground(new java.awt.Color(232, 233, 235));
        txtNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeUsuario.setBorder(null);
        txtNomeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeUsuarioMouseClicked(evt);
            }
        });
        pFundo.add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 500, 34));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        pFundo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 500, 10));

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel5.setOpaque(false);
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/marca-cruzada.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 40));

        pFundo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, -1));

        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo Log.jpg"))); // NOI18N
        lbFundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        pFundo.add(lbFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 550));

        getContentPane().add(pFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_btCancelarActionPerformed
    int x, y;
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String user = txtNomeUsuario.getText();
        String email = txtEmail.getText();
        String senha = txsenha.getText();
        String confirma = txsenha2.getText();
        if (senha.equals(confirma)) {
            String previlefgio = "F";

            if (CbAdm.isSelected()) {
                previlefgio = "A";
            } else if (CbTec.isSelected()) {
                previlefgio = "T";
            } else if (CbFunc.isSelected()) {
                previlefgio = "F";
            } else if (CbContabilidade.isSelected()) {
                previlefgio = "C";
            } else if (CbRH.isSelected()) {
                previlefgio = "R";
            } else if (CbAproCom.isSelected()) {
                previlefgio = "V";
            } else if (CbGeral.isSelected()) {
                previlefgio = "G";
            } else if (cbCEO.isSelected()) {
                previlefgio = "D";
            }

            if (previlefgio.equalsIgnoreCase("A")) {

                if (!new Dados().varrer()) {

                    boolean apto = true;

                    while (apto) {
                        String senhar = JOptionPane.showInputDialog(null, "Criar senha Raiz");

                        if (new Dados().CriarSenhaRaiz(senhar)) {
                            apto = false;
                        }

                    };

                    if (new Dados().VerificarUsuario(user, email)) {
                        JOptionPane.showMessageDialog(null, "Email ou Usuário em uso, tente Outro!");
                    } else {
                        new Dados().NovoUsuario(new LoginOBJ(0, user, email, senha, previlefgio, cbCategoria.getSelectedItem().toString().toUpperCase()));
                    }

                } else {

                    String snh = txtSenhaRaiz.getText();
                    if (new Dados().confirmar(snh)) {
                        if (new Dados().VerificarUsuario(user, email)) {
                            JOptionPane.showMessageDialog(null, "Email ou Usuário em uso, tente Outro!");
                        } else {
                            new Dados().NovoUsuario(new LoginOBJ(0, user, email, senha, previlefgio, cbCategoria.getSelectedItem().toString().toUpperCase()));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha Raiz errada! Processo Cancelado.");
                    }

                }

            } else {

                String snh = txtSenhaRaiz.getText();
                if (new Dados().confirmar(snh)) {
                    if (new Dados().NovoUsuario(new LoginOBJ(0, user, email, senha, previlefgio, cbCategoria.getSelectedItem().toString().toUpperCase()))) {
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Senhas diferentes! ");
            txsenha.setText("");
            txsenha2.setText("");
        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void CbAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbAdmMouseClicked
        CbFunc.setSelected(false);
        CbAdm.setSelected(true);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbAdmMouseClicked

    private void CbFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbFuncMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(true);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbFuncMouseClicked

    private void CbAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAdmActionPerformed
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(true);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbAdmActionPerformed

    private void CbFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbFuncActionPerformed
        // TODO add your handling code here:

        CbFunc.setSelected(true);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbFuncActionPerformed

    private void CbTecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbTecMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(true);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
    }//GEN-LAST:event_CbTecMouseClicked

    private void CbTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTecActionPerformed
        // TODO add your handling code here:

        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(true);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbTecActionPerformed

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
        txtEmail.setText("");
        txtEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtNomeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioMouseClicked

    private void CbContabilidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbContabilidadeMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(true);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbContabilidadeMouseClicked

    private void CbContabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbContabilidadeActionPerformed
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(true);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbContabilidadeActionPerformed

    private void CbRHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbRHMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(true);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);

    }//GEN-LAST:event_CbRHMouseClicked

    private void CbRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbRHActionPerformed
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(true);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbRHActionPerformed

    private void CbAproComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbAproComMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(true);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbAproComMouseClicked

    private void CbAproComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAproComActionPerformed
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(true);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbAproComActionPerformed

    private void CbGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbGeralMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(true);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbGeralMouseClicked

    private void CbGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbGeralActionPerformed
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(true);
        cbCEO.setSelected(false);
    }//GEN-LAST:event_CbGeralActionPerformed

    private void txtSenhaRaizKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaRaizKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btCadastrarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSenhaRaizKeyReleased

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void cbCEOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCEOMouseClicked
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(true);
    }//GEN-LAST:event_cbCEOMouseClicked

    private void cbCEOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCEOActionPerformed
        // TODO add your handling code here:
        CbFunc.setSelected(false);
        CbAdm.setSelected(false);
        CbTec.setSelected(false);
        CbRH.setSelected(false);
        CbAproCom.setSelected(false);
        CbContabilidade.setSelected(false);
        CbGeral.setSelected(false);
        cbCEO.setSelected(true);
    }//GEN-LAST:event_cbCEOActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CbAdm;
    private javax.swing.JCheckBox CbAproCom;
    private javax.swing.JCheckBox CbContabilidade;
    private javax.swing.JCheckBox CbFunc;
    private javax.swing.JCheckBox CbGeral;
    private javax.swing.JCheckBox CbRH;
    private javax.swing.JCheckBox CbTec;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JCheckBox cbCEO;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbFundo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pFundo;
    private javax.swing.JPasswordField txsenha;
    private javax.swing.JPasswordField txsenha2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaRaiz;
    // End of variables declaration//GEN-END:variables
}