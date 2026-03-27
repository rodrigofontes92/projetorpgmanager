
package presentation;

import dataModel.*;
import java.awt.Color;

/**
 * Classe responsável pela listagem de Grupos
 * 
 * Usa JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgGrupoListar extends javax.swing.JDialog {

    private RPGService service;
    
    /**
     * Método Construtor de {@link DlgGrupoListar}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgGrupoListar(java.awt.Frame parent, boolean modal, RPGService service) {
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

        scrDlgGrupoListarResultado = new javax.swing.JScrollPane();
        txtDlgGrupoListarResultado = new javax.swing.JTextArea();
        btnDlgGrupoListarFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDlgGrupoListarIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtDlgGrupoListarResultado.setEditable(false);
        txtDlgGrupoListarResultado.setColumns(20);
        txtDlgGrupoListarResultado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtDlgGrupoListarResultado.setLineWrap(true);
        txtDlgGrupoListarResultado.setRows(5);
        txtDlgGrupoListarResultado.setWrapStyleWord(true);
        scrDlgGrupoListarResultado.setViewportView(txtDlgGrupoListarResultado);

        btnDlgGrupoListarFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgGrupoListarFechar.setText("Fechar");
        btnDlgGrupoListarFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgGrupoListarFecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Listar Grupos");

        lblDlgGrupoListarIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerListPers.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblDlgGrupoListarIMG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDlgGrupoListarFechar)
                    .addComponent(scrDlgGrupoListarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(scrDlgGrupoListarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDlgGrupoListarIMG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnDlgGrupoListarFechar)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que fecha a JDialog {@link DlgGrupoListar}
     * 
     * @param evt 
     */
    private void btnDlgGrupoListarFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgGrupoListarFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgGrupoListarFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgGrupoListarFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDlgGrupoListarIMG;
    private javax.swing.JScrollPane scrDlgGrupoListarResultado;
    private javax.swing.JTextArea txtDlgGrupoListarResultado;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que carrega a lista de grupos para JTextArea
     */
    private void carregarGrupos() {
        try {
            String texto = "";

            for (Grupo g : service.listarGrupos()) {
                texto += "ID: " + g.getId() + " | Nome: " + g.getNome() + "\n";
            }
            if (texto.isEmpty()) {
                texto = "Nenhum grupo cadastrado.";
            }
            txtDlgGrupoListarResultado.setText(texto);
        } catch (Exception e) {
            txtDlgGrupoListarResultado.setText("Erro ao carregar grupos: " + e.getMessage());
        }
    }

}
