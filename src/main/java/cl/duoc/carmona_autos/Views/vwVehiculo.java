/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.carmona_autos.Views;

import  cl.duoc.carmona_autos.DTO.Vehiculo;
import cl.duoc.carmona_autos.Service.Vehiculoapp;
import javax.swing.JOptionPane;
        
public class vwVehiculo extends javax.swing.JInternalFrame {

    Vehiculoapp appv;
    
    public vwVehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtPatente = new javax.swing.JTextField();
        txtSerieMotor = new javax.swing.JTextField();
        cbxTipoauto = new javax.swing.JComboBox<>();
        lblPatente = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtChasis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        cbxTipocombustible = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        jLabel4.setText("Tipo");

        jLabel5.setText("Marca");

        lblTelefono.setText("Modelo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbxTipoauto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Automovil", "Camioneta" }));

        lblPatente.setText("Patente");

        lblMarca.setText("Serie Motor");

        jLabel3.setText("Chasis");

        jLabel1.setText("Año");

        lblTelefono1.setText("Tipo Combustible");

        cbxTipocombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diesel", "Bencina 97", "Bencina 95", "Bencina 93" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addContainerGap(345, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblMarca)
                            .addComponent(lblPatente)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(lblTelefono)
                            .addComponent(jLabel1)
                            .addComponent(lblTelefono1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipocombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipoauto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSerieMotor)
                                .addComponent(txtChasis)
                                .addComponent(txtMarca)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatente)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtSerieMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoauto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono1)
                    .addComponent(cbxTipocombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String patente = txtPatente.getText();
        String seriemotorStr = txtSerieMotor.getText();
        String tipoauto = cbxTipoauto.getSelectedItem().toString();
        String chasisStr = txtChasis.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String anio = txtAnio.getText();
        String tipocombustible = cbxTipocombustible.getSelectedItem().toString();

        try{
            Vehiculo obj = new Vehiculo();
            obj.setPatente(patente);
            obj.setSeriemotor(Integer.parseInt(seriemotorStr));
            obj.setTipoauto(tipoauto);
            obj.setChasis(Integer.parseInt(chasisStr));
            obj.setMarca(marca);
            obj.setModelo(modelo);
            obj.setAnio(anio);
            obj.setTipocombustible(tipocombustible);
            
            appv.Guardar(obj);

            JOptionPane.showMessageDialog(this, obj.toString(), "Vehiculo Guardado", 0);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipoauto;
    private javax.swing.JComboBox<String> cbxTipocombustible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtSerieMotor;
    // End of variables declaration//GEN-END:variables
}
