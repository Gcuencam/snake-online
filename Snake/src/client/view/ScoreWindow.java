package client.view;

import client.model.Player;
import client.model.Counter;
import client.model.PlayerList;
import client.view.GameWindow;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
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

    public ScoreWindow() {
        initComponents();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - this.getWidth();
        int y = 0;
        this.setLocation(x, y);
        this.playersList = new PlayerList();
        Counter c = new Counter();
        this.mainPlayer = Player.getSingletonInstance();
        this.setPuntuacion(this.mainPlayer.getScore());
        this.getJugadores();
        this.setJugadores(this);
        setListData2(this, this.playersListInterface);
        this.setNombreJugador(this.mainPlayer);
        this.setVisible(true);
                
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.mainPlayer = Player.getSingletonInstance();
        this.setPuntuacion(this.mainPlayer.getScore());
        this.setJugadores(this);
        setListData2(this, this.playersListInterface);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jugadoresList = new javax.swing.JList();
        labelPlayer = new javax.swing.JLabel();
        labelPlayerScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jugadoresList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jugadoresList);

        labelPlayer.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        labelPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer.setText("Player");

        labelPlayerScore.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        labelPlayerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayerScore.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(labelPlayer)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(labelPlayerScore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayer)
                    .addComponent(labelPlayerScore)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getNombreJugador() {
        return labelPlayer.getText();
    }

    public void setNombreJugador(Player jug) {
        this.mainPlayer = jug;
        labelPlayer.setText(jug.getPlayerName());
    }

    public String getPuntuacion() {
        return labelPlayerScore.getText();
    }

    public void setPuntuacion(int c) {
        labelPlayerScore.setText(Integer.toString(c));

    }

    public void getJugadores() {
        /*System.out.println("Print 1 " + jugadoresList.getComponentListeners().toString());
        System.out.println("Print 2 " + jugadoresList.getComponentCount());
        System.out.println("Print 3 " + jugadoresList.getComponentListeners().toString());
        System.out.println("Print 4 " + jugadoresList.getFocusListeners().toString());*/
    }

    public void setJugadores(ScoreWindow w) {
        w.playersList = new PlayerList();
        w.playersListInterface = new Vector();
        w.playersList.addJugador(this.mainPlayer);
        w.playersListInterface.add(this.mainPlayer.getPlayerName() + " - " + Integer.toString(this.mainPlayer.getScore()));
        jugadoresList.setListData(w.playersList.getPlayerList());
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jugadoresList;
    private javax.swing.JLabel labelPlayer;
    private javax.swing.JLabel labelPlayerScore;
    // End of variables declaration//GEN-END:variables

}
