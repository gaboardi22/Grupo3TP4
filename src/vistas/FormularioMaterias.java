
package vistas;

import Entidades.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 3
 */
public class FormularioMaterias extends javax.swing.JInternalFrame {
      DefaultTableModel modelo = new DefaultTableModel();
      public static HashSet<Materia> materias;
    public FormularioMaterias() {
        materias = new HashSet<>();
        initComponents();
        armarCabecera();
        cargarTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTCodMateria = new javax.swing.JTextField();
        jTNombreMateria = new javax.swing.JTextField();
        jTAñoMateria = new javax.swing.JTextField();
        jBSalirMa = new javax.swing.JButton();
        jBGuardarMa = new javax.swing.JButton();
        jBNuevoMa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Año al que pertenece:");

        jBSalirMa.setForeground(new java.awt.Color(0, 102, 255));
        jBSalirMa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_paper_file_document_remove_delete_icon_228133.png"))); // NOI18N
        jBSalirMa.setText("Salir");
        jBSalirMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirMaActionPerformed(evt);
            }
        });

        jBGuardarMa.setForeground(new java.awt.Color(0, 102, 255));
        jBGuardarMa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_paper_file_document_bookmark_icon_228140.png"))); // NOI18N
        jBGuardarMa.setText("Guardar");
        jBGuardarMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarMaActionPerformed(evt);
            }
        });

        jBNuevoMa.setForeground(new java.awt.Color(0, 102, 255));
        jBNuevoMa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_paper_file_document_add_insert_icon_228135.png"))); // NOI18N
        jBNuevoMa.setText("Nuevo");
        jBNuevoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoMaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Materias");

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Codigo de Materia:");

        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Nombre de la Materia:");

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMaterias.setEnabled(false);
        jScrollPane1.setViewportView(jTableMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombreMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jTAñoMateria)
                                    .addComponent(jTCodMateria)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBGuardarMa)
                        .addGap(35, 35, 35)
                        .addComponent(jBNuevoMa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalirMa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardarMa)
                    .addComponent(jBNuevoMa)
                    .addComponent(jBSalirMa))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirMaActionPerformed
      dispose();
    }//GEN-LAST:event_jBSalirMaActionPerformed

    private void jBGuardarMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarMaActionPerformed
        try{
        int idMataria = Integer.parseInt(jTCodMateria.getText());
        String nombre = jTNombreMateria.getText();
         if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la materia no puede estar vacío.");
            return; 
        }
        int anio;
        try{ 
        anio = Integer.parseInt(jTAñoMateria.getText());  
          } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El año de la materia debe ser un número.");
            return; 
        }
        int confirmacion = JOptionPane.showInternalConfirmDialog(this, "¿los datos ingresados son correcto?");
        if(confirmacion == JOptionPane.YES_OPTION){
            Materia materia  = new Materia(idMataria, nombre, anio);
            if (materias.contains(materia)) {
            JOptionPane.showMessageDialog(this, "La materia ya existe.");
            return;
        }
            materias.add(materia);
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Porfavor vuelva a cargar los datos");
            jTCodMateria.setText("");
            jTNombreMateria.setText("");
            jTAñoMateria.setText("");
        } 
        }catch(NumberFormatException  ex){
          JOptionPane.showMessageDialog(this, "El codigo de la materia debe ser un numero");
        }
        
    }//GEN-LAST:event_jBGuardarMaActionPerformed

    private void jBNuevoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoMaActionPerformed
        jTCodMateria.setText("");
        jTNombreMateria.setText("");
        jTAñoMateria.setText("");
    }//GEN-LAST:event_jBNuevoMaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarMa;
    private javax.swing.JButton jBNuevoMa;
    private javax.swing.JButton jBSalirMa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAñoMateria;
    private javax.swing.JTextField jTCodMateria;
    private javax.swing.JTextField jTNombreMateria;
    private javax.swing.JTable jTableMaterias;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Año");
    jTableMaterias.setModel(modelo);
}
private void cargarTabla(){
    modelo.setRowCount(0);
    for (Materia materia : materias) {
        modelo.addRow(new Object[]{
           materia.getIdMateria(),
            materia.getNombre(),
            materia.getAnio()
        });
    }
}
}
