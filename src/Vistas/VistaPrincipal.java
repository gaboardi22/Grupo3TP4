/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Ezequiel
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMIAgregarAlumno = new javax.swing.JMenuItem();
        jMMaterias = new javax.swing.JMenu();
        jMIaagregarMateria = new javax.swing.JMenuItem();
        jMRegistro = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenu();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMIAgregarAlumno.setText("Agregar Alumno");
        jMIAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgregarAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMIAgregarAlumno);

        jMenuBar.add(jMAlumno);

        jMMaterias.setText("Materia");

        jMIaagregarMateria.setText("Agregar materia");
        jMIaagregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIaagregarMateriaActionPerformed(evt);
            }
        });
        jMMaterias.add(jMIaagregarMateria);

        jMenuBar.add(jMMaterias);

        jMRegistro.setText("Registro");
        jMRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMRegistroMouseClicked(evt);
            }
        });
        jMRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegistroActionPerformed(evt);
            }
        });
        jMenuBar.add(jMRegistro);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenuBar.add(jMSalir);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        jIFagregarAlumno vista = new jIFagregarAlumno();
        escritorio.add(vista);
        vista.show();
    }//GEN-LAST:event_jMIAgregarAlumnoActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed

    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMSalirMouseClicked

    private void jMIaagregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIaagregarMateriaActionPerformed
        // TODO add your handling code here:
        jIFagregarMateria vista = new jIFagregarMateria();
        escritorio.add(vista);
        vista.show();
    }//GEN-LAST:event_jMIaagregarMateriaActionPerformed

    private void jMRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegistroActionPerformed
        // TODO add your handling code here:
        jIFFormularioInscripcion vista = new jIFFormularioInscripcion();
        escritorio.add(vista);
        vista.show();
    }//GEN-LAST:event_jMRegistroActionPerformed

    private void jMRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMRegistroMouseClicked
        // TODO add your handling code here:
        jIFFormularioInscripcion vista = new jIFFormularioInscripcion();
        escritorio.add(vista);
        vista.show();
    }//GEN-LAST:event_jMRegistroMouseClicked

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenuItem jMIAgregarAlumno;
    private javax.swing.JMenuItem jMIaagregarMateria;
    private javax.swing.JMenu jMMaterias;
    private javax.swing.JMenu jMRegistro;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
}
