//18:12:21 - 19:45

package Vista;

import Controlador.AccesoA;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */

public class Aplicacion extends javax.swing.JFrame {

    int bandera = 0; //bandera estatica que se activa cuando se cierre sesión
    int dni;//para guardar el dni del entrenador
    
    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() {
        initComponents();
        AccesoA.conectar();
        desactivaComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemPerfil = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemLista1a1 = new javax.swing.JMenuItem();
        jMenuItemAlta = new javax.swing.JMenuItem();
        jMenuItemJList = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();
        jMenuNosotros = new javax.swing.JMenuItem();
        jMenuItemAplicacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("MasQueBasket");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Iniciar Sesión");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelContraseña.setText("Contraseña:");

        jButton.setText("Aceptar");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jMenuUsuario.setText("Usuario");

        jMenuItemPerfil.setText("Perfil");
        jMenuItemPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerfilActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemPerfil);

        jMenuItemCerrarSesion.setText("Cerrar sesión");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemCerrarSesion);

        jMenuBar1.add(jMenuUsuario);

        jMenuOpciones.setText("Opciones");
        jMenuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpcionesActionPerformed(evt);
            }
        });

        jMenuItemLista1a1.setText("Ver jugadores");
        jMenuItemLista1a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLista1a1ActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemLista1a1);

        jMenuItemAlta.setText("Nueva convocatoria");
        jMenuItemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemAlta);

        jMenuItemJList.setText("Ver partidos");
        jMenuOpciones.add(jMenuItemJList);

        jMenuBar1.add(jMenuOpciones);

        jMenuAcercaDe.setText("Acerca de");
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaDeActionPerformed(evt);
            }
        });

        jMenuNosotros.setText("Nosotros");
        jMenuNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNosotrosActionPerformed(evt);
            }
        });
        jMenuAcercaDe.add(jMenuNosotros);

        jMenuItemAplicacion.setText("La aplicación");
        jMenuItemAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAplicacionActionPerformed(evt);
            }
        });
        jMenuAcercaDe.add(jMenuItemAplicacion);

        jMenuBar1.add(jMenuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContraseña)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(21, 21, 21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(54, 54, 54)
                        .addComponent(jLabelContraseña)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_jButtonActionPerformed

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaDeActionPerformed
        
    }//GEN-LAST:event_jMenuAcercaDeActionPerformed

    private void jMenuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpcionesActionPerformed

    }//GEN-LAST:event_jMenuOpcionesActionPerformed

    private void jMenuItemLista1a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLista1a1ActionPerformed
        pLista = new JPanelLista1a1(dni);
        this.setContentPane(pLista);
        //pLista.iniBotones();
        pack();
    }//GEN-LAST:event_jMenuItemLista1a1ActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        cerrarSesion();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void jMenuItemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaActionPerformed
        // TODO add your handling code here:
        pAlta = new JPanelAltaConvocatoria(dni);
        this.setContentPane(pAlta);
        //pLista.iniBotones();
        pack();
    }//GEN-LAST:event_jMenuItemAltaActionPerformed

    private void jMenuItemPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerfilActionPerformed
        // TODO add your handling code here:
        pPerfil = new JPanelPerfil(dni);
        this.setContentPane(pPerfil);
        //pLista.iniBotones();
        pack();
    }//GEN-LAST:event_jMenuItemPerfilActionPerformed

    private void jMenuNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNosotrosActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame,"App realizada por Ignacio Martínez de Carvajal Andrés.");
    }//GEN-LAST:event_jMenuNosotrosActionPerformed

    private void jMenuItemAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAplicacionActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame,"App de gestión de plantilla de entrenadores de baloncesto.");
    }//GEN-LAST:event_jMenuItemAplicacionActionPerformed

    public void iniciarSesion()
    {
        String nombre = jTextFieldNombre.getText();
        //String contraseña = jTextFieldContraseña.getText();
        String contraseña = jPasswordField1.getText();
        
        String consulta1 = "select * from entrenador where nombre = '" + nombre +"' and contraseña = " + contraseña;
        
        if(AccesoA.consultaInicial(nombre, contraseña) == true)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Inicio de sesión realizado con exito.");
            
            dni = AccesoA.sacarDni(nombre);
            
            jMenuBar1.setVisible(true);
            jLabel2.setVisible(false);
            jLabelNombre.setVisible(false);
            jLabelContraseña.setVisible(false);
            jTextFieldNombre.setVisible(false);
            //jTextFieldContraseña.setVisible(false);
            jButton.setVisible(false);
            jPasswordField1.setVisible(false);
            
        }else
        {
             JFrame frame = new JFrame();
             JOptionPane.showMessageDialog(frame,"Nombre o contraseña incorrectos.\nIntentalo de nuevo.");
             jTextFieldNombre.setText("");
             //jTextFieldContraseña.setText("");
             jPasswordField1.setText("");
        }
    }
    
    public void cerrarSesion()
    {
        AccesoA.cerrar();
        
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame,"Se ha cerrado la sesión.");
    }
    
    public void desactivaComponentes()
    {
        jMenuBar1.setVisible(false);
        //jTextFieldContraseña.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
        
    }
    
    private Vista.JPanelLista1a1 pLista;
    private Vista.JPanelAltaConvocatoria pAlta;
    private Vista.JPanelPerfil pPerfil;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAlta;
    private javax.swing.JMenuItem jMenuItemAplicacion;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemJList;
    private javax.swing.JMenuItem jMenuItemLista1a1;
    private javax.swing.JMenuItem jMenuItemPerfil;
    private javax.swing.JMenuItem jMenuNosotros;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}

/*
import java.sql.*;
public class EjemploAccesoBD8 {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
       conexion =
       DriverManager.getConnection("jdbc:mysql://localhost/prueba?useServerPrepStmts=true", "root", "1daw");
       PreparedStatement ps = conexion.prepareStatement("INSERT INTO contactos values (null,?,?,?)");                  
           //Asigno al primer ? el String "Leopoldo".
           //Corresponde al campo nombre de tipo VARCHAR
            ps.setString(1, "Leopoldo");
            // Asigno al segundo ? el String "Pelayo".
            //Corresponde al campo apellidos de tipo VARCHAR
            ps.setString(2, "Pelayo");
            // Asigno al tercer ? el String "987876509".
            //Corresponde al campo telefono de tipo VARCHAR
            ps.setString(3, "999878765");
            // Se ejecuta la operación.
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
*/