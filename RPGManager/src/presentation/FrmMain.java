
package presentation;

import dataModel.RPGService;

/**
 * Classe do JFrame principal do package de presentation.
 * 
 * Nele está contido o método main().
 * 
 * @author Rodrigo Fontes
 */
public class FrmMain extends javax.swing.JFrame {

    private RPGService service;

    /**
     * Método Construtor de {@link FrmMain}
     */
    public FrmMain() {
        initComponents();
        service = new RPGService();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        lblFrmMainIMG = new javax.swing.JLabel();
        mnuFrmMain = new javax.swing.JMenuBar();
        mnuFrmMainPersonagem = new javax.swing.JMenu();
        mnuFrmMainPersonagemCriar = new javax.swing.JMenuItem();
        mnuFrmMainPersonagemListar = new javax.swing.JMenuItem();
        mnuFrmMainPersonagemAtualizar = new javax.swing.JMenuItem();
        mnuFrmMainPersonagemRemover = new javax.swing.JMenuItem();
        mnuFrmMainGrupo = new javax.swing.JMenu();
        mnuFrmMainGrupoCriar = new javax.swing.JMenuItem();
        mnuFrmMainGrupoListar = new javax.swing.JMenuItem();
        mnuFrmMainGrupoAddPersonagem = new javax.swing.JMenuItem();
        mnuFrmMainGrupoListarMembros = new javax.swing.JMenuItem();
        mnuFrmMainGrupoRemover = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Personagens de RPG");

        lblFrmMainIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RPGManager-3.png"))); // NOI18N

        mnuFrmMain.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        mnuFrmMainPersonagem.setText("Personagem");
        mnuFrmMainPersonagem.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N

        mnuFrmMainPersonagemCriar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainPersonagemCriar.setText("Criar");
        mnuFrmMainPersonagemCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainPersonagemCriarActionPerformed(evt);
            }
        });
        mnuFrmMainPersonagem.add(mnuFrmMainPersonagemCriar);

        mnuFrmMainPersonagemListar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainPersonagemListar.setText("Listar");
        mnuFrmMainPersonagemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainPersonagemListarActionPerformed(evt);
            }
        });
        mnuFrmMainPersonagem.add(mnuFrmMainPersonagemListar);

        mnuFrmMainPersonagemAtualizar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainPersonagemAtualizar.setText("Atualizar");
        mnuFrmMainPersonagemAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainPersonagemAtualizarActionPerformed(evt);
            }
        });
        mnuFrmMainPersonagem.add(mnuFrmMainPersonagemAtualizar);

        mnuFrmMainPersonagemRemover.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainPersonagemRemover.setText("Remover");
        mnuFrmMainPersonagemRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainPersonagemRemoverActionPerformed(evt);
            }
        });
        mnuFrmMainPersonagem.add(mnuFrmMainPersonagemRemover);

        mnuFrmMain.add(mnuFrmMainPersonagem);

        mnuFrmMainGrupo.setText("Grupo");
        mnuFrmMainGrupo.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N

        mnuFrmMainGrupoCriar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainGrupoCriar.setText("Criar");
        mnuFrmMainGrupoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainGrupoCriarActionPerformed(evt);
            }
        });
        mnuFrmMainGrupo.add(mnuFrmMainGrupoCriar);

        mnuFrmMainGrupoListar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainGrupoListar.setText("Listar Grupos");
        mnuFrmMainGrupoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainGrupoListarActionPerformed(evt);
            }
        });
        mnuFrmMainGrupo.add(mnuFrmMainGrupoListar);

        mnuFrmMainGrupoAddPersonagem.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainGrupoAddPersonagem.setText("Adicionar Personagem");
        mnuFrmMainGrupoAddPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainGrupoAddPersonagemActionPerformed(evt);
            }
        });
        mnuFrmMainGrupo.add(mnuFrmMainGrupoAddPersonagem);

        mnuFrmMainGrupoListarMembros.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainGrupoListarMembros.setText("Listar Membros");
        mnuFrmMainGrupoListarMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainGrupoListarMembrosActionPerformed(evt);
            }
        });
        mnuFrmMainGrupo.add(mnuFrmMainGrupoListarMembros);

        mnuFrmMainGrupoRemover.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        mnuFrmMainGrupoRemover.setText("Remover Grupo");
        mnuFrmMainGrupoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrmMainGrupoRemoverActionPerformed(evt);
            }
        });
        mnuFrmMainGrupo.add(mnuFrmMainGrupoRemover);

        mnuFrmMain.add(mnuFrmMainGrupo);

        setJMenuBar(mnuFrmMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFrmMainIMG)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFrmMainIMG)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Método que abre o JDialog de {@link DlgPersonagemCriar} através de menu item
     * @param evt 
     */
    private void mnuFrmMainPersonagemCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainPersonagemCriarActionPerformed
        DlgPersonagemCriar dlg = new DlgPersonagemCriar(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainPersonagemCriarActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgPersonagemListar} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainPersonagemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainPersonagemListarActionPerformed
        DlgPersonagemListar dlg = new DlgPersonagemListar(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainPersonagemListarActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgPersonagemRemover} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainPersonagemRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainPersonagemRemoverActionPerformed
        DlgPersonagemRemover dlg = new DlgPersonagemRemover(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainPersonagemRemoverActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgPersonagemAtualizar} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainPersonagemAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainPersonagemAtualizarActionPerformed
        DlgPersonagemAtualizar dlg = new DlgPersonagemAtualizar(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainPersonagemAtualizarActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgGrupoCriar} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainGrupoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainGrupoCriarActionPerformed
        DlgGrupoCriar dlg = new DlgGrupoCriar(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainGrupoCriarActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgGrupoListar} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainGrupoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainGrupoListarActionPerformed
        DlgGrupoListar dlg = new DlgGrupoListar(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainGrupoListarActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgGrupoAddPersonagem} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainGrupoAddPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainGrupoAddPersonagemActionPerformed
        DlgGrupoAddPersonagem dlg = new DlgGrupoAddPersonagem(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainGrupoAddPersonagemActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgGrupoListarMembros} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainGrupoListarMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainGrupoListarMembrosActionPerformed
        DlgGrupoListarMembros dlg = new DlgGrupoListarMembros(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainGrupoListarMembrosActionPerformed

    /**
     * Método que abre o JDialog de {@link DlgGrupoRemover} através de menu item
     * 
     * @param evt 
     */
    private void mnuFrmMainGrupoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrmMainGrupoRemoverActionPerformed
        DlgGrupoRemover dlg = new DlgGrupoRemover(this, true, service);
        dlg.setVisible(true);
    }//GEN-LAST:event_mnuFrmMainGrupoRemoverActionPerformed

    /**
     * 
     * @param args 
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFrmMainIMG;
    private javax.swing.JMenuBar mnuFrmMain;
    private javax.swing.JMenu mnuFrmMainGrupo;
    private javax.swing.JMenuItem mnuFrmMainGrupoAddPersonagem;
    private javax.swing.JMenuItem mnuFrmMainGrupoCriar;
    private javax.swing.JMenuItem mnuFrmMainGrupoListar;
    private javax.swing.JMenuItem mnuFrmMainGrupoListarMembros;
    private javax.swing.JMenuItem mnuFrmMainGrupoRemover;
    private javax.swing.JMenu mnuFrmMainPersonagem;
    private javax.swing.JMenuItem mnuFrmMainPersonagemAtualizar;
    private javax.swing.JMenuItem mnuFrmMainPersonagemCriar;
    private javax.swing.JMenuItem mnuFrmMainPersonagemListar;
    private javax.swing.JMenuItem mnuFrmMainPersonagemRemover;
    // End of variables declaration//GEN-END:variables
}
