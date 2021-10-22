package projet;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class FrmHopitale extends javax.swing.JInternalFrame {

    Services.ServiceHopitaleDemande srv = new Services.ServiceHopitaleDemande();

    public FrmHopitale() {
        initComponents();
        jTable1.setModel(srv.mon_model_triée("date_update", "asc"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        idu = new javax.swing.JButton();
        idd = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        disponible = new javax.swing.JLabel();
        hospitalise = new javax.swing.JLabel();
        nompy2 = new javax.swing.JLabel();
        hop = new javax.swing.JLabel();
        nompy3 = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        com = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        nompy4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        setTitle("Hospitale");
        setPreferredSize(new java.awt.Dimension(1118, 623));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 710, 240));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setInheritsPopupMenu(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setInheritsPopupMenu(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 40, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 40, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setInheritsPopupMenu(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 40, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setInheritsPopupMenu(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 40, 30));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setInheritsPopupMenu(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 40, 30));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setInheritsPopupMenu(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 40, 30));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setInheritsPopupMenu(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 40, 30));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setInheritsPopupMenu(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 40, 30));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setInheritsPopupMenu(true);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 40, 30));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setInheritsPopupMenu(true);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 40, 30));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setInheritsPopupMenu(true);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 40, 30));

        jTable2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 710, 260));

        idu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        idu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        idu.setInheritsPopupMenu(true);
        idu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iduActionPerformed(evt);
            }
        });
        getContentPane().add(idu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        idd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        idd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        idd.setInheritsPopupMenu(true);
        idd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iddActionPerformed(evt);
            }
        });
        getContentPane().add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setInheritsPopupMenu(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 40, 30));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setInheritsPopupMenu(true);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 40, 30));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-print-45.png"))); // NOI18N
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setInheritsPopupMenu(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 50, -1));

        disponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lit7.png"))); // NOI18N
        getContentPane().add(disponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 260, 190));

        hospitalise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospitalise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lit.png"))); // NOI18N
        getContentPane().add(hospitalise, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 270, 190));

        nompy2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nompy2.setForeground(new java.awt.Color(0, 153, 153));
        nompy2.setText("Les demandes de l'hopitale : ");
        getContentPane().add(nompy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 30));

        hop.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        hop.setForeground(new java.awt.Color(0, 153, 153));
        hop.setText("0");
        getContentPane().add(hop, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 110, 30));

        nompy3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nompy3.setForeground(new java.awt.Color(0, 153, 153));
        nompy3.setText("cas hospitalisées : ");
        getContentPane().add(nompy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 140, 30));

        dis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dis.setForeground(new java.awt.Color(0, 153, 153));
        dis.setText("0");
        getContentPane().add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 110, 30));

        com.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bizerte", "Béja", "Jendouba", "Kef", "Siliana", "Kairouan", "Sidi Bouzid", "Kasserine", "Gafsa", "Tozeur", "Kébili", "Tataouine", "Médenine", "Ariana", "Tunis", "Manouba", "Ben Arous", "Nabeul", "Zaghouan", "Sousse", "Monastir", "Mahdia", "Sfax", "Gabès" }));
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        getContentPane().add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 240, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-update-40.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 50, 50));

        nompy4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nompy4.setForeground(new java.awt.Color(0, 153, 153));
        nompy4.setText("Lits disponibles : ");
        getContentPane().add(nompy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("gov", "asc"));
        jTable1.setVisible(true);

        jButton1.setVisible(false);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        idu.setVisible(true);
        idd.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton22.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nom", "desc"));
        jTable1.setVisible(true);

        jButton1.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton11.setVisible(true);
        idu.setVisible(true);
        idd.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(true);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton22.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nbr_cas_hospitalise", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(true);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton22.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("lits_dispo_rea", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(true);
        jButton11.setVisible(true);
        idu.setVisible(true);
        idd.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(true);
        jButton16.setVisible(false);
        jButton22.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("adresse", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        idu.setVisible(true);
        idd.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("gov", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(true);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nom", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton13.setVisible(false);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nbr_cas_hospitalise", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(false);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("lits_dispo_rea", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton5.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(false);
        jButton16.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("adresse", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton22.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("date_update", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(true);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(false);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("date_update", "asc"));
        jTable1.setVisible(true);
        idu.setVisible(true);
        idd.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(false);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(true);
        jButton22.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void iduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iduActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("n.id", "asc"));
        jTable1.setVisible(true);
        idu.setVisible(false);
        idd.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton22.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_iduActionPerformed

    private void iddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("n.id", "desc"));
        jTable1.setVisible(true);
        idu.setVisible(true);
        idd.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);

        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_iddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selection = jTable1.getSelectedRow();
        Object nom = jTable1.getModel().getValueAt(selection, 1);
        jTable2.setVisible(false);
        Services.ServiceHopitaleDemande.model1.getDataVector().clear();
        jTable2.setModel(srv.demande(nom.toString()));
        jTable2.setVisible(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 Document doc = new Document(PageSize.A2,50,50,50,50);
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "PartialScreenshot1." + format;
             
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle captureRect = new Rectangle(10, 115, screenSize.width-100 , screenSize.height-160);
            BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
            
            PdfWriter.getInstance(doc, new FileOutputStream("D:\\screen_Hop.pdf"));
            doc.open();
            doc.add(new Paragraph(TOP_ALIGNMENT, "Statistique Hopitale", new Font(Font.FontFamily.TIMES_ROMAN, 30)));
            doc.add(new Paragraph("-------------------------"));
            Image img =Image.getInstance("C:\\Users\\Admin\\Desktop\\Dernière version\\Desktop\\JavaApp Project\\PartialScreenshot1.jpg");
           
            doc.add(img);
            doc.close();
            Desktop.getDesktop().open(new File("D:\\screen_Hop.pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jButton7ActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String gov = (String) com.getSelectedItem();
        int[] lt = srv.lits(gov);
        System.out.println("'"+gov +"'  "+lt[0]+"  "+lt[0]);
                hop.setText(String.valueOf(lt[0]));
                dis.setText(String.valueOf( lt[1]));
         
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox com;
    private javax.swing.JLabel dis;
    private javax.swing.JLabel disponible;
    private javax.swing.JLabel hop;
    private javax.swing.JLabel hospitalise;
    private javax.swing.JButton idd;
    private javax.swing.JButton idu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nompy2;
    private javax.swing.JLabel nompy3;
    private javax.swing.JLabel nompy4;
    // End of variables declaration//GEN-END:variables
}
