
package presentation;

import dataModel.*;
import java.awt.Color;

/**
 * Classe responsável por Listar personagens
 * 
 * Utiliza JDialog para interação com o utilizador
 * 
 * @author Rodrigo Fontes
 */
public class DlgPersonagemListar extends javax.swing.JDialog {

    private RPGService service;
    
    /**
     * Construtor de {@link DlgPersonagemListar}
     * 
     * @param parent
     * @param modal
     * @param service 
     */
    public DlgPersonagemListar(java.awt.Frame parent, boolean modal, RPGService service) {
        super(parent, modal);
        initComponents();
        this.service = service;
        setLocationRelativeTo(parent);
        cmbDlgPersonagemListarTipo.setSelectedItem("TODOS");
        carregarPersonagens();
        getContentPane().setBackground(new Color(230,220,170));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrDlgPersonagemListarResultado = new javax.swing.JScrollPane();
        txtDlgPersonagemListarResultado = new javax.swing.JTextArea();
        btnDlgPersonagemListarFechar = new javax.swing.JButton();
        lblDlgPersonagemListarTipo = new javax.swing.JLabel();
        cmbDlgPersonagemListarTipo = new javax.swing.JComboBox<>();
        lblDlgPersonagemListarIMG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtDlgPersonagemListarResultado.setEditable(false);
        txtDlgPersonagemListarResultado.setColumns(20);
        txtDlgPersonagemListarResultado.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtDlgPersonagemListarResultado.setLineWrap(true);
        txtDlgPersonagemListarResultado.setRows(5);
        txtDlgPersonagemListarResultado.setWrapStyleWord(true);
        scrDlgPersonagemListarResultado.setViewportView(txtDlgPersonagemListarResultado);

        btnDlgPersonagemListarFechar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDlgPersonagemListarFechar.setText("Fechar");
        btnDlgPersonagemListarFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgPersonagemListarFecharActionPerformed(evt);
            }
        });

        lblDlgPersonagemListarTipo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        lblDlgPersonagemListarTipo.setText("Listar por Tipo:");

        cmbDlgPersonagemListarTipo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cmbDlgPersonagemListarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "GUERREIRO", "MAGO", "CLERIGO" }));
        cmbDlgPersonagemListarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDlgPersonagemListarTipoActionPerformed(evt);
            }
        });

        lblDlgPersonagemListarIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManagerListPers.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("Listar Personagens");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(288, 288, 288))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDlgPersonagemListarFechar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDlgPersonagemListarTipo)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDlgPersonagemListarIMG)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cmbDlgPersonagemListarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(scrDlgPersonagemListarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDlgPersonagemListarTipo)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDlgPersonagemListarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(lblDlgPersonagemListarIMG))
                    .addComponent(scrDlgPersonagemListarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDlgPersonagemListarFechar)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que fecha a JDialog {@link DlgPersonagemListar}
     * 
     * @param evt 
     */
    private void btnDlgPersonagemListarFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgPersonagemListarFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnDlgPersonagemListarFecharActionPerformed

    /**
     * Combobox que chama o método {@link DlgPersonagemListar#carregarPersonagens() }
     * 
     * @param evt 
     */
    private void cmbDlgPersonagemListarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDlgPersonagemListarTipoActionPerformed
        carregarPersonagens();
    }//GEN-LAST:event_cmbDlgPersonagemListarTipoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDlgPersonagemListarFechar;
    private javax.swing.JComboBox<String> cmbDlgPersonagemListarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDlgPersonagemListarIMG;
    private javax.swing.JLabel lblDlgPersonagemListarTipo;
    private javax.swing.JScrollPane scrDlgPersonagemListarResultado;
    private javax.swing.JTextArea txtDlgPersonagemListarResultado;
    // End of variables declaration//GEN-END:variables

    /**
    * Método que arrega os personagens de acordo com o tipo selecionado
    */
    private void carregarPersonagens() {
        try {
            String tipoSelecionado = cmbDlgPersonagemListarTipo.getSelectedItem().toString();
            String texto = "";

            for (Personagem p : service.listarPersonagens()) {
                boolean mostrar = false;

                if (tipoSelecionado.equals("TODOS")) {
                    mostrar = true;
                }
                else if (tipoSelecionado.equals("GUERREIRO") && p instanceof Guerreiro) {
                    mostrar = true;
                }
                else if (tipoSelecionado.equals("MAGO") && p instanceof Mago) {
                    mostrar = true;
                }
                else if (tipoSelecionado.equals("CLERIGO") && p instanceof Clerigo) {
                    mostrar = true;
                }
                if (mostrar) {
                    texto += "Nome: " + p.getNome() + " | Vida: " + p.getVida() + "\n";
                }
            }

            if (texto.isEmpty()) {
                texto = "Nenhum personagem encontrado.";
            }
            txtDlgPersonagemListarResultado.setText(texto);

        } catch (Exception e) {
            txtDlgPersonagemListarResultado.setText("Erro ao carregar personagens: " + e.getMessage());
        }
    }

}
