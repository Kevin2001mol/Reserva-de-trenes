package ExamenDI;

import static ExamenDI.Ventana_principal.datosRellenos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Ventana_nueva_reserva extends javax.swing.JFrame {

    public static Color backgroundUsable = Color.decode("#005C53");
    public static Color botonesUsables = Color.decode("#9FC131");
    public static ArrayList<Usuario> users = new ArrayList();

    public static Border borderojo = BorderFactory.createLineBorder(Color.RED, 2);
    public static Border bordernormal = BorderFactory.createLineBorder(Color.GRAY, 1);

    public Ventana_nueva_reserva() {
        initComponents();
        hacerUsable();

    }

    public void hacerUsable() {
        panelNuevaReserva.setBackground(backgroundUsable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevaReserva = new javax.swing.JPanel();
        field_nombre = new javax.swing.JTextField();
        texto_nombre = new javax.swing.JLabel();
        field_apellidos = new javax.swing.JTextField();
        texto_apellidos = new javax.swing.JLabel();
        field_fecha = new javax.swing.JTextField();
        texto_fecha = new javax.swing.JLabel();
        especificarFormatoFecha_lbl = new javax.swing.JLabel();
        field_correo = new javax.swing.JTextField();
        texto_correo = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        b_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar nueva reserva");
        setLocation(new java.awt.Point(300, 300));

        panelNuevaReserva.setBackground(new java.awt.Color(0, 92, 83));
        panelNuevaReserva.setForeground(new java.awt.Color(159, 193, 49));

        field_nombre.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        texto_nombre.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        texto_nombre.setForeground(new java.awt.Color(159, 193, 49));
        texto_nombre.setText("Nombre");

        field_apellidos.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        texto_apellidos.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        texto_apellidos.setForeground(new java.awt.Color(159, 193, 49));
        texto_apellidos.setText("Apellidos");

        field_fecha.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        field_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_fechaKeyReleased(evt);
            }
        });

        texto_fecha.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        texto_fecha.setForeground(new java.awt.Color(159, 193, 49));
        texto_fecha.setText("Fecha");

        especificarFormatoFecha_lbl.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        especificarFormatoFecha_lbl.setForeground(new java.awt.Color(159, 193, 49));
        especificarFormatoFecha_lbl.setText("El formato de la fecha deberá ser de tipo 00-00-0000");

        field_correo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        field_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_correoKeyReleased(evt);
            }
        });

        texto_correo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        texto_correo.setForeground(new java.awt.Color(159, 193, 49));
        texto_correo.setText("Correo");

        b_cancelar.setBackground(new java.awt.Color(0, 92, 83));
        b_cancelar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(159, 193, 49));
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_aceptar.setBackground(new java.awt.Color(0, 92, 83));
        b_aceptar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        b_aceptar.setForeground(new java.awt.Color(159, 193, 49));
        b_aceptar.setText("Aceptar");
        b_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaReservaLayout = new javax.swing.GroupLayout(panelNuevaReserva);
        panelNuevaReserva.setLayout(panelNuevaReservaLayout);
        panelNuevaReservaLayout.setHorizontalGroup(
            panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaReservaLayout.createSequentialGroup()
                            .addComponent(b_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(b_cancelar)
                            .addGap(97, 97, 97))
                        .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                            .addComponent(texto_correo)
                            .addGap(37, 37, 37)
                            .addComponent(field_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                            .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(texto_nombre)
                                .addComponent(texto_apellidos)
                                .addComponent(texto_fecha))
                            .addGap(27, 27, 27)
                            .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(especificarFormatoFecha_lbl))
                .addGap(56, 56, 56))
        );
        panelNuevaReservaLayout.setVerticalGroup(
            panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_apellidos))
                .addGap(18, 18, 18)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_fecha))
                .addGap(18, 18, 18)
                .addComponent(especificarFormatoFecha_lbl)
                .addGap(18, 18, 18)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_correo))
                .addGap(51, 51, 51)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_aceptar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNuevaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevaReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        Ventana_principal vPrincipal = new Ventana_principal();
        vPrincipal.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_aceptarActionPerformed
        String nombre = field_nombre.getText();
        String apellidos = field_apellidos.getText();
        String correo = field_correo.getText();
        String fecha = field_fecha.getText();
        if (field_nombre.getText().isEmpty() || field_nombre.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "El campo nombre esta vacío o tiene menos de 5 carácteres", "Nombre vacío", HEIGHT);
            return;
        }
        if (field_apellidos.getText().isEmpty() || field_apellidos.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "El campo apellidos esta vacío o tiene menos de 5 carácteres", "Apellidos vacíos", HEIGHT);
            return;
        }
        if (field_correo.getText().isEmpty() || field_correo.getText().length() < 6) {
            JOptionPane.showMessageDialog(null, "El campo correo esta vacío o tiene menos de 5 carácteres", "Correo vacío", HEIGHT);
            return;
        }
        //meter tmbn el de confirmacion del correo
        if (field_correo.getBorder().equals(borderojo)) {
            JOptionPane.showMessageDialog(null, "El formato del correo es inválido", "Correo inválido", HEIGHT);
            return;
        }
        if (field_fecha.getText().isEmpty() || field_fecha.getText().length() < 6) {
            JOptionPane.showMessageDialog(null, "El campo fecha esta vacío o tiene menos de 5 carácteres", "Fecha vacía", HEIGHT);
            return;
        }
        if (field_fecha.getBorder().equals(borderojo)) {
            JOptionPane.showMessageDialog(null, "El formato de la fecha es inválido", "fecha inválida", HEIGHT);
            return;
        }

        Usuario n1 = new Usuario(nombre, apellidos, correo, fecha);
        users.add(n1);
        datosRellenos = true;
        Ventana_principal vPrincipal = new Ventana_principal(users.get(users.size() - 1));
        vPrincipal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_b_aceptarActionPerformed

    private void field_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_correoKeyReleased
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!(field_correo.getText().matches(regex))) {
            field_correo.setBorder(borderojo);
        } else {
            field_correo.setBorder(bordernormal);
        }
    }//GEN-LAST:event_field_correoKeyReleased

    private void field_fechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_fechaKeyReleased
        String regex = "^(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-(\\d{4})$";
        if (!(field_fecha.getText().matches(regex))) {
            field_fecha.setBorder(borderojo);
        } else {
            field_fecha.setBorder(bordernormal);
        }


    }//GEN-LAST:event_field_fechaKeyReleased

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
            java.util.logging.Logger.getLogger(Ventana_nueva_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_nueva_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_nueva_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_nueva_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_nueva_reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_aceptar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel especificarFormatoFecha_lbl;
    private javax.swing.JTextField field_apellidos;
    private javax.swing.JTextField field_correo;
    private javax.swing.JTextField field_fecha;
    private javax.swing.JTextField field_nombre;
    private javax.swing.JPanel panelNuevaReserva;
    private javax.swing.JLabel texto_apellidos;
    private javax.swing.JLabel texto_correo;
    private javax.swing.JLabel texto_fecha;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
