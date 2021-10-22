/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;


import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import static projet.Principale.id;

public class FrmAdmin extends javax.swing.JInternalFrame {
    private final JDesktopPane jDesktopPane1 = new JDesktopPane();
  
    private JButton btnHopitaucx = new JButton();
    private JButton btngovernorat = new JButton();
    private JButton btnpays = new JButton();
   
    
    public FrmAdmin() {
   initComponents();

   setLayout(new BorderLayout());
	
        JPanel north = new JPanel(new BorderLayout());
        north.add(createToolBar(), BorderLayout.PAGE_START);

        btnHopitaucx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnHopitaucx.setEnabled(false);
      
                btngovernorat.setEnabled(true);
                btnpays.setEnabled(true);
              createHospitalFrame();
            }
        });

        btngovernorat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btngovernorat.setEnabled(false);
                btnHopitaucx.setEnabled(true);
                btnpays.setEnabled(true);
                createGovernoratFrame();
                
            }
        });

        btnpays.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnpays.setEnabled(false);
                btnHopitaucx.setEnabled(true);
                btngovernorat.setEnabled(true);
                createPaysFrame();
            }
        });

      
        getContentPane().setLayout(new BorderLayout());
        JToolBar menu = createToolBar();
        getContentPane().add(menu, BorderLayout.PAGE_START);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(jDesktopPane1);
        }

        protected JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();
        
        JLabel background=new JLabel(new ImageIcon("src/Image/back.jpg"));
	getContentPane().add(background);
	background.setLayout(new FlowLayout());  

        // Btn
        ImageIcon img;
       

        toolBar.add(btnHopitaucx);
        img = new ImageIcon("src/Image/hospital1.png");
        btnHopitaucx.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btnHopitaucx.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btngovernorat);
        img = new ImageIcon("src/Image/government1.png");
        btngovernorat.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btngovernorat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btnpays);
        img = new ImageIcon("src/Image/pays1.png");
        btnpays.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        final Pane rightSpacer = new Pane();
        HBox.setHgrow(
                rightSpacer,
                Priority.SOMETIMES
        );
        btnpays.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        toolBar.add(Box.createHorizontalStrut(320)); 
        affichedate(); 
        toolBar.add(datelab);  
   
        return toolBar;
    }
       

    
    protected void createGovernoratFrame() {
        FrmGouvernoratADM tn = new FrmGouvernoratADM();
       // tn.setLocation(20, 20);
        tn.setVisible(true);
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
                tn.hide();
                  btngovernorat.setEnabled(true);
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btngovernorat.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    protected void createHospitalFrame() {
        FrmDemandeAdm tn = new FrmDemandeAdm();
        //tn.setLocation(20, 20);
        tn.setVisible(true);
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
                tn.hide();
                btnHopitaucx.setEnabled(true);
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btnHopitaucx.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    protected void createPaysFrame() {
        FrmPaysAdm tn = new FrmPaysAdm();
        //tn.setLocation(20, 20);
        tn.setVisible(true);
        
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
                tn.hide();
                btnpays.setEnabled(true);
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btnpays.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    private void affichedate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datelab.setText(s.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datelab = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        setPreferredSize(new java.awt.Dimension(1088, 633));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datelab.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        datelab.setForeground(new java.awt.Color(255, 0, 0));
        datelab.setText("01-01-2020");
        datelab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datelab.setName("datelab"); // NOI18N
        getContentPane().add(datelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, 45));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.jpg"))); // NOI18N
        background.setName("background"); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 854, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel datelab;
    // End of variables declaration//GEN-END:variables
}
