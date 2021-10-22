/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import Services.ServiceHopitaleDemande;
import Services.verif;
import classs.Demande;
import classs.Hospitale;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.MessageFormat;
import java.util.ArrayList;
//import static javax.persistence.DiscriminatorType.INTEGER;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author HP
 */
public class FrmDemandeAdm extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmDemande
     */
     
    private static ArrayList<Hospitale> lstPays;
    private static ArrayList<Hospitale> lstHG;
    private static ArrayList<Demande> lstD;
    private static ArrayList<String> lstNumH;
    private static ArrayList<String> lstHopNom;

    private JTable table;
    private JTable table1;
  
    /**
     * Creates new form FrmHospital
     */
     private static DefaultTableModel model = new DefaultTableModel(new Object[][] {
         
	}, new String[] {"Nom_Hopitale", "Adresse", "Governorat", "Cas_Hospitalisé", "Nombre_Lits","Date_Update" });
     
     private static DefaultTableModel model1 = new DefaultTableModel(new Object[][] {
         
	}, new String[] {"titre", "type", "Responsable", "Distinateur", "Prix","Txt_Demande" });
  
     public void JTablePeuplerTous() {
         ServiceHopitaleDemande gest = new ServiceHopitaleDemande();
		
		lstPays = gest.findAllHopi();
		String[] data = new String[6];
		for (Hospitale p : lstPays) {
                        data[0]=p.getNomH()+"";
			data[1]=p.getAdr()+"";
	     		data[2]=p.getCov()+"";
	     		data[3]=p.getNbC_H()+"";
	     		data[4]=p.getNbLitR()+"";
                        data[5]=p.getDateU().subSequence(0,10)+"";
                        

			model.addRow(data);
		}

	}
     public void clear_H()
     {
     txtnom.setText("");
    txtD.setText("");
     txtH.setText("");
     txtL.setText("");
     txtadr.setText("");
     txtnom1.setText("");
     txtdem.setText("");
     D.setText("");
     Prix.setText("");
      type.setText("");
      
         
     }
     public void JTablePeuplerTousD() {
         ServiceHopitaleDemande gest = new ServiceHopitaleDemande();
		
		lstD = gest.findAll();
		String[] data = new String[6];
		for (Demande d : lstD) {
                        data[0]=d.getTitre()+"";
                        data[1]=d.getType()+"";
			data[2]=d.getResposable()+"";
	     		data[3]=d.getDistinateur()+"";
	     		data[4]=d.getPrix()+"";
	     		data[5]=d.getTextD()+"";
                       
                        

			model1.addRow(data);
		}

	}
     public void JTablePeuplerTousD_H(String h) {
         ServiceHopitaleDemande gest = new ServiceHopitaleDemande();
		
		lstD = gest.findAllH(h);
		String[] data = new String[6];
		for (Demande d : lstD) {
                        data[0]=d.getTitre()+"";
                        data[1]=d.getType()+"";
			data[2]=d.getResposable()+"";
	     		data[3]=d.getDistinateur()+"";
	     		data[4]=d.getPrix()+"";
	     		data[5]=d.getTextD()+"";
                        

			model1.addRow(data);
		}

	}
      private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        
        // get the selected row index
       int selectedRowIndex = table.getSelectedRow(); 
       
       //ncinTxt.setText(lstPays.get(selectedRowIndex).getIdP());
       cbG.setSelectedItem(lstPays.get(selectedRowIndex).getCov());
       txtnom.setText(lstPays.get(selectedRowIndex).getNomH());
       txtadr.setText(lstPays.get(selectedRowIndex).getAdr());
       txtD.setText((String) lstPays.get(selectedRowIndex).getDateU().subSequence(0,10));
       txtH.setText(lstPays.get(selectedRowIndex).getNbC_H()+"");
       txtL.setText(lstPays.get(selectedRowIndex).getNbLitR()+"");
       
     
}
       private void jTable1MouseClicked1(java.awt.event.MouseEvent evt) {                                     
        
        
        // get the selected row index
       int selectedRowIndex = table1.getSelectedRow(); 
       
       //ncinTxt.setText(lstPays.get(selectedRowIndex).getIdP());
       //cbH.setSelectedItem(lstD.get(selectedRowIndex).getIdH());
       txtnom1.setText(lstD.get(selectedRowIndex).getTitre());
       type.setText(lstD.get(selectedRowIndex).getType());
       txtdem.setText(lstD.get(selectedRowIndex).getTextD());
       D.setText(lstD.get(selectedRowIndex).getDistinateur());
       R.setSelectedItem(lstD.get(selectedRowIndex).getResposable());
       Prix.setText(lstD.get(selectedRowIndex).getPrix()+"");
       }
     public void JTablePeuplerG(String G) {
         ServiceHopitaleDemande gest = new ServiceHopitaleDemande();
		
		lstHG = gest.findAllGOv(G);
		String[] data = new String[6];
		for (Hospitale p : lstHG) {
                        data[0]=p.getNomH()+"";
			data[1]=p.getAdr()+"";
	     		data[2]=p.getCov()+"";
	     		data[3]=p.getNbC_H()+"";
	     		data[4]=p.getNbLitR()+"";
                        data[5]=p.getDateU().subSequence(0,10)+"";
			model.addRow(data);
                        
		}

	}
          
	public static ArrayList<String> getNumH()
        {
         ServiceHopitaleDemande dem = new ServiceHopitaleDemande();
        lstNumH=new ArrayList<String>();
        lstHopNom=new ArrayList<String>();
        for(Hospitale h :dem.find_H())
        {
        lstNumH.add(h.getIdH()+"");
        lstHopNom.add(h.getNomH());
         }
        return lstHopNom ;
        }
    public FrmDemandeAdm() {
        super("DEMANDE-HOPILAE-ADMIN" , 
			true, //resizable
	                true,  //closable
	                true, //maximizable
	                true); //iconifiable
        initComponents();
        JScrollPane scrollPane = new JScrollPane();
       hopitale.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 750, 230));
         table = new JTable();

		table.setEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(model);
		scrollPane.setViewportView(table);
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("calibri", Font.BOLD, 18));
		header.setForeground(new Color(0, 0, 0));

		table.setPreferredScrollableViewportSize(new Dimension(800, 62));

		table.setFont(new Font("calibri", Font.BOLD, 16));
		table.setRowHeight(20);
                table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
                for(int i = model.getRowCount(); i > 0; --i) 
			    model.removeRow(i-1);
