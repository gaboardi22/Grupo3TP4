
package vistas;

/**
 *
 * @author Grupo 3
 */
public class escritorio extends javax.swing.JFrame {

    /**
     * Creates new form escritorio
     */
    public escritorio() {
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

        jDEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMIAgregarAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMIgregarMateria = new javax.swing.JMenuItem();
        jMRegistro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMIAgregarAlumno.setText("Agregar Alumno");
        jMIAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgregarAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMIAgregarAlumno);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMIgregarMateria.setText("Agregar Materia");
        jMIgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIgregarMateriaActionPerformed(evt);
            }
        });
        jMMateria.add(jMIgregarMateria);

        jMenuBar1.add(jMMateria);

        jMRegistro.setText("Registro");

        jMenuItem1.setText("Inscribirse");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMRegistro.add(jMenuItem1);

        jMenuBar1.add(jMRegistro);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgregarAlumnoActionPerformed
       jDEscritorio.removeAll();
       jDEscritorio.repaint();
       FormularioAlumnos a = new FormularioAlumnos();
       a.setVisible(true);
       jDEscritorio.add(a);
       jDEscritorio.moveToFront(a);
    }//GEN-LAST:event_jMIAgregarAlumnoActionPerformed

    private void jMIgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIgregarMateriaActionPerformed
       jDEscritorio.removeAll();
       jDEscritorio.repaint();
       FormularioMaterias a = new FormularioMaterias();
       a.setVisible(true);
       jDEscritorio.add(a);
       jDEscritorio.moveToFront(a);
    }//GEN-LAST:event_jMIgregarMateriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       jDEscritorio.removeAll();
       jDEscritorio.repaint();
       FormularioIncripcion a = new FormularioIncripcion();
       a.setVisible(true);
       jDEscritorio.add(a);
       jDEscritorio.moveToFront(a);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
      
    }//GEN-LAST:event_jMSalirActionPerformed

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
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new escritorio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenuItem jMIAgregarAlumno;
    private javax.swing.JMenuItem jMIgregarMateria;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMRegistro;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
