
package com.fametal.view;

import com.fametal.modelo.ClienteRuc;
import com.fametal.dao.ServiciosGenerales;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arian
 */
public class viewEncontrarClienteRUC extends javax.swing.JFrame {
    private EntityManager em;
    private viewCrearFactura padre;
    private ServiciosGenerales dao;
    
    private DefaultTableModel tabla;
    List<ClienteRuc> DatosRuc;

    public viewEncontrarClienteRUC(EntityManager em, viewCrearFactura view) {
        initComponents();
        this.em = em;
        this.padre = view;
        this.dao = new ServiciosGenerales(em);
        ActualizarTabla();
        txtBuscador.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                ActualizarTabla(txtBuscador.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ActualizarTabla(txtBuscador.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
            
        });
        int a = tbClientes.getSelectedRow();
        int b = tbClientes.getSelectedRow();
        System.out.println(a + " + " + b);
    }
    public void CrearTabla(){
        this.tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.tabla.addColumn("RUC");
        this.tabla.addColumn("RAZON SOCIAL");
    }
    public void ActualizarTabla(){
        CrearTabla();
        List<ClienteRuc> datos = new ArrayList<>();
        
        datos = dao.listarClientesRuc();
        DatosRuc = datos;
        datos.forEach(lista ->{
            String[] fila = {lista.getRuc(),lista.getRazonSocial()};
            tabla.addRow(fila);
        });
        
       tbClientes.setModel(this.tabla); 
    }
    
    public void ActualizarTabla(String nombre){
        CrearTabla();
        List<ClienteRuc> datos = new ArrayList<>();
        
        datos = dao.buscarPorParecidoRuc(nombre);
        
        datos.forEach(lista ->{
            String[] fila = {lista.getRuc(),lista.getRazonSocial()};
            tabla.addRow(fila);
        });
        
       tbClientes.setModel(this.tabla); 
    }
    
    public void CerarPestana(){
        this.setEnabled(false);
        this.setVisible(false);
        padre.setVisible(true);
        padre.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(251, 255, 221));

        txtBuscador.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });

        tbClientes.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbClientes.setShowGrid(true);
        tbClientes.setShowVerticalLines(false);
        tbClientes.getTableHeader().setResizingAllowed(false);
        tbClientes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbClientesPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        btSeleccionar.setBackground(new java.awt.Color(153, 255, 0));
        btSeleccionar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        btSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/ADELANTE 32 px.png"))); // NOI18N
        btSeleccionar.setText("Seleccionar");
        btSeleccionar.setHideActionText(true);
        btSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(234, 234, 234)
                            .addComponent(btSeleccionar))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btSeleccionar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        padre.setEnabled(true);
        padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed
    
    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        ActualizarTabla(txtBuscador.getText());
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void tbClientesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbClientesPropertyChange

    }//GEN-LAST:event_tbClientesPropertyChange

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        int columna = tbClientes.getSelectedColumn();
        int fila = tbClientes.getSelectedRow();
        if(columna==-1 && fila == -1){
            JOptionPane.showMessageDialog(this,"Se Necesita Seleccionar una empresa ","Error 002",JOptionPane.ERROR_MESSAGE);
        }else{
            for(ClienteRuc lista : this.DatosRuc){
                var ruc = tbClientes.getValueAt(fila,columna);
                if(lista.getRuc().equals(ruc.toString())){
                    padre.RecibirCliente(lista);
                    CerarPestana();
                    break;
                }   
            }
        }
    }//GEN-LAST:event_btSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
