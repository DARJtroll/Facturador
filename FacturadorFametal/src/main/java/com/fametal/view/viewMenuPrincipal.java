/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fametal.view;

import javax.persistence.EntityManager;

/**
 *
 * @author Arian
 */
public class viewMenuPrincipal extends javax.swing.JFrame {
    private EntityManager em;
    private viewLogin loginfather;
    /**
     * Creates new form viewMenuPrincipal
     */
    public viewMenuPrincipal(EntityManager EM,viewLogin Login) {
        initComponents();
        this.em = EM;
        this.loginfather = Login;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btCrearFactura = new javax.swing.JButton();
        btAdminsitrarInventario = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemNuevaFactura = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(220, 255, 255));

        btCrearFactura.setBackground(new java.awt.Color(255, 255, 0));
        btCrearFactura.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        btCrearFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/añadir Factura Grande.png"))); // NOI18N
        btCrearFactura.setText("Crear Factura");
        btCrearFactura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, null));
        btCrearFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCrearFactura.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btCrearFactura.setDoubleBuffered(true);
        btCrearFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCrearFactura.setIconTextGap(10);
        btCrearFactura.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btCrearFactura.setMaximumSize(new java.awt.Dimension(140, 140));
        btCrearFactura.setMinimumSize(new java.awt.Dimension(140, 140));
        btCrearFactura.setPreferredSize(new java.awt.Dimension(140, 140));
        btCrearFactura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCrearFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearFacturaActionPerformed(evt);
            }
        });

        btAdminsitrarInventario.setBackground(new java.awt.Color(255, 255, 0));
        btAdminsitrarInventario.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        btAdminsitrarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/administrar Inventario.png"))); // NOI18N
        btAdminsitrarInventario.setText("Inventario");
        btAdminsitrarInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255), null, null));
        btAdminsitrarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdminsitrarInventario.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btAdminsitrarInventario.setDoubleBuffered(true);
        btAdminsitrarInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdminsitrarInventario.setIconTextGap(10);
        btAdminsitrarInventario.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btAdminsitrarInventario.setMaximumSize(new java.awt.Dimension(140, 140));
        btAdminsitrarInventario.setMinimumSize(new java.awt.Dimension(140, 140));
        btAdminsitrarInventario.setPreferredSize(new java.awt.Dimension(140, 140));
        btAdminsitrarInventario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btAdminsitrarInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdminsitrarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdminsitrarInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btAdminsitrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAdminsitrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
        );

        menuArchivo.setText("Archivo");

        menuItemNuevaFactura.setText("Nueva Factura");
        menuItemNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevaFacturaActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevaFactura);

        menuBar.add(menuArchivo);

        menuAyuda.setText("Ayuda");
        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearFacturaActionPerformed
        viewCrearFactura fact = new viewCrearFactura(em,this);
        fact.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCrearFacturaActionPerformed

    private void btAdminsitrarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminsitrarInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdminsitrarInventarioActionPerformed

    private void menuItemNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevaFacturaActionPerformed
        viewCrearFactura fact = new viewCrearFactura(em,this);
        fact.setVisible(true);
    }//GEN-LAST:event_menuItemNuevaFacturaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        loginfather.setVisible(true);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdminsitrarInventario;
    private javax.swing.JButton btCrearFactura;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemNuevaFactura;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
