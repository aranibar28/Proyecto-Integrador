package Formulario;
public class JFGrafico2 extends javax.swing.JFrame {
    public JFGrafico2() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lv = new javax.swing.JLabel();
        lvx2 = new javax.swing.JLabel();
        laltura = new javax.swing.JLabel();
        lvx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lv.setForeground(new java.awt.Color(255, 51, 51));
        lv.setText("v");
        getContentPane().add(lv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 50, -1));

        lvx2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lvx2.setForeground(new java.awt.Color(0, 102, 102));
        lvx2.setText("vx");
        getContentPane().add(lvx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        laltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        laltura.setForeground(new java.awt.Color(0, 102, 102));
        laltura.setText("h");
        getContentPane().add(laltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lvx.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lvx.setForeground(new java.awt.Color(0, 102, 102));
        lvx.setText("Vx");
        getContentPane().add(lvx, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("m");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafica2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        String vi,alt,vf;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lvx.setText(vi);
        lvx2.setText(vi);
        laltura.setText(alt);     
        lv.setText(vf);
    }//GEN-LAST:event_formWindowActivated
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
            java.util.logging.Logger.getLogger(JFGrafico2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGrafico2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGrafico2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGrafico2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGrafico2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel laltura;
    private javax.swing.JLabel lv;
    private javax.swing.JLabel lvx;
    private javax.swing.JLabel lvx2;
    // End of variables declaration//GEN-END:variables
}
