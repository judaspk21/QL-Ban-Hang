/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_GUI;

import ASM_TT_BLL.BLLDangNhap;
import ASM_TT_BLL.BLLNhanVien;
import ASM_TT_DTO.NhanVien;
import ASM_TT_HALPER.ThongBao;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        txtPassWord.setBackground(new Color(0, 0, 0, 0));
        txtTenDangNhap.setBackground(new Color(0, 0, 0, 0));
        ImageIcon icon = new ImageIcon(getClass().getResource("/ASM_TT_IMAGES/produc.png"));
        Image image = icon.getImage();
        setIconImage(image);
        this.getRootPane().setDefaultButton(kbtnLogin);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGoogle = new javax.swing.JLabel();
        lblFb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMaSP1 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        kbtnLogin = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/Poly.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setText("HI, THERE");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("You can log in to your Jimdo account here.");

        lblGoogle.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblGoogle.setForeground(new java.awt.Color(0, 0, 204));
        lblGoogle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/google.png"))); // NOI18N
        lblGoogle.setText("Log in Witch Google");
        lblGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoogleMouseClicked(evt);
            }
        });

        lblFb.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblFb.setForeground(new java.awt.Color(0, 0, 204));
        lblFb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/facebook.png"))); // NOI18N
        lblFb.setText("Log in Witch Facebook");
        lblFb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFbMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Or");

        lblMaSP.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblMaSP.setForeground(new java.awt.Color(0, 0, 204));
        lblMaSP.setText("UserName");

        txtTenDangNhap.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTenDangNhap.setForeground(new java.awt.Color(0, 51, 204));
        txtTenDangNhap.setText("Admin");
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 0, 255)));
        txtTenDangNhap.setOpaque(false);

        lblMaSP1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblMaSP1.setForeground(new java.awt.Color(0, 0, 204));
        lblMaSP1.setText("PassWord");

        txtPassWord.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPassWord.setForeground(new java.awt.Color(0, 51, 204));
        txtPassWord.setText("Admin");
        txtPassWord.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        txtPassWord.setOpaque(false);

        jButton3.setText("<html>\n<body>\nForgot Password?\n</body>\n</html>");
        jButton3.setToolTipText("<html>\n<body>\n<p>\nForgot Password?\n</p>\n</body>\n</html>");

        kbtnLogin.setText("Sign In");
        kbtnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kbtnLogin.setkBackGroundColor(new java.awt.Color(204, 255, 204));
        kbtnLogin.setkBorderRadius(20);
        kbtnLogin.setkEndColor(new java.awt.Color(204, 153, 255));
        kbtnLogin.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kbtnLogin.setkHoverForeGround(new java.awt.Color(0, 0, 153));
        kbtnLogin.setkHoverStartColor(new java.awt.Color(0, 153, 51));
        kbtnLogin.setkIndicatorColor(new java.awt.Color(51, 0, 204));
        kbtnLogin.setkIndicatorThickness(5);
        kbtnLogin.setkSelectedColor(new java.awt.Color(0, 51, 204));
        kbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnLoginActionPerformed(evt);
            }
        });

        kButton2.setText("Sign Up");
        kButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(204, 255, 204));
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(204, 153, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 153));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 153, 51));
        kButton2.setkIndicatorColor(new java.awt.Color(51, 0, 204));
        kButton2.setkIndicatorThickness(5);
        kButton2.setkSelectedColor(new java.awt.Color(0, 51, 204));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 204));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(179, 179, 179)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFb, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(jSeparator1))
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblGoogle, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(92, 92, 92)))
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMaSP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMaSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(270, 270, 270)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaSP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(kbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int rs = JOptionPane.showConfirmDialog(this, "Bạn muốn thoát không",
                "Xác nhận thoát", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (rs == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void lblFbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFbMouseClicked
        // TODO add your handling code here:
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://www.facebook.com/"));
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lblFbMouseClicked

    private void lblGoogleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoogleMouseClicked
        // TODO add your handling code here:
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://www.google.com.vn/"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblGoogleMouseClicked
    public static NhanVien nv;
    private void kbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnLoginActionPerformed
        // TODO add your handling code here:
        String TenDangNhap = txtTenDangNhap.getText();
        String MatKhau = String.valueOf(txtPassWord.getPassword());

        boolean kt = BLLDangNhap.KtraThongTin(TenDangNhap, MatKhau);
        if (kt) {
            nv = BLLNhanVien.DangNhap(TenDangNhap, MatKhau);
           
            if (nv == null) {
                ThongBao.ThongBaoDangNhap("Thông báo", "Đăng nhập thất bại!!");
            } else {
                 ThongBao.ThongBaoDangNhap("Thông báo", "Tên "+TenDangNhap+"Đăng Nhập Thành Công");
                  ThongBao.ThongBaoDangNhap("Thông báo", " Đi Tới Form Main !!");
                frmMain FR = new frmMain();
                FR.setVisible(true);
                this.dispose();
            }
        }


    }//GEN-LAST:event_kbtnLoginActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        frmDangKy dk = new frmDangKy();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KButton kbtnLogin;
    private javax.swing.JLabel lblFb;
    private javax.swing.JLabel lblGoogle;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMaSP1;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}