/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Otros;
import java.util.Calendar;

/**
 *
 * @author daniela
 */
public class AgregarOtro extends javax.swing.JFrame {

    Biblioteca biblioteca;
    Autor autor;

    /**
     * Creates new form agregarLibro
     */
    public AgregarOtro() {
        biblioteca = new Biblioteca();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        jTextFieldAutor.setEnabled(false);
        jTextFieldTitulo.setEnabled(false);
        jDateChooserFechaIngreso.setEnabled(false);

    }

    public AgregarOtro(Autor persona) {
        biblioteca = new Biblioteca();
        autor = persona;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        jTextFieldAutor.setText(persona.getNombreUnico());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAgregarLibro = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFechaIngreso = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jDateChooserFechaIngreso = new com.toedter.calendar.JDateChooser();
        jButtonUsuario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Otros");

        jLabelAgregarLibro.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelAgregarLibro.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAgregarLibro.setText("         Agregar Otros");

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setText("Titulo:");

        jLabelFechaIngreso.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelFechaIngreso.setForeground(new java.awt.Color(0, 51, 255));
        jLabelFechaIngreso.setText("Fecha de ingreso:");

        jLabelAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAutor.setText("Autor");

        jButtonAgregar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.setBorder(null);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jDateChooserFechaIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jButtonUsuario1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonUsuario1.setForeground(new java.awt.Color(0, 51, 255));
        jButtonUsuario1.setText("Buscar Usuario");
        jButtonUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAutor)
                            .addComponent(jLabelFechaIngreso))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabelAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelAgregarLibro)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFechaIngreso)
                    .addComponent(jDateChooserFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutor)
                    .addComponent(jButtonUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        OpcionesCatalogo catalogo = new OpcionesCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed

        String titulo = jTextFieldTitulo.getText();
        String dia = Integer.toString(jDateChooserFechaIngreso.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooserFechaIngreso.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(jDateChooserFechaIngreso.getCalendar().get(Calendar.YEAR));
        String fecha = (dia + "-" + mes + "-" + año);
        String nombreAutor = jTextFieldAutor.getText();

        Autor autor = biblioteca.buscaAutorPorNombreUnico(nombreAutor);

        System.out.println(autor.toString());
        Otros otro = new Otros(titulo, fecha, autor);
        biblioteca.agregarCatalogo(otro);
        dispose();

        OpcionesCatalogo catalogo = new OpcionesCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuario1ActionPerformed
        BuscarUsuario buscarUsuario = new BuscarUsuario("Otro", "buscar");
        buscarUsuario.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButtonUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarOtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarOtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarOtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarOtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarOtro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonUsuario1;
    private com.toedter.calendar.JDateChooser jDateChooserFechaIngreso;
    private javax.swing.JLabel jLabelAgregarLibro;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelFechaIngreso;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
