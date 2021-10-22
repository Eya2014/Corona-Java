package projet;

import Services.ServiceTunisie;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;

public class FrmContinent extends javax.swing.JInternalFrame {

    public FrmContinent() {
        initComponents();
        int[] tb_infecte = Services.ServiceContinent.Total_cas_infecte();
        con_afr.setText(String.valueOf(tb_infecte[0]));
        con_ano.setText(String.valueOf(tb_infecte[1]));
        con_asu.setText(String.valueOf(tb_infecte[2]));
        con_anta.setText(String.valueOf(tb_infecte[3]));
        con_asie.setText(String.valueOf(tb_infecte[4]));
        con_er.setText(String.valueOf(tb_infecte[5]));
        con_ocea.setText(String.valueOf(tb_infecte[6]));
        lbl_total_infecte.setText(String.valueOf(tb_infecte[7]));
        int[] tb_active = Services.ServiceContinent.Total_cas_actives();
                if(tb_active[7]>0){
        lbl_Actives.setText(String.valueOf(tb_active[7]));
                }
        int[] tb_critique = Services.ServiceContinent.Total_cas_critiques();
        lbl_crit.setText(String.valueOf(tb_critique[7]));
        int[] tb_decede = Services.ServiceContinent.Total_cas_decedes();
        lbl_deces.setText(String.valueOf(tb_decede[7]));
        int[] tb_doux = Services.ServiceContinent.Total_cas_doux();
        if(tb_doux[7]>0){
            lbl_doux.setText(String.valueOf(tb_doux[7]));
        }
        int[] tb_recup = Services.ServiceContinent.Total_cas_recup();
        lbl_recup.setText(String.valueOf(tb_recup[7]));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        con_ocea = new javax.swing.JLabel();
        con_er = new javax.swing.JLabel();
        con_afr = new javax.swing.JLabel();
        con_anta = new javax.swing.JLabel();
        con_asu = new javax.swing.JLabel();
        con_ano = new javax.swing.JLabel();
        lbl_recup = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lbl_total_infecte = new javax.swing.JLabel();
        lbl_deces = new javax.swing.JLabel();
        con_asie = new javax.swing.JLabel();
        lbl_cas_infecte = new javax.swing.JLabel();
        lbl_deces1 = new javax.swing.JLabel();
        lbl_doux = new javax.swing.JLabel();
        lbl_Actives = new javax.swing.JLabel();
        lbl_crit = new javax.swing.JLabel();
        lbl_Actives1 = new javax.swing.JLabel();
        lbl_crit1 = new javax.swing.JLabel();
        lbl_doux1 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        lbl_recup1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        com = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(FrmContinent.DISPOSE_ON_CLOSE);
        setTitle("Continent");
        setPreferredSize(new java.awt.Dimension(1118, 623));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        con_ocea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_ocea.setForeground(new java.awt.Color(255, 255, 255));
        con_ocea.setText("0");
        getContentPane().add(con_ocea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 60, 40));

