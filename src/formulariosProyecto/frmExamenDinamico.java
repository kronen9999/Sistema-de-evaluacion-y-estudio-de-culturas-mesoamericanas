/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosProyecto;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmExamenDinamico extends javax.swing.JFrame {
    int preguntas,incisos,punto1=0,punto2=0,punto3=0,punto4=0,punto5=0,punto6=0,punto7=0,punto8=0,punto9=0,punto10=0;
    public static String p1[],p2[],p3[],p4[],p5[],p6[],p7[],p8[],p9[],p10[],incisocorrecto[];
    public static int a1=0,b1=0,c1=0,a2=0,b2=0,c2=0,a3=0,b3=0,c3=0,a4=0,b4=0,c4=0,a5=0,b5=0,c5=0,a6=0,b6=0,c6=0,a7=0,b7=0,c7=0,
            a8=0,b8=0,c8=0,a9=0,b9=0,c9=0,a10=0,b10=0,c10=0,avanzar=0;
    
    
    

    /**
     * Creates new form frmExamenDinamico
     */
    public frmExamenDinamico() {
        initComponents();
        this.setLocationRelativeTo(null);
        frmDatosdocente datos =new frmDatosdocente();
        lblEscuela.setText(datos.escuelaDocente);
        lblGradoyGrupo.setText(datos.GradoyGrupo);
        lblMateria.setText(datos.Materia);
        lblNombreDocente.setText(datos.NombreDocente);
        lblPregunta1.setVisible(false);lblPregunta2.setVisible(false);lblPregunta3.setVisible(false);lblPregunta4.setVisible(false);lblPregunta5.setVisible(false);lblPregunta6.setVisible(false);lblPregunta7.setVisible(false);
        lblPregunta8.setVisible(false);lblPregunta9.setVisible(false);lblPregunta10.setVisible(false);
        chboxA1.setVisible(false);chboxA2.setVisible(false);chboxA3.setVisible(false);chboxA4.setVisible(false);chboxA5.setVisible(false);chboxA6.setVisible(false);
        chboxA7.setVisible(false);chboxA8.setVisible(false);chboxA9.setVisible(false);chboxA10.setVisible(false);
        chboxB1.setVisible(false);chboxB2.setVisible(false);chboxB3.setVisible(false);chboxB4.setVisible(false);chboxB5.setVisible(false);chboxB6.setVisible(false);chboxB7.setVisible(false);
        chboxB8.setVisible(false);chboxB9.setVisible(false);chboxB10.setVisible(false);
        chboxC1.setVisible(false); chboxC2.setVisible(false); chboxC3.setVisible(false);chboxC4.setVisible(false);chboxC5.setVisible(false);chboxC6.setVisible(false);
        chboxC7.setVisible(false);chboxC8.setVisible(false);chboxC9.setVisible(false);chboxC10.setVisible(false);
        
        ///////////////////////////////////////////////
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEscuela = new javax.swing.JLabel();
        lblGradoyGrupo = new javax.swing.JLabel();
        lblNombreDocente = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnguardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        chboxA1 = new javax.swing.JRadioButton();
        chboxB1 = new javax.swing.JRadioButton();
        chboxC1 = new javax.swing.JRadioButton();
        lblPregunta1 = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        chboxA2 = new javax.swing.JRadioButton();
        chboxB2 = new javax.swing.JRadioButton();
        chboxC2 = new javax.swing.JRadioButton();
        lblPregunta3 = new javax.swing.JLabel();
        chboxA3 = new javax.swing.JRadioButton();
        chboxB3 = new javax.swing.JRadioButton();
        chboxC3 = new javax.swing.JRadioButton();
        chboxC4 = new javax.swing.JRadioButton();
        chboxA4 = new javax.swing.JRadioButton();
        lblPregunta4 = new javax.swing.JLabel();
        chboxB4 = new javax.swing.JRadioButton();
        lblPregunta5 = new javax.swing.JLabel();
        chboxA5 = new javax.swing.JRadioButton();
        chboxC5 = new javax.swing.JRadioButton();
        chboxB5 = new javax.swing.JRadioButton();
        lblPregunta6 = new javax.swing.JLabel();
        chboxA6 = new javax.swing.JRadioButton();
        chboxB6 = new javax.swing.JRadioButton();
        chboxC6 = new javax.swing.JRadioButton();
        lblPregunta7 = new javax.swing.JLabel();
        chboxA7 = new javax.swing.JRadioButton();
        chboxB7 = new javax.swing.JRadioButton();
        chboxC7 = new javax.swing.JRadioButton();
        lblPregunta8 = new javax.swing.JLabel();
        chboxA8 = new javax.swing.JRadioButton();
        chboxB8 = new javax.swing.JRadioButton();
        chboxC8 = new javax.swing.JRadioButton();
        lblPregunta9 = new javax.swing.JLabel();
        chboxA9 = new javax.swing.JRadioButton();
        chboxB9 = new javax.swing.JRadioButton();
        chboxC9 = new javax.swing.JRadioButton();
        lblPregunta10 = new javax.swing.JLabel();
        chboxA10 = new javax.swing.JRadioButton();
        chboxB10 = new javax.swing.JRadioButton();
        chboxC10 = new javax.swing.JRadioButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 204)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel1.setText("Nombre del docente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel2.setText("Materia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel3.setText("Grado y Grupo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel4.setText("Escuela:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        lblEscuela.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jPanel1.add(lblEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 150, 18));

        lblGradoyGrupo.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jPanel1.add(lblGradoyGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 155, 18));

        lblNombreDocente.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jPanel1.add(lblNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 183, 18));

        lblMateria.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jPanel1.add(lblMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 130, 18));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 580, 10));

        btnguardar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnguardar.setText("Guardar Examen");
        btnguardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 656, 140, 20));

        btnAtras.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 656, 50, 20));

        btnGenerar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnGenerar.setText("Generar examen");
        btnGenerar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 120, 20));
        jPanel1.add(chboxA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel1.add(chboxB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));
        jPanel1.add(chboxC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        lblPregunta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta1.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 440, 23));

        lblPregunta2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta2.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 440, 23));
        jPanel1.add(chboxA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(chboxB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));
        jPanel1.add(chboxC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        lblPregunta3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta3.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 440, 23));
        jPanel1.add(chboxA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));
        jPanel1.add(chboxB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));
        jPanel1.add(chboxC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));
        jPanel1.add(chboxC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));
        jPanel1.add(chboxA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        lblPregunta4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta4.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 440, 23));
        jPanel1.add(chboxB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        lblPregunta5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta5.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 440, 23));
        jPanel1.add(chboxA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));
        jPanel1.add(chboxC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));
        jPanel1.add(chboxB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        lblPregunta6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta6.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 440, 23));
        jPanel1.add(chboxA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));
        jPanel1.add(chboxB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));
        jPanel1.add(chboxC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        lblPregunta7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta7.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 440, 23));
        jPanel1.add(chboxA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));
        jPanel1.add(chboxB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));
        jPanel1.add(chboxC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        lblPregunta8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta8.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 440, 23));
        jPanel1.add(chboxA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));
        jPanel1.add(chboxB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));
        jPanel1.add(chboxC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        lblPregunta9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta9.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 440, 23));
        jPanel1.add(chboxA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));
        jPanel1.add(chboxB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));
        jPanel1.add(chboxC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, -1, -1));

        lblPregunta10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta10.setText("Introduzca su pregunta");
        jPanel1.add(lblPregunta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 440, 23));
        jPanel1.add(chboxA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));
        jPanel1.add(chboxB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));
        jPanel1.add(chboxC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-Examendinamico.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
         if (incisocorrecto[0].equals("a"))
         {
             a1=1;
             b1=0;
             c1=0;
         }
         else  if (incisocorrecto[0].equals("b"))
         {
             a1=0;
             b1=1;
             c1=0;
         }
          else if (incisocorrecto[0].equals("c"))
         {
             a1=0;
             b1=0;
             c1=1;
         }
           if (incisocorrecto[1].equals("a"))
         {
             a2=1;
             b2=0;
             c2=0;
         }
        else if (incisocorrecto[1].equals("b"))
         {
             a2=0;
             b2=1;
             c2=0;
         }
          else if (incisocorrecto[1].equals("c"))
         {
             a2=0;
             b2=0;
             c2=1;
         }
            if (incisocorrecto[2].equals("a"))
         {
             a3=1;
             b3=0;
             c3=0;
         }
        else if (incisocorrecto[2].equals("b"))
         {
             a3=0;
             b3=1;
             c3=0;
         }
          else if (incisocorrecto[2].equals("c"))
         {
             a3=0;
             b3=0;
             c3=1;
         }
          if (incisocorrecto[3].equals("a"))
         {
             a4=1;
             b4=0;
             c4=0;
         }
        else if (incisocorrecto[3].equals("b"))
         {
             a4=0;
             b4=1;
             c4=0;
         }
          else if (incisocorrecto[3].equals("c"))
         {
             a4=0;
             b4=0;
             c4=1;
         }
           if (incisocorrecto[4].equals("a"))
         {
             a5=1;
             b5=0;
             c5=0;
         }
        else if (incisocorrecto[4].equals("b"))
         {
             a5=0;
             b5=1;
             c5=0;
         }
          else if (incisocorrecto[4].equals("c"))
         {
             a5=0;
             b5=0;
             c5=1;
         }
            if (incisocorrecto[5].equals("a"))
         {
             a6=1;
             b6=0;
             c6=0;
         }
        else if (incisocorrecto[5].equals("b"))
         {
             a6=0;
             b6=1;
             c6=0;
         }
          else if (incisocorrecto[5].equals("c"))
         {
             a6=0;
             b6=0;
             c6=1;
         }
          if (incisocorrecto[6].equals("a"))
         {
             a7=1;
             b7=0;
             c7=0;
         }
        else if (incisocorrecto[6].equals("b"))
         {
             a7=0;
             b7=1;
             c7=0;
         }
          else if (incisocorrecto[6].equals("c"))
         {
             a7=0;
             b7=0;
             c7=1;
         }
           if (incisocorrecto[7].equals("a"))
         {
             a8=1;
             b8=0;
             c8=0;
         }
        else if (incisocorrecto[7].equals("b"))
         {
             a8=0;
             b8=1;
             c8=0;
         }
          else if (incisocorrecto[7].equals("c"))
         {
             a8=0;
             b8=0;
             c8=1;
         }
           if (incisocorrecto[8].equals("a"))
         {
             a9=1;
             b9=0;
             c9=0;
         }
        else if (incisocorrecto[8].equals("b"))
         {
             a9=0;
             b9=1;
             c9=0;
         }
          else if (incisocorrecto[8].equals("c"))
         {
             a9=0;
             b9=0;
             c9=1;
         }
          if (incisocorrecto[9].equals("a"))
         {
             a10=1;
             b10=0;
             c10=0;
         }
        else if (incisocorrecto[9].equals("b"))
         {
             a10=0;
             b10=1;
             c10=0;
         }
          else if (incisocorrecto[9].equals("c"))
         {
             a10=0;
             b10=0;
             c10=1;
         }
          JOptionPane.showMessageDialog(null,"Su examen se ha guardado satisfactoriamente\n"
                                         + "su examen generado se puede testear en el\n"
                                         + "apartado Incio/Alumno/Sistema de registro\n"
                                         + "Seleccion");
        avanzar=1;
        frmInicio verfrmInicio=new frmInicio();
        verfrmInicio.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        frmDatosdocente verfrmDatosdocente=new frmDatosdocente();
        verfrmDatosdocente.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        lblPregunta1.setVisible(false);lblPregunta2.setVisible(false);lblPregunta3.setVisible(false);lblPregunta4.setVisible(false);lblPregunta5.setVisible(false);lblPregunta6.setVisible(false);lblPregunta7.setVisible(false);
        lblPregunta8.setVisible(false);lblPregunta9.setVisible(false);lblPregunta10.setVisible(false);
        chboxA1.setVisible(false);chboxA2.setVisible(false);chboxA3.setVisible(false);chboxA4.setVisible(false);chboxA5.setVisible(false);chboxA6.setVisible(false);
        chboxA7.setVisible(false);chboxA8.setVisible(false);chboxA9.setVisible(false);chboxA10.setVisible(false);
        chboxB1.setVisible(false);chboxB2.setVisible(false);chboxB3.setVisible(false);chboxB4.setVisible(false);chboxB5.setVisible(false);chboxB6.setVisible(false);chboxB7.setVisible(false);
        chboxB8.setVisible(false);chboxB9.setVisible(false);chboxB10.setVisible(false);
        chboxC1.setVisible(false); chboxC2.setVisible(false); chboxC3.setVisible(false);chboxC4.setVisible(false);chboxC5.setVisible(false);chboxC6.setVisible(false);
        chboxC7.setVisible(false);chboxC8.setVisible(false);chboxC9.setVisible(false);chboxC10.setVisible(false);
        String incisos []={"null","a)","b)","c)"};
        incisocorrecto=new String[10];
        p1=new String [4];
        p1[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 1");
       for (int i=1;i<=3;i++)
       {
       p1[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta1.setText("1.- "+p1[0]);
       chboxA1.setText("a) "+p1[1]);
       chboxB1.setText("b) "+p1[2]);
       chboxC1.setText("c) "+p1[3]);
       lblPregunta1.setVisible(true);
        chboxA1.setVisible(true);
        chboxB1.setVisible(true);
        chboxC1.setVisible(true);
       incisocorrecto[0]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 1: a,b o c");
       //para pregunta 2
        p2=new String [4];
        p2[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 2");
       for (int i=1;i<=3;i++)
       {
       p2[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta2.setText("2.- "+p2[0]);
       chboxA2.setText("a) "+p2[1]);
       chboxB2.setText("b) "+p2[2]);
       chboxC2.setText("c) "+p2[3]);
       lblPregunta2.setVisible(true);
        chboxA2.setVisible(true);
        chboxB2.setVisible(true);
        chboxC2.setVisible(true);
       incisocorrecto[1]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 2: a,b o c");
       //para pregunta 3
        p3=new String [4];
        p3[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 3");
       for (int i=1;i<=3;i++)
       {
       p3[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta3.setText("3.- "+p3[0]);
       chboxA3.setText("a) "+p3[1]);
       chboxB3.setText("b) "+p3[2]);
       chboxC3.setText("c) "+p3[3]);
       lblPregunta3.setVisible(true);
        chboxA3.setVisible(true);
        chboxB3.setVisible(true);
        chboxC3.setVisible(true);
       incisocorrecto[2]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 3: a,b o c");
       //para pregunta 4
        p4=new String [4];
        p4[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 4");
       for (int i=1;i<=3;i++)
       {
       p4[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta4.setText("4.- "+p4[0]);
       chboxA4.setText("a) "+p4[1]);
       chboxB4.setText("b) "+p4[2]);
       chboxC4.setText("c) "+p4[3]);
       lblPregunta4.setVisible(true);
        chboxA4.setVisible(true);
        chboxB4.setVisible(true);
        chboxC4.setVisible(true);
       incisocorrecto[3]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 4: a,b o c");
        //para pregunta 5
        p5=new String [4];
        p5[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 5");
       for (int i=1;i<=3;i++)
       {
       p5[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta5.setText("5.- "+p5[0]);
       chboxA5.setText("a) "+p5[1]);
       chboxB5.setText("b) "+p5[2]);
       chboxC5.setText("c) "+p5[3]);
       lblPregunta5.setVisible(true);
        chboxA5.setVisible(true);
        chboxB5.setVisible(true);
        chboxC5.setVisible(true);
       incisocorrecto[4]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 5: a,b o c");
        //para pregunta 6
        p6=new String [4];
        p6[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 6");
       for (int i=1;i<=3;i++)
       {
       p6[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta6.setText("6.- "+p6[0]);
       chboxA6.setText("a) "+p6[1]);
       chboxB6.setText("b) "+p6[2]);
       chboxC6.setText("c) "+p6[3]);
       lblPregunta6.setVisible(true);
        chboxA6.setVisible(true);
        chboxB6.setVisible(true);
        chboxC6.setVisible(true);
       incisocorrecto[5]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 6: a,b o c");
        //para pregunta 7
        p7=new String [4];
        p7[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 7");
       for (int i=1;i<=3;i++)
       {
       p7[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta7.setText("7.- "+p7[0]);
       chboxA7.setText("a) "+p7[1]);
       chboxB7.setText("b) "+p7[2]);
       chboxC7.setText("c) "+p7[3]);
       lblPregunta7.setVisible(true);
        chboxA7.setVisible(true);
        chboxB7.setVisible(true);
        chboxC7.setVisible(true);
       incisocorrecto[6]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 7: a,b o c");
       //para pregunta 8
        p8=new String [4];
        p8[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 8");
       for (int i=1;i<=3;i++)
       {
       p8[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta8.setText("8.- "+p8[0]);
       chboxA8.setText("a) "+p8[1]);
       chboxB8.setText("b) "+p8[2]);
       chboxC8.setText("c) "+p8[3]);
       lblPregunta8.setVisible(true);
        chboxA8.setVisible(true);
        chboxB8.setVisible(true);
        chboxC8.setVisible(true);
       incisocorrecto[7]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 8: a,b o c");
       //para pregunta 9
        p9=new String [4];
        p9[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 9");
       for (int i=1;i<=3;i++)
       {
       p9[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta9.setText("9.- "+p9[0]);
       chboxA9.setText("a) "+p9[1]);
       chboxB9.setText("b) "+p9[2]);
       chboxC9.setText("c) "+p9[3]);
       lblPregunta9.setVisible(true);
        chboxA9.setVisible(true);
        chboxB9.setVisible(true);
        chboxC9.setVisible(true);
       incisocorrecto[8]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 9: a,b o c");
       //para pregunta 10
        p10=new String [4];
        p10[0]=JOptionPane.showInputDialog(null,"Introduzca la pregunta numero 10");
       for (int i=1;i<=3;i++)
       {
       p10[i]=JOptionPane.showInputDialog(null,"Introduzca la respuesta para el inciso "+incisos[i]);
       }
       lblPregunta10.setText("10.- "+p10[0]);
       chboxA10.setText("a) "+p10[1]);
       chboxB10.setText("b) "+p10[2]);
       chboxC10.setText("c) "+p10[3]);
       lblPregunta10.setVisible(true);
        chboxA10.setVisible(true);
        chboxB10.setVisible(true);
        chboxC10.setVisible(true);
       incisocorrecto[9]=JOptionPane.showInputDialog(null,"Cual inciso contiene la respuesta correcta de la pregunta 10: a,b o c");
       
    }//GEN-LAST:event_btnGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(frmExamenDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmExamenDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmExamenDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmExamenDinamico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmExamenDinamico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnguardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JRadioButton chboxA1;
    private javax.swing.JRadioButton chboxA10;
    private javax.swing.JRadioButton chboxA2;
    private javax.swing.JRadioButton chboxA3;
    private javax.swing.JRadioButton chboxA4;
    private javax.swing.JRadioButton chboxA5;
    private javax.swing.JRadioButton chboxA6;
    private javax.swing.JRadioButton chboxA7;
    private javax.swing.JRadioButton chboxA8;
    private javax.swing.JRadioButton chboxA9;
    private javax.swing.JRadioButton chboxB1;
    private javax.swing.JRadioButton chboxB10;
    private javax.swing.JRadioButton chboxB2;
    private javax.swing.JRadioButton chboxB3;
    private javax.swing.JRadioButton chboxB4;
    private javax.swing.JRadioButton chboxB5;
    private javax.swing.JRadioButton chboxB6;
    private javax.swing.JRadioButton chboxB7;
    private javax.swing.JRadioButton chboxB8;
    private javax.swing.JRadioButton chboxB9;
    private javax.swing.JRadioButton chboxC1;
    private javax.swing.JRadioButton chboxC10;
    private javax.swing.JRadioButton chboxC2;
    private javax.swing.JRadioButton chboxC3;
    private javax.swing.JRadioButton chboxC4;
    private javax.swing.JRadioButton chboxC5;
    private javax.swing.JRadioButton chboxC6;
    private javax.swing.JRadioButton chboxC7;
    private javax.swing.JRadioButton chboxC8;
    private javax.swing.JRadioButton chboxC9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEscuela;
    private javax.swing.JLabel lblGradoyGrupo;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblNombreDocente;
    private javax.swing.JLabel lblPregunta1;
    private javax.swing.JLabel lblPregunta10;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPregunta3;
    private javax.swing.JLabel lblPregunta4;
    private javax.swing.JLabel lblPregunta5;
    private javax.swing.JLabel lblPregunta6;
    private javax.swing.JLabel lblPregunta7;
    private javax.swing.JLabel lblPregunta8;
    private javax.swing.JLabel lblPregunta9;
    // End of variables declaration//GEN-END:variables
}
