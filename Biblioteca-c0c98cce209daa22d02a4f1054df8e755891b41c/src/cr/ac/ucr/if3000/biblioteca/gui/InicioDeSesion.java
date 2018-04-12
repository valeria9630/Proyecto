/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Bibliotecario;
import cr.ac.ucr.if3000.biblioteca.domain.Persona;
import cr.ac.ucr.if3000.biblioteca.domain.Usuario;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author daniela
 */
public class InicioDeSesion extends javax.swing.JFrame {

    Biblioteca biblioteca;
    Bibliotecario bibliotecario;
    Autor autor;

    /**
     * Creates new form DatosParaIngresar
     */
    public InicioDeSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();
        bibliotecario = new Bibliotecario("Lupe", DigestUtils.md5Hex("Lupe"), "Guadalupe Goméz Gonzalez", "Extrangera", "M-123");
        biblioteca.agregarPersona(bibliotecario);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabelUsuario.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 51, 255));
        jLabelUsuario.setText("Usuario");

        jLabelContrasena.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(0, 51, 255));
        jLabelContrasena.setText("Contraseña");

        jButtonIniciar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonIniciar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.setBorder(null);
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jLabelImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\ValeriaLeivaQuirós\\Pictures\\imagenesIconos\\iconos\\user.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUsuario)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabelImagen))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jLabelContrasena))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuario)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        String usuarioUnico = jTextFieldUsuario.getText();
        String contraseña = jTextFieldContraseña.getText();

        if (biblioteca.validarNombreUnico(usuarioUnico)) {

            if (biblioteca.validarContraseña(contraseña)) {

                Persona persona = biblioteca.buscarPersonaPorIdentificacion(usuarioUnico);

                if (biblioteca.buscarPersonaPorIdentificacion(usuarioUnico) instanceof Autor) {
                    biblioteca.setIdentificacionPersonaActiva(biblioteca.buscarPersonaPorNombreUnico(usuarioUnico).getIdentificacion());
                    System.out.println("Autor");
                    MenuAutor menuAutor = new MenuAutor();
                    menuAutor.setVisible(true);
                    dispose();

                }
                if (biblioteca.buscarPersonaPorNombreUnico(usuarioUnico) instanceof Usuario) {
                    biblioteca.setIdentificacionPersonaActiva(biblioteca.buscarPersonaPorNombreUnico(usuarioUnico).getIdentificacion());
                    System.out.println("Usuario");
                    MenuUsuario menuUsuario = new MenuUsuario();
                    menuUsuario.setVisible(true);
                    dispose();

                }
                if (biblioteca.buscarPersonaPorNombreUnico(usuarioUnico) instanceof Bibliotecario) {
                    biblioteca.setIdentificacionPersonaActiva(biblioteca.buscarPersonaPorNombreUnico(usuarioUnico).getIdentificacion());
                    System.out.println("Bibliotecologo");
                    MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
                    menuBibliotecologo.setVisible(true);
                    dispose();
                }

            }

        }

//       

    }//GEN-LAST:event_jButtonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}