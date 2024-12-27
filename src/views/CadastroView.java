/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DAO.ContinenteDAO;
import DAO.PaisDAO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Continente;
import models.Pais;



public class CadastroView extends javax.swing.JFrame {

    public CadastroView() {
        initComponents();
        ContinenteDAO contDao = new ContinenteDAO();
        ArrayList<Continente> listaContinentes = new ArrayList<>();
        listaContinentes = contDao.listar();

        for (Continente cont : listaContinentes) {
            idContinente.addItem(cont.getNome());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeContinente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomePais = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idContinente = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        fundoCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastramento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        txtNomeContinente.setBackground(new java.awt.Color(51, 51, 51));
        txtNomeContinente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNomeContinente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 250, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escreva o continente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 46));

        txtNomePais.setBackground(new java.awt.Color(51, 51, 51));
        txtNomePais.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNomePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 210, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 210, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escreva o país:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 46));

        idContinente.setBackground(new java.awt.Color(51, 51, 51));
        idContinente.setForeground(new java.awt.Color(200, 200, 200));
        idContinente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o continente..." }));
        idContinente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idContinenteActionPerformed(evt);
            }
        });
        jPanel1.add(idContinente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 210, 34));

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Lista");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 237, 42));

        fundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/1.jpg"))); // NOI18N
        fundoCadastro.setText("jLabel4");
        fundoCadastro.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(fundoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 573, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nome = txtNomeContinente.getText();
        Continente continente = new Continente();
        continente.setNome(nome);

        ContinenteDAO contDao = new ContinenteDAO();
        contDao.cadastrar(continente);

        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        txtNomeContinente.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String nomePais = txtNomePais.getText();
        String nomeContinente = idContinente.getSelectedItem().toString();
        ContinenteDAO contDao = new ContinenteDAO();
        int continenteId = contDao.buscarIdContinente(nomeContinente);
        
        Pais pais = new Pais();
        pais.setNome(nomePais);
        pais.setIdCont(continenteId);

        PaisDAO paisDao = new PaisDAO();
        paisDao.cadastrar(pais);

        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        txtNomePais.setText("");
        idContinente.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idContinenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idContinenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idContinenteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ListaView listaview = new ListaView();
        listaview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundoCadastro;
    private javax.swing.JComboBox idContinente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNomeContinente;
    private javax.swing.JTextField txtNomePais;
    // End of variables declaration//GEN-END:variables
}
