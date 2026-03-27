
package presentation;

import dataModel.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela listagem de membros de um grupo
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgGrupoListarMembros extends javax.swing.JDialog {

    private RPGService service;

    /**
     * Método construtor de {@link DlgGrupoListarMembros}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgGrupoListarMembros(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        this.service = service;
        setLocationRelativeTo(parent);
        carregarGrupos();
        getContentPane().setBackground(new Color(200,220,240));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDlgGrupoListarMembrosGrupo = new javax.swing.JLabel();
        cmbDlgGrupoListarMembrosGrupo = new javax.swing.JComboBox<>();
        scrDlgGrupoListarMembrosResultado = new javax.swing.JScrollPane();
        txtDlgGrupoListarMembrosResultado = new javax.swing.JTextArea();
        btnDlgGrupoListarMembrosFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDlgGrupoListarMembrosIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDlgGrupoListarMembrosGrupo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgGrupoListarMembrosGrupo.setText("Grupo:");

        cmbDlgGrupoListarMembrosGrupo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgGrupoListarMembrosGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDlgGrupoListarMembrosGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDlgGrupoListarMembrosGrupoActionPerformed(evt);
            }
        });

        txtDlgGrupoListarMembrosResultado.setEditable(false);
        txtDlgGrupoListarMembrosResultado.setColumns(20);
        txtDlgGrupoListarMembrosResultado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtDlgGrupoListarMembrosResultado.setLineWrap(true);
        txtDlgGrupoListarMembrosResultado.setRows(5);
        txtDlgGrupoListarMembrosResultado.setWrapStyleWord(true);
        scrDlgGrupoListarMembrosResultado.setViewportView(txtDlgGrupoListarMembrosResultado);

        btnDlgGrupoListarMembrosFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoListarMembrosFechar.setText("Fechar");
        btnDlgGrupoListarMembrosFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoListarMembrosFecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Listar Membros");

        lblDlgGrupoListarMembrosIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerListPers.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDlgGrupoListarMembrosFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDlgGrupoListarMembrosGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDlgGrupoListarMembrosGrupo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblDlgGrupoListarMembrosIMG)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(scrDlgGrupoListarMembrosResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrDlgGrupoListarMembrosResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(btnDlgGrupoListarMembrosFechar)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDlgGrupoListarMembrosGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDlgGrupoListarMembrosGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblDlgGrupoListarMembrosIMG)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que fecha a JDialog {@link DlgGrupoListarMembros}
     * 
     * @param evt 
     */
    private void btnDlgGrupoListarMembrosFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoListarMembrosFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgGrupoListarMembrosFecharActionPerformed

    /**
     * Método que chama {@link DlgGrupoListarMembros#listarMembros() }
     * 
     * lista os membros em uma comboBox
     * 
     * @param evt 
     */
    private void cmbDlgGrupoListarMembrosGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDlgGrupoListarMembrosGrupoActionPerformed
        listarMembros();
    }//GEN-LAST:event_cmbDlgGrupoListarMembrosGrupoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgGrupoListarMembrosFechar;
    private javax.swing.JComboBox<String> cmbDlgGrupoListarMembrosGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDlgGrupoListarMembrosGrupo;
    private javax.swing.JLabel lblDlgGrupoListarMembrosIMG;
    private javax.swing.JScrollPane scrDlgGrupoListarMembrosResultado;
    private javax.swing.JTextArea txtDlgGrupoListarMembrosResultado;
    // End of variables declaration//GEN-END:variables

    /**
    * Carrega os grupos no ComboBox.
    */
    private void carregarGrupos() {
        try {
            cmbDlgGrupoListarMembrosGrupo.removeAllItems();

            for (Grupo g : service.listarGrupos()) {
                cmbDlgGrupoListarMembrosGrupo.addItem(g.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grupos: " + e.getMessage());
        }
    }
    
    /**
    * Lista os membros do grupo selecionado.
    */
    private void listarMembros() {
        try {
            String nomeGrupo = cmbDlgGrupoListarMembrosGrupo.getSelectedItem().toString();
            String texto = "";

            for (Grupo g : service.listarGrupos()) {
                if (g.getNome().equals(nomeGrupo)) {

                    for (Personagem p : service.listarMembrosDoGrupo(g.getId())) {
                        String atributo = "";

                        if (p instanceof Guerreiro) {
                            atributo = "Força: " + ((Guerreiro)p).getForca();
                        }
                        else if (p instanceof Mago) {
                            atributo = "Magia: " + ((Mago)p).getMagia();
                        }
                        else if (p instanceof Clerigo) {
                            atributo = "Fé: " + ((Clerigo)p).getFe();
                        }
                        
                        texto += "Nome: " + p.getNome() + " | " + atributo + "\n";
                    }
                }
            }

            if (texto.isEmpty()) {
                texto = "Nenhum personagem neste grupo.";
            }
            txtDlgGrupoListarMembrosResultado.setText(texto);

        } catch (Exception e) {
            txtDlgGrupoListarMembrosResultado.setText("Erro ao carregar membros: " + e.getMessage());
        }
    }

}
