package client;

/**
 *
 * @author cvs
 */
public class score_window extends javax.swing.JFrame {

    public score_window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugadorLabel = new javax.swing.JLabel();
        jugadorTextInput = new javax.swing.JTextField();
        puntuacionLabel = new javax.swing.JLabel();
        puntuacionTextInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jugadoresList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jugadorLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jugadorLabel.setText("Jugador : ");

        jugadorTextInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jugadorTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadorTextInputActionPerformed(evt);
            }
        });

        puntuacionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        puntuacionLabel.setText("Puntuacion : ");

        puntuacionTextInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        puntuacionTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntuacionTextInputActionPerformed(evt);
            }
        });

        jugadoresList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jugadoresList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Jugador 1                                               123", "Jugador 2                                               178", "Jugador 3                                                 50", "Jugador 4                                                 34", "Jugador 5                                               345", "Jugador 6                                                 23" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jugadoresList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(puntuacionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntuacionTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jugadorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jugadorTextInput)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugadorTextInput)
                    .addComponent(jugadorLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntuacionLabel)
                    .addComponent(puntuacionTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugadorTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadorTextInputActionPerformed
        
    }//GEN-LAST:event_jugadorTextInputActionPerformed

    private void puntuacionTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntuacionTextInputActionPerformed
        
    }//GEN-LAST:event_puntuacionTextInputActionPerformed

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
            java.util.logging.Logger.getLogger(score_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(score_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(score_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(score_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new score_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jugadorLabel;
    private javax.swing.JTextField jugadorTextInput;
    private javax.swing.JList jugadoresList;
    private javax.swing.JLabel puntuacionLabel;
    private javax.swing.JTextField puntuacionTextInput;
    // End of variables declaration//GEN-END:variables
}
