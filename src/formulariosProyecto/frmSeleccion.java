/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosProyecto;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmSeleccion extends javax.swing.JFrame {
    frmExamenDinamico datoe=new frmExamenDinamico();
    frmDatosdocente datod=new frmDatosdocente();
    
    
    

    /**
     * Creates new form frmSeleccion
     */
    public frmSeleccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        frmDatosalumno dato=new frmDatosalumno();
       // lblUsuario.setText("Usuario: "+dato.Nombre+"  Escuela: "+dato.Escuela);
        txaInfo.setLineWrap(true);
        txaInfo.setWrapStyleWord(true);
        txaInfo.setText("");
            txaInfo.setText("Comenzara con una lectura de comprension acerca de"
                          + " las culturas mesoamericanas ,despues  un  memorama"
                          + " diseñado para aportar algunos datos interesantes y"
                          + " para finalizar un examen diagonsitico donde  se le"
                          + " aplicara una evaluacion de incisos.");
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbCulturas = new javax.swing.JComboBox();
        btnContinuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInfo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 340, 20));

        btnAtras.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 50, 20));

        btnSalir1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 50, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(La opcion 2 sera habilitada si ha creado un examen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 340, 20));

        jLabel7.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Panel de seleccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, -1));

        jcbCulturas.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jcbCulturas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Evaluacion diagnostica", "Examen generado" }));
        jcbCulturas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 204), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        jcbCulturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCulturasActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCulturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 290, 30));

        btnContinuar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 130, 20));

        txaInfo.setBackground(new java.awt.Color(204, 204, 255));
        txaInfo.setColumns(20);
        txaInfo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txaInfo.setRows(5);
        txaInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), java.awt.Color.blue, java.awt.Color.blue));
        jScrollPane1.setViewportView(txaInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, 140));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por favor seleccione el tipo de evaluacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento2-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento2-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento2-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 100, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento3.2-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 260));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento2-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento3.2-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 260));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento3-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 120, 260));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento3.1-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 250, 90));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Complemento3-seleccion.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 120, 260));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen-Fondo.Seleccion.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        frmDatosalumno verfrmDatosalumno=new frmDatosalumno();
        verfrmDatosalumno.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jcbCulturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCulturasActionPerformed
        // TODO add your handling code here:
        if (jcbCulturas.getSelectedIndex()==0)
        {
            txaInfo.setText("");
            txaInfo.setText("Comenzara con una lectura de comprension acerca de"
                          + " las culturas mesoamericanas ,despues  un  memorama"
                          + " diseñado para aportar algunos datos interesantes y"
                          + " para finalizar un examen diagonsitico donde  se le"
                          + " aplicara una evaluacion de incisos.");
        }
         if (jcbCulturas.getSelectedIndex()==1)
        {
            txaInfo.setText("");
            txaInfo.setText("Si usted ha creado un examen el el apartado "
                          + "del inicio / docente aqui  podra testear  su "
                          + "examen generado anteriormente ");
            if(datoe.avanzar==1)
            {
              txaInfo.setText("Su examen de "+datod.Materia+ " para el "
                            + "grupo  "+datod.GradoyGrupo+"  se guardo correctamente "
                            + "oprima   continuar  para testearlo");  
            }
            
        }
         
          
        
    }//GEN-LAST:event_jcbCulturasActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        if(jcbCulturas.getSelectedIndex()==0)
        {
        frmPreexamen verfrmPreexamen=new frmPreexamen();
        verfrmPreexamen.setVisible(true);
        this.hide();
            
        }
        if (jcbCulturas.getSelectedIndex()==1&&datoe.avanzar==0)
        {
         //JOptionPane.showMessageDialog(null,"Arrastre las imagenes a su lugar correspondiente\n"
                                          //+"una vez haya finalizado por favor oprima continuar","Instrucciones",1);   
        JOptionPane.showMessageDialog(null,"No se ha detectado ningun examen guardado");
        }
        if (jcbCulturas.getSelectedIndex()==1&&datoe.avanzar==1)
        {
         //JOptionPane.showMessageDialog(null,"Arrastre las imagenes a su lugar correspondiente\n"
                                          //+"una vez haya finalizado por favor oprima continuar","Instrucciones",1);   
         frmExamenDinamicoGenerado verfrmExamenDinamicoGenerado= new frmExamenDinamicoGenerado();
         verfrmExamenDinamicoGenerado.setVisible(true);
         this.hide();
        }
      

        
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(frmSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSeleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbCulturas;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txaInfo;
    // End of variables declaration//GEN-END:variables
}
