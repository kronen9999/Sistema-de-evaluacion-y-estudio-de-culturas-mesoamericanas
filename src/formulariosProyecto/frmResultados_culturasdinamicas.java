/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosProyecto;

/**
 *
 * @author Usuario
 */
public class frmResultados_culturasdinamicas extends javax.swing.JFrame {
 
    /**
     * Creates new form frmResultados_culturasdinamicas
     */
    public frmResultados_culturasdinamicas() {
        initComponents();
        this.setLocationRelativeTo(null);
        frmDatosalumno dato=new frmDatosalumno();
        
        frmCulturasdinamicas crono=new frmCulturasdinamicas();
        lblTiempototal.setText(crono.tiempototal);
        lblCalificacion.setText(crono.Promedio+"/7 aciertos");
        
        
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
        jLabel1 = new javax.swing.JLabel();
        lblTiempototal = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCalificacion = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ha tenido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        lblTiempototal.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTiempototal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblTiempototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 210, 40));

        btnAceptar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar.setText("Aceptar/Salir");
        btnAceptar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 130, 20));

        btnAceptar1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar1.setText("Regresar a  el inicio");
        btnAceptar1.setBorder(new javax.swing.border.MatteBorder(null));
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 130, 20));

        btnSeleccion.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnSeleccion.setText("Realizar otra evaluacion");
        btnSeleccion.setBorder(new javax.swing.border.MatteBorder(null));
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 160, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tu tiempo fue");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        lblCalificacion.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblCalificacion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 210, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen-Resultados.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
        frmInicio verfrmInicio=new frmInicio();
        verfrmInicio.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        // TODO add your handling code here:
        frmSeleccion verfrmSeleccion=new frmSeleccion();
        verfrmSeleccion.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnSeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(frmResultados_culturasdinamicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmResultados_culturasdinamicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmResultados_culturasdinamicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmResultados_culturasdinamicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmResultados_culturasdinamicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCalificacion;
    private javax.swing.JLabel lblTiempototal;
    // End of variables declaration//GEN-END:variables
}
