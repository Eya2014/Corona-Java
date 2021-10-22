package projet;

import Services.ServicePays;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.MessageFormat;
import java.time.format.DateTimeFormatter;
import javafx.scene.layout.BorderRepeat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;

public class FrmPays extends javax.swing.JInternalFrame {

    ServicePays srv = new ServicePays();

    public void hideButton() {

        jLabel3.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
    }

    public void showButton() {
        date1.setVisible(false);
        date2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jButton23.setVisible(false);
        com.setVisible(false);
        jPanel2.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
    }
    int choix;

    public void d_p() {
        choix = 1;
        date1.setVisible(true);
        date2.setVisible(true);
        jLabel2.setVisible(true);
        jLabel1.setVisible(true);
        jButton23.setVisible(true);
        jPanel2.setVisible(true);
        lstpays.setVisible(false);
        ServicePays.model1.getDataVector().clear();
        lstpays.setModel(ServicePays.model1);
        lstpays.setVisible(true);
        java.util.List<String> list = srv.lstpayscombo();
        list.stream().forEach((s) -> {
            com.addItem(s);
        });
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.validate();
        jPanel1.setVisible(true);
        com.setVisible(true);
        lstpays.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);

    }

    public void p() {
        choix = 2;
        jPanel2.setVisible(true);

        date1.setVisible(false);
        date2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jButton23.setVisible(true);
        lstpays.setVisible(false);
        ServicePays.model1.getDataVector().clear();
        lstpays.setModel(ServicePays.model1);
        lstpays.setVisible(true);
        java.util.List<String> list = srv.lstpayscombo();
        list.stream().forEach((s) -> {
            com.addItem(s);
        });
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.validate();
        jPanel1.setVisible(true);
        com.setVisible(true);
        lstpays.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
    }

    public void d() {
        choix = 3;
        date1.setVisible(true);
        date2.setVisible(true);
        jLabel2.setVisible(true);
        jLabel1.setVisible(true);
        jButton23.setVisible(true);
        com.setVisible(false);   
        jPanel2.setVisible(false);
        lstpays.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);         }

    public void pays() {
        choix = 4;

        date1.setVisible(false);
        date2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jButton23.setVisible(true);
        jPanel2.setVisible(false);
        java.util.List<String> list = srv.lstpayscombo();
        list.stream().forEach((s) -> {
            com.addItem(s);
        });
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.validate();
        jPanel1.setVisible(true);
        com.setVisible(true);
        lstpays.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);     
    }

    public FrmPays() {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) date2.getDateEditor();
        editor.setEditable(false);
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) date1.getDateEditor();
        editor1.setEditable(false);
        jLabel3.setText("Dernier mise a jour : \n\t" + srv.dernier_MA());
        jLabel3.setBounds(560, 10, WIDTH, WIDTH);
        lstpays.setRowSelectionAllowed(true);
        lstpays.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

              
        
        
        date1.setVisible(false);
        date2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jButton23.setVisible(false);
        jPanel2.setVisible(false);
        com.setVisible(false);
        lstpays.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);

        jPanel1.setVisible(false);
        jTable1.setVisible(false);

        jTable1.setModel(srv.mon_model());
        jTable1.setVisible(true);
        showButton();

