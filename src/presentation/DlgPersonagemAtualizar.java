
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe responsável por atualizar/editar personagens
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgPersonagemAtualizar extends javax.swing.JDialog {

    private RPGService service;

    /**
     * Construtuor de {@link DlgPersonagemAtualizar}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgPersonagemAtualizar(java.awt.Frame parent, boolean modal, RPGService service) {
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

        btnDlgPersonagemAtualizarConfirmar = new javax.swing.JButton();
        btnDlgPersonagemAtualizarFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cmbDlgPersonagemAtualizarPersonagem = new javax.swing.JComboBox<>();
        lblDlgPersonagemAtualizarPersonagem = new javax.swing.JLabel();
        lblDlgPersonagemAtualizarNome = new javax.swing.JLabel();
        txtDlgPersonagemAtualizarNome = new javax.swing.JTextField();
        lblDlgPersonagemAtualizarVida = new javax.swing.JLabel();
        txtDlgPersonagemAtualizarVida = new javax.swing.JTextField();
        lblDlgPersonagemAtualizarIMG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDlgPersonagemAtualizarConfirmar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemAtualizarConfirmar.setText("Atualizar");
        btnDlgPersonagemAtualizarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemAtualizarConfirmarActionPerformed(evt);
            }
        });

        btnDlgPersonagemAtualizarFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemAtualizarFechar.setText("Fechar");
        btnDlgPersonagemAtualizarFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemAtualizarFecharActionPerformed(evt);
            }
        });

        cmbDlgPersonagemAtualizarPersonagem.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgPersonagemAtualizarPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDlgPersonagemAtualizarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDlgPersonagemAtualizarPersonagemActionPerformed(evt);
            }
        });

        lblDlgPersonagemAtualizarPersonagem.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemAtualizarPersonagem.setText("Personagem:");

        lblDlgPersonagemAtualizarNome.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemAtualizarNome.setText("Novo nome:");

        txtDlgPersonagemAtualizarNome.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        lblDlgPersonagemAtualizarVida.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemAtualizarVida.setText("Nova vida:");

        txtDlgPersonagemAtualizarVida.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDlgPersonagemAtualizarNome)
                            .addComponent(lblDlgPersonagemAtualizarVida))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDlgPersonagemAtualizarVida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDlgPersonagemAtualizarNome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDlgPersonagemAtualizarPersonagem)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDlgPersonagemAtualizarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDlgPersonagemAtualizarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDlgPersonagemAtualizarPersonagem))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgPersonagemAtualizarNome)
                    .addComponent(txtDlgPersonagemAtualizarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgPersonagemAtualizarVida)
                    .addComponent(txtDlgPersonagemAtualizarVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        lblDlgPersonagemAtualizarIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerUpdtPers.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Atualizar Personagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDlgPersonagemAtualizarIMG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDlgPersonagemAtualizarConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDlgPersonagemAtualizarFechar)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblDlgPersonagemAtualizarIMG)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgPersonagemAtualizarConfirmar)
                    .addComponent(btnDlgPersonagemAtualizarFechar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Fecha o JDialog
     * 
     * @param evt 
     */
    private void btnDlgPersonagemAtualizarFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemAtualizarFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgPersonagemAtualizarFecharActionPerformed

    /**
     * Botão para confirmar atualização de personagem
     * 
     * Usa os métodos {@link RPGService#listarPersonagens() } e {@link RPGService#atualizarPersonagem(java.lang.String, java.lang.String, java.lang.String) }
     * @param evt 
     */
    private void btnDlgPersonagemAtualizarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemAtualizarConfirmarActionPerformed
        try {
            String nomeSelecionado = cmbDlgPersonagemAtualizarPersonagem.getSelectedItem().toString();
            int idSelecionado = -1;

            for (Personagem p : service.listarPersonagens()) {
                if (p.getNome().equals(nomeSelecionado)) {
                    idSelecionado = p.getId();
                    break;
                }
            }

            service.atualizarPersonagem(String.valueOf(idSelecionado),
                txtDlgPersonagemAtualizarNome.getText(),
                txtDlgPersonagemAtualizarVida.getText());

            JOptionPane.showMessageDialog(this, "Personagem atualizado com sucesso!");
            carregarPersonagens();
            txtDlgPersonagemAtualizarNome.setText("");
            txtDlgPersonagemAtualizarVida.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDlgPersonagemAtualizarConfirmarActionPerformed

    /**
     * comboBox com a lista de personagens
     * 
     * Usa o método {@link RPGService#listarPersonagens() }
     * 
     * @param evt 
     */
    private void cmbDlgPersonagemAtualizarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDlgPersonagemAtualizarPersonagemActionPerformed
        try {
            if (cmbDlgPersonagemAtualizarPersonagem.getSelectedItem() == null) {
                return;
            }
            String nomeSelecionado = cmbDlgPersonagemAtualizarPersonagem.getSelectedItem().toString();

            for (Personagem p : service.listarPersonagens()) {
                if (p.getNome().equals(nomeSelecionado)) {
                    txtDlgPersonagemAtualizarNome.setText(p.getNome());
                    txtDlgPersonagemAtualizarVida.setText(String.valueOf(p.getVida()));
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do personagem.");
        }
    }//GEN-LAST:event_cmbDlgPersonagemAtualizarPersonagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgPersonagemAtualizarConfirmar;
    private javax.swing.JButton btnDlgPersonagemAtualizarFechar;
    private javax.swing.JComboBox<String> cmbDlgPersonagemAtualizarPersonagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDlgPersonagemAtualizarIMG;
    private javax.swing.JLabel lblDlgPersonagemAtualizarNome;
    private javax.swing.JLabel lblDlgPersonagemAtualizarPersonagem;
    private javax.swing.JLabel lblDlgPersonagemAtualizarVida;
    private javax.swing.JTextField txtDlgPersonagemAtualizarNome;
    private javax.swing.JTextField txtDlgPersonagemAtualizarVida;
    // End of variables declaration//GEN-END:variables

    /**
    * Carrega os personagens na combobox
    * 
    * Usado no Construtor
    */
    private void carregarPersonagens() {
        try {
            cmbDlgPersonagemAtualizarPersonagem.removeAllItems();

            for (Personagem p : service.listarPersonagens()) {
                cmbDlgPersonagemAtualizarPersonagem.addItem(p.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar personagens: " + e.getMessage());
        }
    }

}
