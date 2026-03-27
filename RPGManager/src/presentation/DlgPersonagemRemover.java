
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe responsável por remover personagem
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgPersonagemRemover extends javax.swing.JDialog {

    private RPGService service;

    /**
     * Construtor de {@link DlgPersonagemRemover}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgPersonagemRemover(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        this.service = service;
        setLocationRelativeTo(parent);
        carregarPersonagens();
        getContentPane().setBackground(new Color(230,220,170));
        jPanel1.setBackground(new Color(230,220,170));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDlgPersonagemRemoverConfirmar = new javax.swing.JButton();
        btnDlgPersonagemRemoverFechar = new javax.swing.JButton();
        lblDlgPersonagemRemoverIMG = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDlgPersonagemRemoverPersonagem = new javax.swing.JLabel();
        cmbDlgPersonagemRemoverPersonagem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDlgPersonagemRemoverConfirmar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemRemoverConfirmar.setText("Remover");
        btnDlgPersonagemRemoverConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemRemoverConfirmarActionPerformed(evt);
            }
        });

        btnDlgPersonagemRemoverFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemRemoverFechar.setText("Fechar");
        btnDlgPersonagemRemoverFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemRemoverFecharActionPerformed(evt);
            }
        });

        lblDlgPersonagemRemoverIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerPersDel.png"))); // NOI18N

        lblDlgPersonagemRemoverPersonagem.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemRemoverPersonagem.setText("Personagem:");

        cmbDlgPersonagemRemoverPersonagem.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgPersonagemRemoverPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDlgPersonagemRemoverPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDlgPersonagemRemoverPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgPersonagemRemoverPersonagem)
                    .addComponent(cmbDlgPersonagemRemoverPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Remover Personagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDlgPersonagemRemoverConfirmar)
                .addGap(18, 18, 18)
                .addComponent(btnDlgPersonagemRemoverFechar)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblDlgPersonagemRemoverIMG))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDlgPersonagemRemoverIMG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgPersonagemRemoverConfirmar)
                    .addComponent(btnDlgPersonagemRemoverFechar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que fecha a JDialog {@link DlgPersonagemRemover}
     * 
     * @param evt 
     */
    private void btnDlgPersonagemRemoverFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemRemoverFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgPersonagemRemoverFecharActionPerformed

    /**
     * Evento do botão remover personagem
     * 
     * Exige confirmação de remoção via ConfirmDialog
     * 
     * @param evt 
     */
    private void btnDlgPersonagemRemoverConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemRemoverConfirmarActionPerformed
        try {
            if (cmbDlgPersonagemRemoverPersonagem.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Selecione um personagem.");
                return;
            }

            String nomeSelecionado = cmbDlgPersonagemRemoverPersonagem.getSelectedItem().toString();
            int idSelecionado = -1;
            for (Personagem p : service.listarPersonagens()) {

                if (p.getNome().equals(nomeSelecionado)) {
                    idSelecionado = p.getId();
                    break;
                }
            }
            
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover este personagem?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }

            service.removerPersonagem(String.valueOf(idSelecionado));
            JOptionPane.showMessageDialog(this, "Personagem removido com sucesso!");
            carregarPersonagens();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDlgPersonagemRemoverConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgPersonagemRemoverConfirmar;
    private javax.swing.JButton btnDlgPersonagemRemoverFechar;
    private javax.swing.JComboBox<String> cmbDlgPersonagemRemoverPersonagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDlgPersonagemRemoverIMG;
    private javax.swing.JLabel lblDlgPersonagemRemoverPersonagem;
    // End of variables declaration//GEN-END:variables

    /**
    * Carrega os personagens na combobox
    * 
    * O método é inicializado em {@link DlgPersonagemRemover#DlgPersonagemRemover(java.awt.Frame, boolean, dataModel.RPGService) }
    */
    private void carregarPersonagens() {
        try {
            cmbDlgPersonagemRemoverPersonagem.removeAllItems();

            for (Personagem p : service.listarPersonagens()) {
                cmbDlgPersonagemRemoverPersonagem.addItem(p.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar personagens: " + e.getMessage());
        }
    }


}