// TODO add your handling code her
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        date2 = new com.toedter.calendar.JDateChooser();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        com = new javax.swing.JComboBox();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstpays = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        bt_t_cas_d_p = new javax.swing.JMenuItem();
        bt_t_cas_d = new javax.swing.JMenuItem();
        bt_t_cas_p = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        bt_t_deces_d_p = new javax.swing.JMenuItem();
        bt_t_deces_d = new javax.swing.JMenuItem();
        bt_t_deces_p = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        bt_t_recup_d_p = new javax.swing.JMenuItem();
        bt_t_recup_d = new javax.swing.JMenuItem();
        bt_t_recup_p = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        bt_t_test_d_p = new javax.swing.JMenuItem();
        bt_t_test_d = new javax.swing.JMenuItem();
        bt_t_test_p = new javax.swing.JMenuItem();
        bt_active = new javax.swing.JMenuItem();
        bt_critique = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        bt_n_cas_d_p = new javax.swing.JMenuItem();
        bt_n_cas_d = new javax.swing.JMenuItem();
        bt_n_cas_p = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        bt_n_deces_d_p = new javax.swing.JMenuItem();
        bt_n_deces_d = new javax.swing.JMenuItem();
        bt_n_deces_p = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        bt_n_recup_d_p = new javax.swing.JMenuItem();
        bt_n_recup_d = new javax.swing.JMenuItem();
        bt_n_recup_p = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        bt_n_test_d_p = new javax.swing.JMenuItem();
        bt_n_test_d = new javax.swing.JMenuItem();
        bt_n_test_p = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(FrmPays.DISPOSE_ON_CLOSE);
        setTitle("Pays");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1118, 650));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAutoscrolls(true);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1040, 440));

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
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1040, 440));

        date2.setDateFormatString("dd/MM/yyyy");
        date2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                date2FocusLost(evt);
            }
        });
        date2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                date2MouseExited(evt);
            }
        });
        date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date2PropertyChange(evt);
            }
        });
        getContentPane().add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, 30));

        date1.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, 30));

        jLabel1.setText("Date fin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setText("Date début");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setInheritsPopupMenu(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setInheritsPopupMenu(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 40, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setInheritsPopupMenu(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 40, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setInheritsPopupMenu(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 40, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setInheritsPopupMenu(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 40, 30));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setInheritsPopupMenu(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 40, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setInheritsPopupMenu(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 40, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setInheritsPopupMenu(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 40, 30));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setInheritsPopupMenu(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 40, 30));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27.png"))); // NOI18N
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setInheritsPopupMenu(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 40, 30));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setInheritsPopupMenu(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 40, 30));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setInheritsPopupMenu(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 30));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setInheritsPopupMenu(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 40, 30));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setInheritsPopupMenu(true);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 40, 30));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setInheritsPopupMenu(true);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 40, 30));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setInheritsPopupMenu(true);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 40, 30));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setInheritsPopupMenu(true);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 40, 30));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setInheritsPopupMenu(true);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 40, 30));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setInheritsPopupMenu(true);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 40, 30));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setInheritsPopupMenu(true);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 40, 30));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ascending-sorting-27 - Copie.png"))); // NOI18N
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setInheritsPopupMenu(true);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 40, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        jButton23.setText("Afficher  les données");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 200, 50));

        getContentPane().add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 200, -1));

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-expand-arrow-20 - Copie.png"))); // NOI18N
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setInheritsPopupMenu(true);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 30, 30));

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-forward-arrow-20.png"))); // NOI18N
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setInheritsPopupMenu(true);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 30, 30));

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-expand-arrow-20.png"))); // NOI18N
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setInheritsPopupMenu(true);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 30, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstpays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pays"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lstpays.setFocusable(false);
        jScrollPane2.setViewportView(lstpays);
        if (lstpays.getColumnModel().getColumnCount() > 0) {
            lstpays.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 240, 110));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-print-45.png"))); // NOI18N
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setInheritsPopupMenu(true);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 60, 50));

        jMenu12.setText("Par pays");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu12);

        jMenu1.setText("Total ");

        jMenu7.setText("Cas affectées");

        bt_t_cas_d_p.setText("Par date et pays");
        bt_t_cas_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_cas_d_pActionPerformed(evt);
            }
        });
        jMenu7.add(bt_t_cas_d_p);

        bt_t_cas_d.setText("Par date ");
        bt_t_cas_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_cas_dActionPerformed(evt);
            }
        });
        jMenu7.add(bt_t_cas_d);

        bt_t_cas_p.setText("Par pays");
        bt_t_cas_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_cas_pActionPerformed(evt);
            }
        });
        jMenu7.add(bt_t_cas_p);

        jMenu1.add(jMenu7);

        jMenu8.setText("Cas déceder");

        bt_t_deces_d_p.setText("Par date et pays");
        bt_t_deces_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_deces_d_pActionPerformed(evt);
            }
        });
        jMenu8.add(bt_t_deces_d_p);

        bt_t_deces_d.setText("Par date ");
        bt_t_deces_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_deces_dActionPerformed(evt);
            }
        });
        jMenu8.add(bt_t_deces_d);

        bt_t_deces_p.setText("Par pays");
        bt_t_deces_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_deces_pActionPerformed(evt);
            }
        });
        jMenu8.add(bt_t_deces_p);

        jMenu1.add(jMenu8);

        jMenu9.setText("Cas récupérer");

        bt_t_recup_d_p.setText("Par date et pays");
        bt_t_recup_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_recup_d_pActionPerformed(evt);
            }
        });
        jMenu9.add(bt_t_recup_d_p);

        bt_t_recup_d.setText("Par date ");
        bt_t_recup_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_recup_dActionPerformed(evt);
            }
        });
        jMenu9.add(bt_t_recup_d);

        bt_t_recup_p.setText("Par pays");
        bt_t_recup_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_recup_pActionPerformed(evt);
            }
        });
        jMenu9.add(bt_t_recup_p);

        jMenu1.add(jMenu9);

        jMenu10.setText("Test effectuées");

        bt_t_test_d_p.setText("Par date et pays");
        bt_t_test_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_test_d_pActionPerformed(evt);
            }
        });
        jMenu10.add(bt_t_test_d_p);

        bt_t_test_d.setText("Par date ");
        bt_t_test_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_test_dActionPerformed(evt);
            }
        });
        jMenu10.add(bt_t_test_d);

        bt_t_test_p.setText("Par pays");
        bt_t_test_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_t_test_pActionPerformed(evt);
            }
        });
        jMenu10.add(bt_t_test_p);

        jMenu1.add(jMenu10);

        bt_active.setText("Cas Actives");
        bt_active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_activeActionPerformed(evt);
            }
        });
        jMenu1.add(bt_active);

        bt_critique.setText("Cas Critiques");
        bt_critique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_critiqueActionPerformed(evt);
            }
        });
        jMenu1.add(bt_critique);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Nouveaux");

        jMenu4.setText("Cas affectées");

        bt_n_cas_d_p.setText("Par date et pays");
        bt_n_cas_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_cas_d_pActionPerformed(evt);
            }
        });
        jMenu4.add(bt_n_cas_d_p);

        bt_n_cas_d.setText("Par date ");
        bt_n_cas_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_cas_dActionPerformed(evt);
            }
        });
        jMenu4.add(bt_n_cas_d);

        bt_n_cas_p.setText("Par pays");
        bt_n_cas_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_cas_pActionPerformed(evt);
            }
        });
        jMenu4.add(bt_n_cas_p);

        jMenu2.add(jMenu4);

        jMenu5.setText("Cas décedes");

        bt_n_deces_d_p.setText("Par date et pays");
        bt_n_deces_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_deces_d_pActionPerformed(evt);
            }
        });
        jMenu5.add(bt_n_deces_d_p);

        bt_n_deces_d.setText("Par date ");
        bt_n_deces_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_deces_dActionPerformed(evt);
            }
        });
        jMenu5.add(bt_n_deces_d);

        bt_n_deces_p.setText("Par pays");
        bt_n_deces_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_deces_pActionPerformed(evt);
            }
        });
        jMenu5.add(bt_n_deces_p);

        jMenu2.add(jMenu5);

        jMenu6.setText("Cas récupérer");

        bt_n_recup_d_p.setText("Par date et pays");
        bt_n_recup_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_recup_d_pActionPerformed(evt);
            }
        });
        jMenu6.add(bt_n_recup_d_p);

        bt_n_recup_d.setText("Par date ");
        bt_n_recup_d.setToolTipText("");
        bt_n_recup_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_recup_dActionPerformed(evt);
            }
        });
        jMenu6.add(bt_n_recup_d);

        bt_n_recup_p.setText("Par pays");
        bt_n_recup_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_recup_pActionPerformed(evt);
            }
        });
        jMenu6.add(bt_n_recup_p);

        jMenu2.add(jMenu6);

        jMenu3.setText("Test effectuées");

        bt_n_test_d_p.setText("Par date et pays");
        bt_n_test_d_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_test_d_pActionPerformed(evt);
            }
        });
        jMenu3.add(bt_n_test_d_p);

        bt_n_test_d.setText("Par date ");
        bt_n_test_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_test_dActionPerformed(evt);
            }
        });
        jMenu3.add(bt_n_test_d);

        bt_n_test_p.setText("Par pays");
        bt_n_test_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_n_test_pActionPerformed(evt);
            }
        });
        jMenu3.add(bt_n_test_p);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jMenu11.setText("Liste de données");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private String graph = "";
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

    public void AfficherDonnees(String d1, String d2, String Model) {
        jPanel1.setVisible(false);
        ChartPanel Chart = null;
        switch (graph) {
            case "pays":
                System.out.println("sel : "+com.getSelectedItem().toString());
                Chart = srv.pays(com.getSelectedItem().toString());
                break;
            case "total_cas_d_p":
                Chart = srv.total_cas_d_p(d1, d2, Model);
                break;
            case "total_cas_p":
                Chart = srv.total_cas_p(Model);
                break;
            case "total_cas_d":
                Chart = srv.total_cas_d(d1, d2);
                break;
            case "nouvels_cas_d_p":
                Chart = srv.nouvels_cas_d_p(d1, d2, Model);
                break;
            case "nouvels_cas_d":
                Chart = srv.nouvels_cas_d(d1, d2);
                break;
            case "nouvels_cas_p":
                Chart = srv.nouvels_cas_p(Model);
                break;
            case "total_deces_d_p":
                Chart = srv.total_deces_d_p(d1, d2, Model);
                break;
            case "total_deces_p":
                Chart = srv.total_deces_p(Model);
                break;
            case "total_deces_d":
                Chart = srv.total_deces_d(d1, d2);
                break;
            case "nouvel_deces_d_p":
                Chart = srv.nouvel_deces_d_p(d1, d2, Model);
                break;
            case "nouvel_deces_p":
                Chart = srv.nouvel_deces_p(Model);
                break;
            case "nouvel_deces_d":
                Chart = srv.nouvel_deces_d(d1, d2);
                break;
            case "nouvels_recup_d_p":
                Chart = srv.nouvels_recup_d_p(d1, d2, Model);
                break;
            case "nouvels_recup_p":
                Chart = srv.nouvels_recup_p(Model);
                break;
            case "nouvels_recup_d":
                Chart = srv.nouvels_recup_d(d1, d2);
                break;
            case "total_recup_d_p":
                Chart = srv.total_recup_d_p(d1, d2, Model);
                break;
            case "total_recup_d":
                Chart = srv.total_recup_d(d1, d2);
                break;
            case "total_recup_p":
                Chart = srv.total_recup_p(Model);
                break;
            case "total_test_d_p":
                Chart = srv.total_test_d_p(d1, d2, Model);
                break;
            case "total_test_p":
                Chart = srv.total_test_p(Model);
                break;
            case "total_test_d":
                Chart = srv.total_test_d(d1, d2);
                break;
            case "nouvel_test_d_p":
                Chart = srv.nouvel_test_d_p(d1, d2, Model);
                break;
            case "nouvel_test_d":
                Chart = srv.nouvel_test_d(d1, d2);
                break;
            case "nouvel_test_p":
                Chart = srv.nouvel_test_p(Model);
                break;
            case "cas_Acrives":
                Chart = srv.cas_Acrives(d1, d2, Model);
                break;
            case "cas_critiques":
                Chart = srv.cas_critiques(Model);
                break;
        }
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
        jTable1.setVisible(false);

    }

    private void bt_t_cas_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_cas_d_pActionPerformed
        graph = "total_cas_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_t_cas_d_pActionPerformed


    private void bt_t_cas_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_cas_pActionPerformed
        graph = "total_cas_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_t_cas_pActionPerformed

    private void bt_t_cas_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_cas_dActionPerformed

        graph = "nouvels_cas_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_t_cas_dActionPerformed

    private void bt_n_cas_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_cas_dActionPerformed
        graph = "total_cas_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_n_cas_dActionPerformed

    private void bt_n_cas_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_cas_d_pActionPerformed
        graph = "nouvels_cas_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_n_cas_d_pActionPerformed

    private void bt_n_cas_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_cas_pActionPerformed
        graph = "nouvels_cas_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_n_cas_pActionPerformed

    private void bt_t_deces_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_deces_d_pActionPerformed
        graph = "total_deces_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_t_deces_d_pActionPerformed

    private void bt_t_deces_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_deces_dActionPerformed
        graph = "total_deces_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_t_deces_dActionPerformed

    private void bt_t_deces_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_deces_pActionPerformed
        graph = "total_deces_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_t_deces_pActionPerformed

    private void bt_n_deces_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_deces_d_pActionPerformed
        graph = "nouvel_deces_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_n_deces_d_pActionPerformed

    private void bt_n_deces_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_deces_dActionPerformed
        graph = "nouvel_deces_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_n_deces_dActionPerformed

    private void bt_n_deces_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_deces_pActionPerformed
        graph = "nouvel_deces_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_n_deces_pActionPerformed

    private void bt_n_recup_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_recup_d_pActionPerformed
        graph = "nouvels_recup_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_n_recup_d_pActionPerformed

    private void bt_t_recup_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_recup_d_pActionPerformed
        graph = "total_recup_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_t_recup_d_pActionPerformed

    private void bt_t_recup_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_recup_dActionPerformed
        graph = "total_recup_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_t_recup_dActionPerformed

    private void bt_t_recup_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_recup_pActionPerformed
        graph = "total_recup_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_t_recup_pActionPerformed

    private void bt_t_test_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_test_d_pActionPerformed
        graph = "total_test_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_t_test_d_pActionPerformed

    private void bt_t_test_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_test_dActionPerformed
        graph = "total_test_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_t_test_dActionPerformed

    private void bt_t_test_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_t_test_pActionPerformed
        graph = "total_test_p";
        p();
        hideButton();


    }//GEN-LAST:event_bt_t_test_pActionPerformed

    private void bt_n_recup_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_recup_dActionPerformed
        graph = "nouvels_recup_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_n_recup_dActionPerformed

    private void bt_n_recup_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_recup_pActionPerformed
        graph = "nouvels_recup_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_n_recup_pActionPerformed

    private void bt_n_test_d_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_test_d_pActionPerformed
        graph = "nouvel_test_d_p";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_n_test_d_pActionPerformed

    private void bt_n_test_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_test_dActionPerformed
        graph = "nouvel_test_d";
        d();
        hideButton();

    }//GEN-LAST:event_bt_n_test_dActionPerformed

    private void bt_n_test_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_n_test_pActionPerformed
        graph = "nouvel_test_p";
        p();
        hideButton();

    }//GEN-LAST:event_bt_n_test_pActionPerformed


    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        jPanel1.setVisible(false);
        jTable1.setVisible(false);

        jTable1.setModel(srv.mon_model());
        jTable1.setVisible(true);
        showButton();

