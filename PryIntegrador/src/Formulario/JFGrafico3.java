package Formulario;
public class JFGrafico3 extends javax.swing.JFrame {
    public JFGrafico3() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ltiempo = new javax.swing.JLabel();
        laltura = new javax.swing.JLabel();
        lalcance = new javax.swing.JLabel();
        lvinicial = new javax.swing.JLabel();
        langulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("seg");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("m");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("m");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel4.setText("=");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel3.setText("=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("9,81 m/s");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        ltiempo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ltiempo.setForeground(new java.awt.Color(255, 0, 0));
        ltiempo.setText("tiempo");
        getContentPane().add(ltiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 40, -1));

        laltura.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        laltura.setForeground(new java.awt.Color(255, 0, 0));
        laltura.setText("altura");
        getContentPane().add(laltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        lalcance.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lalcance.setForeground(new java.awt.Color(0, 102, 102));
        lalcance.setText("alcance");
        getContentPane().add(lalcance, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 50, -1));

        lvinicial.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lvinicial.setForeground(new java.awt.Color(0, 102, 102));
        lvinicial.setText("vi");
        getContentPane().add(lvinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        langulo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        langulo.setForeground(new java.awt.Color(0, 102, 102));
        langulo.setText("angulo");
        getContentPane().add(langulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafica3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String angulo,vinicial,altura,alcance,tiempo;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        langulo.setText(angulo);
        lvinicial.setText(vinicial);
        lalcance.setText(alcance);
        laltura.setText(altura);
        ltiempo.setText(tiempo);   
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
            java.util.logging.Logger.getLogger(JFGrafico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGrafico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGrafico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGrafico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGrafico3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lalcance;
    private javax.swing.JLabel laltura;
    private javax.swing.JLabel langulo;
    private javax.swing.JLabel ltiempo;
    private javax.swing.JLabel lvinicial;
    // End of variables declaration//GEN-END:variables
}
