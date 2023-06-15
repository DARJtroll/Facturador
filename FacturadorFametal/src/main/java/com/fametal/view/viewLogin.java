
package com.fametal.view;

import com.fametal.dao.CuentaDao;
import com.fametal.modelo.Cuenta;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Arian
 */
public class viewLogin extends javax.swing.JFrame {
    EntityManager em = null;
    CuentaDao cuentaDao = null;
    /**
     * Creates new form viewLogin
     * @param em
     */
    public viewLogin(EntityManager em) {
        initComponents();
        this.em = em;
        this.cuentaDao = new CuentaDao(this.em);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        lbUsuraio = new javax.swing.JLabel();
        lbContrasena = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Sistema");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        panelPrincipal.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fametal Facturador");

        txtUsuario.setBackground(new java.awt.Color(204, 255, 204));
        txtUsuario.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        txtUsuario.setToolTipText("usuario");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContrasena.setBackground(new java.awt.Color(204, 255, 204));
        txtContrasena.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        txtContrasena.setToolTipText("Contraseña");

        lbUsuraio.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbUsuraio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/usuario.png"))); // NOI18N

        lbContrasena.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/contrasena.png"))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(102, 204, 255));
        btnLogin.setFont(new java.awt.Font("Franklin Gothic Book", 0, 28)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/acceso.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbContrasena)
                            .addComponent(lbUsuraio))
                        .addGap(57, 57, 57)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(133, 133, 133)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(lbUsuraio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnLogin)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String user = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        Cuenta usuario = cuentaDao.BuscarPorNombre(user);
        if (usuario != null){
            if(usuario.getContrasena().equals(contrasena)){
                JOptionPane.showMessageDialog(null,"Inicio de Sesion Completado","Success Login",JOptionPane.INFORMATION_MESSAGE);
                viewMenuPrincipal menu = new viewMenuPrincipal(em,this);
                menu.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta","InvalidPassword",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Usuario No encontrado","UserNotFound",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbContrasena;
    private javax.swing.JLabel lbUsuraio;
    protected javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
