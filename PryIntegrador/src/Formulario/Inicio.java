package Formulario;
import Clases.*;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    int tipo;
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAlturaVL = new javax.swing.JTextField();
        txtVelocidadVL = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAnguloDA = new javax.swing.JTextField();
        txtVelocidadDA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDistanciaDA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnRecordar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        Panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnguloCC = new javax.swing.JTextField();
        txtVelocidadCC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnFormulas = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Grafica = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        xAlcance = new javax.swing.JLabel();
        xAltura = new javax.swing.JLabel();
        xVelocidadFinal = new javax.swing.JLabel();
        xSubida = new javax.swing.JLabel();
        xTotal = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Velocidad de Llegada"));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Ingrese Altura:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Ingrese Velocidad:");

        txtAlturaVL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaVLKeyTyped(evt);
            }
        });

        txtVelocidadVL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVelocidadVLKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel16.setText("m");

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel17.setText("m/s");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(txtAlturaVL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(txtVelocidadVL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlturaVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVelocidadVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setBackground(new java.awt.Color(153, 204, 255));
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        txtProcedimiento.setForeground(new java.awt.Color(153, 0, 0));
        txtProcedimiento.setRows(5);
        txtProcedimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtProcedimiento);

        jTabbedPane2.addTab("Procedimiento", jScrollPane2);

        btnSalir.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(95, 70));
        btnSalir.setMinimumSize(new java.awt.Dimension(95, 70));
        btnSalir.setPreferredSize(new java.awt.Dimension(95, 70));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(95, 70));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(95, 70));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(95, 70));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        Panel3.setBackground(new java.awt.Color(255, 255, 255));
        Panel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Determinar Altura"));
        Panel3.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Ingrese Angulo:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Ingrese Velocidad:");

        txtAnguloDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnguloDAKeyTyped(evt);
            }
        });

        txtVelocidadDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVelocidadDAKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Ingrese Distancia:");

        txtDistanciaDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistanciaDAKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel18.setText("°");

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel19.setText("m/s");

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel20.setText("m");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(txtVelocidadDA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(txtAnguloDA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(txtDistanciaDA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAnguloDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVelocidadDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDistanciaDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap())
        );

        btnRecordar.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnRecordar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recordar.png"))); // NOI18N
        btnRecordar.setText("Recordar");
        btnRecordar.setMaximumSize(new java.awt.Dimension(95, 70));
        btnRecordar.setMinimumSize(new java.awt.Dimension(95, 70));
        btnRecordar.setPreferredSize(new java.awt.Dimension(95, 70));
        btnRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setText("TIROS PARABÓLICOS");

        cb1.setBackground(new java.awt.Color(153, 153, 153));
        cb1.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Calculo Completo", "Velocidad de Llegada", "Determinar Altura" }));
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculo Completo"));
        Panel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese Angulo:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese Velocidad:");

        txtAnguloCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnguloCCKeyTyped(evt);
            }
        });

        txtVelocidadCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVelocidadCCKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel14.setText("°");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel15.setText("m/s");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(txtAnguloCC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(txtVelocidadCC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAnguloCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVelocidadCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(20, 20, 20))
        );

        btnFormulas.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnFormulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formulas.png"))); // NOI18N
        btnFormulas.setText("Formulas");
        btnFormulas.setMaximumSize(new java.awt.Dimension(95, 70));
        btnFormulas.setMinimumSize(new java.awt.Dimension(95, 70));
        btnFormulas.setPreferredSize(new java.awt.Dimension(95, 70));
        btnFormulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormulasActionPerformed(evt);
            }
        });

        jTabbedPane1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Grafica.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        Grafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafica.png"))); // NOI18N
        Grafica.setText(" Grafica");
        Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Alcance");

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Altura Maxima");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Velocidad Final");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Tiempo Subida");

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Tiempo Total");

        xAlcance.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        xAlcance.setForeground(new java.awt.Color(255, 0, 51));
        xAlcance.setText("???");

        xAltura.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        xAltura.setForeground(new java.awt.Color(255, 0, 51));
        xAltura.setText("???");

        xVelocidadFinal.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        xVelocidadFinal.setForeground(new java.awt.Color(255, 0, 51));
        xVelocidadFinal.setText("???");

        xSubida.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        xSubida.setForeground(new java.awt.Color(255, 0, 51));
        xSubida.setText("???");

        xTotal.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        xTotal.setForeground(new java.awt.Color(255, 0, 51));
        xTotal.setText("???");
        xTotal.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xAlcance)
                    .addComponent(xAltura)
                    .addComponent(xVelocidadFinal))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(xSubida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Grafica)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(xAlcance))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xSubida)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(xVelocidadFinal)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(xAltura)
                                .addComponent(jLabel13)
                                .addComponent(xTotal))))
                    .addComponent(Grafica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resultados", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnCalcular)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecordar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFormulas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)
                    .addComponent(jTabbedPane2))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnRecordar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFormulas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculoCompleto(){
     if(txtAnguloCC.getText().length()!=0 && txtVelocidadCC.getText().length()!=0){
           
       if( Double.parseDouble(txtAnguloCC.getText()) > 0  && Double.parseDouble(txtAnguloCC.getText()) < 90){
        double a=Double.parseDouble(txtAnguloCC.getText());
        double v=Double.parseDouble(txtVelocidadCC.getText());
        
        AlcanceTiro obj1=new AlcanceTiro(a,v);
        txtProcedimiento.append(obj1.Procedimiento());
        xAlcance.setText(String.valueOf(obj1.Resultado()));
        
        Alturamaxima obj2=new Alturamaxima(a,v);
        txtProcedimiento.append(obj2.Procedimiento());
        xAltura.setText(String.valueOf(obj2.Resultado()));
        
        VelocidadFinalTiro obj3=new VelocidadFinalTiro(a,v);
        txtProcedimiento.append(obj3.Procedimiento());
        xVelocidadFinal.setText(String.valueOf(obj3.Resultado()));
        
        TiempoTotalTiro obj4=new TiempoTotalTiro(a,v);
        txtProcedimiento.append(obj4.Procedimiento());
        xTotal.setText(String.valueOf(obj4.Resultado()));
        
        TiempoSubida obj5=new TiempoSubida(a,v);
        txtProcedimiento.append(obj5.Procedimiento());
        xSubida.setText(String.valueOf(obj5.Resultado()));
             
        }else{
             JOptionPane.showMessageDialog(null,"Ingrese el angulo de 0 a 90");
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ingresaste los datos");
        } 
    }
    
    public void VelocidadLlegada(){
        
        if(txtVelocidadVL.getText().length()!=0 && txtAlturaVL.getText().length()!=0){
        
        double v=Double.parseDouble(txtVelocidadVL.getText());
        double al=Double.parseDouble(txtAlturaVL.getText());
        
        
        VelocidadLlegada obj=new VelocidadLlegada(v,al);
        txtProcedimiento.append(obj.Procedimiento());
        xVelocidadFinal.setText(String.valueOf(obj.Resultado()));      
        xAlcance.setText("...");
        xAltura.setText("...");
        xSubida.setText("...");
        xTotal.setText("...");
        
        }else{
            JOptionPane.showMessageDialog(null,"No ingresaste los datos");
        }
    } 
    
    public void DeterminarAltura(){
        
       if(txtAnguloDA.getText().length()!=0 && txtVelocidadDA.getText().length()!=0 && txtDistanciaDA.getText().length()!=0){
        
        double a=Double.parseDouble(txtAnguloDA.getText());
        double v=Double.parseDouble(txtVelocidadDA.getText());
        double alc=Double.parseDouble(txtDistanciaDA.getText());
        
        DeterminarAltura da=new DeterminarAltura(a,v,alc);
        txtProcedimiento.append(da.Procedimiento());
        xAltura.setText(String.valueOf(da.Resultado()));
        xTotal.setText(String.valueOf(da.Tiempo()));
        xVelocidadFinal.setText("...");
        xAlcance.setText("...");
        xSubida.setText("...");
        
        }else{
            JOptionPane.showMessageDialog(null,"No ingresaste los datos");
        }
    }
    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
      tipo=cb1.getSelectedIndex();
        if(tipo==1){
            Panel1.setVisible(true);
            Panel2.setVisible(false);
            Panel3.setVisible(false); 
        }
        if(tipo==2){
            Panel2.setVisible(true);
            Panel1.setVisible(false);
            Panel3.setVisible(false); 
        } 
        if(tipo==3){
            Panel3.setVisible(true);
            Panel1.setVisible(false);
            Panel2.setVisible(false); 
        } 
    }//GEN-LAST:event_cb1ItemStateChanged
 
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtProcedimiento.setText("");
        txtAnguloCC.setText("");
        txtVelocidadCC.setText("");
        txtAlturaVL.setText("");
        txtVelocidadVL.setText("");
        txtAnguloDA.setText("");
        txtVelocidadDA.setText("");
        txtDistanciaDA.setText("");
        xAlcance.setText("???");
        xAltura.setText("???");
        xVelocidadFinal.setText("???");
        xSubida.setText("???");
        xTotal.setText("???");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficaActionPerformed
     if(cb1.getSelectedIndex() == 1){          
        String a,vi,alc,alt,vf,ti ;
        a=txtAnguloCC.getText();
        vi=txtVelocidadCC.getText();
        alc=xAlcance.getText();
        alt=xAltura.getText();
        vf=xVelocidadFinal.getText();
        ti=xSubida.getText();      
        
        JFGrafico1 gr1=new JFGrafico1();
        gr1.angulo=a;
        gr1.vinicial=vi;
        gr1.alcance=alc;
        gr1.altura=alt;
        gr1.vfinal=vf;
        gr1.tiempo=ti;
        gr1.setVisible(true);   
    }
    else if(cb1.getSelectedIndex() == 2){
        String vi,alt,v ;
        vi=txtVelocidadVL.getText();        
        alt=txtAlturaVL.getText();
        v=xVelocidadFinal.getText();  
        
        JFGrafico2 gr2=new JFGrafico2();
        gr2.vi=vi;
        gr2.alt=alt;
        gr2.vf=v;
        gr2.setVisible(true);
    } 
     else if(cb1.getSelectedIndex() == 3){
        String a,vi,alc,alt,ti ;
        a=txtAnguloDA.getText();
        vi=txtVelocidadDA.getText();
        alc=txtDistanciaDA.getText();
        alt=xAltura.getText();
        ti=xTotal.getText();      
        
        JFGrafico3 gr1=new JFGrafico3();
        gr1.angulo=a;
        gr1.vinicial=vi;
        gr1.alcance=alc;
        gr1.altura=alt;
        gr1.tiempo=ti;
        gr1.setVisible(true);   
    } 
    }//GEN-LAST:event_GraficaActionPerformed

    private void btnRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordarActionPerformed
        JFRecordar fr2 = new JFRecordar(); 
        fr2.setVisible(true);
    }//GEN-LAST:event_btnRecordarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        switch (cb1.getSelectedIndex()) {
            case 1:
            CalculoCompleto();
            break;
            case 2:
            VelocidadLlegada();
            break;
            case 3:
            DeterminarAltura();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFormulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormulasActionPerformed
        JFormulario fr = new JFormulario(); 
        fr.setVisible(true);
    }//GEN-LAST:event_btnFormulasActionPerformed

    private void txtAnguloCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnguloCCKeyTyped
    char car = evt.getKeyChar();
    if(txtAnguloCC.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtAnguloCCKeyTyped

    private void txtVelocidadCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVelocidadCCKeyTyped
    char car = evt.getKeyChar();
    if(txtVelocidadCC.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtVelocidadCCKeyTyped

    private void txtAlturaVLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaVLKeyTyped
    char car = evt.getKeyChar();
    if(txtAlturaVL.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtAlturaVLKeyTyped

    private void txtVelocidadVLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVelocidadVLKeyTyped
    char car = evt.getKeyChar();
    if(txtVelocidadVL.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtVelocidadVLKeyTyped

    private void txtAnguloDAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnguloDAKeyTyped
    char car = evt.getKeyChar();
    if(txtAnguloDA.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtAnguloDAKeyTyped

    private void txtVelocidadDAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVelocidadDAKeyTyped
    char car = evt.getKeyChar();
    if(txtVelocidadDA.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtVelocidadDAKeyTyped

    private void txtDistanciaDAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistanciaDAKeyTyped
    char car = evt.getKeyChar();
    if(txtDistanciaDA.getText().length()>=8) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtDistanciaDAKeyTyped
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Grafica;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFormulas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRecordar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAlturaVL;
    private javax.swing.JTextField txtAnguloCC;
    private javax.swing.JTextField txtAnguloDA;
    private javax.swing.JTextField txtDistanciaDA;
    private javax.swing.JTextArea txtProcedimiento;
    private javax.swing.JTextField txtVelocidadCC;
    private javax.swing.JTextField txtVelocidadDA;
    private javax.swing.JTextField txtVelocidadVL;
    private javax.swing.JLabel xAlcance;
    private javax.swing.JLabel xAltura;
    private javax.swing.JLabel xSubida;
    private javax.swing.JLabel xTotal;
    private javax.swing.JLabel xVelocidadFinal;
    // End of variables declaration//GEN-END:variables
}
