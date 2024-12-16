/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Eventos
     */
    public Eventos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao1 = new javax.swing.JButton();
        campoTexto = new javax.swing.JLabel();
        botao2 = new javax.swing.JButton();
        campoTexto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botao1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Botao1.setText("CLIQUE");
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        campoTexto.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        campoTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoTexto.setText(" ");

        botao2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        botao2.setText("PASSE O MOUSE");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao2MouseExited(evt);
            }
        });
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        campoTexto2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        campoTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoTexto2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Botao1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addComponent(campoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Botao1)
                .addGap(27, 27, 27)
                .addComponent(botao2)
                .addGap(18, 18, 18)
                .addComponent(campoTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        campoTexto.setText("voce clicou no botao");
    }//GEN-LAST:event_Botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseEntered
        campoTexto2.setText("BOM DIIIIA!!!!!");
    }//GEN-LAST:event_botao2MouseEntered

    private void botao2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseExited
        campoTexto2.setText(" ");
    }//GEN-LAST:event_botao2MouseExited

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
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JLabel campoTexto;
    private javax.swing.JLabel campoTexto2;
    // End of variables declaration//GEN-END:variables
}