JTablePeuplerTous();
                JScrollPane scrollPane1 = new JScrollPane();
       demande.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 750, 230));
        table1 = new JTable();

		table1.setEnabled(true);
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.setModel(model1);
		scrollPane1.setViewportView(table1);
		JTableHeader header1 = table1.getTableHeader();
		header1.setFont(new Font("calibri", Font.BOLD, 18));
		header1.setForeground(new Color(0, 0, 0));

		table1.setPreferredScrollableViewportSize(new Dimension(750, 62));

		table1.setFont(new Font("calibri", Font.BOLD, 16));
		table1.setRowHeight(20);
                table1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked1(evt);
			}
		});
              getNumH();
             
              for(String s :lstHopNom)
              {
              R.addItem(s);
              }
              for(String s :lstHopNom)
              {
              jComboBox3.addItem(s);
              }
                  
for(int i = model1.getRowCount(); i > 0; --i) 
			    model1.removeRow(i-1);
JTablePeuplerTousD();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        hopitale = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbG = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        txtD = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadr = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtH = new javax.swing.JTextField();
        txtL = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Afficher_Tous = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        demande = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        R = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnom1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdem = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        D = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Prix = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Afficher_Tous1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hopitale.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Governorat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel3.setText("Gouvernorat");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        cbG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bizerte", "Béja", "Jendouba", "Kef", "Siliana", "Kairouan", "Sidi Bouzid", "Kasserine", "Gafsa", "Tozeur", "Kébili", "Tataouine", "Médenine", "Ariana", "Tunis", "Manouba", "Ben Arous", "Nabeul", "Zaghouan", "Sousse", "Monastir", "Mahdia", "Sfax", "Gabès" }));
        jPanel2.add(cbG, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 16, 108, 36));

        hopitale.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date_Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 188, 25));

        hopitale.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 220, 70));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel1.setText("Nom");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 54, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel2.setText("Adresse");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, 54, 31));
        jPanel1.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 16, 130, 38));

        txtadr.setColumns(20);
        txtadr.setRows(5);
        jScrollPane1.setViewportView(txtadr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 65, 130, 60));

        hopitale.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Les Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel4.setText("Cas_Hospitalisés");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel5.setText("Lits_disponibles");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));
        jPanel4.add(txtH, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 27, 90, -1));
        jPanel4.add(txtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 75, 90, -1));

        hopitale.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 220, 140));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_30px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        hopitale.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 80, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_flip_chart_50px_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        hopitale.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 80, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_unavailable_24px.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        hopitale.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 80, 50));

        Afficher_Tous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_features_list_24px.png"))); // NOI18N
        Afficher_Tous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Afficher_TousActionPerformed(evt);
            }
        });
        hopitale.add(Afficher_Tous, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 100, 50));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afficher Par....", "Bizerte", "Béja", "Jendouba", "Kef", "Siliana", "Kairouan", "Sidi Bouzid", "Kasserine", "Gafsa", "Tozeur", "Kébili", "Tataouine", "Médenine", "Ariana", "Tunis", "Manouba", "Ben Arous", "Nabeul", "Zaghouan", "Sousse", "Monastir", "Mahdia", "Sfax", "Gabès" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        hopitale.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 340, -1, 50));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_print_64px.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        hopitale.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, 70));

        tab.addTab("HOPITALE", null, hopitale, "");

        demande.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hopitale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel6.setText("Hopitale");
        jLabel6.setToolTipText("");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel5.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        demande.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 70));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information_Général", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel7.setText("Titre");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 54, 20));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel8.setText("Text_Demande");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 31));
        jPanel7.add(txtnom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 220, 30));

        txtdem.setColumns(20);
        txtdem.setRows(5);
        jScrollPane2.setViewportView(txtdem);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 220, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel11.setText("Type");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel7.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 220, 30));

        demande.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 360, 150));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel9.setText("Distinataire");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, -1, -1));
        jPanel8.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel12.setText("Prix");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel8.add(Prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 90, -1));

        demande.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 220, 150));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_30px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        demande.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 80, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_flip_chart_50px_1.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        demande.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 80, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_unavailable_24px.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        demande.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 80, 50));

        Afficher_Tous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_features_list_24px.png"))); // NOI18N
        Afficher_Tous1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Afficher_Tous1ActionPerformed(evt);
            }
        });
        demande.add(Afficher_Tous1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 100, 50));

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        demande.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 100, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_print_64px.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        demande.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 100, 60));

        tab.addTab("DEMANDE", null, demande, "");

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));
        tab.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int j=0;
           verif ver = new verif();
           if(txtH.getText()=="" ||txtL.getText()==""|| txtnom.getText()==""||txtadr.getText()==""||txtD.getText()=="")
           {
            JOptionPane.showMessageDialog(null, "chaine vide non accepté");
            j=1;
           }
           if (ver.verifDate(txtD.getText())!=true) {
            JOptionPane.showMessageDialog(null, "date incorrect");
            j = 1;
        }
         if(ver.verifDigit(txtH.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de cas hospitalisés incorrect");
           j=1;
        }
          if(ver.verifDigit(txtL.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de Lits disponibles incorrect");
            j=1;
        }
           if(ver.verifDigitOrAlpha(txtadr.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "le nom incorrect");
            j=1;
        }
              if(ver.verifAlpha(txtnom.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "l'adresse incorrect");
            j=1;
        }
              if(j==0){
        Hospitale p= new Hospitale(
            0,
            txtnom.getText(),
            txtadr.getText(),
            (String) cbG.getSelectedItem(),
            Integer.parseInt(txtH.getText()),
            Integer.parseInt(txtL.getText()),
            txtD.getText()
        );
        ServiceHopitaleDemande Hop= new ServiceHopitaleDemande();
        boolean v;
        try{
            v=Hop.create(p);
            if(v==true)
            {
                System.out.println(v);
                String[] data = new String[6];

                data[0]=p.getNomH()+"";
                data[1]=p.getAdr()+"";
                data[2]=p.getCov()+"";
                data[3]=p.getNbC_H()+"";
                data[4]=p.getNbLitR()+"";
                data[5]=p.getDateU().subSequence(0,10)+"";
                model.addRow(data);
            }
            else {
                clear_H();}

        }
        catch(Exception e)
        {
        }
        
              }
              clear_H();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int j =0;
         verif ver = new verif();
           if(txtH.getText()=="" ||txtL.getText()==""|| txtnom.getText()==""||txtadr.getText()==""||txtD.getText()=="")
           {
            JOptionPane.showMessageDialog(null, "chaine vide non accepté");
            j=1;
           }
         
         if(ver.verifDigit(txtH.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de cas hospitalisés incorrect");
           j=1;
        }
          if(ver.verifDigit(txtL.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de Lits disponibles incorrect");
            j=1;
        }
           if(ver.verifDigitOrAlpha(txtadr.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "l'adresse incorrect");
            j=1;
        }
              if(ver.verifAlpha(txtnom.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "le nom  incorrect");
            j=1;
        }
              if(j==0)
              {
        Hospitale h= new Hospitale(
            0,
            txtnom.getText(),
            txtadr.getText(),
            (String) cbG.getSelectedItem(),
            Integer.parseInt(txtH.getText()),
            Integer.parseInt(txtL.getText()),
            txtD.getText()
        );
        ServiceHopitaleDemande Hop= new ServiceHopitaleDemande();
        boolean v;
        try{
            Hop.updateP(h);
            for(int i = model.getRowCount(); i > 0; --i)
            model.removeRow(i-1);
            JTablePeuplerTous();
                if( Hop.updateP(h)!=true)
                {
                    clear_H();
                }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        clear_H();
              }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ServiceHopitaleDemande Hop= new ServiceHopitaleDemande();
        Hop.delete(txtnom.getText());
        for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerTous();
        if(Hop.delete(txtnom.getText())!=true)
        {
        clear_H();}
        clear_H();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Afficher_TousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Afficher_TousActionPerformed
        // TODO add your handling code here:
        for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerTous();
    }//GEN-LAST:event_Afficher_TousActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerG(jComboBox2.getSelectedItem()+"");
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int j=0;
         verif ver = new verif();
         if(D.getText()==""||type.getText()==""||txtnom1.getText()==""||txtdem.getText()=="")
         {
         JOptionPane.showMessageDialog(null, "chaine vide est inacceptable");
         j=1;
         }
         if(ver.verifAlpha(D.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Le nom de distinataire est incorrect");
           j=1;
        }
          if(ver.verifAlpha(type.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Le type est incorrect");
            j=1;
        }
           if(ver.verifAlpha(txtnom1.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "le titre de demande est incorrect");
            j=1;
        }
              if(ver.verifDigitOrAlpha(txtdem.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "le text de demande est incorrect");
            j=1;
        }
              if(j==0)
              {
         Demande d= new Demande(
         0,
        Integer.parseInt( lstNumH.get(R.getSelectedIndex())),
        type.getText(),
        txtnom1.getText(),
        D.getText(),
        txtdem.getText(),
         Float.parseFloat((Prix.getText())),    
         (String)R.getSelectedItem()
         );
        ServiceHopitaleDemande Hop= new ServiceHopitaleDemande();
        boolean v;
        try{
            v=Hop.create(d);
            if(v==true)
            {
                System.out.println(v);
                String[] data = new String[6];
                        data[0]=d.getTitre()+"";
                        data[1]=d.getType()+"";
			data[2]=d.getResposable()+"";
	     		data[3]=d.getDistinateur()+"";
	     		data[4]=d.getPrix()+"";
	     		data[5]=d.getTextD()+"";
                model1.addRow(data);
            }
            else{
            clear_H();}

        }
        catch(Exception e)
        {
        }
        }
        for(int i = model1.getRowCount(); i > 0; --i) 
			    model1.removeRow(i-1);
JTablePeuplerTousD();
clear_H();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int j=0;
         verif ver = new verif();
         if(D.getText()==""||type.getText()==""||txtnom1.getText()==""||txtdem.getText()=="")
         {
         JOptionPane.showMessageDialog(null, "chaine vide est inacceptable");
         j=1;
         }
         if(ver.verifAlpha(D.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Le nom de distinataire est incorrect");
           j=1;
        }
          if(ver.verifAlpha(type.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Le type est incorrect");
            j=1;
        }
           if(ver.verifAlpha(txtnom1.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "le titre de demande est incorrect");
            j=1;
        }
              if(ver.verifDigitOrAlpha(txtdem.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "le text de demande est incorrect");
            j=1;
        }
              if(j==0)
              {
        
        Demande d= new Demande(
         0,
        Integer.parseInt( lstNumH.get(R.getSelectedIndex())),
        type.getText(),
        txtnom1.getText(),
        D.getText(),
        txtdem.getText(),
         Float.parseFloat((Prix.getText())),    
         (String)R.getSelectedItem()
         );
        ServiceHopitaleDemande Hop= new ServiceHopitaleDemande();
        boolean v;
        try{
            v=Hop.updateP(d);
            if(v==true)
            {
             
            }
            else{
            clear_H();
            }

        }
        catch(Exception e)
        {
        }}
         for(int i = model1.getRowCount(); i > 0; --i) 
			    model1.removeRow(i-1);
            JTablePeuplerTousD();
       clear_H();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table1.getSelectedRow(); 
        int id =lstD.get(selectedRowIndex).getIdH();
        type.setText(lstD.get(selectedRowIndex).getType());
        ServiceHopitaleDemande Hop= new ServiceHopitaleDemande();
        Hop.delete(txtnom1.getText(),id);
        for(int i = model1.getRowCount(); i > 0; --i) 
			    model1.removeRow(i-1);
JTablePeuplerTousD();
if(Hop.delete(txtnom1.getText(),id))
{
clear_H();}
clear_H();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Afficher_Tous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Afficher_Tous1ActionPerformed
        // TODO add your handling code here:
        for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerTousD();
    }//GEN-LAST:event_Afficher_Tous1ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
        for(int i = model1.getRowCount(); i > 0; --i)
        model1.removeRow(i-1);
        JTablePeuplerTousD_H((String)jComboBox3.getSelectedItem());
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Hopitale");
        MessageFormat footer = new MessageFormat("page{0,number,Integer}");
        try{
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.println("erooor" +e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Demande");
        MessageFormat footer = new MessageFormat("page{0,number,Integer}");
        try{
            table1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.println("erooor" +e.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afficher_Tous;
    private javax.swing.JButton Afficher_Tous1;
    private javax.swing.JTextField D;
    private javax.swing.JTextField Prix;
    private javax.swing.JComboBox R;
    private javax.swing.JComboBox cbG;
    private javax.swing.JPanel demande;
    private javax.swing.JPanel hopitale;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtH;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextArea txtadr;
    private javax.swing.JTextArea txtdem;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnom1;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
