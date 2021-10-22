/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import Services.ServiceGouvernorat;
import Services.ServicePays;
import Services.ServicePersonne;
import Services.verif;
import classs.Gouvernorat;
import classs.Pays;
import classs.Personne;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import static projet.Principale.id;

/**
 *
 * @author HP
 */
public class FrmGouvernoratADM extends javax.swing.JInternalFrame {
 private static ArrayList<Gouvernorat> lstG ;
  private static ArrayList<Personne> lstP ;
    private JTable table;
     private JTable table1;
      private JTable table2;
     private static ArrayList<String> lstNum;
    private static ArrayList<String> lstNom;
    private int id=0;
    private String nom ="";
    private String date="";
    //sprivate int i=0;
    /**ArrayList<Gouvernorat> Gou = new ArrayList<>();
     * Creates new form FrmGouvernorat
     */
    private static DefaultTableModel model = new DefaultTableModel(new Object[][] {
         
	}, new String[] {"Nom_G", "DateU", "T_Cas", "T_Décés", "T_Tests","T_Recupere" });
     private static DefaultTableModel model2 = new DefaultTableModel(new Object[][] {
         
	}, new String[] {"CIN", "Governorat", "Date_Update", "Sexe", "Age","cas_importé" });
    public static ArrayList<String> getG()
        {
         ServiceGouvernorat dem = new ServiceGouvernorat();
        lstNum=new ArrayList<String>();
        lstNom=new ArrayList<String>();
        for(Gouvernorat h :dem.find_G())
        {
        lstNum.add(h.getIdP()+"");
        lstNom.add(h.getNomG());
         }
        return lstNom ;
        }
     public void JTablePeuplerTousP() {
         ServicePersonne gest = new ServicePersonne();
               
               
		lstP = gest.findAll();
		String[] data = new String[6];
		for (Personne p : lstP) {
                       
			data[0]=p.getCin()+"";
	     		data[1]=p.getCov()+"";
	     		data[2]=p.getDate()+"";
	     		data[3]=p.getSexe()+"";
                        data[4]=p.getAge()+"";
                        data[5]=p.getCas_imp()+"";

			model2.addRow(data);

		}

	}
     public void JTablePeuplerTous() {
         ServiceGouvernorat gest = new ServiceGouvernorat();
               
               
		lstG = gest.findAllG();
		String[] data = new String[6];
		for (Gouvernorat p : lstG) {
                       
			data[0]=p.getNomG()+"";
	     		data[1]=p.getDateU()+"";
	     		data[2]=p.getTcas()+"";
	     		data[3]=p.getTdeces()+"";
                        data[4]=p.getTtest()+"";
                        data[5]=p.getTrecup()+"";

			model.addRow(data);

		}

	}
     public void clear(){
         nvcas.setText("");
          nvcri.setText("");
          nvdeces.setText("");
          nvre.setText("");
          nvtests.setText("");
          Tcas.setText("");
         Tdeces.setText("");
          Ttst.setText("");
          Tre.setText("");
          dateU.setText("");
  
     }
     private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        
        // get the selected row index
       int selectedRowIndex = table.getSelectedRow(); 
       
