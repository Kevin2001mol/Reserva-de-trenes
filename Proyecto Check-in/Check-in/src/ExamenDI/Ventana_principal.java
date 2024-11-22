package ExamenDI;

import static ExamenDI.Ventana_nueva_reserva.backgroundUsable;
import static ExamenDI.Ventana_nueva_reserva.users;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventana_principal extends javax.swing.JFrame {

    public static Usuario user;
    public static boolean datosRellenos;

    public Ventana_principal(Usuario usuario) {
        user = usuario;
        initComponents();
        RellenarComboBox();
        hacerUsable();

    }

    public Ventana_principal() {//estan cambiadas las letras a sans serif

        initComponents();
        RellenarComboBox();
        hacerUsable();

    }

    public void hacerUsable() {
        panelPrincipal.setBackground(backgroundUsable);
    }

    public void RellenarComboBox() {
        comboCodReserva.removeAllItems();
        for (Usuario usuario : users) {
            comboCodReserva.addItem(usuario.getCodReserva());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        texto_principal = new javax.swing.JLabel();
        comboCodReserva = new javax.swing.JComboBox<>();
        boton_nueva_reserva = new javax.swing.JButton();
        boton_check_in = new javax.swing.JButton();
        checkCondiciones = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        itemBorrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión reservas tren");

        panelPrincipal.setForeground(new java.awt.Color(159, 193, 49));

        texto_principal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        texto_principal.setForeground(new java.awt.Color(159, 193, 49));
        texto_principal.setText("Seleccione código de reserva");

        comboCodReserva.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        comboCodReserva.setForeground(new java.awt.Color(159, 193, 49));
        comboCodReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCodReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodReservaActionPerformed(evt);
            }
        });

        boton_nueva_reserva.setBackground(new java.awt.Color(0, 92, 83));
        boton_nueva_reserva.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        boton_nueva_reserva.setForeground(new java.awt.Color(159, 193, 49));
        boton_nueva_reserva.setText("Agregar Reserva");
        boton_nueva_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nueva_reservaActionPerformed(evt);
            }
        });

        boton_check_in.setBackground(new java.awt.Color(0, 92, 83));
        boton_check_in.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        boton_check_in.setForeground(new java.awt.Color(159, 193, 49));
        boton_check_in.setText("Hacer check-in");
        boton_check_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_check_inActionPerformed(evt);
            }
        });

        checkCondiciones.setBackground(new java.awt.Color(0, 92, 83));
        checkCondiciones.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        checkCondiciones.setForeground(new java.awt.Color(159, 193, 49));
        checkCondiciones.setText("Aceptar condiciones de transporte de la compañia.");
        checkCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCondicionesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExamenDI/train_logo.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(checkCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(texto_principal)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(comboCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_nueva_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(checkCondiciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(texto_principal)
                        .addGap(18, 18, 18)
                        .addComponent(comboCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_nueva_reserva)
                        .addGap(18, 18, 18)
                        .addComponent(boton_check_in)
                        .addGap(69, 69, 69))))
        );

        menuArchivo.setText("Archivo");

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemSalir);

        jMenuBar1.add(menuArchivo);

        menuEdicion.setText("Edición");

        itemBorrar.setText("Borrar todo");
        itemBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBorrarActionPerformed(evt);
            }
        });
        menuEdicion.add(itemBorrar);

        jMenuBar1.add(menuEdicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_check_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_check_inActionPerformed
        //chequear que ha agregado previamente
        if (!datosRellenos) {
            JOptionPane.showMessageDialog(null, "Debes agregar tus datos antes de hacer check-in", "Agregar datos", HEIGHT);
            return;
        }

        if (!(checkCondiciones.isSelected())) {
            JOptionPane.showMessageDialog(null, "Debes aceptar las conciciones previamente", "Aceptar condiciones", HEIGHT);
            return;
        }

        for (Usuario user1 : users) {
            if (comboCodReserva.getSelectedItem().equals(user1.getCodReserva())) {
                int respuesta = JOptionPane.showConfirmDialog(null, "realizar chack-in para :" + user1.toString(), "Términos y condiciones", JOptionPane.OK_CANCEL_OPTION);
                if (respuesta == JOptionPane.OK_OPTION) {
                    checkCondiciones.setSelected(true);
                } else {
                    checkCondiciones.setSelected(false);
                }
            }
        }

    }//GEN-LAST:event_boton_check_inActionPerformed

    private void boton_nueva_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nueva_reservaActionPerformed
        Ventana_nueva_reserva nuevaR = new Ventana_nueva_reserva();
        nuevaR.setVisible(true);
        datosRellenos = true;
        this.dispose();


    }//GEN-LAST:event_boton_nueva_reservaActionPerformed

    private void comboCodReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodReservaActionPerformed

    }//GEN-LAST:event_comboCodReservaActionPerformed

    private void checkCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCondicionesActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n"
                + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum\n"
                + "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n",
                "Términos y condiciones", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            checkCondiciones.setSelected(true);
        } else {
            checkCondiciones.setSelected(false);
        }

        return;
    }//GEN-LAST:event_checkCondicionesActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Adios", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBorrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Vas a borrarlo todo, estas seguro?", "Borrar todo", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            users.removeAll(users);
            comboCodReserva.removeAllItems();
        } else {
            return;
        }
    }//GEN-LAST:event_itemBorrarActionPerformed

    public static void main(String args[]) {
        Usuario usr = new Usuario();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal(usr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_check_in;
    private javax.swing.JButton boton_nueva_reserva;
    private javax.swing.JCheckBox checkCondiciones;
    private javax.swing.JComboBox<String> comboCodReserva;
    private javax.swing.JMenuItem itemBorrar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel texto_principal;
    // End of variables declaration//GEN-END:variables
}
