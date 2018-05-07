package client;

import client.model.Player;
import client.model.Counter;
import client.model.PlayerList;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 *
 * @author cvs
 */
public class ScoreWindow extends javax.swing.JFrame implements Observer {

    private PlayerList playersList;
    private Vector<String> playersListInterface;
    private Player mainPlayer;

    public ScoreWindow(String userName) {
        initComponents();
        this.playersList = new PlayerList();
        Counter c = new Counter();
        this.mainPlayer = new Player(userName);
        System.out.println(this.mainPlayer);
        System.out.println(this.mainPlayer.getScore());
        this.setPuntuacion(this.mainPlayer.getScore());
        this.getJugadores();
        this.setJugadores(this);
        setListData2(this, this.playersListInterface);
        this.setNombreJugador(this.mainPlayer);
        this.setVisible(true);
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

        puntuacionTextInput.setEditable(false);
        puntuacionTextInput.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        puntuacionTextInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        puntuacionTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntuacionTextInputActionPerformed(evt);
            }
        });

        jugadoresList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puntuacionLabel)
                    .addComponent(puntuacionTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugadorTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadorTextInputActionPerformed

    }//GEN-LAST:event_jugadorTextInputActionPerformed

    private void puntuacionTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntuacionTextInputActionPerformed

    }//GEN-LAST:event_puntuacionTextInputActionPerformed

    public String getNombreJugador() {
        return jugadorTextInput.getText();
    }

    public void setNombreJugador(Player jug) {
        this.mainPlayer = jug;
        jugadorTextInput.setText(jug.getPlayerName());
    }

    public String getPuntuacion() {
        return puntuacionTextInput.getText();
    }

    public void setPuntuacion(int c) {
        puntuacionTextInput.setText(Integer.toString(c));

    }

    public void getJugadores() {
        System.out.println("Print 1 " + jugadoresList.getComponentListeners().toString());
        System.out.println("Print 2 " + jugadoresList.getComponentCount());
        System.out.println("Print 3 " + jugadoresList.getComponentListeners().toString());
        System.out.println("Print 4 " + jugadoresList.getFocusListeners().toString());
    }

    public void setJugadores(ScoreWindow w) {
        System.out.println("antes del for ");
        //w.listaJugadores=new ArrayList();
        w.playersList = new PlayerList();
        w.playersListInterface = new Vector();
        w.playersList.addJugador(this.mainPlayer);
        w.playersListInterface.add(this.mainPlayer.getPlayerName() + "....................................................." + Integer.toString(this.mainPlayer.getScore()));
        System.out.println("lista jugadores 1 " + w.playersList);
        for (int i = 0; i < 15; i++) {
            /* Counter cont = new Counter();
            Player jugador = new Player("Player-" + Integer.toString(i), cont);
            w.listaJugadores.addJugador(jugador);
            w.ListaJugadoresInterface.add(jugador.getPlayerName() + "....................................................." + jugador.getScore());
        */ }
        jugadoresList.setListData(w.playersList.getPlayerList());
        System.out.println("lista jugadores 2 " + w.playersList);
        System.out.println("lista jugadores 3 " + w.playersListInterface);
    }

    private static void setListData2(ScoreWindow w, Vector<String> listaJ) {
        w.jugadoresList.setListData(listaJ);
    }

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
            java.util.logging.Logger.getLogger(ScoreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
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

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
