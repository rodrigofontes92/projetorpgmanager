
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe responsável por criar personagens
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgPersonagemCriar extends javax.swing.JDialog {

    private RPGService service;

    /**
     * Construtor de {@link DlgPersonagemCriar}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgPersonagemCriar(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        lblDlgPersonagemCriarAtributo.setText("Força:");
        this.service = service;
        setLocationRelativeTo(parent);
        getContentPane().setBackground(new Color(230,220,170));
        jPanel1.setBackground(new Color(230,220,170));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDlgPersonagemCriarFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDlgPersonagemCriarNome = new javax.swing.JLabel();
        lblDlgPersonagemCriarTipolblDlgPersonagemCriarTipo = new javax.swing.JLabel();
        lblDlgPersonagemCriarAtributo = new javax.swing.JLabel();
        cmbDlgPersonagemCriarTipo = new javax.swing.JComboBox<>();
        txtDlgPersonagemCriarNome = new javax.swing.JTextField();
        txtDlgPersonagemCriarAtributo = new javax.swing.JTextField();
        lblDlgPersonagemCriarVida = new javax.swing.JLabel();
        txtDlgPersonagemCriarVida = new javax.swing.JTextField();
        lblDlgPersonagemCriarIMG = new javax.swing.JLabel();
        btnDlgPersonagemCriarConfirmar = new javax.swing.JButton();
        lblDlgPersonagemCriarTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDlgPersonagemCriarFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemCriarFechar.setText("Fechar");
        btnDlgPersonagemCriarFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemCriarFecharActionPerformed(evt);
            }
        });

        lblDlgPersonagemCriarNome.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemCriarNome.setText("Nome:");

        lblDlgPersonagemCriarTipolblDlgPersonagemCriarTipo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemCriarTipolblDlgPersonagemCriarTipo.setText("Tipo:");

        lblDlgPersonagemCriarAtributo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemCriarAtributo.setText("Atributo:");

        cmbDlgPersonagemCriarTipo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgPersonagemCriarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GUERREIRO", "MAGO", "CLERIGO" }));
        cmbDlgPersonagemCriarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDlgPersonagemCriarTipoActionPerformed(evt);
            }
        });

        txtDlgPersonagemCriarNome.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        txtDlgPersonagemCriarAtributo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        lblDlgPersonagemCriarVida.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemCriarVida.setText("Vida:");

        txtDlgPersonagemCriarVida.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDlgPersonagemCriarTipolblDlgPersonagemCriarTipo)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDlgPersonagemCriarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDlgPersonagemCriarAtributo)
                        .addGap(18, 18, 18)
                        .addComponent(txtDlgPersonagemCriarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDlgPersonagemCriarVida)
                                .addGap(18, 18, 18)
                                .addComponent(txtDlgPersonagemCriarVida)
                                .addGap(115, 115, 115))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDlgPersonagemCriarNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDlgPersonagemCriarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgPersonagemCriarNome)
                    .addComponent(txtDlgPersonagemCriarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgPersonagemCriarTipolblDlgPersonagemCriarTipo)
                    .addComponent(lblDlgPersonagemCriarAtributo)
                    .addComponent(cmbDlgPersonagemCriarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDlgPersonagemCriarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgPersonagemCriarVida)
                    .addComponent(txtDlgPersonagemCriarVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblDlgPersonagemCriarIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerCreatePersonagem.png"))); // NOI18N
        lblDlgPersonagemCriarIMG.setText("jLabel1");

        btnDlgPersonagemCriarConfirmar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemCriarConfirmar.setText("Confirmar");
        btnDlgPersonagemCriarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemCriarConfirmarActionPerformed(evt);
            }
        });

        lblDlgPersonagemCriarTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        lblDlgPersonagemCriarTitulo.setText("Criar Personagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDlgPersonagemCriarIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(btnDlgPersonagemCriarConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDlgPersonagemCriarFechar)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblDlgPersonagemCriarTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblDlgPersonagemCriarTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDlgPersonagemCriarConfirmar)
                            .addComponent(btnDlgPersonagemCriarFechar))
                        .addGap(17, 17, 17))
                    .addComponent(lblDlgPersonagemCriarIMG, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que confirma o evento criar personagem
     * 
     * Em caso de sucesso ou falha, mostra MessageDialog específica
     * 
     * @param evt 
     */
    private void btnDlgPersonagemCriarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemCriarConfirmarActionPerformed
        try {
            service.criarPersonagem(
                txtDlgPersonagemCriarNome.getText(),
                txtDlgPersonagemCriarVida.getText(),
                cmbDlgPersonagemCriarTipo.getSelectedItem().toString(),
                txtDlgPersonagemCriarAtributo.getText()
            );

            JOptionPane.showMessageDialog(this,"Personagem criado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDlgPersonagemCriarConfirmarActionPerformed

    /**
     * Evento da combobox que muda a label lblDlgPersonagemCriarAtributo conforme o nome do personagem selecionado
     * 
     * @param evt 
     */
    private void cmbDlgPersonagemCriarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDlgPersonagemCriarTipoActionPerformed
        String tipo = cmbDlgPersonagemCriarTipo.getSelectedItem().toString();

        if (tipo.equals("GUERREIRO")) {
            lblDlgPersonagemCriarAtributo.setText("Força:");

        } else if (tipo.equals("MAGO")) {
            lblDlgPersonagemCriarAtributo.setText("Magia:");

        } else if (tipo.equals("CLERIGO")) {
            lblDlgPersonagemCriarAtributo.setText("Fé:");
        }
    }//GEN-LAST:event_cmbDlgPersonagemCriarTipoActionPerformed

    /**
     * Fecha a JDialog {@link DlgPersonagemCriar}
     * 
     * @param evt 
     */
    private void btnDlgPersonagemCriarFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemCriarFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgPersonagemCriarFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgPersonagemCriarConfirmar;
    private javax.swing.JButton btnDlgPersonagemCriarFechar;
    private javax.swing.JComboBox<String> cmbDlgPersonagemCriarTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDlgPersonagemCriarAtributo;
    private javax.swing.JLabel lblDlgPersonagemCriarIMG;
    private javax.swing.JLabel lblDlgPersonagemCriarNome;
    private javax.swing.JLabel lblDlgPersonagemCriarTipolblDlgPersonagemCriarTipo;
    private javax.swing.JLabel lblDlgPersonagemCriarTitulo;
    private javax.swing.JLabel lblDlgPersonagemCriarVida;
    private javax.swing.JTextField txtDlgPersonagemCriarAtributo;
    private javax.swing.JTextField txtDlgPersonagemCriarNome;
    private javax.swing.JTextField txtDlgPersonagemCriarVida;
    // End of variables declaration//GEN-END:variables
}