       //ncinTxt.setText(lstPays.get(selectedRowIndex).getIdP());
       cbP.setSelectedItem(lstG.get(selectedRowIndex).getNomG());
       Tcas.setText(lstG.get(selectedRowIndex).getTcas()+""); 
       Tdeces.setText(lstG.get(selectedRowIndex).getTdeces()+"");
       Ttst.setText(lstG.get(selectedRowIndex).getTtest()+"");
       Tre.setText(lstG.get(selectedRowIndex).getTrecup()+"");
       nvcas.setText(lstG.get(selectedRowIndex).getNvcas()+"");
       nvdeces.setText(lstG.get(selectedRowIndex).getNvdeces()+"");
       nvtests.setText(lstG.get(selectedRowIndex).getNvtest()+"");
       nvre.setText(lstG.get(selectedRowIndex).getNvrecup()+"");
       nvcri.setText(lstG.get(selectedRowIndex).getNvcritique()+"");
       dateU.setEnabled(false);
        cbP.setEnabled(false);
}
     private void jTable1MouseClickedP(java.awt.event.MouseEvent evt) {                                     
      String cin="0";
       int selectedRowIndex = table1.getSelectedRow(); 
       cin=lstP.get(selectedRowIndex).getCin();
     // return cin ; 
      
     }
    public FrmGouvernoratADM() {
        
        super("GOUVERNORAT-ADMIN" , 
			true, //resizable
	                true,  //closable
	                true, //maximizable
	                true); //iconifiable
        super.setTitle("Gouvernorat");
        this.setSize(900, 600);
        initComponents();
        //System.out.println(lstG.size());
        JScrollPane scrollPane = new JScrollPane();
        //scrollPane.setBackground(Color.red);
       getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 550, 250));
         table = new JTable();

		table.setEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(model);
		scrollPane.setViewportView(table);
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("calibri", Font.BOLD, 18));
		header.setForeground(new Color(0, 0, 0));

		table.setPreferredScrollableViewportSize(new Dimension(300, 62));

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

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tcas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tdeces = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Ttst = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Tre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nvcas = new javax.swing.JTextField();
        nvdeces = new javax.swing.JTextField();
        nvtests = new javax.swing.JTextField();
        nvre = new javax.swing.JTextField();
        nvcri = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbP = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        dateU = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setName("background"); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 28, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Total cas ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel1.add(Tcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 240, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("total décés ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        Tdeces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdecesActionPerformed(evt);
            }
        });
        jPanel1.add(Tdeces, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 240, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Total tests");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(Ttst, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 240, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_calculator_16px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 40, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("total rrecuperer");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(Tre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 470, 200));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nouvelles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));
        jPanel2.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("NVT-cas");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("NVT-décés");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("NVT-tests");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("NVT-recupérer");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("NVT-critiqué");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel2.add(nvcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));
        jPanel2.add(nvdeces, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));
        jPanel2.add(nvtests, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));
        jPanel2.add(nvre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, -1));
        jPanel2.add(nvcri, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 200));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Governorat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Gouvernorat");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cbP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bizerte", "Béja", "Jendouba", "Kef", "Siliana", "Kairouan", "Sidi Bouzid", "Kasserine", "Gafsa", "Tozeur", "Kébili", "Tataouine", "Médenine", "Ariana", "Tunis", "Manouba", "Ben Arous", "Nabeul", "Zaghouan", "Sousse", "Monastir", "Mahdia", "Sfax", "Gabès" }));
        jPanel3.add(cbP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(dateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_30px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_flip_chart_50px_1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_unavailable_24px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 90, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personne", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_features_list_24px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_unavailable_24px.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel5.setText(" suppression");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 20));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel12.setText("Affichage");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, 180));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_print_64px.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, 70));

        getAccessibleContext().setAccessibleName("Gouvernorat");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void TdecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdecesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdecesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int j=0;
        verif ver = new verif();
        if(nvcas.getText()==""||nvdeces.getText()==""||nvcri.getText()==""||nvre.getText()==""||nvtests.getText()=="")
        {
              JOptionPane.showMessageDialog(null, "chaine vide non accepté");
    j=1;
        }
        if (ver.verifDate(dateU.getText())!=true) {
            JOptionPane.showMessageDialog(null, "date incorrect");
            j = 1;
        }
        if(ver.verifDigit(Tcas.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total cas incorrect");
    j=1;
        }
         if(ver.verifDigit(Tdeces.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total deces incorrect");
           j=1;
        }
          if(ver.verifDigit(Tre.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total recuperé incorrect");
           j=1;
        }
           if(ver.verifDigit(Ttst.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total tests incorrect");
           j=1;
        }
             if(ver.verifDigit(nvcas.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles cas incorrect");
           j=1;
        }
            if(ver.verifDigit(nvdeces.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles deces incorrect");
           j=1;
        }
          if(ver.verifDigit(nvre.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles recuperé incorrect");
           j=1;
        }
           if(ver.verifDigit(nvtests.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles tests incorrect");
           j=1;
        }
              if(ver.verifDigit(nvcri.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles cas critiques incorrect");
           j=1;
        }
        if(j==0)
        {
         Gouvernorat p = new Gouvernorat(
            (String)cbP.getSelectedItem(),
            20,
            dateU.getText(),
            Integer.parseInt(Tcas.getText()),
            Integer.parseInt(nvcas.getText()),
            Integer.parseInt( Tdeces.getText()),
            Integer.parseInt( nvdeces.getText()),
            Integer.parseInt(Tre.getText()),
            Integer.parseInt(nvre.getText()),
            Integer.parseInt(Ttst.getText()),
            Integer.parseInt( nvtests.getText()),
            Integer.parseInt(nvcri.getText())
        );
       
        ServiceGouvernorat P1= new ServiceGouvernorat();
        boolean v;
        try {
            v = P1.createG(p);
            System.err.println(v);
            if(v==true)
            {
               
                String [] data = new String[6];
                data[0]=p.getNomG()+"";
	     		data[1]=p.getDateU()+"";
	     		data[2]=p.getTcas()+"";
	     		data[3]=p.getTdeces()+"";
                        data[4]=p.getTtest()+"";
                        data[5]=p.getTrecup()+"";

                model.addRow(data);
                
            }
              else{
            }
        } catch (ParseException ex) {
            Logger.getLogger(FrmGouvernoratADM.class.getName()).log(Level.SEVERE, null, ex);
        }

        for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerTous();
        
                  for (int i = 0 ; i<Integer.parseInt(nvcas.getText());i++){

        JPanel mainPanel = new JPanel();
        
	    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.setPreferredSize(new Dimension(200, 350));
            JLabel nb = new JLabel("Vous devez inserer : "+(Integer.parseInt(nvcas.getText())-i)+" cas.");	   
	    nb.setAlignmentX(LEFT_ALIGNMENT);
	    nb.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
             JLabel labNCIN = new JLabel("Ncin");	   
	    labNCIN.setAlignmentX(LEFT_ALIGNMENT);
	    labNCIN.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
	    JTextField addNcinTxt = new JTextField();	   
	    addNcinTxt.setFont(new Font("Calibri", Font.BOLD, 16));
	   // addNcinTxt.setText(ncinTxt.getText());
	    addNcinTxt.setAlignmentX(LEFT_ALIGNMENT);
	   addNcinTxt.setBounds(400, 100, 50,50);
	    JLabel labNom = new JLabel("Governorat");	   
	    labNom.setAlignmentX(LEFT_ALIGNMENT);
	    labNom.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
           JTextField nomTxt = new JTextField();	    
	    nomTxt.setFont(new Font("Calibri", Font.BOLD, 16));
	    nomTxt.setAlignmentX(LEFT_ALIGNMENT);
	    nomTxt.setColumns(10);
            nomTxt.setText(P1.find_Go(dateU.getText(),(String) cbP.getSelectedItem()).getNomG());
            int id =P1.find_Go(dateU.getText(),(String) cbP.getSelectedItem()).getIdP();
             nomTxt.setEnabled(false);
            JTextField date = new JTextField("dd-MM-YYYY");	    
	    date.setFont(new Font("Calibri", Font.BOLD, 16));
	    date.setAlignmentX(LEFT_ALIGNMENT);
	    date.setColumns(10);
             JLabel DateNaiss = new JLabel("Date Update");	   
	    DateNaiss.setAlignmentX(LEFT_ALIGNMENT);
	    DateNaiss.setFont(new Font("Tahoma", Font.BOLD, 14));
	    date.setText(dateU.getText());
            date.setEnabled(false);
	    JLabel se = new JLabel("SEXE");	   
	    se.setAlignmentX(LEFT_ALIGNMENT);
	    se.setFont(new Font("Tahoma", Font.BOLD, 14));
	    JComboBox sexe = new JComboBox() ;   
	    sexe.setFont(new Font("Calibri", Font.BOLD, 16));
	    sexe.setAlignmentX(LEFT_ALIGNMENT);
            sexe.addItem("F");
            sexe.addItem("M");
            JLabel age = new JLabel("Age");	   
	    age.setAlignmentX(LEFT_ALIGNMENT);
	    age.setFont(new Font("Tahoma", Font.BOLD, 14));
	    JTextField txtage = new JTextField();	    
	    txtage.setFont(new Font("Calibri", Font.BOLD, 16));
	    txtage.setAlignmentX(LEFT_ALIGNMENT);
	    txtage.setColumns(10);
	    
	        JLabel imp = new JLabel("cas_importé");	   
	    imp.setAlignmentX(LEFT_ALIGNMENT);
	    imp.setFont(new Font("Tahoma", Font.BOLD, 14));
	    JComboBox impo = new JComboBox() ;
	    impo.addItem(0+"");
            impo.addItem(1+"");
	    impo.setFont(new Font("Calibri", Font.BOLD, 16));
	    impo.setAlignmentX(LEFT_ALIGNMENT);
	   
            mainPanel.add(nb);
	    mainPanel.add(labNCIN);
	    mainPanel.add(addNcinTxt);	    
	    mainPanel.add(labNom);
	    mainPanel.add(nomTxt);
	    mainPanel.add(DateNaiss);	    
	    mainPanel.add(date);
           mainPanel.add(se);
	    mainPanel.add(sexe);
            mainPanel.add(age);
	    mainPanel.add(txtage);
             mainPanel.add(imp);
	    mainPanel.add(impo);
            
             
                    
	    String[] buttons = { "Annuler", "Ajouter" };
	    int rc = JOptionPane.showOptionDialog(null, mainPanel,"Ajout d'un nouveau Personne", JOptionPane.INFORMATION_MESSAGE,JOptionPane.PLAIN_MESSAGE, null, buttons, buttons[1]);

	    if(rc != 0 && rc != -1)	  
            {   
              ServicePersonne per = new ServicePersonne();
              Personne p1 = new Personne(addNcinTxt.getText(),
               nomTxt.getText(),
               id, 
               date.getText(),
               (String)sexe.getSelectedItem(),
               Integer.parseInt(txtage.getText()), 
               Integer.parseInt((String)impo.getSelectedItem()));
                
                try {
                    per.create(p1);
                     txtage.setText("");
                        nomTxt.getText();
                        sexe.setSelectedIndex(0);
                        impo.setSelectedIndex(0);
                        date.setText("");
                            addNcinTxt.setText("");
                    
                } catch (ParseException ex) {
                    Logger.getLogger(FrmGouvernoratADM.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
	    }
            else{break;}
            
                  }
      
            }
         clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            int j=0;
        verif ver = new verif();
        if(nvcas.getText()==""||nvdeces.getText()==""||nvcri.getText()==""||nvre.getText()==""||nvtests.getText()=="")
        {
              JOptionPane.showMessageDialog(null, "chaine vide non accepté");
    j=1;
        }
      
        if(ver.verifDigit(Tcas.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total cas incorrect");
    j=1;
        }
         if(ver.verifDigit(Tdeces.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total deces incorrect");
           j=1;
        }
          if(ver.verifDigit(Tre.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total recuperé incorrect");
           j=1;
        }
           if(ver.verifDigit(Ttst.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "Total tests incorrect");
           j=1;
        }
             if(ver.verifDigit(nvcas.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles cas incorrect");
           j=1;
        }
            if(ver.verifDigit(nvdeces.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles deces incorrect");
           j=1;
        }
          if(ver.verifDigit(nvre.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles recuperé incorrect");
           j=1;
        }
           if(ver.verifDigit(nvtests.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles tests incorrect");
           j=1;
        }
              if(ver.verifDigit(nvcri.getText())!=true)
        {
           JOptionPane.showMessageDialog(null, "nombre de nouvelles cas critiques incorrect");
           j=1;
        }
        if(j==0)
        {
        ServiceGouvernorat P1= new ServiceGouvernorat();
        int selectedRowIndex = table.getSelectedRow();
        id=lstG.get(selectedRowIndex).getIdP();
        nom=lstG.get(selectedRowIndex).getNomG();
        date=lstG.get(selectedRowIndex).getDateU();
        Gouvernorat pay ;
        pay=P1.findByIdG(id,nom,date);
        System.out.println(pay);
        Gouvernorat p= new Gouvernorat(
            nom,
            id,
            date,
            Integer.parseInt(Tcas.getText()),
            Integer.parseInt(nvcas.getText()),
            Integer.parseInt( Tdeces.getText()),
            Integer.parseInt( nvdeces.getText()),
            Integer.parseInt(Tre.getText()),
            Integer.parseInt(nvre.getText()),
            Integer.parseInt(Ttst.getText()),
            Integer.parseInt( nvtests.getText()),
            Integer.parseInt(nvcri.getText()));
        System.out.println(p);

        P1.updateG(p);
        dateU.setEnabled(true);
        cbP.setEnabled(true);
        if(P1.updateG(p)!=true)
             {
               
            clear();
             
             }
       
        //model.setRowCount(0);
        for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerTous();
        }
        clear();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ServiceGouvernorat P1 = new ServiceGouvernorat();
        int selectedRowIndex = table.getSelectedRow();
        id=lstG.get(selectedRowIndex).getIdP();
        nom=lstG.get(selectedRowIndex).getNomG();
        date=lstG.get(selectedRowIndex).getDateU();
        

        boolean v= P1.deleteG(id,nom,date);
        if(v==true)
        {
            System.err.println("tay");
            for(int i = model.getRowCount(); i > 0; --i)
        model.removeRow(i-1);
        JTablePeuplerTous();
         
        }
         else{
        clear();
        }
        clear();   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        ServiceGouvernorat P1=new ServiceGouvernorat();
        Gouvernorat gg =new Gouvernorat();
                gg=P1.findAllDay(cbP.getSelectedItem()+"");
                Tcas.setText((gg.getTcas()+Integer.parseInt(nvcas.getText()))+"");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        ServiceGouvernorat P1=new ServiceGouvernorat();
        Gouvernorat gg =new Gouvernorat();
                gg=P1.findAllDay(cbP.getSelectedItem()+"");
                Tdeces.setText((gg.getTdeces()+Integer.parseInt(nvdeces.getText()))+"");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        ServiceGouvernorat P1=new ServiceGouvernorat();
        Gouvernorat gg =new Gouvernorat();
                gg=P1.findAllDay(cbP.getSelectedItem()+"");
                Ttst.setText((gg.getTtest()+Integer.parseInt(nvtests.getText()))+"");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        ServiceGouvernorat P1=new ServiceGouvernorat();
        Gouvernorat gg =new Gouvernorat();
                gg=P1.findAllDay(cbP.getSelectedItem()+"");
                Tre.setText((gg.getTrecup()+Integer.parseInt(nvre.getText()))+"");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ServiceGouvernorat P1=new ServiceGouvernorat();
        Gouvernorat gg =new Gouvernorat();
                gg=P1.findAllDay(cbP.getSelectedItem()+"");
                Tre.setText((gg.getTrecup()+Integer.parseInt(nvre.getText()))+"");
                Ttst.setText((gg.getTtest()+Integer.parseInt(nvtests.getText()))+"");
                Tdeces.setText((gg.getTdeces()+Integer.parseInt(nvdeces.getText()))+"");
                Tcas.setText((gg.getTcas()+Integer.parseInt(nvcas.getText()))+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        JPanel mainPanel2 = new JPanel();
        mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.Y_AXIS));
            mainPanel2.setPreferredSize(new Dimension(800, 350));
            JButton imp = new JButton("imprimer");
            
            
            imp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MessageFormat header = new MessageFormat("Personne");
        MessageFormat footer = new MessageFormat("page{0,number,Integer}");
        try{
            table1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(java.awt.print.PrinterException ex)
        {
            System.err.println("erooor" +ex.getMessage());
        }
            
            
            }});
            JScrollPane scrollPane = new JScrollPane();
        //scrollPane.setBackground(Color.red);
       mainPanel2.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 780, 250));
       mainPanel2.add(imp);
         table1 = new JTable();

		table1.setEnabled(true);
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.setModel(model2);
		scrollPane.setViewportView(table1);
		JTableHeader header = table1.getTableHeader();
		header.setFont(new Font("calibri", Font.BOLD, 18));
		header.setForeground(new Color(0, 0, 0));

		table1.setPreferredScrollableViewportSize(new Dimension(300, 62));

		table1.setFont(new Font("calibri", Font.BOLD, 16));
		table1.setRowHeight(20);
                table1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClickedP(evt);
			}
		});
                 for(int i = model2.getRowCount(); i > 0; --i)
        model2.removeRow(i-1);
                JTablePeuplerTousP() ;
                
                String[] buttons = { "annuler", "  Ok   "};
	    int rc = JOptionPane.showOptionDialog(null, mainPanel2,"Afficher personnes", JOptionPane.INFORMATION_MESSAGE,JOptionPane.PLAIN_MESSAGE, null, buttons, buttons[1]);

	    if(rc != 0 && rc != -1)	  
            {   
               
	    }
          
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         JPanel mainPanel2 = new JPanel();
        mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.Y_AXIS));
            mainPanel2.setPreferredSize(new Dimension(800, 350));
            JScrollPane scrollPane = new JScrollPane();
        //scrollPane.setBackground(Color.red);
       mainPanel2.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 780, 250));
         table1 = new JTable();

		table1.setEnabled(true);
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.setModel(model2);
		scrollPane.setViewportView(table1);
		JTableHeader header = table1.getTableHeader();
		header.setFont(new Font("calibri", Font.BOLD, 18));
		header.setForeground(new Color(0, 0, 0));

		table1.setPreferredScrollableViewportSize(new Dimension(300, 62));

		table1.setFont(new Font("calibri", Font.BOLD, 16));
		table1.setRowHeight(20);
                table1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClickedP(evt);
			}
		});
                 for(int i = model2.getRowCount(); i > 0; --i)
        model2.removeRow(i-1);
                JTablePeuplerTousP() ;
                String[] buttons = { "annuler", "Supprimer"};
	    int rc = JOptionPane.showOptionDialog(null, mainPanel2,"Supprimer personnes", JOptionPane.INFORMATION_MESSAGE,JOptionPane.PLAIN_MESSAGE, null, buttons, buttons[1]);

	    if(rc != 0 && rc != -1)	  
            {   
                 int selectedRowIndex = table1.getSelectedRow(); 
                ServicePersonne per = new ServicePersonne();
                per.delete(lstP.get(selectedRowIndex).getCin());
                
                
                mainPanel2.setVisible(false);
                  JPanel mainPanel3 = new JPanel();
                   mainPanel3.setLayout(new BoxLayout(mainPanel3, BoxLayout.Y_AXIS));
                   mainPanel3.setPreferredSize(new Dimension(800, 350));
                   JScrollPane scrollPane1 = new JScrollPane();
                 mainPanel3.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 780, 250));
                 table2 = new JTable();

		table2.setEnabled(true);
		table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table2.setModel(model2);
		scrollPane1.setViewportView(table2);
		JTableHeader header1 = table2.getTableHeader();
		header1.setFont(new Font("calibri", Font.BOLD, 18));
		header1.setForeground(new Color(0, 0, 0));

		table2.setPreferredScrollableViewportSize(new Dimension(300, 62));

		table2.setFont(new Font("calibri", Font.BOLD, 16));
		table2.setRowHeight(20);
                table2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClickedP(evt);
			}
		});
                 for(int i = model2.getRowCount(); i > 0; --i)
                model2.removeRow(i-1);
                JTablePeuplerTousP() ;
                String[] buttons1 = { "annuler", "  Ok   "};
                 int rc1 = JOptionPane.showOptionDialog(null, mainPanel3,"Afficher personnes", JOptionPane.INFORMATION_MESSAGE,JOptionPane.PLAIN_MESSAGE, null, buttons1, buttons1[1]);
                if(rc != 0 && rc != -1)	  
                     { }
	    }
            
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Governorat");
        MessageFormat footer = new MessageFormat("page{0,number,Integer}");
        try{
        table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.println("erooor" +e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed
                                                                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tcas;
    private javax.swing.JTextField Tdeces;
    private javax.swing.JTextField Tre;
    private javax.swing.JTextField Ttst;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox cbP;
    private javax.swing.JTextField dateU;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField nvcas;
    private javax.swing.JTextField nvcri;
    private javax.swing.JTextField nvdeces;
    private javax.swing.JTextField nvre;
    private javax.swing.JTextField nvtests;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
