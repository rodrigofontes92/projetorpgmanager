
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe responsável por adicionar personagem a um grupo
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgGrupoAddPersonagem extends javax.swing.JDialog {

    private RPGService service;
    
    /**
     * Método construtor de {@link DlgGrupoAddPersonagem}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgGrupoAddPersonagem(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        this.service = service;
        setLocationRelativeTo(parent);
        carregarGrupos();
        carregarPersonagens();
        getContentPane().setBackground(new Color(200,220,240));
        jPanel1.setBackground(new Color(200,220,240));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDlgGrupoAddPersonagemConfirmar = new javax.swing.JButton();
        btnDlgGrupoAddPersonagemFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDlgGrupoAddPersonagemGrupo = new javax.swing.JLabel();
        cmbDlgGrupoAddPersonagemGrupo = new javax.swing.JComboBox<>();
        lblDlgGrupoAddPersonagemPersonagem = new javax.swing.JLabel();
        cmbDlgGrupoAddPersonagemPersonagem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblDlgGrupoAddPersonagemIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDlgGrupoAddPersonagemConfirmar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoAddPersonagemConfirmar.setText("Confirmar");
        btnDlgGrupoAddPersonagemConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoAddPersonagemConfirmarActionPerformed(evt);
            }
        });

        btnDlgGrupoAddPersonagemFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoAddPersonagemFechar.setText("Fechar");
        btnDlgGrupoAddPersonagemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoAddPersonagemFecharActionPerformed(evt);
            }
        });

        lblDlgGrupoAddPersonagemGrupo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgGrupoAddPersonagemGrupo.setText("Grupo:");

        cmbDlgGrupoAddPersonagemGrupo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgGrupoAddPersonagemGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDlgGrupoAddPersonagemPersonagem.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgGrupoAddPersonagemPersonagem.setText("Personagem:");

        cmbDlgGrupoAddPersonagemPersonagem.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgGrupoAddPersonagemPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDlgGrupoAddPersonagemGrupo)
                    .addComponent(cmbDlgGrupoAddPersonagemGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDlgGrupoAddPersonagemPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDlgGrupoAddPersonagemPersonagem))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgGrupoAddPersonagemGrupo)
                    .addComponent(lblDlgGrupoAddPersonagemPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDlgGrupoAddPersonagemGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDlgGrupoAddPersonagemPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Adicionar Personagem");

        lblDlgGrupoAddPersonagemIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerGrupoAddMembro.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDlgGrupoAddPersonagemConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDlgGrupoAddPersonagemFechar)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDlgGrupoAddPersonagemIMG)
                        .addGap(229, 229, 229))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDlgGrupoAddPersonagemIMG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgGrupoAddPersonagemConfirmar)
                    .addComponent(btnDlgGrupoAddPersonagemFechar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que fecha o JDialog {@link DlgGrupoAddPersonagem}
     * 
     * @param evt 
     */
    private void btnDlgGrupoAddPersonagemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoAddPersonagemFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgGrupoAddPersonagemFecharActionPerformed

    /**
     * Botão que adiciona um personagem a determinado grupo
     * 
     * @param evt 
     */
    private void btnDlgGrupoAddPersonagemConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoAddPersonagemConfirmarActionPerformed
        try {
            service.adicionarPersonagemAoGrupo(
                cmbDlgGrupoAddPersonagemGrupo.getSelectedItem().toString(),
                cmbDlgGrupoAddPersonagemPersonagem.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Personagem adicionado ao grupo com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnDlgGrupoAddPersonagemConfirmarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgGrupoAddPersonagemConfirmar;
    private javax.swing.JButton btnDlgGrupoAddPersonagemFechar;
    private javax.swing.JComboBox<String> cmbDlgGrupoAddPersonagemGrupo;
    private javax.swing.JComboBox<String> cmbDlgGrupoAddPersonagemPersonagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDlgGrupoAddPersonagemGrupo;
    private javax.swing.JLabel lblDlgGrupoAddPersonagemIMG;
    private javax.swing.JLabel lblDlgGrupoAddPersonagemPersonagem;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que carrega os Grupos para a combobox cmbDlgGrupoAddPersonagemGrupo
     */
    private void carregarGrupos() {
        try {
            cmbDlgGrupoAddPersonagemGrupo.removeAllItems();

            for (Grupo g : service.listarGrupos()) {
                cmbDlgGrupoAddPersonagemGrupo.addItem(g.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grupos: " + e.getMessage());
        }
    }
    
    /**
    * Método que carrega personagens para a ComboBox cmbDlgGrupoAddPersonagemPersonagem
    */
    private void carregarPersonagens() {
        try {
            cmbDlgGrupoAddPersonagemPersonagem.removeAllItems();
            
            for (Personagem p : service.listarPersonagens()) {
                cmbDlgGrupoAddPersonagemPersonagem.addItem(p.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar personagem" + e.getMessage());
        }
    }
    
}
