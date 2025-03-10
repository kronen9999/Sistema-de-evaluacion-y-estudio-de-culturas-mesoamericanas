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
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author kenor
 */
public class frmResultadosExamengenerado extends javax.swing.JFrame {
frmExamenDinamicoGenerado datos=new frmExamenDinamicoGenerado();
frmDatosdocente datos_docente=new frmDatosdocente();
frmDatosalumno datos_alumno=new frmDatosalumno();
frmExamenDinamico datos_examendinamico=new frmExamenDinamico();
    /**
     * Creates new form frmResultadosExamengenerado
     */
    public frmResultadosExamengenerado() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblPorcentaje.setText(datos.total+" %");
        if (datos.total<30)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\incorrecta.png"));
            lblMensajePromedio.setText("         ¡Definitivamente nesesitas estudiar mas!");
            lblMensajePromedio.setForeground(Color.RED);
        }
         if (datos.total>30&&datos.total<59)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\incorrecta.png"));
            lblMensajePromedio.setText("                   ¡Nesesitas estudiar mas!");
             lblMensajePromedio.setForeground(Color.RED);
        }
        if (datos.total>=59&&datos.total<60)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\incorrecta.png"));
            lblMensajePromedio.setText("                   ¡Sigue esforzandote!");
             lblMensajePromedio.setForeground(Color.RED);
        }
        if (datos.total>=60&&datos.total<=79)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\correcto.png"));
            lblMensajePromedio.setText("        ¡Lo has conseguido pero puedes mejorar!");
            lblMensajePromedio.setForeground(Color.BLUE);
        }
         if (datos.total>=80&&datos.total<=95)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\correcto.png"));
            lblMensajePromedio.setText("                    ¡Muy bien sigue asi!");
             lblMensajePromedio.setForeground(Color.BLUE);
        }
         if (datos.total>=100)
        {
            lblimagenresultados.setIcon(new ImageIcon("C:\\Users\\kenor\\Documents\\NetBeansProjects\\Proyecto_Integrador\\build\\classes\\Imagenes\\correcto.png"));
            lblMensajePromedio.setText("             ¡Felicitaciones Excelente trabajo!");
            lblMensajePromedio.setForeground(Color.BLUE);
        }
        
        
            
        
    
    }
    public void generar(String nombre)throws FileNotFoundException, DocumentException
    {
     if (!(lblPorcentaje.getText().isEmpty()))
     {  
         FileOutputStream archivo=new FileOutputStream(nombre + ".pdf");
         Document documento = new Document();
         PdfWriter.getInstance(documento, archivo);
         documento.open();
         Paragraph parrafo = new Paragraph("Comprobante de Evaluacion Dinamica");
         parrafo.setAlignment(1);
         documento.add(parrafo);
         documento.add(new Paragraph("   "));
         documento.add(new Paragraph("Nombre del docente: "+datos_docente.NombreDocente));
         documento.add(new Paragraph("   "));
         documento.add(new Paragraph("Nombre del alumno: "+datos_alumno.Nombre));
         documento.add(new Paragraph("    "));
         documento.add(new Paragraph("Nombre de la escuela: "+datos_alumno.Escuela));
         documento.add(new Paragraph("    "));
         documento.add(new Paragraph("Grado y grupo : "+datos_alumno.GrupoyGrado));
         documento.add(new Paragraph("     "));
         documento.add(new Paragraph("Promedio :  "+lblPorcentaje.getText()));
         documento.add(new Paragraph("     "));
         Paragraph parrafoTitulo = new Paragraph("Resultados de su evaluacion");
         parrafoTitulo.setAlignment(1);
         documento.add(parrafoTitulo);
         documento.add(new Paragraph("   "));
         documento.add(new Paragraph("   "));
         if (datos.punto1==1)
         {
           documento.add(new Paragraph(" Pregunta 1.-  "+datos_examendinamico.p1[0]+"  Correcta"));  
         }
         else if (datos.punto1==0)  
         {
             documento.add(new Paragraph(" Pregunta 1.-  "+datos_examendinamico.p1[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto2==1)
         {
           documento.add(new Paragraph(" Pregunta 2.-  "+datos_examendinamico.p2[0]+"  Correcta"));  
         }
         else if (datos.punto2==0)
         {
             documento.add(new Paragraph(" Pregunta 2.-  "+datos_examendinamico.p2[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto3==1)
         {
           documento.add(new Paragraph(" Pregunta 3.-  "+datos_examendinamico.p3[0]+"  Correcta"));  
         }
         else if (datos.punto3==0)
         {
             documento.add(new Paragraph(" Pregunta 3.-  "+datos_examendinamico.p3[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto4==1)
         {
           documento.add(new Paragraph(" Pregunta 4.-  "+datos_examendinamico.p4[0]+"  Correcta"));  
         }
         else if (datos.punto4==0)
         {
             documento.add(new Paragraph(" Pregunta 4.-  "+datos_examendinamico.p4[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto5==1)
         {
           documento.add(new Paragraph(" Pregunta 5.-  "+datos_examendinamico.p5[0]+"  Correcta"));  
         }
         else if (datos.punto5==0)
         {
             documento.add(new Paragraph(" Pregunta 5.-  "+datos_examendinamico.p5[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto6==1)
         {
           documento.add(new Paragraph(" Pregunta 6.-  "+datos_examendinamico.p6[0]+"  Correcta"));  
         }
         else if (datos.punto6==0)
         {
             documento.add(new Paragraph(" Pregunta 6.-  "+datos_examendinamico.p6[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto7==1)
         {
           documento.add(new Paragraph(" Pregunta 7.-  "+datos_examendinamico.p7[0]+"  Correcta"));  
         }
         else if (datos.punto7==0)
         {
             documento.add(new Paragraph(" Pregunta 7.-  "+datos_examendinamico.p7[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto8==1)
         {
           documento.add(new Paragraph(" Pregunta 8.-  "+datos_examendinamico.p8[0]+"  Correcta"));  
         }
         else if (datos.punto8==0)
         {
             documento.add(new Paragraph(" Pregunta 8.-  "+datos_examendinamico.p8[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto9==1)
         {
           documento.add(new Paragraph(" Pregunta 9.-  "+datos_examendinamico.p9[0]+"  Correcta"));  
         }
         else if (datos.punto9==0)
         {
             documento.add(new Paragraph(" Pregunta 9.-  "+datos_examendinamico.p9[0]+"  Incorrecta"));
         }
         documento.add(new Paragraph("     ")); 
         if (datos.punto10==1)
         {
           documento.add(new Paragraph(" Pregunta 10.-  "+datos_examendinamico.p10[0]+"  Correcta"));  
         }
         else if (datos.punto10==0)
         {
             documento.add(new Paragraph(" Pregunta 10.-  "+datos_examendinamico.p10[0]+"  Incorrecta"));
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

        jPanel1 = new javax.swing.JPanel();
        btnPdf = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMensajePromedio = new javax.swing.JLabel();
        lblimagenresultados = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPdf.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnPdf.setText("Comprobante de examen");
        btnPdf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0)));
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 180, 20));

        btnAceptar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar.setText("Salir");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0)));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 100, 20));

        btnSeleccion.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnSeleccion.setText("Realizar otra evaluacion");
        btnSeleccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0)));
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 160, 20));

        btnAceptar1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnAceptar1.setText("Regresar al inicio");
        btnAceptar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0)));
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 130, 20));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("de su examen  fue:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        lblPorcentaje.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(lblPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 80, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Su porcentaje de aciertos ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 8, 260, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Itsao-Logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 240, 240));

        lblMensajePromedio.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(lblMensajePromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 390, 40));

        lblimagenresultados.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(lblimagenresultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 170, 170));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-ResultadosExamenDinamico.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

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

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        try {
            generar("Evaluacion de "+datos_docente.Materia+" Para el grupo "+datos_docente.GradoyGrupo);}
            catch (FileNotFoundException ex){
             Logger.getLogger(Setup.class.getName()).log(Level.SEVERE,null,ex);       }
        catch (DocumentException ex) {
        Logger.getLogger(Setup.class.getName()).log(Level.SEVERE,null,ex);}
        abrir("Evaluacion de "+datos_docente.Materia+" Para el grupo "+datos_docente.GradoyGrupo+".pdf");
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        // TODO add your handling code here:
        frmSeleccion verfrmSeleccion=new frmSeleccion();
        verfrmSeleccion.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
        frmInicio verfrmInicio=new frmInicio();
        verfrmInicio.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmResultadosExamengenerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmResultadosExamengenerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmResultadosExamengenerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmResultadosExamengenerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmResultadosExamengenerado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensajePromedio;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblimagenresultados;
    // End of variables declaration//GEN-END:variables
}