        con_er.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_er.setForeground(new java.awt.Color(255, 255, 255));
        con_er.setText("0");
        getContentPane().add(con_er, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 60, 50));

        con_afr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_afr.setForeground(new java.awt.Color(255, 255, 255));
        con_afr.setText("0");
        getContentPane().add(con_afr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 60, 40));

        con_anta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_anta.setForeground(new java.awt.Color(255, 255, 255));
        con_anta.setText("0");
        getContentPane().add(con_anta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 60, 40));

        con_asu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_asu.setForeground(new java.awt.Color(255, 255, 255));
        con_asu.setText("0");
        getContentPane().add(con_asu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 50));

        con_ano.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_ano.setForeground(new java.awt.Color(255, 255, 255));
        con_ano.setText("0");
        getContentPane().add(con_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 40));

        lbl_recup.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_recup.setForeground(new java.awt.Color(255, 255, 255));
        lbl_recup.setText("0");
        getContentPane().add(lbl_recup, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 60, 20));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/md1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        lbl_total_infecte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_total_infecte.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total_infecte.setText("0");
        getContentPane().add(lbl_total_infecte, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 60, 30));

        lbl_deces.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_deces.setForeground(new java.awt.Color(255, 255, 255));
        lbl_deces.setText("0");
        getContentPane().add(lbl_deces, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 60, 20));

        con_asie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        con_asie.setForeground(new java.awt.Color(255, 255, 255));
        con_asie.setText("0");
        getContentPane().add(con_asie, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 60, 40));

        lbl_cas_infecte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_cas_infecte.setForeground(new java.awt.Color(255, 51, 51));
        lbl_cas_infecte.setText("Total cas \n\ninfectées"); // NOI18N
        getContentPane().add(lbl_cas_infecte, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 120, 60));

        lbl_deces1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_deces1.setForeground(new java.awt.Color(0, 51, 255));
        lbl_deces1.setText(" Cas decedes");
        getContentPane().add(lbl_deces1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 90, 20));

        lbl_doux.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_doux.setForeground(new java.awt.Color(255, 255, 255));
        lbl_doux.setText("0");
        getContentPane().add(lbl_doux, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 60, 20));

        lbl_Actives.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Actives.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Actives.setText("0");
        getContentPane().add(lbl_Actives, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 60, 30));

        lbl_crit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_crit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_crit.setText("0");
        getContentPane().add(lbl_crit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 350, 60, 20));

        lbl_Actives1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Actives1.setForeground(new java.awt.Color(255, 51, 51));
        lbl_Actives1.setText("Total cas Actives"); // NOI18N
        getContentPane().add(lbl_Actives1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 120, 60));

        lbl_crit1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_crit1.setForeground(new java.awt.Color(0, 51, 255));
        lbl_crit1.setText(" Cas critiques");
        getContentPane().add(lbl_crit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 440, 90, 20));

        lbl_doux1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_doux1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_doux1.setText("état doux");
        lbl_doux1.setToolTipText("");
        getContentPane().add(lbl_doux1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, 20));

        jButton23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 153, 153));
        jButton23.setText("Afficher  les données par continent");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 240, 50));

        lbl_recup1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_recup1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_recup1.setText("Cas recupere");
        lbl_recup1.setToolTipText("");
        getContentPane().add(lbl_recup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3pl.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 390, 250));

        com.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afrique", "Amerique nord", "Amerique sud", "Antarctique", "Asie", "Europe", "Océanie" }));
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        getContentPane().add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 240, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aaaaa.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 610, 430));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3pl.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 390, 250));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-print-45.png"))); // NOI18N
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setInheritsPopupMenu(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] tb_infecte = Services.ServiceContinent.Total_cas_infecte();
        con_afr.setText(String.valueOf(tb_infecte[0]));
        con_ano.setText(String.valueOf(tb_infecte[1]));
        con_asu.setText(String.valueOf(tb_infecte[2]));
        con_anta.setText(String.valueOf(tb_infecte[3]));
        con_asie.setText(String.valueOf(tb_infecte[4]));
        con_er.setText(String.valueOf(tb_infecte[5]));
        con_ocea.setText(String.valueOf(tb_infecte[6]));
        lbl_total_infecte.setText(String.valueOf(tb_infecte[7]));
        int[] tb_active = Services.ServiceContinent.Total_cas_actives();
                if(tb_active[7]>0){
        lbl_Actives.setText(String.valueOf(tb_active[7]));
                }        int[] tb_critique = Services.ServiceContinent.Total_cas_critiques();
        lbl_crit.setText(String.valueOf(tb_critique[7]));
        int[] tb_decede = Services.ServiceContinent.Total_cas_decedes();
        lbl_deces.setText(String.valueOf(tb_decede[7]));
        int[] tb_doux = Services.ServiceContinent.Total_cas_doux();
        if(tb_doux[7]>0){
            lbl_doux.setText(String.valueOf(tb_doux[7]));
        }        int[] tb_recup = Services.ServiceContinent.Total_cas_recup();
        lbl_recup.setText(String.valueOf(tb_recup[7]));

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        String cont = (String) com.getSelectedItem();
        int[] tb_infecte = Services.ServiceContinent.Total_cas_infecte();
        int[] tb_active = Services.ServiceContinent.Total_cas_actives();
        int[] tb_critique = Services.ServiceContinent.Total_cas_critiques();
        int[] tb_decede = Services.ServiceContinent.Total_cas_decedes();
        int[] tb_doux = Services.ServiceContinent.Total_cas_doux();
        if(tb_doux[0]<0){
            tb_doux[0]=0;
        }
          if(tb_active[0]<0){
            tb_active[0]=0;
        }
        int[] tb_recup = Services.ServiceContinent.Total_cas_recup();
        switch (cont) {
            case "Afrique":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[0]));
                lbl_Actives.setText(String.valueOf(tb_active[0]));
                lbl_crit.setText(String.valueOf(tb_critique[0]));
                lbl_deces.setText(String.valueOf(tb_decede[0]));
                lbl_doux.setText(String.valueOf(tb_doux[0]));
                lbl_recup.setText(String.valueOf(tb_recup[0]));
                break;
            case "Amerique nord":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[1]));
                lbl_Actives.setText(String.valueOf(tb_active[1]));
                lbl_crit.setText(String.valueOf(tb_critique[1]));
                lbl_deces.setText(String.valueOf(tb_decede[1]));
                lbl_doux.setText(String.valueOf(tb_doux[1]));
                lbl_recup.setText(String.valueOf(tb_recup[1]));
                break;
            case "Amerique sud":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[2]));
                lbl_Actives.setText(String.valueOf(tb_active[2]));
                lbl_crit.setText(String.valueOf(tb_critique[2]));
                lbl_deces.setText(String.valueOf(tb_decede[2]));
                lbl_doux.setText(String.valueOf(tb_doux[2]));
                lbl_recup.setText(String.valueOf(tb_recup[2]));
                break;
            case "Antarctique":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[3]));
                lbl_Actives.setText(String.valueOf(tb_active[3]));
                lbl_crit.setText(String.valueOf(tb_critique[3]));
                lbl_deces.setText(String.valueOf(tb_decede[3]));
                lbl_doux.setText(String.valueOf(tb_doux[3]));
                lbl_recup.setText(String.valueOf(tb_recup[3]));
                break;
            case "Asie":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[4]));
                lbl_Actives.setText(String.valueOf(tb_active[4]));
                lbl_crit.setText(String.valueOf(tb_critique[4]));
                lbl_deces.setText(String.valueOf(tb_decede[4]));
                lbl_doux.setText(String.valueOf(tb_doux[4]));
                lbl_recup.setText(String.valueOf(tb_recup[4]));
                break;
            case "Europe":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[5]));
                lbl_Actives.setText(String.valueOf(tb_active[5]));
                lbl_crit.setText(String.valueOf(tb_critique[5]));
                lbl_deces.setText(String.valueOf(tb_decede[5]));
                lbl_doux.setText(String.valueOf(tb_doux[5]));
                lbl_recup.setText(String.valueOf(tb_recup[5]));
                break;
            case "Océanie":
                lbl_total_infecte.setText(String.valueOf(tb_infecte[6]));
                lbl_Actives.setText(String.valueOf(tb_active[6]));
                lbl_crit.setText(String.valueOf(tb_critique[6]));
                lbl_deces.setText(String.valueOf(tb_decede[6]));
                lbl_doux.setText(String.valueOf(tb_doux[6]));
                lbl_recup.setText(String.valueOf(tb_recup[6]));
                break;
        }

    }//GEN-LAST:event_jButton23ActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Document doc = new Document(PageSize.A2,50,50,50,50);
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "PartialScreenshot3." + format;

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle captureRect = new Rectangle(10, 115, screenSize.width-100 , screenSize.height-160);
            BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
            ImageIO.write(screenFullImage, format, new File(fileName));

            PdfWriter.getInstance(doc, new FileOutputStream("D:\\screen_continent.pdf"));
            doc.open();
            doc.add(new Paragraph(TOP_ALIGNMENT, "Statistique de continent", new Font(Font.FontFamily.TIMES_ROMAN, 30)));
            doc.add(new Paragraph("-------------------------"));
            Image img =Image.getInstance("C:\\Users\\Admin\\Documents\\Dernière version\\MyLast Version\\JavaApp Project\\PartialScreenshot3.jpg");

            doc.add(img);
            doc.close();
            Desktop.getDesktop().open(new File("D:\\screen_continent.pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmHopitale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox com;
    private javax.swing.JLabel con_afr;
    private javax.swing.JLabel con_ano;
    private javax.swing.JLabel con_anta;
    private javax.swing.JLabel con_asie;
    private javax.swing.JLabel con_asu;
    private javax.swing.JLabel con_er;
    private javax.swing.JLabel con_ocea;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_Actives;
    private javax.swing.JLabel lbl_Actives1;
    private javax.swing.JLabel lbl_cas_infecte;
    private javax.swing.JLabel lbl_crit;
    private javax.swing.JLabel lbl_crit1;
    private javax.swing.JLabel lbl_deces;
    private javax.swing.JLabel lbl_deces1;
    private javax.swing.JLabel lbl_doux;
    private javax.swing.JLabel lbl_doux1;
    private javax.swing.JLabel lbl_recup;
    private javax.swing.JLabel lbl_recup1;
    private javax.swing.JLabel lbl_total_infecte;
    // End of variables declaration//GEN-END:variables
}
