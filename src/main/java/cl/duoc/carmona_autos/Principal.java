package cl.duoc.carmona_autos;

import cl.duoc.carmona_autos.DTO.*;
import cl.duoc.carmona_autos.Service.*;
import cl.duoc.carmona_autos.Views.*;

public class Principal extends javax.swing.JFrame {

    Clienteapp appc = new Clienteapp();
    Vehiculoapp appv = new Vehiculoapp();
    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        itemRegistarCliente = new javax.swing.JMenuItem();
        menuVehiculo = new javax.swing.JMenu();
        itemRegistrarVehiculo = new javax.swing.JMenuItem();
        menuArriendo = new javax.swing.JMenu();
        itemRegistarArriendo = new javax.swing.JMenuItem();
        itemConsultarArriendo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        menuCliente.setText("Cliente");

        itemRegistarCliente.setText("Registrar");
        itemRegistarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itemRegistarCliente);

        jMenuBar1.add(menuCliente);

        menuVehiculo.setText("Vehiculo");

        itemRegistrarVehiculo.setText("Registrar");
        itemRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarVehiculoActionPerformed(evt);
            }
        });
        menuVehiculo.add(itemRegistrarVehiculo);

        jMenuBar1.add(menuVehiculo);

        menuArriendo.setText("Arriendo");

        itemRegistarArriendo.setText("Registrar");
        itemRegistarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistarArriendoActionPerformed(evt);
            }
        });
        menuArriendo.add(itemRegistarArriendo);

        itemConsultarArriendo.setText("Consultar");
        itemConsultarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarArriendoActionPerformed(evt);
            }
        });
        menuArriendo.add(itemConsultarArriendo);

        jMenuBar1.add(menuArriendo);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void itemRegistarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistarClienteActionPerformed
        vwCliente ventana = new vwCliente();
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemRegistarClienteActionPerformed

    private void itemRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarVehiculoActionPerformed
        vwVehiculo ventana = new vwVehiculo();
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemRegistrarVehiculoActionPerformed

    private void itemRegistarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistarArriendoActionPerformed
        vwArriendo ventana = new vwArriendo();
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemRegistarArriendoActionPerformed

    private void itemConsultarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarArriendoActionPerformed
        vwArriendoconsultar ventana = new vwArriendoconsultar();
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_itemConsultarArriendoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemConsultarArriendo;
    private javax.swing.JMenuItem itemRegistarArriendo;
    private javax.swing.JMenuItem itemRegistarCliente;
    private javax.swing.JMenuItem itemRegistrarVehiculo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArriendo;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuVehiculo;
    // End of variables declaration//GEN-END:variables
}
