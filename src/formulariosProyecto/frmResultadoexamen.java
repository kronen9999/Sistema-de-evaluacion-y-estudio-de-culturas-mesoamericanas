/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosProyecto;

import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.scenario.effect.ImageData;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Usuario
 */
public class frmResultadoexamen extends javax.swing.JFrame {
frmDatosalumno datosp = new frmDatosalumno();
frmExamen dato_Examen=new frmExamen();



    /**
     * Creates new form frmResultadoexamen
     */
    public frmResultadoexamen() {
        initComponents();
        this.setLocationRelativeTo(null);
        frmDatosalumno dato=new frmDatosalumno();
        
        frmExamen Promedioex=new frmExamen();
        lblPromedio.setText("    "+Promedioex.total+"%");
        String a=lblPromedio.getText();
        frmCulturasdinamicas crono=new frmCulturasdinamicas();
        lblTiempoMemo.setText(crono.tiempototal);
        if (dato_Examen.total<30)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\incorrecta.png"));
            lblMensajePromedio.setText("         ¡Definitivamente nesesitas estudiar mas!");
            lblMensajePromedio.setForeground(Color.white);
        }
         if (dato_Examen.total>30&&dato_Examen.total<59)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\incorrecta.png"));
            lblMensajePromedio.setText("                   ¡Nesesitas estudiar mas!");
             lblMensajePromedio.setForeground(Color.white);
        }
        if (dato_Examen.total>=59&&dato_Examen.total<60)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\incorrecta.png"));
            lblMensajePromedio.setText("                   ¡Sigue esforzandote!");
             lblMensajePromedio.setForeground(Color.white);
        }
        if (dato_Examen.total>=60&&dato_Examen.total<=79)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\correcto.png"));
            lblMensajePromedio.setText("        ¡Lo has conseguido pero puedes mejorar!");
            lblMensajePromedio.setForeground(Color.GREEN);
        }
         if (dato_Examen.total>=80&&dato_Examen.total<=95)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\correcto.png"));
            lblMensajePromedio.setText("                    ¡Muy bien sigue asi!");
             lblMensajePromedio.setForeground(Color.GREEN);
        }
         if (dato_Examen.total>=100)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\correcto.png"));
            lblMensajePromedio.setText("             ¡Felicitaciones Excelente trabajo!");
            lblMensajePromedio.setForeground(Color.GREEN);
        }
         
        
        
       
                
        
    }
    public void generar(String nombre)throws FileNotFoundException, DocumentException
    {
     if (!(lblPromedio.getText().isEmpty()))
     {  
         FileOutputStream archivo=new FileOutputStream(nombre + ".pdf");
         Document documento = new Document();
         PdfWriter.getInstance(documento, archivo);
         documento.open();
         Paragraph parrafo = new Paragraph("Comprobante de Evaluacion");
         parrafo.setAlignment(1);
         documento.add(parrafo);
         documento.add(new Paragraph("   "));
         documento.add(new Paragraph("Nombre del alumno: "+datosp.Nombre));
         documento.add(new Paragraph("    "));
         documento.add(new Paragraph("Nombre de la escuela: "+datosp.Escuela));
         documento.add(new Paragraph("    "));
         documento.add(new Paragraph("Grado y grupo : "+datosp.GrupoyGrado));
         documento.add(new Paragraph("     "));
         documento.add(new Paragraph("Promedio"+lblPromedio.getText()));
         documento.add(new Paragraph("     "));
         Paragraph parrafo1 = new Paragraph("Resultados del Examen");
         parrafo1.setAlignment(1);
         documento.add(parrafo1);
         documento.add(new Paragraph("     "));
         documento.add(new Paragraph("     "));
         if (dato_Examen.r1==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[0]+"  Correcta"));
         }
         else if(dato_Examen.r1==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[0]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r2==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[1]+"  Correcta"));
         }
         else if(dato_Examen.r2==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[1]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r3==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[2]+"  Correcta"));
         }
         else if(dato_Examen.r3==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[2]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r4==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[3]+" Correcta"));
         }
         else if(dato_Examen.r4==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[3]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r5==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[4]+"  Correcta"));
         }
         else if(dato_Examen.r5==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[4]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r6==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[5]+"  Correcta"));
         }
         else if(dato_Examen.r6==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[5]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r7==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[6]+"  Correcta"));
         }
         else if(dato_Examen.r7==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[6]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r8==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[7]+"  Correcta"));
         }
         else if(dato_Examen.r8==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[7]+"  Incorrecta"));   
         }
         documento.add(new Paragraph("     "));
         if (dato_Examen.r9==1)
         {
         documento.add(new Paragraph(dato_Examen.Pregunta[8]+"  Correcta"));
         }
         else if(dato_Examen.r9==0)
         {
          documento.add(new Paragraph(dato_Examen.Pregunta[8]+"  Incorrecta"));   
         }
         
         
         documento.close();
         
     
     }
    }
     public void abrir(String nombre){
         try{
             File path= new File(nombre);
             Desktop.getDesktop().open(path);}
             catch (Exception ex){
         JOptionPane.showMessageDialog(null,"vacio");
             
     }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPromedio = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        btnAceptar3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblTiempoMemo = new javax.swing.JLabel();
        lblimagenresultados = new javax.swing.JLabel();
        lblMensajePromedio = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiempo de Memorama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        lblPromedio.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPromedio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 130, 50));

        btnAceptar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar.setText("Salir");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 100, 20));

        btnAceptar1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar1.setText("Regresar al inicio");
        btnAceptar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 407, 130, 20));

        btnSeleccion.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnSeleccion.setText("Realizar otra evaluacion");
        btnSeleccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 407, 160, 20));

        btnAceptar3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar3.setText("Comprobante de examen");
        btnAceptar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnAceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 180, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Promedio de Examen:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        lblTiempoMemo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblTiempoMemo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblTiempoMemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 180, 50));

        lblimagenresultados.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel2.add(lblimagenresultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 170));

        lblMensajePromedio.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(lblMensajePromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 380, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen-Resultados.jpg"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar3ActionPerformed
        // TODO add your handling code here:
        try {
            generar("Evaluacion de "+datosp.Nombre);}
            catch (FileNotFoundException ex){
             Logger.getLogger(Setup.class.getName()).log(Level.SEVERE,null,ex);       }
        catch (DocumentException ex) {
        Logger.getLogger(Setup.class.getName()).log(Level.SEVERE,null,ex);}
        abrir("Evaluacion de "+datosp.Nombre+".pdf"); 
    }//GEN-LAST:event_btnAceptar3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmResultadoexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmResultadoexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmResultadoexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmResultadoexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmResultadoexamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar3;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMensajePromedio;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblTiempoMemo;
    private javax.swing.JLabel lblimagenresultados;
    // End of variables declaration//GEN-END:variables
}
