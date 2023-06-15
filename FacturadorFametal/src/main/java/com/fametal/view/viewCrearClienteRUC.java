
package com.fametal.view;

import com.fametal.modelo.Apis.DaoMaestro;
import com.fametal.modelo.Apis.artefactosAPI;
import com.fametal.modelo.ClienteRuc;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Arian
 */
public class viewCrearClienteRUC extends javax.swing.JFrame {
    private EntityManager em;
    private ClienteRuc cliente;
    private viewCrearFactura vPadre;
    public viewCrearClienteRUC(EntityManager em,viewCrearFactura padre) {
        initComponents();
        this.em = em;
        this.vPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbRuc = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        btBuscarRUC = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbRazonSocial = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Cliente");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        lbRuc.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        lbRuc.setText("RUC:");

        txtRUC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        txtRUC.setToolTipText("Numero RUC");

        btBuscarRUC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/buscar.png"))); // NOI18N
        btBuscarRUC.setToolTipText("Buscar RUC");
        btBuscarRUC.setBorderPainted(false);
        btBuscarRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarRUCActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        lb1.setText("Razon Social :");

        lb2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        lb2.setText("Direccion       :");

        lb3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        lb3.setText("Telefono 2     :");

        lb4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        lb4.setText("Telefono 1     :");

        lb5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        lb5.setText("Celular           :");

        lbDireccion.setBackground(new java.awt.Color(255, 255, 255));
        lbDireccion.setFont(new java.awt.Font("Franklin Gothic Book", 1, 22)); // NOI18N
        lbDireccion.setForeground(new java.awt.Color(0, 0, 204));
        lbDireccion.setText("direccion");
        lbDireccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbRazonSocial.setBackground(new java.awt.Color(255, 255, 255));
        lbRazonSocial.setFont(new java.awt.Font("Franklin Gothic Book", 1, 22)); // NOI18N
        lbRazonSocial.setForeground(new java.awt.Color(0, 0, 204));
        lbRazonSocial.setText("nombre empresa");
        lbRazonSocial.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtTelefono2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        txtTelefono2.setToolTipText("Telefono 1");
        txtTelefono2.setName(""); // NOI18N

        txtTelefono1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        txtTelefono1.setToolTipText("Telefono 1");
        txtTelefono1.setName(""); // NOI18N

        txtCelular.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        txtCelular.setToolTipText("Telefono 1");
        txtCelular.setName(""); // NOI18N

        btGuardar.setBackground(new java.awt.Color(216, 255, 255));
        btGuardar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        btGuardar.setText("Guardar y Seleccionar");
        btGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGuardar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbRuc)
                .addGap(18, 18, 18)
                .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb2)
                            .addComponent(lb1)
                            .addComponent(lb3)
                            .addComponent(lb4)
                            .addComponent(lb5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btBuscarRUC)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lbRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb5)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarRUCActionPerformed
        artefactosAPI arte = new artefactosAPI();
        String ruc = txtRUC.getText();
        if(ruc.length()==11){
            try {
                cliente = arte.consultar(ruc);
                lbRazonSocial.setText(cliente.getRazonSocial());
                lbDireccion.setText(cliente.getDireccion());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"El ruc esta conformado de 11 digitos","Error: '001'",JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btBuscarRUCActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        vPadre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        cliente.setTelefono1(txtTelefono1.getText());
        cliente.setTelefono2(txtTelefono2.getText());
        cliente.setCelular(txtCelular.getText());
        DaoMaestro dao = new DaoMaestro();
        
        dao.GuardarEntidad(cliente,em);
        
        this.setVisible(false);
        vPadre.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarRUC;
    private javax.swing.JButton btGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbRazonSocial;
    private javax.swing.JLabel lbRuc;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
