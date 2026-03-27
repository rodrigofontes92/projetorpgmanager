
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe responsável por remover um grupo
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgGrupoRemover extends javax.swing.JDialog {

    private RPGService service;

    /**
     * Construtor de {@link DlgGrupoRemover}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgGrupoRemover(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        this.service = service;
        setLocationRelativeTo(parent);
        carregarGrupos();
        getContentPane().setBackground(new Color(200,220,240));
        jPanel1.setBackground(new Color(200,220,240));
    }

    /**
     * Carrega os grupos na ComboBox.
     * 
     * Em caso de erro, invoca MessageDialog informando
     */
    private void carregarGrupos() {
        try {
            cmbDlgGrupoRemoverGrupo.removeAllItems();

            for (Grupo g : service.listarGrupos()) {
                cmbDlgGrupoRemoverGrupo.addItem(g.getNome());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grupos.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDlgGrupoRemoverTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDlgGrupoRemoverNomeGrupo = new javax.swing.JLabel();
        cmbDlgGrupoRemoverGrupo = new javax.swing.JComboBox<>();
        btnDlgGrupoRemoverConfirmar = new javax.swing.JButton();
        btnDlgGrupoRemoverFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDlgGrupoRemoverTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        lblDlgGrupoRemoverTitulo.setText("Remover Grupo");

        lblDlgGrupoRemoverNomeGrupo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgGrupoRemoverNomeGrupo.setText("Grupo:");

        cmbDlgGrupoRemoverGrupo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbDlgGrupoRemoverGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblDlgGrupoRemoverNomeGrupo)
                .addGap(28, 28, 28)
                .addComponent(cmbDlgGrupoRemoverGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgGrupoRemoverNomeGrupo)
                    .addComponent(cmbDlgGrupoRemoverGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnDlgGrupoRemoverConfirmar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoRemoverConfirmar.setText("Remover");
        btnDlgGrupoRemoverConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoRemoverConfirmarActionPerformed(evt);
            }
        });

        btnDlgGrupoRemoverFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoRemoverFechar.setText("Fechar");
        btnDlgGrupoRemoverFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoRemoverFecharActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerGrupoDel.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblDlgGrupoRemoverTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDlgGrupoRemoverConfirmar)
                .addGap(18, 18, 18)
                .addComponent(btnDlgGrupoRemoverFechar)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDlgGrupoRemoverTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgGrupoRemoverFechar)
                    .addComponent(btnDlgGrupoRemoverConfirmar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento do botão de Remover
     * 
     * Exige confirmação de remoção via ConfirmDialog
     * 
     * @param evt 
     */
    private void btnDlgGrupoRemoverConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoRemoverConfirmarActionPerformed
        try {
            if (cmbDlgGrupoRemoverGrupo.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Selecione um grupo.");
                return;
            }

            String nomeSelecionado = cmbDlgGrupoRemoverGrupo.getSelectedItem().toString();
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover este grupo?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
            service.removerGrupo(nomeSelecionado);
            JOptionPane.showMessageDialog(this, "Grupo removido com sucesso!");
            carregarGrupos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDlgGrupoRemoverConfirmarActionPerformed

    /**
     * Fecha o Dialog {@link DlgGrupoRemover}
     * 
     * @param evt 
     */
    private void btnDlgGrupoRemoverFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoRemoverFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgGrupoRemoverFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgGrupoRemoverConfirmar;
    private javax.swing.JButton btnDlgGrupoRemoverFechar;
    private javax.swing.JComboBox<String> cmbDlgGrupoRemoverGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDlgGrupoRemoverNomeGrupo;
    private javax.swing.JLabel lblDlgGrupoRemoverTitulo;
    // End of variables declaration//GEN-END:variables
}
