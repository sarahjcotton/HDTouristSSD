/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Sarah
 */
public class SearchHotelGUI extends javax.swing.JFrame {

    TouristInformationCenter tourist = new TouristInformationCenter();
    private ArrayList<Accommodation> aResults;
    private String sur;
    private String fir;
    private String pho;

    /**
     * Creates new form SearchHotelGUI
     */
    public SearchHotelGUI(String s, String f, String p) {
        initComponents();
        sur = s;
        fir = f;
        pho = p;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSearch = new javax.swing.ButtonGroup();
        lblResult = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        radName = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cboHotels = new javax.swing.JComboBox();
        radType = new javax.swing.JRadioButton();
        cboType = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAvailable = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        chkMon = new javax.swing.JCheckBox();
        chkTue = new javax.swing.JCheckBox();
        chkWed = new javax.swing.JCheckBox();
        chkThu = new javax.swing.JCheckBox();
        chkFri = new javax.swing.JCheckBox();
        chkSat = new javax.swing.JCheckBox();
        chkSun = new javax.swing.JCheckBox();
        cboRooms = new javax.swing.JComboBox();
        lblRoomType = new javax.swing.JLabel();
        lblRoomNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("Accommodation Options");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        grpSearch.add(radName);
        radName.setText("Name");

        jLabel1.setText("Search Accommodation By:");

        cboHotels.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHotelsItemStateChanged(evt);
            }
        });

        grpSearch.add(radType);
        radType.setText("Type");

        cboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hotel", "Self Catering", "B & B" }));
        cboType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTypeItemStateChanged(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cboHotels, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(radName)
                            .addGap(12, 12, 12)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(radType)
                            .addGap(18, 18, 18)
                            .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radName)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radType))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboHotels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setText("Check availability for selected hotel:");

        btnAvailable.setText("Availability at a glance");
        btnAvailable.setEnabled(false);
        btnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        chkMon.setText("Monday");
        chkMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMonActionPerformed(evt);
            }
        });

        chkTue.setText("Tuesday");

        chkWed.setText("Wednesday");

        chkThu.setText("Thursday");

        chkFri.setText("Friday");
        chkFri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFriActionPerformed(evt);
            }
        });

        chkSat.setText("Saturday");

        chkSun.setText("Sunday");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(chkMon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkTue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkWed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkThu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkFri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSun)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMon)
                    .addComponent(chkTue)
                    .addComponent(chkWed)
                    .addComponent(chkThu)
                    .addComponent(chkFri)
                    .addComponent(chkSat)
                    .addComponent(chkSun)))
        );

        cboRooms.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboRoomsItemStateChanged(evt);
            }
        });

        lblRoomNo.setText("Room Number:");

        jLabel5.setText("Room Type:");

        btnBook.setText("Book Selection");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRoomNo)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRoomType)
                                    .addComponent(cboRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAvailable)
                                .addGap(9, 9, 9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBook)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnBook)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setText("Add  new room to selected hotel:");

        jButton1.setText("Add Room");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResult)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-640)/2, (screenSize.height-623)/2, 640, 623);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddRoomGUI addRoom = new AddRoomGUI(cboHotels.getSelectedItem().toString());
        addRoom.setVisible(true);
        addRoom.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableActionPerformed
        // TODO add your handling code here:            

        //CREATE TABLE HERE (http://www.java2s.com/Code/Java/Swing-JFC/AppendingaRowtoaJTableComponent.htm)
        DefaultTableModel model = new DefaultTableModel();

        JTable table = new JTable(model);

        model.addColumn("Hotel");
        model.addColumn("Room No");
        model.addColumn("Room Type");
        model.addColumn("Monday");
        model.addColumn("Tuesday");
        model.addColumn("Wednesday");
        model.addColumn("Thursday");
        model.addColumn("Friday");
        model.addColumn("Saturday");
        model.addColumn("Sunday");

        for (int d = 3; d < 10; d++) { //start from first boolean cell
            TableColumn tcolumns = table.getColumnModel().getColumn(d);
            tcolumns.setCellRenderer(table.getDefaultRenderer(Boolean.class));
            tcolumns.setCellEditor(table.getDefaultEditor(Boolean.class));
        }

        String htNa = cboHotels.getSelectedItem().toString();

        for (Accommodation a : aResults) { //Loop through accommodation results

            if (a.getName().equals(htNa)) { //if current accommodation getName = cboName
                // System.out.println(a);
                for (Room r : a.getRooms()) { //loop through rooms in that accommodation to find availalitlty for each room.                   

                    String rmNo = r.getRoomNo();
                    String rmTy = r.getRoomType();
                    boolean mon = r.available[0];
                    boolean tue = r.available[1];
                    boolean wed = r.available[2];
                    boolean thu = r.available[3];
                    boolean fri = r.available[4];
                    boolean sat = r.available[5];
                    boolean sun = r.available[6];

                    model.addRow(new Object[]{htNa, rmNo, rmTy, mon, tue, wed, thu, fri, sat, sun}); //add data to table model
                }
            }
        }

        JFrame f = new JFrame();
        f.setSize(600, 300);
        f.add(new JScrollPane(table));
        f.setLocationByPlatform(true);
        f.setVisible(true);


    }//GEN-LAST:event_btnAvailableActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        // TODO add your handling code here:
        //determine if search is by name or type then send appropriate parameters
        if (evt.getSource() == btnSearch) {
            cboHotels.removeAllItems();
            cboRooms.removeAllItems();
            if (aResults != null) {
                aResults.clear();
            }

            if (radName.isSelected()) {
                String name = txtName.getText();
                aResults = tourist.searchForAccommodation(name, "Empty");
                for (Accommodation a : aResults) {
                    cboHotels.addItem(a.getName());

                    for (Room r : a.getRooms()) {
                        cboHotels.getSelectedItem();
                        cboRooms.addItem(r.getHotelName() + " " + r.getRoomNo());
                    }
                    btnAvailable.setEnabled(true);
                    jButton1.setEnabled(true);
                }
            } else {
                if (radType.isSelected()) {
                    String type = cboType.getSelectedItem().toString();
                    aResults = tourist.searchForAccommodation("Empty", type);
                    for (Accommodation a : aResults) {
                        cboHotels.addItem(a.getName());
                        btnAvailable.setEnabled(true);
                        jButton1.setEnabled(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void chkMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMonActionPerformed

    private void chkFriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkFriActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:    
        //get array list of chosen dates
        boolean[] dates = new boolean[7];
        if ((chkMon.isSelected()==true) && (chkMon.isEnabled() == true)) {
            dates[0] = true;
        } else {
            dates[0] = false;
        }
       
        if ((chkTue.isSelected()==true)&&(chkTue.isEnabled() == true)) {
            dates[1] = true;
        } else {
            dates[1] = false;
        }
       
        if ((chkWed.isSelected() == true)&&(chkWed.isEnabled()==true)) {
            dates[2] = true;
        } else {
            dates[2] = false;
        }
       
        if ((chkThu.isSelected() == true)&&(chkThu.isEnabled()==true)) {
            dates[3] = true;
        } else {
            dates[3] = false;
        }
      
        if ((chkFri.isSelected() == true)&&(chkFri.isEnabled()==true)) {
            dates[4] = true;
        } else {
            dates[4] = false;
        }
     
        if ((chkSat.isSelected() == true)&&(chkSat.isEnabled()==true)) {
            dates[5] = true;
        } else {
            dates[5] = false;
        }
      
        if ((chkSun.isSelected() == true)&&(chkSun.isEnabled()==true)) {
            dates[6] = true;
        } else {
            dates[6] = false;
        }

        //get room name&no
        String hotel;// = null;
        hotel = cboHotels.getSelectedItem().toString();
        String rnumber;// = null;
        rnumber = cboRooms.getSelectedItem().toString();

        //test selection
     /*   for (String d : dates) {
         System.out.println(d + hotel + rnumber);
         }*/

        //create new booking
        if (sur == null) {
            //  System.out.println(cust);
            SearchCustGUI searchGUI = new SearchCustGUI(hotel, rnumber, dates);
            searchGUI.setVisible(true);
            searchGUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            tourist.addBooking(hotel, rnumber, fir, sur, pho, dates);
            
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void cboRoomsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboRoomsItemStateChanged
        // TODO add your handling code here:
        //  System.out.println(evt);
        if (evt.getStateChange() == 1) { //USE EVENT GETSTATECHANGE!!!!
            for (Accommodation a : aResults) { //loop through hotels
                if (a.getName().equals(a.getName())) { //if current accommodation in loop is selected hotel
                    //System.out.println(ho);
                    for (Room r : a.getRooms()) {//loop through rooms in selected hotel
                        String rm = cboRooms.getSelectedItem().toString(); //get selected room
                        // System.out.println(rm);
                        if (r.getRoomNo().equals(rm)) { //if current room in loop equals selected room
                            lblRoomType.setText(r.getRoomType().toString());
                            chkMon.setSelected(r.available[0]);
                            if (chkMon.isSelected() == true) {
                                chkMon.setEnabled(false);
                            } else {
                                chkMon.setEnabled(true);
                            }
                            chkTue.setSelected(r.available[1]);
                            if (chkTue.isSelected() == true) {
                                chkTue.setEnabled(false);
                            } else {
                                chkTue.setEnabled(true);
                            }
                            chkWed.setSelected(r.available[2]);
                            if (chkWed.isSelected() == true) {
                                chkWed.setEnabled(false);
                            } else {
                                chkWed.setEnabled(true);
                            }
                            chkThu.setSelected(r.available[3]);
                            if (chkThu.isSelected() == true) {
                                chkThu.setEnabled(false);
                            } else {
                                chkThu.setEnabled(true);
                            }
                            chkFri.setSelected(r.available[4]);
                            if (chkFri.isSelected() == true) {
                                chkFri.setEnabled(false);
                            } else {
                                chkFri.setEnabled(true);
                            }
                            chkSat.setSelected(r.available[5]);
                            if (chkSat.isSelected() == true) {
                                chkSat.setEnabled(false);
                            } else {
                                chkSat.setEnabled(true);
                            }
                            chkSun.setSelected(r.available[6]);
                            if (chkSun.isSelected() == true) {
                                chkSun.setEnabled(false);
                            } else {
                                chkSun.setEnabled(true);
                            }
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_cboRoomsItemStateChanged

    private void cboHotelsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHotelsItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            lblRoomType.removeAll(); //clear room type LABEL     
            String ho = cboHotels.getSelectedItem().toString(); //get HOTEL cbo selected name

            for (Accommodation a : aResults) { //loop through HOTELS

                if (a.getName().equals(ho)) { //if current accommodation equals selected HOTEL                     

                    cboRooms.removeAllItems(); //remove all item in ROOMS cbo        
                    for (Room r : a.getRooms()) {//loop through rooms for current hotel
                        lblRoomNo.setText("Room number: ");
                        // System.out.println(r.getRoomNo().toString());
                        cboRooms.addItem(r.getRoomNo().toString()); //this is the problem line - what else is trying to do the same thing?
                    }
                }
            }
        }
    }//GEN-LAST:event_cboHotelsItemStateChanged

    private void cboTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTypeItemStateChanged
        // TODO add your handling code here:
        ///need to use ITEMSTATECHANGED to avoid error
        if (radName.isSelected()) {
            String name = txtName.getText();
            aResults = tourist.searchForAccommodation(name, "Empty");
            for (Accommodation a : aResults) {
                cboHotels.addItem(a.getName());

                for (Room r : a.getRooms()) {
                    cboHotels.getSelectedItem();
                    cboRooms.addItem(r.getHotelName() + " " + r.getRoomNo());
                }
                btnAvailable.setEnabled(true);
                jButton1.setEnabled(true);
            }
        } else {
            if (radType.isSelected()) {
                String type = cboType.getSelectedItem().toString();
                aResults = tourist.searchForAccommodation("Empty", type);
                for (Accommodation a : aResults) {
                    cboHotels.addItem(a.getName());
                    btnAvailable.setEnabled(true);
                    jButton1.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_cboTypeItemStateChanged
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
            java.util.logging.Logger.getLogger(SearchHotelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchHotelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchHotelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchHotelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new SearchHotelGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cboHotels;
    private javax.swing.JComboBox cboRooms;
    private javax.swing.JComboBox cboType;
    private javax.swing.JCheckBox chkFri;
    private javax.swing.JCheckBox chkMon;
    private javax.swing.JCheckBox chkSat;
    private javax.swing.JCheckBox chkSun;
    private javax.swing.JCheckBox chkThu;
    private javax.swing.JCheckBox chkTue;
    private javax.swing.JCheckBox chkWed;
    private javax.swing.ButtonGroup grpSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JLabel lblRoomType;
    private javax.swing.JRadioButton radName;
    private javax.swing.JRadioButton radType;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}