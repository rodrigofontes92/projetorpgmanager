
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe resposável pela criação de grupos
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgGrupoCriar extends javax.swing.JDialog {

    private RPGService service;

    /**
     * Construtor de {@link DlgGrupoCriar}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgGrupoCriar(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        this.service = service;
        setLocationRelativeTo(parent);
        getContentPane().setBackground(new Color(200,220,240));
        jPanel1.setBackground(new Color(200,220,240));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDlgGrupoCriarConfirmar = new javax.swing.JButton();
        btnDlgGrupoCriarFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDlgGrupoCriarNome = new javax.swing.JLabel();
        txtDlgGrupoCriarNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblDlgGrupoCriarIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDlgGrupoCriarConfirmar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoCriarConfirmar.setText("Criar");
        btnDlgGrupoCriarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoCriarConfirmarActionPerformed(evt);
            }
        });

        btnDlgGrupoCriarFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoCriarFechar.setText("Fechar");
        btnDlgGrupoCriarFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoCriarFecharActionPerformed(evt);
            }
        });

        lblDlgGrupoCriarNome.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgGrupoCriarNome.setText("Nome do Grupo:");

        txtDlgGrupoCriarNome.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblDlgGrupoCriarNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDlgGrupoCriarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgGrupoCriarNome)
                    .addComponent(txtDlgGrupoCriarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Criar Grupo");

        lblDlgGrupoCriarIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerGrupoCriar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDlgGrupoCriarConfirmar)
                .addGap(18, 18, 18)
                .addComponent(btnDlgGrupoCriarFechar)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDlgGrupoCriarIMG)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDlgGrupoCriarIMG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgGrupoCriarConfirmar)
                    .addComponent(btnDlgGrupoCriarFechar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que fecha o JDialog {@link DlgGrupoCriar}
     * 
     * @param evt 
     */
    private void btnDlgGrupoCriarFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoCriarFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgGrupoCriarFecharActionPerformed

    /**
     * Método que cria o grupo via RPGService
     * 
     * Em caso de sucesso ou de erro, uma MessageDialog é invocada.
     * 
     * @param evt 
     */
    private void btnDlgGrupoCriarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoCriarConfirmarActionPerformed
        try {
            service.criarGrupo(txtDlgGrupoCriarNome.getText());
            JOptionPane.showMessageDialog(this, "Grupo criado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDlgGrupoCriarConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgGrupoCriarConfirmar;
    private javax.swing.JButton btnDlgGrupoCriarFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDlgGrupoCriarIMG;
    private javax.swing.JLabel lblDlgGrupoCriarNome;
    private javax.swing.JTextField txtDlgGrupoCriarNome;
    // End of variables declaration//GEN-END:variables
}