// TODO add your handling code here:
    }//GEN-LAST:event_jMenu11MouseClicked

    private void bt_activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_activeActionPerformed
        graph = "cas_Acrives";
        d_p();
        hideButton();

    }//GEN-LAST:event_bt_activeActionPerformed

    private void bt_critiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_critiqueActionPerformed
        graph = "cas_critiques";
        choix = 2;
        p();
        hideButton();
    }//GEN-LAST:event_bt_critiqueActionPerformed

    private void date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date2PropertyChange

    private void date2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_date2MouseClicked

    private void date2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_date2FocusLost

    private void date2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_date2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_cas", "asc"));
        jTable1.setVisible(true);

        jButton1.setVisible(false);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nompays", "desc"));
        jTable1.setVisible(true);

        jButton1.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(true);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_deces", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(true);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_deces", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(true);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_recupere", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(false);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(true);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_recupere", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(false);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(true);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_test", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(false);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(true);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_test", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(false);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(true);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_cas-total_recupere-total_deces", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(false);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(true);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_critique", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(false);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(true);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_cas", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_cas", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nompays", "asc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(false);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_deces", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(false);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_deces", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(false);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_recupere", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(true);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(false);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_recupere", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(true);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(false);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_test", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(true);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(false);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_test", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(true);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(false);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_cas-total_recupere-total_deces", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(true);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(false);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("nvl_critique", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(true);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(false);
        jButton22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jTable1.setVisible(false);
        jTable1.setModel(srv.mon_model_triée("total_cas", "desc"));
        jTable1.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed


    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        String d1 = "";
        d1 = ((JTextField) date1.getDateEditor().getUiComponent()).getText();
        String d2 = "";
        d2 = ((JTextField) date2.getDateEditor().getUiComponent()).getText();

        System.out.println("choix :" + choix);
        System.out.println((d1.equals("") || d2.equals("")) + " && " + (choix == 3 || choix == 1));
        System.out.println(" mt3 pays " + (choix == 2 || choix == 1));
        int i = 0;
        if ((d1.equals("") || d2.equals("")) && (choix == 3 || choix == 1)) {
            i = 1;
            JOptionPane.showMessageDialog(this, "Vous Devez choisir la date de debut et de fin \n pour avoir un affichage correcte ..");
            jPanel1.setVisible(false);
            jPanel1.removeAll();
            jPanel1.validate();
            jPanel1.setVisible(true);
        }
        if (!(d1.equals("") || d2.equals(""))) {
            if ((date1.getDate().compareTo(date2.getDate()) > 0) && (choix == 3 || choix == 1)) {
                i = 1;
                JOptionPane.showMessageDialog(this, "Vous Devez choisir la date de debut inferieur a celle de fin !");
                jPanel1.setVisible(false);
                jPanel1.removeAll();
                jPanel1.validate();
                jPanel1.setVisible(true);

            }
        }
        if (lstpays.getRowCount() == 0 && (choix == 2 || choix == 1)) {
            i = 1;
            JOptionPane.showMessageDialog(this, "Vous Devez choisir au moin un pays ..");
            jPanel1.setVisible(false);
            jPanel1.removeAll();
            jPanel1.validate();
            jPanel1.setVisible(true);
        }
        if (i == 0) {
            String pys = "";
            if (choix == 2 || choix == 1) {
                DefaultTableModel modelx = (DefaultTableModel) lstpays.getModel();
                String selectedx = modelx.getValueAt(0, 0).toString();
                System.out.println("selected : " + selectedx);
                pys = "'" + selectedx + "'";
                for (int row = 1; row < lstpays.getRowCount(); row++) {
                    DefaultTableModel model = (DefaultTableModel) lstpays.getModel();
                    System.out.println("taille tab : " + lstpays.getRowCount());

                    String selected = model.getValueAt(row, 0).toString();
                    System.out.println("selected : " + selected);
                    System.out.println("pays : " + pys);
                    pys = pys + ",'" + selected + "'";
                }
            }
            AfficherDonnees(d1, d2, pys);
        }

    }//GEN-LAST:event_jButton23ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String text = (String) com.getSelectedItem();
        int exist = 0;
        int rowCount = lstpays.getRowCount();
        System.out.println(rowCount);
        for (int row = 0; row < lstpays.getRowCount(); row++) {
            DefaultTableModel model = (DefaultTableModel) lstpays.getModel();
            String selected = model.getValueAt(row, 0).toString();
            if (selected.equals(text)) {
                exist = 1;
                break;
            }
        }
        if (exist == 0) {
            lstpays.setModel(srv.lstpays(text));
        } else {
            JOptionPane.showMessageDialog(this, "Vous avez deja choisis cette pays.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // check for selected row first
        if (lstpays.getSelectedRow() != -1) {
            // remove selected row from the model
            lstpays.setVisible(false);
            ServicePays.model1.getDataVector().remove(lstpays.getSelectedRow());
            lstpays.setModel(ServicePays.model1);
            lstpays.setVisible(true);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        lstpays.setVisible(false);
        ServicePays.model1.getDataVector().clear();
        lstpays.setModel(ServicePays.model1);
        lstpays.setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        pays();
        hideButton();
        graph = "pays";

    }//GEN-LAST:event_jMenu12MouseClicked

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        MessageFormat header = new MessageFormat("Governorat");
        MessageFormat footer = new MessageFormat("page{0,number,Integer}");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.println("erooor" +e.getMessage());
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JMenuItem bt_active;
    private javax.swing.JMenuItem bt_critique;
    private javax.swing.JMenuItem bt_n_cas_d;
    private javax.swing.JMenuItem bt_n_cas_d_p;
    private javax.swing.JMenuItem bt_n_cas_p;
    private javax.swing.JMenuItem bt_n_deces_d;
    private javax.swing.JMenuItem bt_n_deces_d_p;
    private javax.swing.JMenuItem bt_n_deces_p;
    private javax.swing.JMenuItem bt_n_recup_d;
    private javax.swing.JMenuItem bt_n_recup_d_p;
    private javax.swing.JMenuItem bt_n_recup_p;
    private javax.swing.JMenuItem bt_n_test_d;
    private javax.swing.JMenuItem bt_n_test_d_p;
    private javax.swing.JMenuItem bt_n_test_p;
    private javax.swing.JMenuItem bt_t_cas_d;
    private javax.swing.JMenuItem bt_t_cas_d_p;
    private javax.swing.JMenuItem bt_t_cas_p;
    private javax.swing.JMenuItem bt_t_deces_d;
    private javax.swing.JMenuItem bt_t_deces_d_p;
    private javax.swing.JMenuItem bt_t_deces_p;
    private javax.swing.JMenuItem bt_t_recup_d;
    private javax.swing.JMenuItem bt_t_recup_d_p;
    private javax.swing.JMenuItem bt_t_recup_p;
    private javax.swing.JMenuItem bt_t_test_d;
    private javax.swing.JMenuItem bt_t_test_d_p;
    private javax.swing.JMenuItem bt_t_test_p;
    private javax.swing.JComboBox com;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable lstpays;
    // End of variables declaration//GEN-END:variables
}
